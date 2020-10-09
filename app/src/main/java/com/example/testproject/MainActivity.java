package com.example.testproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickBtnMostrar(View v) {
        EditText firstText = findViewById(R.id.et_texto);
        EditText secondText = findViewById(R.id.et_texto2);

        String fullString = firstText.getText().toString() + " " + secondText.getText().toString();

        Toast.makeText(MainActivity.this, fullString, Toast.LENGTH_LONG).show();
    }

    public void onClickBtnLimpar(View v) {
        EditText firstText = findViewById(R.id.et_texto);
        EditText secondText = findViewById(R.id.et_texto2);

        firstText.setText("");
        secondText.setText("");
    }

}