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

    public char[] generatePassword() {
        String capitalLetter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String smallLetter = "avcdefghijklmnopqrstuvwxyz";
        String specialChars = "!!@#$%^&*()_+{}:<>";
        String numbers = "1234567890";
        String pwd = capitalLetter + smallLetter + numbers + specialChars;
        Random random = new Random();
        char[] password = new char[8];
        for (int i = 0; i < 8; i++) {
            password[i] = pwd.charAt(random.nextInt(pwd.length()));
        }
        return password;
    }

    public void showPassword() {
        System.out.println("Your password is " + password);
    }
}
