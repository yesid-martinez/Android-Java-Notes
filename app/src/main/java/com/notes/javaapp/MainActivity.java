    // Main Class

    package com.notes.javaapp;

    import android.os.Bundle;

    import androidx.appcompat.app.AppCompatActivity;

    import androidx.core.splashscreen.SplashScreen;

    public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            // Install the splash screen before calling super.onCreate()
            SplashScreen splashScreen = SplashScreen.Companion.installSplashScreen(this);
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

        }

    }