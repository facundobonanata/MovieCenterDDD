package com.movie.ddd.MovieDDD.Bill.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.movie.ddd.MovieDDD.Bill.Bill;
import com.movie.ddd.MovieDDD.Bill.commands.AddTicket;

public class AddTicketUseCase extends UseCase<RequestCommand<AddTicket>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AddTicket> addTicketRequestCommand) {

        var command = addTicketRequestCommand.getCommand();
        var bill = Bill.from(
                command.getBillId(), repository().getEventsBy(command.getBillId().value())
        );

        bill.AddCinemaTicket(command.getCinemaTicketId(), command.getDescription(), command.getValue(), command.getExpirationDate());

        emit().onResponse(new ResponseEvents(bill.getUncommittedChanges()));
    }
}

