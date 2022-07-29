package com.movie.ddd.MovieDDD.cinema;


import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import com.movie.ddd.MovieDDD.Cinema.Cinema;
import com.movie.ddd.MovieDDD.Cinema.commands.AddCinema;
import com.movie.ddd.MovieDDD.Cinema.entities.Manager;
import com.movie.ddd.MovieDDD.Cinema.entities.Movie;
import com.movie.ddd.MovieDDD.Cinema.events.CinemaAdded;
import com.movie.ddd.MovieDDD.Cinema.usecases.AddCinemaUseCase;
import com.movie.ddd.MovieDDD.Cinema.values.*;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.mockito.Mockito.*;

public class AddCinemaUseCaseTest {

    @Test
    void addCinema(){
        var id = new CinemaId();
        var name = new Name("Sala3D");
        var language = new Language("ingles");
        var gender = new Gender("accion");
        Set<Set> seats = new HashSet<>();

        var command = new AddCinema(id, name, seats,language, gender);

        var useCase = new AddCinemaUseCase();

        //act
        List<DomainEvent> events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        CinemaAdded event = (CinemaAdded) events.get(0);

        Assertions.assertEquals("Sala3D", cinemaAdded.getName);
    }

    }
   /* private AddCinemaUseCase addCinemaUseCase;
    private DomainEventRepository repository;

    @BeforeEach
    public void setup(){
        addCinemaUseCase = new AddCinemaUseCase();
        repository = mock(DomainEventRepository.class);
        addCinemaUseCase.addRepository(repository);
    }

    @Test
    public void setCinemaForClient(){
        Set<Seat> seats = new HashSet<>();
        seats.add(new Seat("A1"));
        seats.add(new Seat("C20"));

        var command= new AddCinema(
                CinemaId.of("134"),
                new Name("cinema 4D"),
                seats,
                new Movie(MovieId.of("200"), new Gender("Accion"), new Language("Ingles")),
                new Manager(ManagerId.of("345"), new Name("Arebalo")))
                ;

        var response = UseCaseHandler.getInstance()
                .setIdentifyExecutor("134").syncExecutor(addCinemaUseCase, new RequestCommand<>(command)).orElseThrow();

        var events = response.getDomainEvents();
        CinemaAdded cinemaAdded = (CinemaAdded) events.get(0);

        Assertions.assertEquals("cinema 4D", cinemaAdded.getName().value());
    }*/
}


