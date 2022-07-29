package com.movie.ddd.MovieDDD.Cinema;

import co.com.sofka.domain.generic.EventChange;
import com.movie.ddd.MovieDDD.Cinema.events.*;

import java.util.HashSet;

public class CinemaChange extends EventChange {
    public CinemaChange(Cinema cinema){
        apply((CinemaAdded event) ->{
            cinema.seats = new HashSet<>();
            cinema.movie =event.getMovie();
            cinema.manager=event.getManager();
            cinema.name =event.getName();
        });
        apply((UpdatedNameManager event)->{
            cinema.UpdateNameManager(event.getManagerId(),event.getName(), event.getCinemaId());
        });
        apply((ManagerAdded event)->{
            cinema.AddManager(event.getManagerId(),event.getName());
        });
        apply((UpdatedGenderMovie event)->{
            cinema.UpdateGenderMovie(event.getMovieId(),event.getGender());
        });
        apply((UpdatedLanguageMovie event)->{
            cinema.UpdateLanguageMovie(event.getMovieId(),event.getLanguage());
        });
        apply((MovieAdded event)->{
            cinema.AddMovie(event.getMovieId(),event.getGender(), event.getLanguage());
        });
        apply((UpdatedNameManager event)->{
            cinema.UpdateNameManager(event.getManagerId(),event.getName(), event.getCinemaId());
        });

    }

}
