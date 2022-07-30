package com.movie.ddd.MovieDDD.Bill.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.movie.ddd.MovieDDD.Bill.Bill;
import com.movie.ddd.MovieDDD.Bill.commands.AddBill;

public class AddBillUseCase extends UseCase<RequestCommand<AddBill>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AddBill> addBillRequestCommand) {

        var command = addBillRequestCommand.getCommand();
        var bill = new Bill(command.getEntityId(), command.getEstablecimientoId(), command.getClient());

        emit().onResponse(new ResponseEvents(bill.getUncommittedChanges()));
    }
}

