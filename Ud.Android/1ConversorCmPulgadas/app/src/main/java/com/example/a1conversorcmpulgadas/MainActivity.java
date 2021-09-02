package com.example.a1conversorcmpulgadas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    Button button1;
    Button button2;
    TextView editTextCM;
    TextView editTextPulg;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);

        editTextCM = findViewById(R.id.editTextCM);
        editTextPulg = findViewById(R.id.editTextPulg);

    }


    public void button1_onClick(View v)
    {
        String cadena = editTextCM.getText().toString();

        double cm, pulgada;
        cm = Double.valueOf(cadena);
        pulgada = cm * 0.393701;

        editTextPulg.setText(String.valueOf(pulgada));
    }
    public void button2_onClick(View v)
    {
        String cadena = editTextPulg.getText().toString();

        double cm, pulgada;
        pulgada = Double.valueOf(cadena);
        cm = pulgada * 2.54;

        editTextCM.setText(String.valueOf(cm));
    }
}
