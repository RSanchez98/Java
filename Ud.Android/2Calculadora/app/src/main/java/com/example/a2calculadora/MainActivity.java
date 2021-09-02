package com.example.a2calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.logging.StreamHandler;

public class MainActivity extends AppCompatActivity
{
    EditText editText1;
    EditText editText2;
    EditText editText3;

    Button button1;
    Button button2;
    Button button3;
    Button button4;

    TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        editText3 = findViewById(R.id.editText3);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);

        textView1 = findViewById(R.id.textView1);
    }

    public void button1_onClick(View v)
    {
        textView1.setText("+");

        String cadena1 = editText1.getText().toString();
        String cadena2 = editText2.getText().toString();

        double n1, n2, resultado;
        n1 = Double.valueOf(cadena1);
        n2 = Double.valueOf(cadena2);

        resultado = n1 + n2;

        editText3.setText(String.valueOf(resultado));
    }

    public void button2_onClick(View v)
    {
        textView1.setText("-");

        String cadena1 = editText1.getText().toString();
        String cadena2 = editText2.getText().toString();

        double n1, n2, resultado;
        n1 = Double.valueOf(cadena1);
        n2 = Double.valueOf(cadena2);

        resultado = n1 - n2;

        editText3.setText(String.valueOf(resultado));
    }

    public void button3_onClick(View v)
    {
        textView1.setText("x");

        String cadena1 = editText1.getText().toString();
        String cadena2 = editText2.getText().toString();

        double n1, n2, resultado;
        n1 = Double.valueOf(cadena1);
        n2 = Double.valueOf(cadena2);

        resultado = n1 * n2;

        editText3.setText(String.valueOf(resultado));
    }
    public void button4_onClick(View v)
    {
        textView1.setText("/");

        String cadena1 = editText1.getText().toString();
        String cadena2 = editText2.getText().toString();

        double n1, n2, resultado;
        n1 = Double.valueOf(cadena1);
        n2 = Double.valueOf(cadena2);

        resultado = n1 - n2;

        editText3.setText(String.valueOf(resultado));
    }
}
