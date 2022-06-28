import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tarjeta[] t = new Tarjeta[] {new TarjetaDebito("0888", "252", 2500)};
        Cuenta c1 = new Cuenta("055", 255, "O", t);
        
        ClienteFisico cliente1 = new ClienteFisico("01", c1, "Alf", 22, "Soltero");
        cliente1.abonar(500);
        cliente1.convertToString();

        System.out.print("\nAAAAA\n");

        Tarjeta[] t2 = new Tarjeta[] {new TarjetaDebito("0888", "252", 2500), new TarjetaCredito("0888", "252", 2500, 0)};
        Cuenta c2 = new Cuenta("055", 2500, "O", t2);
        
        ClienteMoral cliente2 = new ClienteMoral("01", c2, "SA CV", "25525", "SA2255");
        cliente2.retirar(500);
        cliente2.convertToString();

        /* 
        ClienteFisico cliente1 = new ClienteFisico("4455055", "Juan Ignacio Herrera", 28, "Soltero", 4000, "DEBITO");
        
        ClienteMoral cliente2 = new ClienteMoral("4455056", "Social", "47855", "RFC18HYRU", 800, "DEBITO");
        
        cliente1.convertToString();
         System.out.println("\n");
        cliente2.convertToString();
        */
    }
}


/*

Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.println("Elija el proceso a realizar");
            System.out.println("1: Agregar Cliente\n2: Salir");
            String response = scanner.nextLine();

            if(response.equals("1")){
                System.out.println("Elija el tipo de cliente");
                System.out.println("1: Moral\n2: Fisico");
                String clientType = scanner.nextLine();
                switch(clientType){
                    case "1":
                        
                    break;
                    case "2":
                        System.out.println("Fisico");
                    break;
                    default:
                        System.out.println("Elija una opción que corresponda.");
                    break;
                }
            }
            else if(response.equals("2")){
                break;
            }
        };

        System.out.println("Se ha cerrado el sistema.");

*/