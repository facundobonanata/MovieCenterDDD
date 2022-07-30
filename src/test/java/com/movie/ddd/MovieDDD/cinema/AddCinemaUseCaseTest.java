package com.movie.ddd.MovieDDD.cinema;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import com.movie.ddd.MovieDDD.Cinema.commands.AddCinema;
import com.movie.ddd.MovieDDD.Cinema.entities.Seat;
import com.movie.ddd.MovieDDD.Cinema.events.CinemaAdded;
import com.movie.ddd.MovieDDD.Cinema.usecases.AddCinemaUseCase;
import com.movie.ddd.MovieDDD.Cinema.values.*;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.HashSet;
import java.util.List;
import java.util.Set;



public class AddCinemaUseCaseTest {
    @Test
    public void addNewCinema(){

        //arrange
        var id = new CinemaId();
        var capacidad = new Capacidad(25);
        Set<Seat> seats = new HashSet<>();

        var command = new AddCinema(id, capacidad, seats);

        var useCase = new AddCinemaUseCase();

        //act
        List<DomainEvent> events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        CinemaAdded event = (CinemaAdded) events.get(0);

        Assertions.assertEquals(25, event.getCapacidad().value());
        Assertions.assertEquals(new HashSet<>().size(), event.getSeats().size());
    }


}




