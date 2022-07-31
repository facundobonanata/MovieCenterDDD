package com.movie.ddd.MovieDDD.bill;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import com.movie.ddd.MovieDDD.Bill.commands.AddTicket;
import com.movie.ddd.MovieDDD.Bill.entities.Client;
import com.movie.ddd.MovieDDD.Bill.events.BillAdded;
import com.movie.ddd.MovieDDD.Bill.events.TicketAdded;
import com.movie.ddd.MovieDDD.Bill.usecases.AddTicketUseCase;
import com.movie.ddd.MovieDDD.Bill.values.*;
import com.movie.ddd.MovieDDD.Establecimiento.values.EstablecimientoId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class AddTicketUseCaseTest {

    @Mock
    DomainEventRepository repository;

    @InjectMocks
    AddTicketUseCase useCase;

    @Test
    void addTicket(){

        var billId = BillId.of("0021");
        var command = new AddTicket(billId, CinemaTicketId.of("01"), new Description("Consumo del comprador: "), new Value(300), new ExpirationDate(23,07,2022));
        when(repository.getEventsBy(billId.value())).thenReturn(history());
        useCase.addRepository(repository);

        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        var event = (TicketAdded) events.get(0);
        Assertions.assertEquals(300, event.getValue().value());

    }

    private List<DomainEvent> history() {
        var establecimientoId = EstablecimientoId.of("Movie Portones");
        var client = new Client(ClientId.of("070"), new Name("Alonso Armas"), new ClientAdress("Camino Carrasco"));
        return List.of(
                new BillAdded(establecimientoId, client)
        );
    }

}

