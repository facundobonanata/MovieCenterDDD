package com.movie.ddd.MovieDDD.Cinema.commands;

import co.com.sofka.domain.generic.Command;
import com.movie.ddd.MovieDDD.Cinema.values.SeatId;
import com.movie.ddd.MovieDDD.Cinema.values.SeatType;

public class AddSeat extends Command {
    private final SeatId seatId;
    private final SeatType seatType;

    public AddSeat(SeatId seatId, SeatType seatType) {
        this.seatId = seatId;
        this.seatType = seatType;
    }

    public SeatId getSeatId() {
        return seatId;
    }

    public SeatType getSeatType() {
        return seatType;
    }
}
