package com.movie.ddd.MovieDDD.Establecimiento.commands;

import co.com.sofka.domain.generic.Command;
import com.movie.ddd.MovieDDD.Establecimiento.values.*;

public class AddBillBoard extends Command {
    private final BillBoardId billBoardId;
    private final Price price;
    private final MovieBoard movieBoard;
    private final DateTime dateTime;
    private final EstablecimientoId establecimientoId;

    public AddBillBoard(BillBoardId billBoardId, Price price, EstablecimientoId establecimientoId, DateTime dateTime, MovieBoard movieBoard) {
        this.billBoardId = billBoardId;
        this.establecimientoId=establecimientoId;
        this.dateTime=dateTime;
        this.price = price;
        this.movieBoard = movieBoard;
    }

    public BillBoardId getBillBoardId() {
        return billBoardId;
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

    public EstablecimientoId getEstablecimientoId() {
        return establecimientoId;
    }
}
