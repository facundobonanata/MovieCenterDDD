package com.movie.ddd.MovieDDD.Cliente.values;

import co.com.sofka.domain.generic.Identity;

public class MembershipCardId extends Identity {
    private MembershipCardId(String id) {
        super(id);
    }

    public MembershipCardId(){}

    public static MembershipCardId of(String id){
        return new MembershipCardId(id);
    }

}

