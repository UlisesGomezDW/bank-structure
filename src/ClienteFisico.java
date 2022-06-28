public class ClienteFisico extends Cliente {
    private String nombre;
    private int edad;
    private String estadoCivil;
    
    public ClienteFisico(){}

    public ClienteFisico(String numero, Cuenta cuenta, String nombre, int edad, String estadoCivil){
      setNumero(numero);
      setCuenta(cuenta);
      this.nombre = nombre;
      this.edad = edad;
      this.estadoCivil = estadoCivil;
    }

    public void setNombre(String nombre){
      this.nombre = nombre;
    }

    public void setEdad(int edad){
      this.edad = edad;
    }

    public void setRazon(String estadoCivil){
      this.estadoCivil = estadoCivil;
    }

    public String getNombre(){
      return this.nombre;
    }

    public int getEdad(){
      return this.edad;
    }

    public String estadoCivil(){
      return this.estadoCivil;
    }
    
    public void convertToString(){
        System.out.println(this.nombre + " (" + this.getNumero() + ") " + "\nEdad: " + this.edad + "\nEstado Civil: " + this.estadoCivil);  
        System.out.println("\n");
        this.getCuenta().convertToString();
    }
}
