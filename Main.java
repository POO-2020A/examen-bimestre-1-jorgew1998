import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingrese la cantidad de filas:");
    int numFiles = Integer.valueOf(scanner.nextLine());
    System.out.println("Ingrese la cantidad de columnas:");
    int numColums = Integer.valueOf(scanner.nextLine());

    Plane plane = new  Plane(numFiles,numColums);
    plane.viewTable();
    

    UserInterface user = new UserInterface(plane, scanner);
    user.start();

  }
}
