package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Promedio extends AppCompatActivity {
    private EditText num1,num2,num3,num4,num5,num6,num7,num8,num9,num10;
    private Button btnpromedio;
    private TextView resultadoprom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promedio);
        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        num3 = (EditText) findViewById(R.id.num3);
        num4 = (EditText) findViewById(R.id.num4);
        num5 = (EditText) findViewById(R.id.num5);
        num6 = (EditText) findViewById(R.id.num6);
        num7 = (EditText) findViewById(R.id.num7);
        num8 = (EditText) findViewById(R.id.num8);
        num9 = (EditText) findViewById(R.id.num9);
        num10 = (EditText) findViewById(R.id.num10);
        resultadoprom = (TextView) findViewById(R.id.resultadoprom);
        btnpromedio = (Button) findViewById(R.id.btnpromedio);


        btnpromedio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double valor1 = Integer.parseInt(num1.getText().toString());
                double valor2 = Integer.parseInt(num2.getText().toString());
                double valor3 = Integer.parseInt(num3.getText().toString());
                double valor4 = Integer.parseInt(num4.getText().toString());
                double valor5 = Integer.parseInt(num5.getText().toString());
                double valor6 = Integer.parseInt(num6.getText().toString());
                double valor7 = Integer.parseInt(num7.getText().toString());
                double valor8 = Integer.parseInt(num8.getText().toString());
                double valor9 = Integer.parseInt(num9.getText().toString());
                double valor10 = Integer.parseInt(num10.getText().toString());
                double r = (valor1 + valor2 + valor3 + valor4 + valor5 + valor6 + valor7 + valor8 + valor9 + valor10)/10 ;
                resultadoprom.setText("El promedio es:" + r);
            }
        });
    }
    public void menu(View view){
        Intent intent4 = new Intent(this, MainActivity.class);
        startActivity(intent4);
    }

}