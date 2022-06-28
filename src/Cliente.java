public class Cliente {
    private String numero;
    private Cuenta cuenta;
    
    public Cliente(){}

    public Cliente(String numero, Cuenta cuenta){
      this.numero = numero;
      this.cuenta = cuenta;
    }

    public void setNumero(String numero){
      this.numero = numero;
    }

    public void setCuenta(Cuenta cuenta){
      this.cuenta = cuenta;
    }
  
    public String getNumero(){
      return this.numero;
    }

    public Cuenta getCuenta(){
      return this.cuenta;
    }

    public void abonar(double cantidad) {
      this.cuenta.abonar(cantidad);
    }

    public void retirar(double cantidad) {
      if(this.cuenta.getCapital() > cantidad){
        this.cuenta.retirar(cantidad);
      } else {
        System.out.println("Saldo insuficiente");
      }
    }

    public void pagarAnualidad(int index){
      double anualidad = this.cuenta.getTrajetas()[index].pagarAnualidad();
      if(this.cuenta.getCapital() > anualidad){
        this.cuenta.pagarAnualidad(anualidad);
      }
      else {
        System.out.print("Saldo insuficiente");
      }
    }
}
