package com.movie.ddd.MovieDDD.Bill.values;

import co.com.sofka.domain.generic.Identity;

public class BillId extends Identity {
    private BillId(String id) {
            super(id);
        }public BillId(){}

        public static BillId of(String id){
            return new BillId(id);
        }

    }

