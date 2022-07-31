package com.movie.ddd.MovieDDD.cinema;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import com.movie.ddd.MovieDDD.Cinema.commands.AddManager;
import com.movie.ddd.MovieDDD.Cinema.entities.Seat;
import com.movie.ddd.MovieDDD.Cinema.events.CinemaAdded;
import com.movie.ddd.MovieDDD.Cinema.events.ManagerAdded;
import com.movie.ddd.MovieDDD.Cinema.usecases.AddManagerUseCase;
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
public class AddManagerUseCaseTest {

    @Mock
    DomainEventRepository repository;

    @InjectMocks
    AddManagerUseCase useCase;

    @Test
    void addManager(){

        var cinemaId=new CinemaId();
        var command = new AddManager(cinemaId, new ManagerId(), new NameManager("Alex"), new Email("AlexGmail"));
        when(repository.getEventsBy(cinemaId.value())).thenReturn(history());
        useCase.addRepository(repository);

        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(command.getCinemaId().value())
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        var event= (ManagerAdded) events.get(0);
        Assertions.assertEquals("Alex", event.getNameManager().value());
        Assertions.assertEquals("AlexGmail", event.getEmail().value());
    }
    private List<DomainEvent> history() {
        var capacity = new Capacity(72);
        Set<Seat> seats = new HashSet<>();
        return List.of(
                new CinemaAdded(capacity, seats)
        );
    }

}

