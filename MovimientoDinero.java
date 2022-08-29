package com.elite.shoes;

public class MovimientoDinero {

    //Atributos
    private Long idMovimientoDinero;
    private Float monto;
    private double montoEsperado;
    private Float capital;
    private String concepto;
    private String usuario;
    private int tiempoAnual;
    private double tasaInteres;


    //Constructor

    public MovimientoDinero(String usuario, float capital, float tasaInteres,int tiempoAnual, String concepto) {
        this.capital = capital;
        this.tiempoAnual =tiempoAnual;
        this.usuario = usuario;
        this.tasaInteres = tasaInteres;
        this.concepto = concepto;

    }

    //Metodo Metodo Funcional

    public void calculoMonto() {
        switch (getConcepto()) {
            case "efectivo mensual":
                this.montoEsperado =  getCapital() * Math.pow(1 + getTasaInteres() , getTiempoAnual()*12);
                break;
            case "efectivo anual":
                this.montoEsperado = getCapital() * Math.pow((1 + getTasaInteres()), getTiempoAnual());
                break;
            case "efectivo semestral":
                this.montoEsperado = getCapital() * Math.pow((1 + getTasaInteres()), getTiempoAnual()*2);
                break;
            case "contado":
                this.montoEsperado = getCapital() / (1-getTasaInteres());
                System.out.println("Este es el monto de contado: " + this.montoEsperado);

                break;
            default:
                System.out.println("datos incorrectos");
        }

    }

    public void montoPosNeg (){
        if (getMonto() < getMontoEsperado()){
            System.out.println("El monto es negativo");
        }
        if (getMonto() > getMontoEsperado() || getMonto() == getMontoEsperado()){
            System.out.println("El monto es positivo");
        }
    }


    //Getters and Setters


    public Long getIdMovimientoDinero() {
        return idMovimientoDinero;
    }

    public void setIdMovimientoDinero(Long idMovimientoDinero) {
        this.idMovimientoDinero = idMovimientoDinero;
    }

    public Float getMonto() {
        return monto;
    }

    public void setMonto(Float monto) {
        this.monto = monto;
    }

    public double getMontoEsperado() {
        return montoEsperado;
    }

    public void setMontoEsperado(Float montoEsperado) {
        this.montoEsperado = montoEsperado;
    }

    public Float getCapital() {
        return capital;
    }

    public void setCapital(Float capital) {
        this.capital = capital;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getTiempoAnual() {
        return tiempoAnual;
    }

    public void setTiempoAnual(int tiempoAnual) {
        this.tiempoAnual = tiempoAnual;
    }

    public double getTasaInteres() {
        return tasaInteres;
    }

    @Override
    public String toString() {
        return "MovimientoDinero{" +
                "idMovimientoDinero=" + idMovimientoDinero +
                ", monto=" + monto +
                ", montoEsperado=" + montoEsperado +
                ", capital=" + capital +
                ", concepto='" + concepto + '\'' +
                ", usuario='" + usuario + '\'' +
                ", tiempoAnual=" + tiempoAnual +
                ", tasaInteres=" + tasaInteres +
                '}';
    }

    public void setTasaInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres;



    }

}