import java.util.Scanner;

public class UserInterface {

   private Plane list;
   private Scanner scanner;


public UserInterface(Plane list, Scanner scanner) { 
    this.list = list;
    this.scanner = scanner;
  }

public void start() {
  
  while(true) {
    
    System.out.println("¿Que desea hacer?");
    System.out.println("1. Ingresar pasajero");
    System.out.println("2. Consultar asiento");
    System.out.println("3. Consultar pasajero");
    System.out.println();
    
    System.out.print("Ingrese la opcion: ");
    int opcion = Integer.valueOf(scanner.nextLine());
    System.out.println();
    
    if(opcion == 1) {
      System.out.println("Ingresar un pasajero. ");
      System.out.print("Ingrese el nombre del pasajero: ");
      String newName = scanner.nextLine();
      
      System.out.print("Ingrese el apellido del pasajero: ");
      String newLastName = scanner.nextLine();

      System.out.print("Ingrese la fila del asiento: ");
      int newCror = Integer.valueOf(scanner.nextLine());

      System.out.print("Ingrese la columna del asiento: ");
      String newCol = scanner.nextLine();

      System.out.println("Pasajero ingresado!");
      System.out.println();

    } else if(opcion == 2) {
      System.out.println("Consulta de asiento. ");
      System.out.print("Ingrese la fila del asiento: ");
      int consultCrow = Integer.valueOf(scanner.nextLine());
      System.out.print("Ingrese la columna del asiento: ");
      String consultCol = scanner.nextLine();

      System.out.println();




    } else if(opcion == 3) {
       System.out.print("Ingrese nombre y apellido: ");
       String consultName = scanner.nextLine();
       String consultLastName = scanner.nextLine();



    }
    
    
    
  }
}


}
