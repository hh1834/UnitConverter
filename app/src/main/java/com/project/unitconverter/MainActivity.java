package com.project.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private final static double KILOS_TO_POUNDS = 2.20462;

    TextView titleView;
    TextView resultView;
    EditText inputView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputView = findViewById(R.id.editText);
        button = findViewById(R.id.btn);
        resultView = findViewById(R.id.resultView);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double inputInKilos = Double.parseDouble(inputView.getText().toString());
                resultView.setText(inputInKilos * KILOS_TO_POUNDS + " lb");
            }
        });
    }
}