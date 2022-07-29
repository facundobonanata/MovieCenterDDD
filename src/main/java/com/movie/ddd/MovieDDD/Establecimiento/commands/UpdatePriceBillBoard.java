package com.movie.ddd.MovieDDD.Establecimiento.commands;

import co.com.sofka.domain.generic.Command;
import com.movie.ddd.MovieDDD.Establecimiento.values.EstablecimientoId;
import com.movie.ddd.MovieDDD.Establecimiento.values.Price;

public class UpdatePriceBillBoard extends Command {
    private final EstablecimientoId establecimientoId;
    private final Price price;

    public UpdatePriceBillBoard(EstablecimientoId establecimientoId, Price price) {
        this.establecimientoId = establecimientoId;
        this.price = price;
    }

    public EstablecimientoId getEstablecimientoId() {
        return establecimientoId;
    }

    public Price getPrice() {
        return price;
    }
}
