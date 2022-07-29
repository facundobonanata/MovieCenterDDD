package com.movie.ddd.MovieDDD.Cinema;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.movie.ddd.MovieDDD.Cinema.entities.Manager;
import com.movie.ddd.MovieDDD.Cinema.entities.Movie;
import com.movie.ddd.MovieDDD.Cinema.events.*;
import com.movie.ddd.MovieDDD.Cinema.values.CinemaId;
import com.movie.ddd.MovieDDD.Cinema.values.*;


import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Cinema extends AggregateEvent<CinemaId> {

    protected Name name;
    protected Manager manager;
    protected Movie movie;
    protected Set<Seat> seats = new HashSet<>();

public Cinema(CinemaId entityId, Name name, Set<Seat> seats, Movie movie, Manager manager){
    super(entityId);
    Objects.requireNonNull(name);
    Objects.requireNonNull(seats);
    Objects.requireNonNull(movie);
    Objects.requireNonNull(manager);
    appendChange(new CinemaAdded(entityId,name, seats,movie,manager));

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
public void UpdateNameManager(ManagerId managerId, Name name, CinemaId cinemaId){
    Objects.requireNonNull(managerId);
    Objects.requireNonNull(name);
    Objects.requireNonNull(cinemaId);
    appendChange(new UpdatedNameManager(managerId, name, cinemaId));
}
public void AddManager(ManagerId managerId, Name name){
    Objects.requireNonNull(managerId);
    Objects.requireNonNull(name);
    appendChange(new ManagerAdded(managerId, name));

}
public void AddMovie(MovieId movieId, Gender gender, Language language){
    Objects.requireNonNull(movieId);
    Objects.requireNonNull(gender);
    Objects.requireNonNull(language);
    appendChange(new MovieAdded(movieId, language, gender));
}
public void UpdateLanguageMovie(MovieId movieId, Language language){
    Objects.requireNonNull(movieId);
    Objects.requireNonNull(language);
    appendChange(new UpdatedLanguageMovie(movieId, language));
}
    public void UpdateGenderMovie(MovieId movieId, Gender gender){
        Objects.requireNonNull(movieId);
        Objects.requireNonNull(gender);
        appendChange(new UpdatedGenderMovie(movieId, gender));
    }
    public Name name(){
    return name;
    }
    public Set<Seat> seats(){
    return seats;
    }
    public Movie movie(){
    return movie;
    }
    public Manager manager(){
    return manager;
    }
}


