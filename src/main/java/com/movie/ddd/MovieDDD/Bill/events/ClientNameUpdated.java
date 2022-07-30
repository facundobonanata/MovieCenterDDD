package com.movie.ddd.MovieDDD.Bill.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.movie.ddd.MovieDDD.Bill.entities.Client;
import com.movie.ddd.MovieDDD.Bill.values.Name;

public class ClientNameUpdated extends DomainEvent {
    private final Client client;
    private final Name name;

    public ClientNameUpdated(Client client, Name name) {
        super("com.movie.ddd.MovieDDD.bill.clientnameupdated");
        this.client = client;
        this.name = name;
    }

    public Client getClient() {
        return client;
    }

    public Name getName() {
        return name;
    }
}
