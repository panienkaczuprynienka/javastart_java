package apps;

import dto.Student;

public class University {
  public static void main(String[] args) {
    Student student = new Student("Jan ", "brzychalwski", "12321312");

    Student.showStudents();

    Student student1 = new Student("Edek ", "Bzdziagwa", "3331312");
    Student student2 = new Student("Janica ", "Ho", "983331312");
    Student student4 = new Student("Janica ", "Ho", "983331312");
    Student student5 = new Student("Janica ", "Ho", "983331312");

    Student.showStudents();
  }
}
