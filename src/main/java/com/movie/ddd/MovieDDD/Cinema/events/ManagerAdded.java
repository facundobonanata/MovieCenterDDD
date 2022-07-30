package com.movie.ddd.MovieDDD.Cinema.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.movie.ddd.MovieDDD.Cinema.values.Email;
import com.movie.ddd.MovieDDD.Cinema.values.ManagerId;
import com.movie.ddd.MovieDDD.Cinema.values.NameManager;

public class ManagerAdded extends DomainEvent {
    private final ManagerId entityId;
    private final NameManager nameManager;
    private final Email email;

    public ManagerAdded(ManagerId entityId, NameManager nameManager, Email email) {
        super("com.movie.ddd.MovieDDD.cinema.manageradded");
        this.entityId = entityId;
        this.nameManager = nameManager;
        this.email=email;
    }

    public ManagerId getManagerId() {
        return entityId;
    }

    public Email getEmail() {
        return email;
    }

    public NameManager getNameManager() {
        return nameManager;

    }

}
