
public class Passenger {
    private String name;
    private String lastname;

    public Passenger(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
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
        final Passenger otherPassenger = (Passenger) obj;
        if (this.name.equals(otherPassenger.name) && this.lastname.equals(otherPassenger.lastname)) {
            return true;
        }
        return false;
    }

     public String getName() {
        return this.name;
    }

    public String getLastname() {
        return this.lastname;
    }

     public void setName(String newName) {
        this.name = newName;
    }

    public void setLastname(String newLastname) {
        this.lastname = newLastname;
    }

    @Override
    public String toString() {
        return this.name + " " + this.lastname;
    }
    
    
}
