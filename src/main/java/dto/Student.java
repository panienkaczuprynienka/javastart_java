package dto;

public class Student {
  private String name;
  private String surname;
  private String indexNo;
  public static int NUMBER_OF_STUDENTS =0;

  public Student(String name, String surname, String indexNo) {
    this.name = name;
    this.surname = surname;
    this.indexNo = indexNo;
    NUMBER_OF_STUDENTS = NUMBER_OF_STUDENTS + 1;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public String getIndexNo() {
    return indexNo;
  }

  public void setIndexNo(String indexNo) {
    this.indexNo = indexNo;
  }

  public static void showStudents(){
    if (NUMBER_OF_STUDENTS >=2){
      System.out.println("Liczba studentow to " + NUMBER_OF_STUDENTS);
    } else {
      System.out.println("Za malo studentow do wyswietlenia");
    }
  }
}
