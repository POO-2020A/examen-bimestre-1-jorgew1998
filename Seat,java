public class Seat {
    private Passenger passenger;
    private int row;
    private String col;

    public Seat(int row, String col) {
        this.row = row;
        this.col = col;
    }
    
    public boolean isFree(){
        if(passenger == null){
            return true;
        }else{
            return false;
        }
    }

    public int getRow() {
        return row;
    }

    public String getCol() {
        return col;
    }

     public void setRow(int newRow) {
        this.row = newRow;
    }

    public void setCol(String newCol) {
        this.col = newCol;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Seat otherSeat = (Seat) obj;
        if (this.row != otherSeat.row) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        if(isFree()){
            return "Asiento: " + row + col + ", ocupado. Pasajero: " + passenger.toString();
        } else
            return "Asiento: " + row + col + ", libre."; 
         }
   
    
}
