  package com.elite.shoes;

public class Empleado {

    //Atributos
    private Long id;
    private String nombreEmpleado;
    private String correo;
    private String perteneceALaEmpresa;
    private String rolEmpleado;

    //Nuevo Atributo
    private Empresa empresas;

    //Constructor

    public Empleado(Long id, String nombreEmpleado, String correo, String perteneceALaEmpresa, String rolEmpleado, Empresa empresas) {
        this.id = id;
        this.nombreEmpleado = nombreEmpleado;
        this.correo = correo;
        this.perteneceALaEmpresa = perteneceALaEmpresa;
        this.rolEmpleado = rolEmpleado;
        this.empresas = empresas;
    }

    //Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPerteneceALaEmpresa() {
        return perteneceALaEmpresa;
    }

    public void setPerteneceALaEmpresa(String perteneceALaEmpresa) {
        this.perteneceALaEmpresa = perteneceALaEmpresa;
    }

    public String getRolEmpleado() {
        return rolEmpleado;
    }

    public void setRolEmpleado(String rolEmpleado) {
        this.rolEmpleado = rolEmpleado;
    }

    public Empresa getEmpresas() {
        return empresas;
    }

    public void setEmpresas(Empresa empresas) {
        this.empresas = empresas;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombreEmpleado='" + nombreEmpleado + '\'' +
                ", correo='" + correo + '\'' +
                ", perteneceALaEmpresa='" + perteneceALaEmpresa + '\'' +
                ", rolEmpleado='" + rolEmpleado + '\'' +
                ", empresas=" + empresas +
                '}';
    }
}