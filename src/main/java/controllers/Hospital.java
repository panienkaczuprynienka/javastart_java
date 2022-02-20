package controllers;

import dto.Patient;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hospital {

  List<Patient> listOfPatients = new ArrayList<>();
  Scanner scanner = new Scanner(System.in);

  private Patient getPatient(){
   // Scanner scanner = new Scanner(System.in);

      System.out.println("Wpisz imię pacjencie");
      String name = scanner.nextLine();
      System.out.println("Wpisz nazwisko pacjencie");
      String lastname = scanner.nextLine();
      System.out.println("Wpisz pesel pacjencie");
      String pesel = scanner.nextLine();
      Patient patient = new Patient(name, lastname, pesel);
   return patient;
  }

  public void showAllPatients(){
    System.out.println(listOfPatients);
  }

  public void addPatientToList(){
    System.out.println("Czy chchesz dodoac pacjenta? 1-tak 0 wyjdz");
    int czyChceDodac = scanner.nextInt();
    while (czyChceDodac==1){
      if(listOfPatients.size()<=10){
        listOfPatients.add(getPatient());
      } else {
        System.out.println("Juz jest za duzo pacjentow zapisanych");
      }
      System.out.println("Czy chchesz dodoac pacjenta? 1-tak 0 wyjdz");
      czyChceDodac = scanner.nextInt();
    }
    if (czyChceDodac==2){
      showAllPatients();

    }   else if (czyChceDodac==0){
      scanner.close();
    }



  }}
