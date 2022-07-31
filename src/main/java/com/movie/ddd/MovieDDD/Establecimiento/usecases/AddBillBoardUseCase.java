package com.movie.ddd.MovieDDD.Establecimiento.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.movie.ddd.MovieDDD.Establecimiento.Establecimiento;
import com.movie.ddd.MovieDDD.Establecimiento.commands.AddBillBoard;

public class AddBillBoardUseCase extends UseCase<RequestCommand<AddBillBoard>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AddBillBoard> addBillBoardRequestCommand) {

        var command = addBillBoardRequestCommand.getCommand();
        var establecimiento = Establecimiento.from(command.getEstablecimientoId(), repository().getEventsBy(command.getEstablecimientoId().value())
        );

        establecimiento.AddBillBoard(command.getBillBoardId(), command.getPrice(), command.getMovieBoard(), command.getDateTime());

        emit().onResponse(new ResponseEvents(establecimiento.getUncommittedChanges()));

    }
}


