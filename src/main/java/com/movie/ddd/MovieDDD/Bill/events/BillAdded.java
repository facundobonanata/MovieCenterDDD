package com.movie.ddd.MovieDDD.Bill.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.movie.ddd.MovieDDD.Bill.entities.Client;
import com.movie.ddd.MovieDDD.Establecimiento.values.EstablecimientoId;

public class BillAdded  extends DomainEvent {
    private final EstablecimientoId establecimientoId;
    private final Client client;

    public BillAdded(EstablecimientoId establecimientoId, Client client) {
        super("com.movie.ddd.MovieDDD.bill.billadded");
        this.establecimientoId = establecimientoId;
        this.client = client;
    }

    public EstablecimientoId getEstablecimientoId() {
        return establecimientoId;
    }

    public Client getClient() {
        return client;
    }
}
