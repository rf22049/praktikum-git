package Week05.com.university.main;

import Week05.com.university.model.Student;

public class MainApp {
    public static void main(String[] args) {
        Student[] students = new Student[5];

        students[0] = new Student("S001", "Alice", 20, 3.8);
        students[1] = new Student("S002", "Bob", 22, 3.6);
        students[2] = new Student("S003", "Charlie", 21, 3.9);
        students[3] = new Student("S004", "David", 19, 3.7);
        students[4] = new Student("S005", "Eve", 23, 3.5);

        System.out.println("=== Data Mahasiswa ===");
        for (Student student : students) {
            System.out.println("ID: " + student.getStudentId() + ", Nama: " + student.getName() + ", Umur: " + student.getAge() + ", GPA: " + student.getGpa());
        }
    }
}