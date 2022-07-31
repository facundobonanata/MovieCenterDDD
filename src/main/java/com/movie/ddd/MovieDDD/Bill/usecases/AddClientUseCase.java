package com.movie.ddd.MovieDDD.Bill.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.movie.ddd.MovieDDD.Bill.Bill;
import com.movie.ddd.MovieDDD.Bill.commands.AddClient;

public class AddClientUseCase extends UseCase<RequestCommand<AddClient>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AddClient> addClientRequestCommand) {
        var command = addClientRequestCommand.getCommand();
        var bill = Bill.from(command.getBillId(), repository().getEventsBy(command.getBillId().value()));

        bill.AddClient(command.getClientId(), command.getName(), command.getClientAdress());
        emit().onResponse(new ResponseEvents(bill.getUncommittedChanges()));

    }
}

