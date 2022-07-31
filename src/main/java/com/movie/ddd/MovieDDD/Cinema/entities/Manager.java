package com.movie.ddd.MovieDDD.Cinema.entities;

import co.com.sofka.domain.generic.Entity;
import com.movie.ddd.MovieDDD.Cinema.values.Email;
import com.movie.ddd.MovieDDD.Cinema.values.ManagerId;
import com.movie.ddd.MovieDDD.Cinema.values.NameManager;

import java.util.Objects;


public class Manager extends Entity<ManagerId> {
    private NameManager nameManager;
    private Email email;


    public Manager(ManagerId entityId, NameManager nameManager, Email email) {
        super(entityId);
        this.nameManager = nameManager;
        this.email=email;
    }

    public NameManager getNameManager() {
        return nameManager;
    }
    public void UpdateNameManager(String updateNameM) {
        this.nameManager = nameManager.UpdateNameManager(updateNameM);
    }


    public Email getEmail() {
        return email;
    }
    public NameManager nameManager(){
        return nameManager;
    }
}




