package com.movie.ddd.MovieDDD.Cinema.entities;

import co.com.sofka.domain.generic.Entity;
import com.movie.ddd.MovieDDD.Cinema.values.ManagerId;
import com.movie.ddd.MovieDDD.Cinema.values.Name;

public class Manager extends Entity<ManagerId> {
    private Name name;


    public Manager(ManagerId entityId, Name name) {
        super(entityId);
        this.name = name;
    }

    public Name getName() {
        return name;
    }
}




