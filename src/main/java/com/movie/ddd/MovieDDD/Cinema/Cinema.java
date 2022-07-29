package com.movie.ddd.MovieDDD.Cinema;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.movie.ddd.MovieDDD.Cinema.entities.Manager;
import com.movie.ddd.MovieDDD.Cinema.entities.Movie;
import com.movie.ddd.MovieDDD.Cinema.entities.Seat;
import com.movie.ddd.MovieDDD.Cinema.events.CinemaAdded;
import com.movie.ddd.MovieDDD.Cinema.events.ManagerAdded;
import com.movie.ddd.MovieDDD.Cinema.events.UpdatedNameManager;
import com.movie.ddd.MovieDDD.Cinema.values.CinemaId;
import com.movie.ddd.MovieDDD.Cinema.values.*;

import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Cinema extends AggregateEvent<CinemaId> {
protected Manager manager;
protected Movie movie;
protected Set<Seat> seats;

public Cinema(CinemaId entityId, Manager manager, Set<Seat> seats){
    super(entityId);
    appendChange(new CinemaAdded(seats, movie, manager)).apply();
}
private Cinema(CinemaId entityId){
    super(entityId);
    subscribe(new CinemaChange(this));
}
public static Cinema from(CinemaId cinemaId, List<DomainEvent> events){
    var cinema = new Cinema(cinemaId);
    events.forEach(cinema::applyEvent);
    return cinema;
}

public void UpdateNameManager(ManagerId managerId, Name name){
    Objects.requireNonNull(managerId);
    Objects.requireNonNull(name);
    //Objects.requireNonNull(cinemaId);
    appendChange(new UpdatedNameManager(managerId,name));
}

    public void AddManager(ManagerId managerId, Name name){
        Objects.requireNonNull(managerId);
        Objects.requireNonNull(name);
        appendChange(new ManagerAdded(managerId,name));
    }
}

