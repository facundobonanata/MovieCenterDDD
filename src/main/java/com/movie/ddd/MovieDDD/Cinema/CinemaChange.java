package com.movie.ddd.MovieDDD.Cinema;

import co.com.sofka.domain.generic.EventChange;
import com.movie.ddd.MovieDDD.Cinema.entities.Manager;
import com.movie.ddd.MovieDDD.Cinema.entities.Movie;
import com.movie.ddd.MovieDDD.Cinema.events.*;


public class CinemaChange extends EventChange {
    public CinemaChange(Cinema cinema){
        apply((CinemaAdded event) ->{
            cinema.capacidad =event.getCapacidad();
            cinema.seats =event.getSeats();
        });

        apply((ManagerAdded event)-> {
            cinema.manager = new Manager(event.getManagerId(), event.getNameManager(), event.getEmail());
                });

        apply((UpdatedNameManager event)->{
            cinema.manager.UpdateNameManager(event.getNameManager().value());
        });

        apply((UpdatedEmailManager event)->{
            cinema.UpdateEmailManager(event.getManagerId(), event.getEmail(), event.getCinemaId());
        });

        apply((MovieAdded event)->{
            cinema.movie = new Movie(
                    event.getMovieId(),
                    event.getGender(),
                    event.getLanguage(),
                    event.getMovieName());
        });
       /* apply((UpdatedNameManager event)->{
            cinema.UpdateNameManager(event.getManagerId(),event.getName(), event.getCinemaId());
        });*/

    }

}
