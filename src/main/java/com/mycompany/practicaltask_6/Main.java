package com.mycompany.practicaltask_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Choose the type of doctor(1 or 2):");
            int doctorType = scanner.nextInt();
            
            Doctor doctor;
            if (doctorType == 1) {
                doctor = new DoctorSubclass1();
            } else {
                doctor = new DoctorSubclass2();
            }
            
            System.out.println("Write the text of your reciept");
            String recipeText = scanner.next();
            
            doctor.writeRecipe(recipeText);
        }
    }
}