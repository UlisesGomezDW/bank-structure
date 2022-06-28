public class TarjetaCredito extends Tarjeta {
    private double limite;
    private double deuda;
    
    public TarjetaCredito(){}

    public TarjetaCredito(String numero, String fecha, double limite, double deuda){
        super();
        setNumero(numero);
        setFecha(fecha);
        this.limite = limite;
        this.deuda = deuda;
    }
    
    public double pagarAnualidad(){
        return this.deuda * 0.15;
    }

    public void convertToString(){
         System.out.println("-Credito -> No:" + this.getNumero() + " Fecha de vencimiento:" + this.getFecha() + " Limite:" + this.limite + " Deuda:"+this.deuda);
    }
}
