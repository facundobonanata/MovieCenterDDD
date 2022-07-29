package com.movie.ddd.MovieDDD.Cinema;

import co.com.sofka.domain.generic.EventChange;
import com.movie.ddd.MovieDDD.Cinema.events.CinemaAdded;
import com.movie.ddd.MovieDDD.Cinema.events.ManagerAdded;
import com.movie.ddd.MovieDDD.Cinema.events.UpdatedNameManager;

public class CinemaChange extends EventChange {
    public CinemaChange(Cinema cinema){
        apply((CinemaAdded event) ->{
           cinema.seats = event.getSeats();
           cinema.movie = event.getMovie();
           cinema.manager = event.getManager();
        });
        apply((UpdatedNameManager event)->{
            cinema.UpdateNameManager(event.getManagerId(),event.getName());
        });
        apply((ManagerAdded event)->{
            cinema.AddManager(event.getManagerId(),event.getName());
        });
    }
}
