package dto.hospitalemployees;

public class Nurse  extends Person{
  private int overtime;

  public Nurse(String name, String lastName, double salary, int overtime) {
    super(name, lastName, salary);
    this.overtime = overtime;
  }

  public int getOvertime() {
    return overtime;
  }

  public void setOvertime(int overtime) {
    this.overtime = overtime;
  }

  @Override
  public void getInfo() {
    super.getInfo();
    System.out.println("NAdgodziny to " + overtime);
  }
}
