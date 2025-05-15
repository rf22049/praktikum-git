package week09.PostTest;

class Vehicle {
    void startEngine() {
        System.out.println("Mesin nyala");
    }
}

class Car extends Vehicle {
    void startEngine() {
        System.out.println("Mesin mobil nyala");
    }
}

class Motorcycle extends Vehicle {
    void startEngine() {
        System.out.println("Mesin motor nyala");
    }
}

class Driver{
    String name;
    Vehicle vehicle;
    License SIM = new License();

    Driver(String name, Vehicle vehicle) {
        this.name = name;
        this.vehicle = vehicle;
    }

    void tampilkanJenisKendaraan() {
        if (vehicle instanceof Car) {
            System.out.println("Si " + name + " mengendarai mobil");
        } else if (vehicle instanceof Motorcycle) {
            System.out.println("Si " + name + " mengendarai motor");
        }
    }
}

class License{
    int number;
    String issueDate;
}

public class Main {
    public static void main(String[] args) {
        Driver pengemudi1 = new Driver("Budi", new Car());
        Driver pengemudi2 = new Driver("Andi", new Motorcycle());

        pengemudi1.vehicle.startEngine();
        pengemudi2.vehicle.startEngine();
        pengemudi1.tampilkanJenisKendaraan();
        pengemudi2.tampilkanJenisKendaraan();
    }

}
