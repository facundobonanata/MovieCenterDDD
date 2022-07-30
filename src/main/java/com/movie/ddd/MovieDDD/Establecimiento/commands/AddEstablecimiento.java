package com.movie.ddd.MovieDDD.Establecimiento.commands;

import co.com.sofka.domain.generic.Command;
import com.movie.ddd.MovieDDD.Establecimiento.values.Adress;
import com.movie.ddd.MovieDDD.Establecimiento.values.EstablecimientoId;
import com.movie.ddd.MovieDDD.Establecimiento.values.NameEstablecimiento;

public class AddEstablecimiento extends Command {
    private final EstablecimientoId establecimientoId;
    private final NameEstablecimiento nameEstablecimiento;
    private final Adress adress;


    public AddEstablecimiento(EstablecimientoId establecimientoId, NameEstablecimiento nameEstablecimiento, Adress adress) {
        this.establecimientoId = establecimientoId;
        this.nameEstablecimiento = nameEstablecimiento;
        this.adress = adress;
    }

    public EstablecimientoId getEntityId() {
        return establecimientoId;
    }

    public NameEstablecimiento getNameEstablecimiento() {
        return nameEstablecimiento;
    }

    public Adress getAdress() {
        return adress;
    }


}
