package com.mycompany.practicaltask_6;

public class DoctorSubclass1 extends Doctor {
    @Override
    public void writeRecipe(String text) {
        StringBuilder reversedText = new StringBuilder(text).reverse();
        System.out.println("New Text: " + reversedText.toString());
    }
}

