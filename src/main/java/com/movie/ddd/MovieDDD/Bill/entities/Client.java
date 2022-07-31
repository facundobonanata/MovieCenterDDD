package com.movie.ddd.MovieDDD.Bill.entities;

import co.com.sofka.domain.generic.Entity;
import com.movie.ddd.MovieDDD.Bill.values.ClientAdress;
import com.movie.ddd.MovieDDD.Bill.values.ClientId;
import com.movie.ddd.MovieDDD.Bill.values.Name;

import java.util.Objects;

public class Client extends Entity<ClientId> {
    private Name name;
    private ClientAdress adress;

    public Client(ClientId entityId){
        super(entityId);
    }
    public Client(ClientId entityId, Name name, ClientAdress adress){
        super(entityId);
        this.name =name;
        this.adress=adress;
    }
    public void updateName(Name name){
        this.name = Objects.requireNonNull(name);
    }

    public void updateClientAdress(ClientAdress adress){
        this.adress = Objects.requireNonNull(adress);
    }

    public Name getName() {
        return name;
    }

    public ClientAdress getAdress() {
        return adress;
    }
}
