package com.movie.ddd.MovieDDD.Establecimiento;

import co.com.sofka.domain.generic.EventChange;
import com.movie.ddd.MovieDDD.Cinema.entities.Movie;
import com.movie.ddd.MovieDDD.Cinema.events.MovieAdded;
import com.movie.ddd.MovieDDD.Establecimiento.entities.BillBoard;
import com.movie.ddd.MovieDDD.Establecimiento.entities.Seller;
import com.movie.ddd.MovieDDD.Establecimiento.events.*;

public class EstablecimientoChange extends EventChange {
    public EstablecimientoChange(Establecimiento establecimiento){

        apply((EstablecimientoAdded event)->{
            establecimiento.nameEstablecimiento = event.getNameEstablecimiento();
            establecimiento.adress = event.getAdress();

        });

        apply((SellerAdded event)->{
           establecimiento.seller = new Seller(event.getSellerId(), event.getSellerName()) ;
        });

        apply((NameUpdated event)->{
            establecimiento.UpdateName(event.getSellerId(), event.getSellerName());

        });
        apply((EstablecimientoNameUpdated event)->{
            establecimiento.UpdateEstablecimientoName(event.getEstablecimientoId(), event.getNameEstablecimiento());
        });

        apply((BillBoardAdded event)->{
            establecimiento.billBoard = new BillBoard(event.getBillBoardId(), event.getPrice(), event.getMovieBoard(), event.getDateTime());
        });

    }
}
