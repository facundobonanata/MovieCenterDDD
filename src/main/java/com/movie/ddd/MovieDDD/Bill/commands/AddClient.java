package com.movie.ddd.MovieDDD.Bill.commands;

import co.com.sofka.domain.generic.Command;
import com.movie.ddd.MovieDDD.Bill.values.BillId;
import com.movie.ddd.MovieDDD.Bill.values.ClientAdress;
import com.movie.ddd.MovieDDD.Bill.values.ClientId;
import com.movie.ddd.MovieDDD.Bill.values.Name;

public class AddClient extends Command {
    private final BillId billId;
    private final ClientId clientId;
    private final ClientAdress clientAdress;
    private final Name name;

    public AddClient(BillId billId, ClientId clientId, ClientAdress clientAdress, Name name) {
        this.billId = billId;
        this.clientId = clientId;
        this.clientAdress = clientAdress;
        this.name = name;
    }

    public BillId getBillId() {
        return billId;
    }

    public ClientId getClientId() {
        return clientId;
    }

    public ClientAdress getClientAdress() {
        return clientAdress;
    }

    public Name getName() {
        return name;
    }
}
