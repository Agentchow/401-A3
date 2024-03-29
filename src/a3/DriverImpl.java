package a3;

public class DriverImpl implements Driver{

    private String firstName;
    private String lastName;
    private int id;
    private Vehicle vehicle;

    public DriverImpl(String first, String last, int id, Vehicle vehicle) {
        if (first == null || last == null || vehicle == null ) {
        	throw new RuntimeException("Driver FUCK YOU");
        }

    	this.firstName = first;
        this.lastName = last;
        this.id = id;
        this.vehicle = vehicle;
	}

    @Override
    public String getFirstName() {
        if (this.firstName == null) {
            throw new RuntimeException("Need to specify first name");
        } else {
            return this.firstName;
        }
    }

    @Override
    public String getLastName() {
        if (this.lastName == null) {
            throw new RuntimeException("Need to specify first name");
        } else {
            return this.lastName;
        }
    }

    @Override
    public String getFullName() {
    	if (this.firstName == null || this.lastName == null) {
            throw new RuntimeException("Need to specify first name");
    	}
        return this.getFirstName() + " " + this.getLastName();
    }

    @Override
    public int getID() {
        return this.id;
    }

    @Override
    public Vehicle getVehicle() {
        if (this.vehicle == null) {
            throw new RuntimeException("Need to specify vehicle");
        } else {
            return vehicle;
        }
    }

    @Override
    public void setVehicle(Vehicle v) {
    	if (v == null) {
    		throw new RuntimeException("");
    	}
        this.vehicle = v;
    }
}
