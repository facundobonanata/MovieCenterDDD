package com.movie.ddd.MovieDDD.cinema;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import com.movie.ddd.MovieDDD.Cinema.commands.UpdateManagerEmail;
import com.movie.ddd.MovieDDD.Cinema.entities.Seat;
import com.movie.ddd.MovieDDD.Cinema.events.CinemaAdded;
import com.movie.ddd.MovieDDD.Cinema.events.ManagerAdded;
import com.movie.ddd.MovieDDD.Cinema.events.UpdatedEmailManager;
import com.movie.ddd.MovieDDD.Cinema.usecases.UpdateEmailManagerUseCase;
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
public class UpdateEmailManagerUseCaseTest {

    @Mock
    DomainEventRepository repository;

    @InjectMocks
    UpdateEmailManagerUseCase useCase;

    @Test
    void updateEmail(){
        var cinemaId = CinemaId.of("Movie1");
        var command = new UpdateManagerEmail(new Email("Alonsito21@Viera.com"), new ManagerId(), cinemaId);
        when(repository.getEventsBy(cinemaId.value())).thenReturn(history());
        useCase.addRepository(repository);

        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        var event = (UpdatedEmailManager)events.get(0);
        Assertions.assertEquals("Alonsito21@Viera.com", event.getEmail().value());

    }
    private List<DomainEvent> history() {
        var capacity = new Capacity(72);
        Set<Seat> seats = new HashSet<>();
        var managerId = ManagerId.of("Movie1");
        var name = new NameManager("Argelio Rodolfino");
        var email = new Email("Areglito@gmail.com");
        return List.of(
                new CinemaAdded(capacity, seats),
                new ManagerAdded(managerId, name, email));

    }
}
