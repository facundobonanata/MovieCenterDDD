package com.movie.ddd.MovieDDD.Cinema.entities;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generic.Entity;
import com.movie.ddd.MovieDDD.Cinema.values.ManagerId;
import com.movie.ddd.MovieDDD.Cinema.values.Name;
import com.movie.ddd.MovieDDD.Cinema.values.NameManager;

import java.util.List;
import java.util.Objects;

public class Manager extends Entity<ManagerId> {
    private NameManager nameManager;


    public Manager(ManagerId entityId, NameManager nameManager) {
        super(entityId);
        this.nameManager = nameManager;
    }

    public void updateNameManager(NameManager name){
        this.nameManager = Objects.requireNonNull(name);
    }

    public NameManager getNameManager() {
        return nameManager;
    }
}




