package com.movie.ddd.MovieDDD.Establecimiento.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class MovieBoard implements ValueObject<String> {
        private final String value;

        public MovieBoard(String value) {
            this.value = Objects.requireNonNull(value);
            if (this.value.isBlank()){
                throw new IllegalArgumentException("Película sin definir");
            }
        }

        public String value() {
            return value;
        }
    }

