package com.example.holamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ViewAnimator;

public class MainActivity extends AppCompatActivity
{
    Button button1;
    TextView textView1;



    @Override
    protected void onCreate(Bundle savedInstanceState) //onCreate equivalente a Main
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);
        textView1 = findViewById(R.id.textView1);

       button1.setOnLongClickListener(new View.OnLongClickListener()
       {
           @Override
           public boolean onLongClick(View v)
           {
               textView1.setText(R.string.Sueltame);
               return false; //true = no se produce el click nomral, faltse = se produce
           }
       });




        //button1.setText("PATATAS");
        //textView1.setText("FRITAS");
    }
    public void button1_onClick(View v)
    {
        if (textView1.getText().length()==0)
        {
            textView1.setText(R.string.holamundo);

        }
        else
        {
            textView1.setText("");
        }
    }
}
