public class Cuenta {
    private String numero;
    private double capital;
    private String tipo;
    private Tarjeta tarjetas[];
    
    public Cuenta(){}

    public Cuenta(String numero, double capital, String tipo, Tarjeta[] tarjetas){
        this.numero = numero;
        this.capital = capital;
        this.tipo = tipo;
        this.tarjetas = tarjetas;
    }

    public void setNumero(String numero){
        this.numero = numero;
    }

    public void setCapital(double capital){
        this.capital = capital;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public void setTarjeta(Tarjeta[] tarjetas){
        this.tarjetas = tarjetas;
    }

    public String getNumero(){
        return this.numero;
    }

    public double getCapital(){
        return this.capital;
    }

    public String getTipo(){
        return this.tipo;
    }

    public Tarjeta[] getTrajetas(){
        return this.tarjetas;
    }

    public void abonar(double cantidad){
        this.capital = this.capital + cantidad;
    }

    public void retirar(double cantidad){
        this.capital = this.capital - cantidad;
    }

    public void pagarAnualidad(double anualidad){
        this.capital = this.capital - anualidad;
    }
    
    public void convertToString(){
        System.out.println("CUENTA");
        System.out.println("No:" + this.numero + "\nCapital:" + this.capital + "\nTipo:" + this.tipo);
        System.out.println("\nTARJETAS");
        
        for(int i = 0; i < this.tarjetas.length; i++){
            this.tarjetas[i].convertToString();
        }
        
    }
}
