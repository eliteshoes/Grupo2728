package com.elite.shoes.ShoesApplication.entidades;




import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="MovimientoDinero")
public class MovimientoDinero {
    @Id
    private Long registroMovimiento;
    @Column(name="fecha")
    private String fecha;
    @Column(name="monto")
    private static Double monto;

//Nuevos Argumentos
    @Column(name="movimiento")
    private double movimiento;
    @Column(name="tipoDeGasto")
    private String tipoDeGasto;

    //Nuevo Atributo

    //private Empresa empresa;

    @ManyToOne(optional= false)
    @JoinColumn(name="documentoDeIdentidad")
    private Empleado empleado;



    //private int[] gastosFijos = {4000000, 1000000, 500000};

    //private int[] listaDeCompras;

    //private int total;


//------------------info---------------------------------------//
//MONTO= VF = flujo netos de caja: Cantidad de dinero que se tiene que pagar o que se recibe al finalizar el plazo pactado

//i: ---------------------tasa de interés simple

//VF = VP*(1+i*n)

//------------------interes compuesto-------------------------
//VF=VP* [(1+i)^n]

    //------------------CONSTRUCTOR-----------------------------------------//

    public MovimientoDinero() {
    }

    /*
    public MovimientoDinero(String fecha, Empleado empleado, String usuario,
                            Double movimiento, String tipoDeGasto) {
        this.usuario = usuario;
        this.fecha = fecha;
        this.monto = 10000000.0;
        this.movimiento = movimiento;
        this.tipoDeGasto = tipoDeGasto;
        //this.empresa = empresa;
        this.empleado = empleado;
    }

     */


    //this.listaDeCompras = listaDeCompras;

    //for (int i = 0; i < 100; i++) {
    //    listaDeCompras[i] = 0;


//---------------Calcular monto--------------------------------------//

    /*
    public void pagar(String[] cuenta ) {
        int total = 0;

        for (int i = 0; i < cuenta.size ; i++) {
            if (cuenta.equalsIgnoreCase("Zapatos deportivos")) {
                total += 200000;
            }
            if (cuenta.equalsIgnoreCase("Zapatos casuales")) {
                total += 180000;
            }
            if (cuenta.equalsIgnoreCase("Zapatos elegantes")) {
                total += 250000;
            }
            return total;
        }

        for (int i = 0; i < 100; i++){
            if (" ".equals(listaDeCompras[i])) {
                listaDeCompras[i] = total;
                break;
            }
        }


     */
      /*  public void CalculoGanancias(){
            int totalPositivo = 0;
            int totalNegativo = 0;
            for (int i = 0; i < listaDeCompras.length; i++){
                totalPositivo = totalPositivo + listaDeCompras[i];
            }
            // Total Negativo:
            for (int i = 0; i < gastosFijos.length; i++){
                totalNegativo = totalNegativo + gastosFijos[i];
            }
        }
        */

    public Long getRegistroMovimiento() {
        return this.registroMovimiento;
    }


    public void setRegistroMovimiento(Long registroMovimiento) {
        this.registroMovimiento = registroMovimiento;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public Double getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(Double movimiento) {
        this.movimiento = movimiento;
    }

    public String getTipoDeGasto() {
        return tipoDeGasto;
    }

    public void setTipoDeGasto(String tipoDeGasto) {
        this.tipoDeGasto = tipoDeGasto;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    /*
    @Override
    public String toString() {
        return "MovimientoDinero{" +
                ", fecha='" + fecha + '\'' +
                "usuario='" + usuario + '\'' +
                ", monto=" + monto +
                ", movimiento=" + movimiento +
                ", tipoDeGasto='" + tipoDeGasto + '\'' +
                ", empleado=" + empleado +
                '}';
    }

     */


    // Metodo Funcional


        public static Object[] Resultados(List<MovimientoDinero> Datos){



        for (int i = 0; i < Datos.size(); i++) {

            Double monto = Datos.get(i).getMonto();

            if (Datos.get(i).getTipoDeGasto() == "ingreso") {
                Datos.get(i).setMonto(Datos.get(i).getMonto() + Datos.get(i).getMovimiento());
                System.out.println("El Monto actual es " + Datos.get(i).getMonto());
            }
            if (Datos.get(i).getTipoDeGasto() == "egreso") {
                Datos.get(i).setMonto(Datos.get(i).getMonto() - Datos.get(i).getMovimiento());
                System.out.println("El Monto actual es " + Datos.get(i).getMonto());

            }

        }
        Object[] resultado = {monto};
        return resultado;

    }

}

