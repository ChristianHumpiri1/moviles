package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Mayor extends AppCompatActivity {
    private EditText num1,num2,num3;
    private Button btnmax;
    private TextView txtresult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mayor);
        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        num3 = (EditText) findViewById(R.id.num3);
        txtresult = (TextView) findViewById(R.id.txtresult);
        btnmax = (Button) findViewById(R.id.btnmax);

        btnmax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int valor1 = Integer.parseInt(num1.getText().toString());
                int valor2 = Integer.parseInt(num2.getText().toString());
                int valor3 = Integer.parseInt(num3.getText().toString());
                int r = Math.max(valor3,Math.max(valor1,valor2));

                txtresult.setText("El mayor es:" + r);
            }
        });
    }
    public void menu(View view){
        Intent intent4 = new Intent(this, MainActivity.class);
        startActivity(intent4);
    }
}