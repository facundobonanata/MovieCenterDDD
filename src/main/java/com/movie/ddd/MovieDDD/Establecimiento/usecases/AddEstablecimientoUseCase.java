package com.movie.ddd.MovieDDD.Establecimiento.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.movie.ddd.MovieDDD.Establecimiento.Establecimiento;
import com.movie.ddd.MovieDDD.Establecimiento.commands.AddEstablecimiento;

public class AddEstablecimientoUseCase extends UseCase<RequestCommand<AddEstablecimiento>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AddEstablecimiento> addEstablecimientoRequestCommand) {

        var command = addEstablecimientoRequestCommand.getCommand();
        var establecimiento = new Establecimiento(command.getEntityId(), command.getNameEstablecimiento(), command.getAdress());

        emit().onResponse(new ResponseEvents(establecimiento.getUncommittedChanges()));
    }
}

