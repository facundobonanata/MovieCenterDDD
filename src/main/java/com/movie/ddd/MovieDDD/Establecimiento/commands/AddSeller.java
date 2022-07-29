package com.movie.ddd.MovieDDD.Establecimiento.commands;

import co.com.sofka.domain.generic.Command;
import com.movie.ddd.MovieDDD.Establecimiento.values.SellerId;
import com.movie.ddd.MovieDDD.Establecimiento.values.SellerName;

public class AddSeller extends Command {
    private final SellerId sellerId;
    private final SellerName sellerName;

    public AddSeller(SellerId sellerId, SellerName sellerName) {
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
