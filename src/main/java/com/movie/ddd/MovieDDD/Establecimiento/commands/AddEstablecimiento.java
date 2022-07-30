package com.movie.ddd.MovieDDD.Establecimiento.commands;

import co.com.sofka.domain.generic.Command;
import com.movie.ddd.MovieDDD.Establecimiento.values.Adress;
import com.movie.ddd.MovieDDD.Establecimiento.values.EstablecimientoId;
import com.movie.ddd.MovieDDD.Establecimiento.values.NameEstablecimiento;

public class AddEstablecimiento extends Command {
    private final EstablecimientoId entityId;
    private final NameEstablecimiento nameEstablecimiento;
    private final Adress adress;


    public AddEstablecimiento(EstablecimientoId entityId, NameEstablecimiento nameEstablecimiento, Adress adress) {
        this.entityId = entityId;
        this.nameEstablecimiento = nameEstablecimiento;
        this.adress = adress;
    }

    public EstablecimientoId getEntityId() {
        return entityId;
    }

    public NameEstablecimiento getNameEstablecimiento() {
        return nameEstablecimiento;
    }

    public Adress getAdress() {
        return adress;
    }


}
