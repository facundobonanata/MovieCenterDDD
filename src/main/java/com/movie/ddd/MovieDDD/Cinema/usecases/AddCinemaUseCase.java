package com.movie.ddd.MovieDDD.Cinema.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.movie.ddd.MovieDDD.Cinema.Cinema;
import com.movie.ddd.MovieDDD.Cinema.commands.AddCinema;

public class AddCinemaUseCase extends UseCase<RequestCommand<AddCinema>, ResponseEvents> {


    @Override
    public void executeUseCase(RequestCommand<AddCinema> addCinemaRequestCommand) {
        var command = addCinemaRequestCommand.getCommand();
        var cinema = new Cinema(command.getCinemaId(), command.getName(),command.getSeats(), command.getMovie(),command.getManager());
        emit().onResponse(new ResponseEvents(cinema.getUncommittedChanges()));
    }
}

