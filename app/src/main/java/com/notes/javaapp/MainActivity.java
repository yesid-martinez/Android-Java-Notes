// Main Class

package com.notes.javaapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

//It brings the functionality of the Log class from the android.util package
import android.util.Log;

public class MainActivity extends AppCompatActivity {


    // It maintains its unique state for each object created from this class
    // It is accessible through any non-static method within the same class
    String instanceVariable = "This is a global variable";

    // Define a variable named TAG to identify the source of the log messages, typically set to the name of the current class.
    private static final String TAG = "MainActivity";

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


        // Use the Android Log class to log messages at different log levels:
        Log.v(TAG, "Verbose log message"); // Log a verbose message, useful for detailed information during development.
        Log.d(TAG, "Debug log message"); // Log a debug message, useful for debugging purposes.
        Log.i(TAG, "Info log message"); // Log an informational message, useful for providing general information about app operation.
        Log.w(TAG, "Warning log message"); // Log a warning message, useful for indicating potential issues.
        Log.e(TAG, "Error log message"); // Log an error message, useful for indicating errors that occur during execution.

        calculateArea(58, 178);
        variableTest();
    }

    public void calculateArea(int base, int height) {
        // Local variable. It can only be accessed within the method in which it is defined.
        int area = (base * height) / 2;
        System.out.println("The area of the triangle is: " + area + " cm²");
    }

    public void variableTest(){
        System.out.println(instanceVariable);
    }

}