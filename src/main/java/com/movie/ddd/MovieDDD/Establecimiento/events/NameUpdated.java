package com.movie.ddd.MovieDDD.Establecimiento.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.movie.ddd.MovieDDD.Establecimiento.values.SellerId;
import com.movie.ddd.MovieDDD.Establecimiento.values.SellerName;

public class NameUpdated extends DomainEvent {
    private final SellerId sellerId;
    private final SellerName sellerName;

    public NameUpdated(SellerId sellerId, SellerName sellerName) {
        super("com.movie.ddd.MovieDDD.cinema.nameupdated");
        this.sellerId = sellerId;
        this.sellerName = sellerName;
    }

    public SellerId getSellerId() {
        return sellerId;
    }

    public SellerName getSellerName() {
        return sellerName;
    }
}
