package apps;

import controllers.Hospital;

public class HospitalApp {
  public static void main(String[] args) {
    Hospital hospital = new Hospital();
    hospital.addPatientToList();

    hospital.showAllPatients();
  }
}
