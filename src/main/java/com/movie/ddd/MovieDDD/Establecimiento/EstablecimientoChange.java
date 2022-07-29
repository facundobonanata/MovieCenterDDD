package com.movie.ddd.MovieDDD.Establecimiento;

import co.com.sofka.domain.generic.EventChange;
import com.movie.ddd.MovieDDD.Establecimiento.events.EstablecimientoAdded;
import com.movie.ddd.MovieDDD.Establecimiento.events.EstablecimientoNameUpdated;
import com.movie.ddd.MovieDDD.Establecimiento.events.NameUpdated;
import com.movie.ddd.MovieDDD.Establecimiento.events.PriceBillBoardUpdated;

public class EstablecimientoChange extends EventChange {
    public EstablecimientoChange(Establecimiento establecimiento){

        apply((EstablecimientoAdded event)->{
            establecimiento.nameEstablecimiento = event.getNameEstablecimiento();
            establecimiento.adress = event.getAdress();
            establecimiento.billBoard = event.getBillBoard();
            establecimiento.seller = event.getSeller();

        });

        apply((NameUpdated event)->{
            establecimiento.UpdateName(event.getSellerId(), event.getSellerName());

        });
        apply((EstablecimientoNameUpdated event)->{
            establecimiento.UpdateEstablecimientoName(event.getEstablecimientoId(), event.getNameEstablecimiento());
        });

        apply((PriceBillBoardUpdated event)->{
            establecimiento.UpdatePriceBillBoard(event.getEstablecimientoId(),event.getPrice());
        });
    }
}
