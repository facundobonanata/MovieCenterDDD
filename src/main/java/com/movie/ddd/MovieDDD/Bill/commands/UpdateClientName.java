package com.movie.ddd.MovieDDD.Bill.commands;

import co.com.sofka.domain.generic.Command;
import com.movie.ddd.MovieDDD.Bill.entities.Client;
import com.movie.ddd.MovieDDD.Bill.values.BillId;
import com.movie.ddd.MovieDDD.Bill.values.Name;

public class UpdateClientName extends Command {
    private final BillId billId;
    private final Client client;
    private final Name name;


    public UpdateClientName(BillId billId, Client client, Name name) {
        this.billId = billId;
        this.client = client;
        this.name = name;
    }

    public BillId getBillId() {
        return billId;
    }

    public Client getClient() {
        return client;
    }

    public Name getName() {
        return name;
    }
}


