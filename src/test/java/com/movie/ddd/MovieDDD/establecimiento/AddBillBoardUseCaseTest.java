package com.movie.ddd.MovieDDD.establecimiento;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import com.movie.ddd.MovieDDD.Cinema.commands.AddMovie;
import com.movie.ddd.MovieDDD.Cinema.events.MovieAdded;
import com.movie.ddd.MovieDDD.Cinema.usecases.AddMovieUseCase;
import com.movie.ddd.MovieDDD.Cinema.values.*;
import com.movie.ddd.MovieDDD.Establecimiento.commands.AddBillBoard;
import com.movie.ddd.MovieDDD.Establecimiento.events.BillBoardAdded;
import com.movie.ddd.MovieDDD.Establecimiento.events.EstablecimientoAdded;
import com.movie.ddd.MovieDDD.Establecimiento.usecases.AddBillBoardUseCase;
import com.movie.ddd.MovieDDD.Establecimiento.values.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)

public class AddBillBoardUseCaseTest {

    @Mock
    DomainEventRepository repository;

    @InjectMocks
    AddBillBoardUseCase useCase;

    @Test
    void AddBillBoard(){

        var establecimientoId = new EstablecimientoId();
        var command = new AddBillBoard(new BillBoardId(), new Price("Oferta entrada por 200$ por persona"), establecimientoId, new DateTime("03/12/21"), new MovieBoard("Avengers Premiere"));
        when(repository.getEventsBy(establecimientoId.value())).thenReturn(history());
        useCase.addRepository(repository);

        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        var event = (BillBoardAdded)events.get(0);
        Assertions.assertEquals("Avengers Premiere", event.getMovieBoard().value());
        Assertions.assertEquals("03/12/21", event.getDateTime().value());
        Assertions.assertEquals("Oferta entrada por 200$ por persona", event.getPrice().value());
    }

    private List<DomainEvent> history() {
        var name = new NameEstablecimiento("Movie center Portones");
        var adress = new Adress("Portones Shopping");
        return List.of(
                new EstablecimientoAdded(name, adress)
        );
    }
}
