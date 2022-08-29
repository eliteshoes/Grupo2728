package com.elite.shoes;

public class Empresa {

    // Atributos
    private String nombreEmpresa;
    private String direccion;
    private String telefono;
    private Long nit;

    // Nuevo Atributo
    private MovimientoDinero movimientoDineros;

    // Constructor

    public Empresa(String nombreEmpresa, String direccion, String telefono, Long nit, MovimientoDinero movimientoDineros) {
        this.nombreEmpresa = nombreEmpresa;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nit = nit;
        this.movimientoDineros = movimientoDineros;
    }

    // Getters and Setters


    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Long getNit() {
        return nit;
    }

    public void setNit(Long nit) {
        this.nit = nit;
    }

    public MovimientoDinero getMovimientoDineros() {
        return movimientoDineros;
    }

    public void setMovimientoDineros(MovimientoDinero movimientoDineros) {
        this.movimientoDineros = movimientoDineros;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombreEmpresa='" + nombreEmpresa + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", nit=" + nit +
                ", movimientoDineros=" + movimientoDineros +
                '}';
    }
}