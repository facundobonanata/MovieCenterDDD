package com.movie.ddd.MovieDDD.Establecimiento.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.movie.ddd.MovieDDD.Establecimiento.values.EstablecimientoId;
import com.movie.ddd.MovieDDD.Establecimiento.values.NameEstablecimiento;

public class EstablecimientoNameUpdated extends DomainEvent {
    private final NameEstablecimiento nameEstablecimiento;
    private final EstablecimientoId establecimientoId;

    public EstablecimientoNameUpdated(EstablecimientoId establecimientoId,NameEstablecimiento nameEstablecimiento) {
        super("com.movie.ddd.MovieDDD.cinema.establecimientonameupdated");
        this.nameEstablecimiento = nameEstablecimiento;
        this.establecimientoId = establecimientoId;
    }

    public NameEstablecimiento getNameEstablecimiento() {
        return nameEstablecimiento;
    }

    public EstablecimientoId getEstablecimientoId() {
        return establecimientoId;
    }
}
