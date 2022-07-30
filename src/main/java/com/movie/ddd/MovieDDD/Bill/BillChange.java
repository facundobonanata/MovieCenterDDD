package com.movie.ddd.MovieDDD.Bill;

import co.com.sofka.domain.generic.EventChange;
import com.movie.ddd.MovieDDD.Bill.events.BillAdded;
import com.movie.ddd.MovieDDD.Bill.events.ClientNameUpdated;
import com.movie.ddd.MovieDDD.Bill.events.TicketDescriptionUpdated;
import com.movie.ddd.MovieDDD.Bill.values.Value;

public class BillChange extends EventChange {
    public BillChange(Bill bill){
        apply((BillAdded event)->{
            bill.establecimientoId = event.getEstablecimientoId();
            bill.client=event.getClient();
            bill.value=new Value(0);
        });
        apply((ClientNameUpdated event)->{
            bill.client =event.getClient();
        });
    }
}
