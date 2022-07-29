package com.movie.ddd.MovieDDD.Establecimiento.entities;

import co.com.sofka.domain.generic.Entity;
import com.movie.ddd.MovieDDD.Establecimiento.values.SellerId;
import com.movie.ddd.MovieDDD.Establecimiento.values.SellerName;

public class Seller extends Entity<SellerId> {
    private SellerName sellerName;

    public Seller(SellerId entityId, SellerName sellerName) {
        super(entityId);
        this.sellerName = sellerName;
    }

    public SellerName getSellerName() {
        return sellerName;
    }
}
