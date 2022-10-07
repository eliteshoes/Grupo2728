
package com.elite.shoes.ShoesApplication.controladores;

import com.elite.shoes.ShoesApplication.entidades.Empleado;
import com.elite.shoes.ShoesApplication.servicios.serviciosEmpleados;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@RestController
public class controlEmpleado {
/*
    serviciosEmpleados servicesE;

    //constructor

    public controlEmpleado (serviciosEmpleados sevicesE){
        this.servicesE = sevicesE;

    }

    @GetMapping("/vista1")
    public String visualizar(){
        return "Primera vista de una web con Spring Boot";
    }
    @GetMapping("/vista2")
    public Empleado controlEmpleado(){
        Empleado empleado1 = new Empleado(9386676, "Carlos", "carll@gmail.com",
                "Compensar","cajero",null);
        return empleado1;
    }

 */
    serviciosEmpleados services;

    //Constructor del controlador

    public controlEmpleado(serviciosEmpleados services){

        this.services = services;
    }

    //Metodo para visualizar las listas de empleados de serviciosEmpleados
   /* @GetMapping("/verEmpleado")
    public List<Empleado> verEmpleado(){
        return this.services.getListaEmpleados();
    }

    @GetMapping("/verEmpleado/{id}")
    public Empleado llamarEmpleado(@PathVariable long id){
        return this.services.getLlamarEmpleado(id);
    }

    */

    //Esto es lo nuevo implementando las herramientas del JPA

    @PostMapping("/empleado")
        public RedirectView crearEmpleado(@ModelAttribute Empleado e, Model model){
        model.addAttribute(e);
        this.services.crearEmpleado(e);
        return new RedirectView("/empleado");

    }

    @PutMapping("/empleado/{id}")
    public RedirectView actualizarEmpleado(@PathVariable Long id, Empleado actEmpleado){
        this.services.actualizarE(id, actEmpleado);
        return new RedirectView("/empleado");
    }

    /*
    @PutMapping("empleado/{id}")
    public Empleado actualizarEmpleado(@PathVariable Long id, @RequestBody Empleado actEmpleado){
        return this.services.actualizarE(id, actEmpleado);
    }

     */
//Metodo para eliminar

    @DeleteMapping("/eliminar/{id}")
    public RedirectView eliminarEmpleado (@PathVariable(value ="id") Long id){
        this.services.eliminarE(id);
        return new RedirectView("/empleado");
    }

    /*
    @DeleteMapping("/eliminar/{id}")
    public Empleado eliminarEmpleado (@PathVariable(value ="id") Long id){
        return this.services.eliminarE(id);
    }
     */
}

