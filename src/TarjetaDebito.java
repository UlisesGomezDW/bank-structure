public class TarjetaDebito extends Tarjeta {
    private double saldo;
    
    public TarjetaDebito(){}

    public TarjetaDebito(String numero, String fecha, double saldo){
        super();
        setNumero(numero);
        setFecha(fecha);
        this.saldo = saldo;
    }
    
    
    public double pagarAnualidad(){
        double anualidad = 0;
        if(this.saldo > 10000){
            anualidad = this.saldo * 0.1;
        }
        else {
            anualidad =  this.saldo * 0.3;
        }
        return anualidad;
    }
    
    public void convertToString(){
         System.out.println("-Debito -> No:" + this.getNumero() + " Fecha de vencimiento:" + this.getFecha() + " Saldo:" + this.saldo);
    }
}
