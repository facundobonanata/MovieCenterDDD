package com.movie.ddd.MovieDDD.Establecimiento.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.movie.ddd.MovieDDD.Establecimiento.values.BillBoardId;
import com.movie.ddd.MovieDDD.Establecimiento.values.DateTime;
import com.movie.ddd.MovieDDD.Establecimiento.values.MovieBoard;
import com.movie.ddd.MovieDDD.Establecimiento.values.Price;

public class BillBoardAdded extends DomainEvent {
    private final Price price;
    private final BillBoardId billBoardId;
    private final MovieBoard movieBoard;
    private final DateTime dateTime;

    public BillBoardAdded(Price price, BillBoardId billBoardId, MovieBoard movieBoard, DateTime dateTime) {
        super("com.movie.ddd.MovieDDD.establecimiento.billboardadded");
        this.price = price;
        this.dateTime=dateTime;
        this.billBoardId = billBoardId;
        this.movieBoard = movieBoard;
    }

    public Price getPrice() {
        return price;
    }

    public BillBoardId getBillBoardId() {
        return billBoardId;
    }

    public MovieBoard getMovieBoard() {
        return movieBoard;
    }

    public DateTime getDateTime() {
        return dateTime;
    }
}
