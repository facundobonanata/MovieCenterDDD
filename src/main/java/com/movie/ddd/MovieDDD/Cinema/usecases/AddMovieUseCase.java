package com.movie.ddd.MovieDDD.Cinema.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.movie.ddd.MovieDDD.Cinema.Cinema;
import com.movie.ddd.MovieDDD.Cinema.commands.AddMovie;

public class AddMovieUseCase extends UseCase<RequestCommand<AddMovie>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AddMovie> addMovieRequestCommand) {

        var command = addMovieRequestCommand.getCommand();
        var cinema = Cinema.from(command.getCinemaId(), repository().getEventsBy(command.getCinemaId().value())
        );

        cinema.AddMovie(command.getMovieId(), command.getMovieName(), command.getGender(), command.getLanguage());

        emit().onResponse(new ResponseEvents(cinema.getUncommittedChanges()));

    }
}

