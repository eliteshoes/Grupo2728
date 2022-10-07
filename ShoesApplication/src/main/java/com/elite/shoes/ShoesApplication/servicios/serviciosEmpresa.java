package com.elite.shoes.ShoesApplication.servicios;

import com.elite.shoes.ShoesApplication.entidades.Empleado;
import com.elite.shoes.ShoesApplication.entidades.Empresa;
import com.elite.shoes.ShoesApplication.repositorios.repositorioEmpresa;
import org.springframework.stereotype.Service;

@Service
public class serviciosEmpresa {

    private repositorioEmpresa repositorioEmp;

    //Constructor
    public serviciosEmpresa(repositorioEmpresa repositorioEmp){
        this.repositorioEmp = repositorioEmp;
    }
    //Metodos CRUD
    public Empresa getVerEmpresa(Long id){
        return this.repositorioEmp.findById(id).orElseThrow();
    }
    public Empresa crearEmpresa(Empresa nuevaEmp){
        return this.repositorioEmp.save(nuevaEmp);
    }
    public Empresa actualizarEmp(Long id, Empresa e){
        Empresa EmpActual = repositorioEmp.findById(id).orElseThrow();
        EmpActual.setNombreEmpresa(e.getNombreEmpresa());
        EmpActual.setDireccion(e.getDireccion());
        EmpActual.setTelefono(e.getTelefono());

        return this.repositorioEmp.save(EmpActual);
    }
    public Empresa eliminarEmp(Long id){
        Empresa EmpActual = repositorioEmp.findById(id).orElseThrow();
        this.repositorioEmp.deleteById(id);
        return EmpActual;
    }
}
