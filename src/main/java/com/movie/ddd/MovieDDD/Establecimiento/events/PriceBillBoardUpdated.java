package com.movie.ddd.MovieDDD.Establecimiento.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.movie.ddd.MovieDDD.Establecimiento.values.EstablecimientoId;
import com.movie.ddd.MovieDDD.Establecimiento.values.Price;

public class PriceBillBoardUpdated extends DomainEvent {
    private final Price price;
    private final EstablecimientoId establecimientoId;

    public PriceBillBoardUpdated(Price price, EstablecimientoId establecimientoId) {
        super("com.movie.ddd.MovieDDD.cinema.pricebillboardupdated");
        this.price = price;
        this.establecimientoId=establecimientoId;
    }

    public Price getPrice() {
        return price;
    }

    public EstablecimientoId getEstablecimientoId() {
        return establecimientoId;
    }
}
