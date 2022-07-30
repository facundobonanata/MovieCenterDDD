package com.movie.ddd.MovieDDD.Establecimiento.commands;

import co.com.sofka.domain.generic.Command;
import com.movie.ddd.MovieDDD.Establecimiento.values.EstablecimientoId;
import com.movie.ddd.MovieDDD.Establecimiento.values.SellerId;
import com.movie.ddd.MovieDDD.Establecimiento.values.SellerName;

public class AddSeller extends Command {

    private final SellerId entityId;
    private final EstablecimientoId establecimientoId;
    private final SellerName sellerName;

    public AddSeller(SellerId entityId, SellerName sellerName, EstablecimientoId establecimientoId) {
        this.entityId = entityId;
        this.sellerName = sellerName;
        this.establecimientoId=establecimientoId;
    }

    public SellerId getEntityId() {
        return entityId;
    }

    public SellerName getSellerName() {
        return sellerName;
    }

    public EstablecimientoId getEstablecimientoId() {
        return establecimientoId;
    }
}
