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

        /*apply((UpdatedNameManager event)->{
            cinema.UpdateNameManager(event.getManagerId(),event.getName(), event.getCinemaId());
        });*/

        apply((UpdatedGenderMovie event)->{
            cinema.UpdateGenderMovie(event.getMovieId(),event.getGender());
        });
        apply((UpdatedLanguageMovie event)->{
            cinema.UpdateLanguageMovie(event.getMovieId(),event.getLanguage());
        });
        apply((MovieAdded event)->{
            if(cinema.movie != null){
                throw new IllegalArgumentException("Asigne una pelicula");
            }
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
