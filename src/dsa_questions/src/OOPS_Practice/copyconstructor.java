package OOPS_Practice;

public class copyconstructor {
    public static void main(String[] args) {
        Car car = new Car("Honda", 2022, "Civic");
        car.display();
    }
}
// Superclass
class Vehicle {
    String brand;
    int year;

    // Constructor in the superclass
    Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    void display() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}

// Subclass
class Car extends Vehicle {
    String model;

    // Constructor in the subclass
    Car(String brand, int year, String model) {
        // Calling the superclass constructor
        super(brand, year);
        this.model = model;
    }

    void display() {
        // Calling the superclass method
        super.display();
        System.out.println("Model: " + model);
    }
}


