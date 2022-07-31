package com.movie.ddd.MovieDDD.Cinema.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.movie.ddd.MovieDDD.Cinema.Cinema;
import com.movie.ddd.MovieDDD.Cinema.commands.UpdateNameManager;

public class UpdateNameManagerUseCase extends UseCase<RequestCommand <UpdateNameManager>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<UpdateNameManager> updateNameManagerRequestCommand){
        var command = updateNameManagerRequestCommand.getCommand();
        var cinema = Cinema.from(command.getCinemaId(), repository().getEventsBy(command.getCinemaId().value()));

        cinema.UpdateNameManager(command.getManagerId(), command.getNameManager());
        emit().onResponse(new ResponseEvents(cinema.getUncommittedChanges()));
    }
}
