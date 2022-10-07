package com.elite.shoes.ShoesApplication.servicios;

import com.elite.shoes.ShoesApplication.entidades.Empleado;
import com.elite.shoes.ShoesApplication.entidades.MovimientoDinero;
import com.elite.shoes.ShoesApplication.repositorios.repositorioMovimientoDinero;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiciosMovimientoDinero {

//Atributo
    private repositorioMovimientoDinero repositorioMov;

    //Constructor

public ServiciosMovimientoDinero(repositorioMovimientoDinero repositorioMov){
    this.repositorioMov = repositorioMov;
}

    public List<MovimientoDinero> getListaMovimientos() {
        return this.repositorioMov.findAll();
    }

//Metodo CRUD
    public MovimientoDinero crearMovimiento(MovimientoDinero nuevoMov){
    return this.repositorioMov.save(nuevoMov);
    }
    public MovimientoDinero getVerMovimiento(Long id){
    return this.repositorioMov.findById(id).orElseThrow();
    }
    public MovimientoDinero actualizarMovimiento(Long id, MovimientoDinero md){
    MovimientoDinero movimientoActual =  this.repositorioMov.findById(id).orElseThrow();
    movimientoActual.setMovimiento(md.getMovimiento());
    movimientoActual.setTipoDeGasto(md.getTipoDeGasto());
    return this.repositorioMov.save(movimientoActual);
    }
    public MovimientoDinero eliminarMovimiento(Long id){
    MovimientoDinero movimientoActual = this.repositorioMov.findById(id).orElseThrow();
    this.repositorioMov.deleteById(id);
    return movimientoActual;
    }
    /*
    MovimientoDinero compra1;

    serviciosEmpleados empl1 = new serviciosEmpleados();

    //Constructor
    public ServiciosMovimientoDinero(){
        Empleado prof1 = this.empl1.empleado1;
        this.compra1 = new MovimientoDinero("01-01-2022",  prof1, "Camilo",
                100000.0, "egreso");
    }


    public MovimientoDinero getMovimientoDinero(){
        return compra1;
    }

     */
}
