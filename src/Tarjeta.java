abstract class Tarjeta {
    private String numero;
    private String fecha;
    
    public Tarjeta(){}

    public Tarjeta(String numero, String fecha){
        this.numero = numero;
        this.fecha = fecha;
    }

    public abstract double pagarAnualidad();

    public abstract void convertToString();

    public void setNumero(String numero){
        this.numero = numero;
    }

    public void setFecha(String fecha){
        this.fecha = fecha;
    }

    public String getNumero(){
        return this.numero;
    }

    public String getFecha(){
        return this.fecha;
    }
}
