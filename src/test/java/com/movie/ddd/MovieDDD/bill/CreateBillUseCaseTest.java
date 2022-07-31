package com.movie.ddd.MovieDDD.bill;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import com.movie.ddd.MovieDDD.Bill.commands.AddBill;
import com.movie.ddd.MovieDDD.Bill.entities.Client;
import com.movie.ddd.MovieDDD.Bill.events.BillAdded;
import com.movie.ddd.MovieDDD.Bill.usecases.AddBillUseCase;
import com.movie.ddd.MovieDDD.Bill.values.BillId;
import com.movie.ddd.MovieDDD.Bill.values.ClientAdress;
import com.movie.ddd.MovieDDD.Bill.values.ClientId;
import com.movie.ddd.MovieDDD.Bill.values.Name;
import com.movie.ddd.MovieDDD.Establecimiento.values.EstablecimientoId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class CreateBillUseCaseTest {
    @Test
    void addNewBill() {

        var id = new BillId();
        var establecimientoId = EstablecimientoId.of("Movie center Portones");
        var client = new Client(ClientId.of("23"), new Name("Adrian"), new ClientAdress("Camino carrasco"));
        var command = new AddBill(id, establecimientoId, client);
        var useCase = new AddBillUseCase();

        List<DomainEvent> events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        BillAdded event = (BillAdded) events.get(0);

        Assertions.assertEquals(EstablecimientoId.of("Movie center Portones"), event.getEstablecimientoId());
        Assertions.assertEquals(new Client(ClientId.of("23"), new Name("Cris"), new ClientAdress("Camino carrasco")), event.getClient());
    }
}
