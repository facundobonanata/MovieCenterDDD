package com.movie.ddd.MovieDDD.Bill;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.movie.ddd.MovieDDD.Bill.entities.CinemaTicket;
import com.movie.ddd.MovieDDD.Bill.entities.Client;
import com.movie.ddd.MovieDDD.Bill.events.BillAdded;
import com.movie.ddd.MovieDDD.Bill.events.ClientAdded;
import com.movie.ddd.MovieDDD.Bill.events.ClientNameUpdated;
import com.movie.ddd.MovieDDD.Bill.events.TicketAdded;
import com.movie.ddd.MovieDDD.Bill.values.*;
import com.movie.ddd.MovieDDD.Cinema.events.ManagerAdded;
import com.movie.ddd.MovieDDD.Cinema.values.Email;
import com.movie.ddd.MovieDDD.Cinema.values.ManagerId;
import com.movie.ddd.MovieDDD.Cinema.values.NameManager;
import com.movie.ddd.MovieDDD.Establecimiento.values.EstablecimientoId;

import java.util.List;
import java.util.Objects;

public class Bill extends AggregateEvent<BillId> {
    protected EstablecimientoId establecimientoId;
    protected Client client;
    protected Value value;
    protected CinemaTicket cinemaTicket;

    public Bill(BillId entityId, EstablecimientoId establecimientoId, Client client) {
        super(entityId);
        appendChange(new BillAdded(establecimientoId, client)).apply();
    }
    private Bill(BillId billId){
        super(billId);
        subscribe(new BillChange(this));
    }
    public static Bill from(BillId billId, List<DomainEvent> events){
        var bill = new Bill(billId);
        events.forEach(bill::applyEvent);
        return bill;
    }

    public void UpdateClientName(Client client, Name name){
        appendChange(new ClientNameUpdated(client, name)).apply();
    }
    public void AddClient(ClientId clientId, Name name, ClientAdress clientAdress) {
        Objects.requireNonNull(clientId);
        Objects.requireNonNull(clientAdress);
        Objects.requireNonNull(name);
        appendChange(new ClientAdded(clientId, clientAdress, name)).apply();

    }
        public void AddCinemaTicket(CinemaTicketId entityId, Description description, Value value, ExpirationDate expirationDate){
        appendChange(new TicketAdded(entityId, description, value, expirationDate)).apply();
    }
    public EstablecimientoId establecimientoId(){
        return establecimientoId;
    }
    public Client client(){
        return client;
    }
    public Value value(){
        return value;
    }
    public void setValue(Value value){
        this.value=value;
    }
    public CinemaTicket cinemaTicket(){
        return cinemaTicket;
    }


}
