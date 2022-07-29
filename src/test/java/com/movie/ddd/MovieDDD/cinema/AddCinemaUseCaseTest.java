package com.movie.ddd.MovieDDD.cinema;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import com.movie.ddd.MovieDDD.Cinema.commands.AddCinema;
import com.movie.ddd.MovieDDD.Cinema.entities.Manager;
import com.movie.ddd.MovieDDD.Cinema.entities.Seat;
import com.movie.ddd.MovieDDD.Cinema.events.CinemaAdded;
import com.movie.ddd.MovieDDD.Cinema.usecases.AddCinemaUseCase;
import com.movie.ddd.MovieDDD.Cinema.values.CinemaId;
import com.movie.ddd.MovieDDD.Cinema.values.ManagerId;
import com.movie.ddd.MovieDDD.Cinema.values.Name;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.mockito.Mockito.mock;

public class AddCinemaUseCaseTest {
    private AddCinemaUseCase addCinemaUseCase;
    private DomainEventRepository repository;

    @BeforeEach
    public void setup(){
        addCinemaUseCase = new AddCinemaUseCase();
        repository = mock(DomainEventRepository.class);
        addCinemaUseCase.addRepository(repository);
    }

    @Test
    void crearNuevaSala(){

        //arrange
        var id = new CinemaId();
        Set<Seat> seats = new HashSet<>();

        var command = new AddCinema("12", "345", "Cris");

        var useCase = new AddCinemaUseCase();

        //act
        List<DomainEvent> events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        CinemaAdded event = (CinemaAdded) events.get(0);

        Assertions.assertEquals(new HashSet<>().size(), event.getSeats().size());
    }

}

    



