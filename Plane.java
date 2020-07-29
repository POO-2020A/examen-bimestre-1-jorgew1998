import java.util.Scanner;
import java.util.ArrayList;

public class Plane {

  private ArrayList<Seat> seats;
  private int rowls;
  private int cols;

  public Plane(int rowls, int cols) {
    this.rowls = rowls;
    this.cols = cols;
    this.seats = new ArrayList<>();
  } 

  public int getRowls() {
    return this.rowls;
  }

  public int getCols() {
    return this.cols;
  }

  public void setRowls(int newRowl) {
    this.rowls = newRowl;
  }

  public void setCols(int newCols) {
    this.cols = newCols;
  }

  public void viewTable(){
    if(this.rowls <= 20 && this.cols <= 8){
    ArrayList<String> listLetters = new ArrayList<>();
    listLetters.add("A");
    listLetters.add("B");
    listLetters.add("C");
    listLetters.add("D");
    listLetters.add("E");
    listLetters.add("E");
    listLetters.add("F");
    listLetters.add("G");

       for(int i = 1; i <= this.rowls; i++){
      System.out.print(i + " ");
       for(int j = 0; j < this.cols; j++){
          System.out.print(listLetters.get(j));
       }
        System.out.println();
      } 
    }  
  }
}
