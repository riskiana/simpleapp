package com.ubl.mysimpleapp;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.time.LocalDate;
import java.time.Period;

public class MainActivity extends AppCompatActivity {
    EditText fullName, dateOfBirth;
    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fullName = findViewById(R.id.txtFullName);
        dateOfBirth = findViewById(R.id.txtDob);
        txtResult = findViewById(R.id.txtResult);


    }

    public void handleSaveData(View v){
        String fullNameValue = fullName.getText().toString();
        LocalDate dobValue = LocalDate.parse(dateOfBirth.getText().toString());
        Integer age = Period.between(dobValue, LocalDate.now()).getYears();
        Log.d("full name", fullNameValue);

        txtResult.setText("your age:"+ age);


    }
}