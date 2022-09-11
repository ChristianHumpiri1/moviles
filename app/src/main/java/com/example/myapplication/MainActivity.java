package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private EditText txtnombre;
    private Button btn,btn1,btn2,btn3,btn4,btn5;
    private TextView tvus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtnombre = findViewById(R.id.edtnombre);
        btn = findViewById(R.id.btnenviar);
        btn1 = findViewById(R.id.btnraiz);
        btn2 = findViewById(R.id.btnmayor);
        btn3 = findViewById(R.id.btnpromedio);
        btn4 = findViewById(R.id.btncal);
        tvus = findViewById(R.id.tvuser);
        tvus.setText("Bienvenido: "+getIntent().getStringExtra("pupil"));
        /*btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre = txtnombre.getText().toString();
                txtnombre.setText("Bienvenido: " +nombre);
            }
        });*/

    }
    public void mostrar(View view){
        String nombre = txtnombre.getText().toString();
        txtnombre.setText("Bienvenido: " +nombre);
    }
    public void raiz(View view){
        Intent intent = new Intent(this, Raiz.class);
        startActivity(intent);

    }
    public void mayor(View view){
        Intent intent2 = new Intent(this,Mayor.class);
        startActivity(intent2);
    }
    public void promedio(View view){
        Intent intent3 = new Intent(this,Promedio.class);
        startActivity(intent3);
    }
    public void calculadora(View view){
        Intent intent4 = new Intent(this, Calculadora.class);
        startActivity(intent4);
    }


}