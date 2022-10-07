package com.elite.shoes.ShoesApplication.entidades;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="Empresa")
public class Empresa {
    /*
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
*/

    // Atributos
    @Id
    private Long nit;
    @Column (name = "nombreEmpresa")
    private String nombreEmpresa;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "telefono")
    private String telefono;


    // Nuevo Atributo

    //private MovimientoDinero movimientoDineros;
/*
    @OneToMany
    @JoinColumn(name = "documentoDeIdentidad")
    private Empleado empleado;

*/
    @OneToMany(mappedBy = "empresa")
    private Set<Empleado> empleado;

    // Constructor

    public Empresa() {
    }
/*
    public Empresa(String nombreEmpresa, String direccion, String telefono, int nit) {
        this.nombreEmpresa = nombreEmpresa;
        this.direccion = direccion;
        this.telefono = telefono;

        //this.movimientoDineros = movimientoDineros;
        //this.empleado = empleado;
    }

 */

    // Getters and Setters


    public Set<Empleado> getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Set<Empleado> empleado) {
        this.empleado = empleado;
    }

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

/*
    @Override
    public String toString() {
        return "Empresa{" +
                "nombreEmpresa='" + nombreEmpresa + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", nit=" + nit +
                '}';
    }

 */
}
