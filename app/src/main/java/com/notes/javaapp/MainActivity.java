// Main Class

package com.notes.javaapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

//It brings the functionality of the Log class from the android.util package
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    // Define a variable named TAG to identify the source of the log messages, typically set to the name of the current class.
    private static final String TAG = "MainActivity";

    // It maintains its unique state for each object created from this class
    // It is accessible through any non-static method within the same class
    String instanceVariable = "This is a global variable";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Represents an 8-bit integer numeric value
        byte age = 25;

        // Represents a 16-bit Unicode character value
        // Can store any valid Unicode character, including letters, digits, symbols, and special characters
        char gender = 'M';
        // To avoid errors, make sure that char variables contain only one character

        // Represents a 32-bit integer numeric value
        int availableProducts = 10;

        // Represents a 32-bit floating-point numeric value
        // It can represent a wide range of fractional values with a certain degree of accuracy
        float price = 19.9f;
        // Float numbers must be followed by an 'f' or 'F' to differentiate them from double

        // Double precision floating-point data type, occupying 64 bits.
        // It is more accurate than float and is used to represent decimal numbers when greater precision is required.
        double piDouble = 3.141592653589793;

        // Represents a 64-bit integer numeric value
        long phoneNumber = 1234567890;

        boolean isAvailable = true;

        String productName = "Product A";

        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Available Products: " + availableProducts);
        System.out.println("Price: " + price);
        System.out.println("Pi: " + piDouble);
        System.out.println("Is Available: " + isAvailable);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Product Name: " + productName);


        // Use the Android Log class to log messages at different log levels:
        Log.v(TAG, "Verbose log message"); // Log a verbose message, useful for detailed information during development.
        Log.d(TAG, "Debug log message"); // Log a debug message, useful for debugging purposes.
        Log.i(TAG, "Info log message"); // Log an informational message, useful for providing general information about app operation.
        Log.w(TAG, "Warning log message"); // Log a warning message, useful for indicating potential issues.
        Log.e(TAG, "Error log message"); // Log an error message, useful for indicating errors that occur during execution.

        calculateArea(58, 178);
        variableTest();

        int id = 1434;
        id = 3004;
        // A new value can be reassigned to 'id'

        String name = "Yesid";
        name = "Axel";
        // The 'name' reference now points to a new String object

        // Once initialized, a final variable cannot change its value. It is constant and cannot be reallocated.
        final int quantity = 45;
        // quantity = 34; // This will cause a compilation error, as 'quantity' is final and cannot be reassigned

        final String lastname = "Martinez";
        // lastname = "Gomez"; // This will cause a build error, as 'lastname' is final and cannot be reassigned

        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Quantity: " + quantity);
        System.out.println("Lastname: " + lastname);

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