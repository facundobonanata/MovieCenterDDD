package com.movie.ddd.MovieDDD.cinema;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import com.movie.ddd.MovieDDD.Cinema.commands.AddMovie;
import com.movie.ddd.MovieDDD.Cinema.entities.Seat;
import com.movie.ddd.MovieDDD.Cinema.events.CinemaAdded;
import com.movie.ddd.MovieDDD.Cinema.events.MovieAdded;
import com.movie.ddd.MovieDDD.Cinema.usecases.AddMovieUseCase;
import com.movie.ddd.MovieDDD.Cinema.values.*;
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
public class AddMovieUseCaseTest {

    @Mock
    DomainEventRepository repository;

    @InjectMocks
    AddMovieUseCase useCase;

    @Test
    void AddMovieC(){

        var cinemaId = new CinemaId();
        var command = new AddMovie(new MovieId(), new MovieName("Avengers"), cinemaId, new Gender("Accion"), new Language("Español España"));
        when(repository.getEventsBy(cinemaId.value())).thenReturn(history());
        useCase.addRepository(repository);

        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        var event = (MovieAdded)events.get(0);
        Assertions.assertEquals("Avengers", event.getMovieName().value());
        Assertions.assertEquals("Español España", event.getLanguage().value());
        Assertions.assertEquals("Accion", event.getGender().value());
    }

    private List<DomainEvent> history() {
        var capacity = new Capacity(72);
        Set<Seat> seats = new HashSet<>();
        return List.of(
                new CinemaAdded(capacity, seats)
        );
    }

}


