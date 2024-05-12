public class Car {
    private String make;
    private String model;
    private int year;

    // Constructor with parameters
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Default constructor
    public Car() {
        this.make = "Unknown";
        this.model = "Unknown";
        this.year = 0;
    }

    // Getter methods
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    // Setter methods
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Method to display car information
    public void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    // Main method to test the Car class
    public static void main(String[] args) {
        // Creating car objects using different constructors
        Car car1 = new Car("Toyota", "Camry", 2020);
        Car car2 = new Car();

        // Accessing and modifying car properties
        car1.displayInfo(); // Output: Make: Toyota, Model: Camry, Year: 2020

        car2.setMake("Honda");
        car2.setModel("Accord");
        car2.setYear(2018);
        car2.displayInfo(); // Output: Make: Honda, Model: Accord, Year: 2018
    }
}
