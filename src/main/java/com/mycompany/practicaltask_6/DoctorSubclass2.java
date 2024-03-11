package com.mycompany.practicaltask_6;

public class DoctorSubclass2 extends Doctor {
    @Override
    public void writeRecipe(String text) {
        String transformedText = text.toUpperCase();
        System.out.println("New text: " + transformedText);
    }
}