package com.movie.ddd.MovieDDD.Cinema.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.movie.ddd.MovieDDD.Cinema.Cinema;
import com.movie.ddd.MovieDDD.Cinema.commands.UpdateManagerEmail;

public class UpdateEmailManagerUseCase extends UseCase<RequestCommand<UpdateManagerEmail>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<UpdateManagerEmail> updateManagerEmailRequestCommand){
        var command = updateManagerEmailRequestCommand.getCommand();
        var cinema = Cinema.from(command.getCinemaId(), retrieveEvents(command.getCinemaId().value()));

        cinema.UpdateEmailManager(command.getManagerId(),command.getEmail(),command.getCinemaId());
        emit().onResponse(new ResponseEvents(cinema.getUncommittedChanges()));
    }



}
