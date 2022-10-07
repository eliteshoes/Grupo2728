package com.elite.shoes.ShoesApplication.controladores;

import com.elite.shoes.ShoesApplication.entidades.Empresa;
import com.elite.shoes.ShoesApplication.servicios.serviciosEmpresa;
import org.springframework.web.bind.annotation.*;

@RestController
public class controlEmpresa {

    serviciosEmpresa servicesEmp;

    //constructor

    public controlEmpresa(serviciosEmpresa servicesEmp){
        this.servicesEmp = servicesEmp;
    }
    //Metodos CRUD
    //Get pero mediante nit
    @GetMapping("/verEmpresa/{id}")
    public Empresa verEmpresa(@PathVariable Long id){
        return this.servicesEmp.getVerEmpresa(id);
    }
    @PostMapping("/verEmpresa")
    public Empresa crearEmpresa(@RequestBody Empresa e){
        return this.servicesEmp.crearEmpresa(e);
    }
    @PutMapping("/verEmpresa/{id}")
    public Empresa actualizarEmpresa(@PathVariable Long id, @RequestBody Empresa actEmp){
        return this.servicesEmp.actualizarEmp(id, actEmp);
    }
    @DeleteMapping("eliminarEmp/{id}")
    public Empresa eliminarEmpresa(@PathVariable(value="id") Long id){
        return this.servicesEmp.eliminarEmp(id);
    }

}
