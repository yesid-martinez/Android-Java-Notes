// Main Class

package com.notes.javaapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Define a variable named TAG to identify the source of the log messages, typically set to the name of the current class.
//    private static final String TAG = "MainActivity";
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Primitive data type. It is 16 bits long
        // Can store any valid Unicode character, including letters, digits, symbols, and special characters
        char gender = 'M';
        // To avoid errors, make sure that char variables contain only one character

        // Its size depends on the number of bits used to store them
        int availableProducts = 10;

        // Represents a 32-bit floating-point numeric value
        // It can represent a wide range of fractional values with a certain degree of accuracy
        float price = 19.9f;
        // Float numbers must be followed by an 'f' or 'F' to differentiate them from double

        // Double precision floating-point data type, occupying 64 bits.
        // It is more accurate than float and is used to represent decimal numbers when greater precision is required.
        double piDouble = 3.141592653589793;

        boolean isAvailable = true;

        String productName = "Product A";

        System.out.println("Gender: " + gender);
        System.out.println("Available Products: " + availableProducts);
        System.out.println("Price: " + price);
        System.out.println("Is Available: " + isAvailable);
        System.out.println("Product Name: " + productName);
        System.out.println("Pi: " + piDouble);

    }
}