package com.movie.ddd.MovieDDD.Cinema.commands;

import co.com.sofka.domain.generic.Command;
import com.movie.ddd.MovieDDD.Cinema.values.ManagerId;
import com.movie.ddd.MovieDDD.Cinema.values.Name;

public class AddManager extends Command {
    private final ManagerId managerId;
    private final Name name;

    public AddManager(ManagerId managerId, Name name) {
        this.managerId = managerId;
        this.name = name;
    }

    public ManagerId getManagerId() {
        return managerId;
    }

    public Name getName() {
        return name;
    }
}
