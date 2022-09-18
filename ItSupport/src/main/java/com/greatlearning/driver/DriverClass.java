package com.greatlearning.driver;

import com.greatlearning.model.Employee;
import com.greatlearning.services.CredentialService;

import java.util.Scanner;

public class DriverClass {
    public static void main(String[] args) {
        CredentialService credentialService = new CredentialService();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your First Name : ");
        String firstName = scanner.next();
        System.out.print("Enter your Last Name : ");
        String lastName = scanner.next();
        Employee employee = new Employee(firstName, lastName);

        System.out.println("Available departments");
        System.out.println("1. Technical");
        System.out.println("2. Admin");
        System.out.println("3. Human Resource");
        System.out.println("4. Legal");

        System.out.print("Select the department (1 to 4) : ");
        int departmentId = scanner.nextInt();
        String emailId = null;
        String password = String.valueOf(credentialService.generatePassword());

        switch (departmentId) {
            case 1:
                emailId = credentialService.generateEmailId(employee, "tech");
                break;
            case 2:
                emailId = credentialService.generateEmailId(employee, "admin");
                break;
            case 3:
                emailId = credentialService.generateEmailId(employee, "hr");
                break;
            case 4:
                emailId = credentialService.generateEmailId(employee, "legal");
                break;
            default:
                System.out.println("Entered Wrong department");
        }
        if (departmentId >= 1 && departmentId <= 4) {
            System.out.println(" Your Email id - " + emailId);
            System.out.println(" Your password is - " + password);
        }

    }
}
