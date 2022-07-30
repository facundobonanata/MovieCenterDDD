package com.movie.ddd.MovieDDD.Cinema.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.movie.ddd.MovieDDD.Cinema.Cinema;
import com.movie.ddd.MovieDDD.Cinema.commands.AddManager;

public class AddManagerUseCase extends UseCase<RequestCommand<AddManager>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AddManager> addManagerRequestCommand){
        var command = addManagerRequestCommand.getCommand();
        var cinema = Cinema.from(command.getCinemaId(), repository().getEventsBy(command.getCinemaId().value()));
    }
}
