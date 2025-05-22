package week10.postTest;

class Employee{
    String name;
    int age;
    String address;
    int salary = 1000;

    public Employee(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void displayInfo() {
        System.out.println("Nama: " + name);
        System.out.println("Umur: " + age);
        System.out.println("Alamat: " + address);
    }
    
    public void calculateSalary() {
        System.out.println("Kalkulasi gaji pegawai: " + salary + " USD");
    }

    public void calculateSalary(boolean withBonus){
        if (withBonus) {
            System.out.println("Kalkulasi gaji pegawai dengan bonus: " + (salary + 500) + " USD");
        } else {
            System.out.println("Kalkulasi gaji pegawai tanpa bonus: " + salary + " USD");
        }
    }

}

class softwareEngineer extends Employee{
    String programmingLanguage;
    int salary = 2000;

    public softwareEngineer(String name, int age, String address, String programmingLanguage) {
        super(name, age, address);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Bahasa Pemrograman: " + programmingLanguage);
    }

    @Override
    public void calculateSalary() {
        System.out.println("Kalkulasi gaji software engineer: " + salary + " USD");
    }

    public void calculateSalary(boolean withBonus) {
        if (withBonus) {
            System.out.println("Kalkulasi gaji software engineer dengan bonus: " + (salary + 700) + " USD");
        } else {
            System.out.println("Kalkulasi gaji software engineer tanpa bonus: " + salary + " USD");
        }
    }
}

class dataScientist extends Employee{
    String dataAnalysisTool;
    int salary = 3000;

    public dataScientist(String name, int age, String address, String dataAnalysisTool) {
        super(name, age, address);
        this.dataAnalysisTool = dataAnalysisTool;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Alat Analisis Data: " + dataAnalysisTool);
    }

    @Override
    public void calculateSalary() {
        System.out.println("Kalkulasi gaji data scientist: " + salary + " USD");
    }

    public void calculateSalary(boolean withBonus) {
        if (withBonus) {
            System.out.println("Kalkulasi gaji data scientist dengan bonus: " + (salary + 600) + " USD");
        } else {
            System.out.println("Kalkulasi gaji data scientist tanpa bonus: " + salary + " USD");
        }
    }
}

class intern extends Employee{
    String internshipDuration;
    int salary = 500;

    public intern(String name, int age, String address, String internshipDuration) {
        super(name, age, address);
        this.internshipDuration = internshipDuration;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Durasi Magang: " + internshipDuration);
    }

    @Override
    public void calculateSalary() {
        System.out.println("Kalkulasi gaji intern: " + salary + " USD");
    }

    public void calculateSalary(boolean withBonus) {
        if(withBonus) {
            System.out.println("Kalkulasi gaji intern dengan bonus: " + (salary + 200) + " USD");
        } else {
            System.out.println("Kalkulasi gaji intern tanpa bonus: " + salary + " USD");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new softwareEngineer("a", 32, "jkt", "java");
        Employee emp2 = new dataScientist("b", 28, "bdg", "python");
        Employee emp3 = new intern("c", 22, "sby", "3 bulan");
        Employee emp4 = new Employee("d", 30, "bali");
        
        emp1.displayInfo();
        emp1.calculateSalary();
        emp1.calculateSalary(false);

        emp2.displayInfo();
        emp2.calculateSalary();
        emp2.calculateSalary(true);

        emp3.displayInfo();
        emp3.calculateSalary();
        emp3.calculateSalary(true);

        emp4.displayInfo();
        emp4.calculateSalary();
        emp4.calculateSalary(false);
    }
}
