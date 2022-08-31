package ELITE;

public class MovimientoDinero {
    private double monto ;
    private double capital;
    private String concepto;
    private String usuario;
    private int tiempoAnual;
    private double tasaInteres;

    
//------------------info---------------------------------------//   
//MONTO= VF = flujo netos de caja: Cantidad de dinero que se tiene que pagar o que se recibe al finalizar el plazo pactado

//i: ---------------------tasa de interés simple

//VF = VP*(1+i*n)

//------------------interes compuesto-------------------------
//VF=VP* [(1+i)^n]

 //------------------CONSTRUCTOR-----------------------------------------//   
    public MovimientoDinero(String usuario, double capital, double tasaInteres,int tiempoAnual, String concepto) {
        this.capital = capital;
        this.tiempoAnual =tiempoAnual;
        this.usuario = usuario;
        this.tasaInteres = tasaInteres;
        this.concepto = concepto;
    }

//---------------Calcular monto--------------------------------------//

    public void pagar(String[] cuenta ) {
        int total = 0;

        for (i = 0; i < cuenta.size ; i++){
            if (cuenta.equalsIgnoreCase ("Zapatos deportivos")){
                total += 200000;
            }
            if (cuenta.equalsIgnoreCase ("Zapatos casuales")){
                total += 180000;
            }
            if (cuenta.equalsIgnoreCase ("Zapatos elegantes")){
                total += 250000;
            }
        }
        switch (getConcepto()) {
            case "concepto efectivo mensual ":
                this.monto = getCapital() * Math.pow(1 + getTasaInteres() , getTiempoAnual()*12);
                break;
            case "concepto efectivo semestral ":
                this.monto = getCapital() * Math.pow((1 + getTasaInteres()), getTiempoAnual());
                break;
            case "concepto efectivo anual ":
                this.monto = getCapital() * Math.pow((1 + getTasaInteres()), getTiempoAnual()*2);
                break;
            case "concepto Contado ":
                this.monto = getCapital() / (1-getTasaInteres());
                break;
            default:
                System.out.println("datos incorrectos");
        }

    }

    public void montoPosNeg (){
        if (getMonto() < getCapital()){
            System.out.println("El monto es negativo");
        }
        if (getMonto() > getCapital()){
            System.out.println("El monto es positivo");
        }
        if (getMonto() == getCapital()){
            System.out.println("El monto es Nuetral");
        }
    }

    //-----------------GETTER AND SETTER

    public double getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(float tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
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

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public int getTiempoAnual() {
        return tiempoAnual;
    }

    public void setTiempoAnual(int tiempoAnual) {
        this.tiempoAnual = tiempoAnual;
    }
}
