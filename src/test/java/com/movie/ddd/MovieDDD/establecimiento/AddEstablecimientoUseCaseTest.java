package com.movie.ddd.MovieDDD.establecimiento;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import com.movie.ddd.MovieDDD.Establecimiento.commands.AddEstablecimiento;
import com.movie.ddd.MovieDDD.Establecimiento.events.EstablecimientoAdded;
import com.movie.ddd.MovieDDD.Establecimiento.usecases.AddEstablecimientoUseCase;
import com.movie.ddd.MovieDDD.Establecimiento.values.Adress;
import com.movie.ddd.MovieDDD.Establecimiento.values.EstablecimientoId;
import com.movie.ddd.MovieDDD.Establecimiento.values.NameEstablecimiento;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class AddEstablecimientoUseCaseTest {

     @Test
    public void addNewEstablecimiento(){
        //arrange
         var id = new EstablecimientoId();
         var name= new NameEstablecimiento("Movie center Portones");
         var adress = new Adress("Portones Shopping");
         var command = new AddEstablecimiento(id, name, adress);
         var useCase = new AddEstablecimientoUseCase();
         //act
         List<DomainEvent> events = UseCaseHandler.getInstance()
                 .syncExecutor(useCase, new RequestCommand<>(command))
                 .orElseThrow()
                 .getDomainEvents();

         //assert
         EstablecimientoAdded event = (EstablecimientoAdded) events.get(0);
         Assertions.assertEquals("Movie center Portones", event.getNameEstablecimiento().value());
         Assertions.assertEquals("Portones Shopping", event.getAdress().value());
     }
}
