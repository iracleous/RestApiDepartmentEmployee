package gr.codehub.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Employee {
     private int id;
     private String   firstName;
    private String   lastName;
    private  String address;
    private LocalDate dateOfBirth;
    private LocalDate registrationDate;
    private  String  departmentTitle;

}
