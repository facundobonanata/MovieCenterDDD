package com.movie.ddd.MovieDDD.Cinema;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.movie.ddd.MovieDDD.Cinema.entities.Manager;
import com.movie.ddd.MovieDDD.Cinema.entities.Movie;
import com.movie.ddd.MovieDDD.Cinema.entities.Seat;
import com.movie.ddd.MovieDDD.Cinema.events.*;
import com.movie.ddd.MovieDDD.Cinema.values.CinemaId;
import com.movie.ddd.MovieDDD.Cinema.values.*;


import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Cinema extends AggregateEvent<CinemaId> {

    protected Capacity capacity;
    protected Manager manager;
    protected Movie movie;
    protected Set<Seat> seats;


    public Cinema(CinemaId entityId, Capacity capacity, Set<Seat> seats){
    super(entityId);
    appendChange(new CinemaAdded(capacity, seats)).apply();

}
private Cinema(CinemaId entityId){
    super(entityId);
    subscribe((new CinemaChange(this)));
}

public static Cinema from(CinemaId cinemaId, List<DomainEvent> events){
    var cinema = new Cinema(cinemaId);
    events.forEach((cinema::applyEvent));
    return cinema;
}
public void UpdateNameManager(ManagerId managerId, NameManager nameManager) {
    appendChange(new UpdatedNameManager(nameManager)).apply();
}
public void AddManager(ManagerId entityId, NameManager nameManager, Email email) {
    Objects.requireNonNull(entityId);
    Objects.requireNonNull(email);
    Objects.requireNonNull(nameManager);
    appendChange(new ManagerAdded(entityId, nameManager, email)).apply();
}

public void UpdateEmailManager(ManagerId managerId, Email email, CinemaId cinemaId){
        appendChange(new UpdatedEmailManager(managerId, email, cinemaId));
}

    public void AddMovie(MovieId movieId, MovieName movieName, Gender gender, Language language){
    Objects.requireNonNull(gender);
    Objects.requireNonNull(language);
    Objects.requireNonNull(movieName);
    appendChange(new MovieAdded(movieId,movieName, language, gender)).apply();
}

    public Movie movieId(){
    return movie;
    }
    public Manager manager(){
    return manager;
    }
    public Capacity capacity(){
        return capacity;
    }

    public Set<Seat> seats(){
        return seats;
    }
}


