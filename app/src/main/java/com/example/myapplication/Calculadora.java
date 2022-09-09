package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculadora extends AppCompatActivity {
      private EditText txt1,txt2;
      private Button btnsumar;
      private Button btnrestar;
      private Button btnmulti;
      private Button btndividir;
      private Button btnmenu;
      private TextView txtresultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        txt1 = (EditText) findViewById(R.id.txt1);
        txt2 = (EditText) findViewById(R.id.txt2);
        txtresultado = (TextView) findViewById(R.id.txtresultado);
        btnsumar = (Button) findViewById(R.id.btnsumar);
        btnrestar = (Button) findViewById(R.id.btnrestar);
        btnmulti = (Button) findViewById(R.id.btnmulti);
        btndividir = (Button) findViewById(R.id.btndividir);
        btnmenu = (Button) findViewById(R.id.btnMenu);

        btnsumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double valor1 = Integer.parseInt(txt1.getText().toString());
                double valor2 = Integer.parseInt(txt2.getText().toString());
                double r = valor1 + valor2;
                txtresultado.setText("La suma es:" + r);
            }
        });

        btnrestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double valor1 = Integer.parseInt(txt1.getText().toString());
                double valor2 = Integer.parseInt(txt2.getText().toString());
                double r = valor1 - valor2;
                txtresultado.setText("La resta es:" + r);
            }
        });
        btnmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double valor1 = Integer.parseInt(txt1.getText().toString());
                double valor2 = Integer.parseInt(txt2.getText().toString());
                double r = valor1 * valor2;
                txtresultado.setText("La multiplicacion es:" + r);
            }
        });
        btndividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double valor1 = Integer.parseInt(txt1.getText().toString());
                double valor2 = Integer.parseInt(txt2.getText().toString());
                double r = 0;
                if (valor2 !=0){
                     r = valor1 / valor2;
                }
                txtresultado.setText("La division es:" + r);
            }
        });

    }
    public void menu(View view){
        Intent intent4 = new Intent(this, MainActivity.class);
        startActivity(intent4);
    }


}