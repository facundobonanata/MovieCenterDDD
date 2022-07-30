package com.movie.ddd.MovieDDD.Bill.commands;

import co.com.sofka.domain.generic.Command;
import com.movie.ddd.MovieDDD.Bill.entities.Client;
import com.movie.ddd.MovieDDD.Bill.values.BillId;
import com.movie.ddd.MovieDDD.Establecimiento.Establecimiento;
import com.movie.ddd.MovieDDD.Establecimiento.values.EstablecimientoId;

public class AddBill extends Command {
    private final BillId entityId;
    private final EstablecimientoId establecimientoId;
    private Client client;

    public AddBill(BillId entityId, EstablecimientoId establecimientoId, Client client) {
        this.entityId = entityId;
        this.establecimientoId = establecimientoId;
        this.client = client;
    }

    public BillId getEntityId() {
        return entityId;
    }

    public EstablecimientoId getEstablecimientoId() {
        return establecimientoId;
    }

    public Client getClient() {
        return client;
    }
}
