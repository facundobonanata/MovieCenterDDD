package com.movie.ddd.MovieDDD.Establecimiento.commands;

import co.com.sofka.domain.generic.Command;
import com.movie.ddd.MovieDDD.Establecimiento.values.EstablecimientoId;
import com.movie.ddd.MovieDDD.Establecimiento.values.NameEstablecimiento;

public class UpdateEstablecimientoName extends Command {
    private final EstablecimientoId establecimientoId;
    private final NameEstablecimiento nameEstablecimiento;

    public UpdateEstablecimientoName(EstablecimientoId establecimientoId, NameEstablecimiento nameEstablecimiento) {
        this.establecimientoId = establecimientoId;
        this.nameEstablecimiento = nameEstablecimiento;
    }

    public EstablecimientoId getEstablecimientoId() {
        return establecimientoId;
    }

    public NameEstablecimiento getNameEstablecimiento() {
        return nameEstablecimiento;
    }
}
