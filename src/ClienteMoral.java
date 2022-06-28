public class ClienteMoral extends Cliente {
    private String razon;
    private String numeroRegistro;
    private String rfc;
    
    public ClienteMoral(){}

    public ClienteMoral(String numero, Cuenta cuenta, String razon, String numeroRegistro, String rfc){
      setNumero(numero);
      setCuenta(cuenta);
      this.razon = razon;
      this.numeroRegistro = numeroRegistro;
      this.rfc = rfc;
    }

    public void setRazon(String razon){
      this.razon = razon;
    }

    public void setNumeroRegistro(String numeroRegistro){
      this.numeroRegistro = numeroRegistro;
    }

    public void setRFC(String rfc){
      this.rfc = rfc;
    }

    public String getRazon() {
      return this.razon;
    }

    public String getNumeroRegistro() {
      return this.numeroRegistro;
    }

    public String getRFC() {
      return this.rfc;
    }
    
    public void convertToString(){
      System.out.println(this.razon + " (" + this.getNumero() + ") " + "\nNumero de registro: " + this.numeroRegistro + "\nRFC: " + this.rfc);
      System.out.println("\n");
      this.getCuenta().convertToString();
    }
}
