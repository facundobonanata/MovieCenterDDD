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

        var id = new CinemaId();
        var capacity = new Capacity(72);
        Set<Seat> seats = new HashSet<>();

        var command = new AddCinema(id, capacity, seats);

        var useCase = new AddCinemaUseCase();

        List<DomainEvent> events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        CinemaAdded event = (CinemaAdded) events.get(0);

        Assertions.assertEquals(72, event.getCapacity().value());
        Assertions.assertEquals(new HashSet<>().size(), event.getSeats().size());
    }


}




