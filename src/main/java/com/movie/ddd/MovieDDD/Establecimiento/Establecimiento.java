package com.movie.ddd.MovieDDD.Establecimiento;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.movie.ddd.MovieDDD.Establecimiento.entities.BillBoard;
import com.movie.ddd.MovieDDD.Establecimiento.entities.Seller;
import com.movie.ddd.MovieDDD.Establecimiento.events.*;
import com.movie.ddd.MovieDDD.Establecimiento.values.*;

import java.util.List;

public class Establecimiento  extends AggregateEvent<EstablecimientoId> {
    NameEstablecimiento nameEstablecimiento;
    Adress adress;
    BillBoard billBoard;

    Seller seller;

    public Establecimiento(EstablecimientoId entityId, NameEstablecimiento nameEstablecimiento, Adress adress, BillBoard billBoard, Seller seller) {
        super(entityId);
        appendChange(new EstablecimientoAdded(entityId, nameEstablecimiento, adress, billBoard, seller));
    }
        private Establecimiento(EstablecimientoId establecimientoId){
            super(establecimientoId);
            subscribe(new EstablecimientoChange(this));
        }

        public static Establecimiento from(EstablecimientoId establecimientoId, List<DomainEvent> events){
        var establecimiento = new Establecimiento(establecimientoId);
        events.forEach(establecimiento::applyEvent);
        return establecimiento;

    }
    public void UpdateEstablecimientoName(EstablecimientoId establecimientoId, NameEstablecimiento nameEstablecimiento){
        appendChange(new EstablecimientoNameUpdated(establecimientoId, nameEstablecimiento)).apply();
    }
    public void UpdateName(SellerId sellerId, SellerName sellerName){
        appendChange(new NameUpdated(sellerId, sellerName)).apply();
    }

    public void UpdatePriceBillBoard(EstablecimientoId establecimientoId, Price price){
        appendChange(new PriceBillBoardUpdated(price, establecimientoId)).apply();
    }
    public void AddSeller(SellerId sellerId, SellerName sellerName){
        appendChange(new SellerAdded(sellerId, sellerName)).apply();
    }
    public BillBoard billBoard(){
        return billBoard;
    }
    public Establecimiento establecimiento(){
        return establecimiento();
    }
    public NameEstablecimiento nameEstablecimiento(){
        return nameEstablecimiento;
    }
    public Adress adress(){
        return adress;
    }
}
