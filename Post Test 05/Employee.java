class Employee extends Person {
    private double salary;

    public Employee(String n, int a, double s) {
        super(n, a);
        salary = s;
    }

    public void showSalary() {
        System.out.println("Salary: " + salary);
    }
}