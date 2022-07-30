package com.movie.ddd.MovieDDD.cinema;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import com.movie.ddd.MovieDDD.Cinema.commands.AddMovie;
import com.movie.ddd.MovieDDD.Cinema.entities.Movie;
import com.movie.ddd.MovieDDD.Cinema.entities.Seat;
import com.movie.ddd.MovieDDD.Cinema.events.CinemaAdded;
import com.movie.ddd.MovieDDD.Cinema.events.MovieAdded;
import com.movie.ddd.MovieDDD.Cinema.usecases.AddMovieUseCase;
import com.movie.ddd.MovieDDD.Cinema.values.*;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
 public class AddMovieUseCaseTest {

@Mock
    private DomainEventRepository repository;

@InjectMocks
    private AddMovieUseCase useCase;

@Test
     public void AddMovieCinema(){

    //arrange
    CinemaId cinemaId = CinemaId.of("SalaTeatro");
    MovieName movieName = new MovieName("Avengers");
    Language language = new Language("Español");
    Gender gender = new Gender("Accion");
    MovieId movieId = new MovieId("23");
    var command = new AddMovie(movieId,cinemaId, movieName, gender,language);

    Mockito.when(repository.getEventsBy("SalaTeatro")).thenReturn(history());
    useCase.addRepository(repository);

    //act
    List<DomainEvent> events = UseCaseHandler.getInstance()
            .syncExecutor(useCase, new RequestCommand<>(command))
            .orElseThrow()
            .getDomainEvents();

//assert
    var event = (MovieAdded) events.get(0);
    Assertions.assertEquals("23", event.getMovieId().value());
    Assertions.assertEquals("Avengers", event.getMovieName().value());
    Assertions.assertEquals("Español", event.getLanguage().value());
    Assertions.assertEquals("Accion", event.getGender().value());

}
    private List<DomainEvent> history() {
        var capacidad = new Capacidad(40);
        Set<Seat> seats = new HashSet<>();
        return List.of(
                new CinemaAdded(capacidad, seats)
        );
    }

}



