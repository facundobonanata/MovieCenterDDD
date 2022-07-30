package com.movie.ddd.MovieDDD.Establecimiento.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.movie.ddd.MovieDDD.Establecimiento.Establecimiento;
import com.movie.ddd.MovieDDD.Establecimiento.commands.AddSeller;

public class AddSellerUseCase extends UseCase<RequestCommand<AddSeller>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AddSeller> addSellerRequestCommand) {
        var command = addSellerRequestCommand.getCommand();
        var establecimiento = Establecimiento.from(command.getEstablecimientoId(), repository().getEventsBy(command.getEstablecimientoId().value()));

        establecimiento.AddSeller(command.getEntityId(), command.getSellerName());
        emit().onResponse(new ResponseEvents(establecimiento.getUncommittedChanges()));

    }
}
