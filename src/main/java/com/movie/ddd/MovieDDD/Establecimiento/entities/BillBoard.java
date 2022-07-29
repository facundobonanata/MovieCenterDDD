package com.movie.ddd.MovieDDD.Establecimiento.entities;

import co.com.sofka.domain.generic.Entity;
import com.movie.ddd.MovieDDD.Establecimiento.values.*;

public class BillBoard extends Entity <BillBoardId> {
    private Price price;
    private MovieBoard movieBoard;
    private DateTime dateTime;

    public BillBoard(BillBoardId entityId, Price price, MovieBoard movieBoard, DateTime dateTime) {
        super(entityId);
        this.price = price;
        this.movieBoard = movieBoard;
        this.dateTime = dateTime;
    }

    public Price getPrice() {
        return price;
    }

    public MovieBoard getMovieBoard() {
        return movieBoard;
    }

    public DateTime getDateTime() {
        return dateTime;
    }
}
