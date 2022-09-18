package com.greatlearning.services;

import com.greatlearning.model.Employee;

import java.util.Random;

public class CredentialService {
    String emailId;
    String password;

    private String domain = "greatlearning.com";

    public String generateEmailId(Employee employee, String department) {
        emailId = employee.getFirstName() + employee.getLastName() + "@" + department + "." + domain;
        return emailId;
    }

    public String generatePassword() {
        String capitalLetter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random random = new Random();
        String password = "";
        for (int i = 0; i < 8; i++) {
            password = password + capitalLetter.charAt(random.nextInt(26));
        }
        this.password = password;
        return password;
    }

    public void showPassword() {
        System.out.println("Your password is " + password);
    }
}
