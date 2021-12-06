package gr.codehub;

import gr.codehub.model.Department;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class MainApplication {

    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        String urlForDepartment= "http://localhost:4000/department";


        Department department = new Department();
        department.setTitle("Administration");
        department.setLocation("Patra");

        restTemplate.postForEntity(urlForDepartment,department,Department.class);



        ResponseEntity<Department> employeeList
                = restTemplate.getForEntity(urlForDepartment+"/1", Department.class);

        System.out.println(employeeList.getBody().toString());

    }

    public static void test2() {

        RestTemplate restTemplate = new RestTemplate();
        String urlGoogle= "https://gorest.co.in/public/v1/users";

        ResponseEntity<Object> response
                = restTemplate.getForEntity(urlGoogle, Object.class);

        System.out.println(response.getBody());


    }


public static void test1(){
    RestTemplate restTemplate = new RestTemplate();
    String urlForDepartment= "http://localhost:4000/department";
    String urlForEmployee= "http://localhost:4000/employee";

    Department department = new Department();
    department.setTitle("Administration");
    department.setLocation("Patra");

    restTemplate.postForEntity(urlForDepartment,department,Department.class);

    ResponseEntity<List> response
            = restTemplate.getForEntity(urlForDepartment, List.class);

    System.out.println(response.getBody().toString());


    ResponseEntity<List> employeeList
            = restTemplate.getForEntity(urlForEmployee, List.class);

    System.out.println(employeeList.getBody().toString());
}

}
