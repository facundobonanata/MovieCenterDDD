package com.movie.ddd.MovieDDD.bill;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import com.movie.ddd.MovieDDD.Bill.commands.AddClient;
import com.movie.ddd.MovieDDD.Bill.entities.Client;
import com.movie.ddd.MovieDDD.Bill.events.BillAdded;
import com.movie.ddd.MovieDDD.Bill.events.ClientAdded;
import com.movie.ddd.MovieDDD.Bill.usecases.AddClientUseCase;
import com.movie.ddd.MovieDDD.Bill.values.BillId;
import com.movie.ddd.MovieDDD.Bill.values.ClientAdress;
import com.movie.ddd.MovieDDD.Bill.values.ClientId;
import com.movie.ddd.MovieDDD.Bill.values.Name;
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
public class AddClientUseCaseTest {

    @Mock
    DomainEventRepository repository;

    @InjectMocks
    AddClientUseCase useCase;

    @Test
    void addClient() {

        var billId = new BillId();
        var command = new AddClient(billId, new ClientId(), new ClientAdress("Camino carrasco"), new Name("Sebastian"));
        when(repository.getEventsBy(billId.value())).thenReturn(history());
        useCase.addRepository(repository);

        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(command.getClientId().value())
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        var event= (ClientAdded) events.get(0);
        Assertions.assertEquals("Sebastian", event.getName().value());
        Assertions.assertEquals("Camino carrasco", event.getClientAdress().value());
    }
    private List<DomainEvent> history() {
        var client = new Client(ClientId.of("23"), new Name("Adrian"), new ClientAdress("Camino carrasco"));
        var establecimientoId = EstablecimientoId.of("Movie center Portones");
        return List.of(
                new BillAdded(establecimientoId, client)
        );
    }
}
