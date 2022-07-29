package com.movie.ddd.MovieDDD.Establecimiento.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.movie.ddd.MovieDDD.Establecimiento.entities.BillBoard;
import com.movie.ddd.MovieDDD.Establecimiento.entities.Seller;
import com.movie.ddd.MovieDDD.Establecimiento.values.Adress;
import com.movie.ddd.MovieDDD.Establecimiento.values.EstablecimientoId;
import com.movie.ddd.MovieDDD.Establecimiento.values.NameEstablecimiento;

public class EstablecimientoAdded extends DomainEvent {
    private final EstablecimientoId establecimientoId;
    private final NameEstablecimiento nameEstablecimiento;
    private final Adress adress;
    private final BillBoard billBoard;
    private final Seller seller;

    public EstablecimientoAdded(EstablecimientoId establecimientoId, NameEstablecimiento nameEstablecimiento, Adress adress,BillBoard billBoard, Seller seller) {
        super("com.movie.ddd.MovieDDD.establecimiento.establecimientoadded");
        this.establecimientoId = establecimientoId;
        this.nameEstablecimiento = nameEstablecimiento;
        this.adress = adress;
        this.billBoard = billBoard;
        this.seller = seller;
    }

    public EstablecimientoId getEstablecimientoId() {
        return establecimientoId;
    }

    public NameEstablecimiento getNameEstablecimiento() {
        return nameEstablecimiento;
    }

    public Adress getAdress() {
        return adress;
    }

    public BillBoard getBillBoard() {
        return billBoard;
    }
    public Seller getSeller(){
        return seller;
    }
}
