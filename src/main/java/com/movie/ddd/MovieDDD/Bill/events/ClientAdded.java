package com.movie.ddd.MovieDDD.Bill.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.movie.ddd.MovieDDD.Bill.values.ClientAdress;
import com.movie.ddd.MovieDDD.Bill.values.ClientId;
import com.movie.ddd.MovieDDD.Bill.values.Name;

public class ClientAdded extends DomainEvent {
    private final ClientId clientId;
    private final ClientAdress clientAdress;
    private final Name name;

    public ClientAdded(ClientId clientId, ClientAdress clientAdress, Name name) {
        super("com.movie.ddd.MovieDDD.bill.clientadded");
        this.clientId = clientId;
        this.clientAdress = clientAdress;
        this.name = name;
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
