package com.elite.shoes.ShoesApplication.controladores;

import com.elite.shoes.ShoesApplication.entidades.MovimientoDinero;
import com.elite.shoes.ShoesApplication.servicios.ServiciosMovimientoDinero;
import org.springframework.web.bind.annotation.*;

@RestController
public class controlMovimientoDinero {

    ServiciosMovimientoDinero servicesMov;

    ServiciosMovimientoDinero movimiento1;

    //Constructor
    public controlMovimientoDinero(ServiciosMovimientoDinero serviciosMov){
        this.servicesMov = serviciosMov;
    }
    //Metodos CRUD

    /*
    @GetMapping("/verMovimiento/{id}")
    public MovimientoDinero verMovimiento(@PathVariable Long id){
        return this.servicesMov.getVerMovimiento(id);
    }

     */
    @PostMapping("/verMovimiento")
    public MovimientoDinero crearMovimiento(@RequestBody MovimientoDinero m){
        return this.servicesMov.crearMovimiento(m);
    }
    @PutMapping("/verMovimiento/{id}")
    public MovimientoDinero actualizarMovimiento(@PathVariable Long id, @RequestBody MovimientoDinero md){
        return this.servicesMov.actualizarMovimiento(id, md);
    }
    @DeleteMapping("eliminarMov/{id}")
    public MovimientoDinero eliminarMovimiento(@PathVariable(value="id") Long id){
        return this.servicesMov.eliminarMovimiento(id);
    }
    /*
    //Constructor
    public controlMovimientoDinero(){
        this.movimiento1 = new ServiciosMovimientoDinero();
    }
    //Metodo
    @GetMapping("VerMovimientos")
    public MovimientoDinero controlMovimientoDinero(){
        return this.movimiento1.getMovimientoDinero();
    }

     */
}
