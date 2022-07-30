package com.movie.ddd.MovieDDD.establecimiento;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import com.movie.ddd.MovieDDD.Establecimiento.commands.AddSeller;
import com.movie.ddd.MovieDDD.Establecimiento.events.EstablecimientoAdded;
import com.movie.ddd.MovieDDD.Establecimiento.events.SellerAdded;
import com.movie.ddd.MovieDDD.Establecimiento.usecases.AddSellerUseCase;
import com.movie.ddd.MovieDDD.Establecimiento.values.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class AddSellerUseCaseTest {
    @Mock
    DomainEventRepository repository;

    @InjectMocks
    AddSellerUseCase useCase;

    @Test
    void addSeller(){
        var establecimientoId = new EstablecimientoId();
        var command = new AddSeller(new SellerId(), new SellerName("Alejandro"), establecimientoId);
        when(repository.getEventsBy(establecimientoId.value())).thenReturn(history());
        useCase.addRepository(repository);

        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(command.getEstablecimientoId().value())
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();
        var event= (SellerAdded) events.get(0);
        Assertions.assertEquals("Alejandro", event.getSellerName().value());
    }
    private List<DomainEvent> history() {
        var name = new NameEstablecimiento("Movie center Portones");
        var adress = new Adress("Portones Shopping");
        return List.of(
                new EstablecimientoAdded(name, adress)
        );
    }
}
