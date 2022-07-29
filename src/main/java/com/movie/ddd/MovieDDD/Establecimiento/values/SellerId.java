package com.movie.ddd.MovieDDD.Establecimiento.values;

import co.com.sofka.domain.generic.Identity;

public class SellerId extends Identity {

        public SellerId(){

        }

        private SellerId(String id){
            super(id);
        }

        public static SellerId of(String id){
            return new SellerId(id);
        }

    }

