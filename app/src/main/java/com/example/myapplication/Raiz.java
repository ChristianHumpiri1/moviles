package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Raiz extends AppCompatActivity {
    private EditText txtnum;
    private Button btnraiz;
    private TextView txtresul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtnum = (EditText) findViewById(R.id.txtnum);
        txtresul = (TextView) findViewById(R.id.txtresul);
        btnraiz = (Button) findViewById(R.id.btnraiz);


        btnraiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double valor1 = Integer.parseInt(txtnum.getText().toString());
                double r = Math.sqrt(valor1);
                txtresul.setText("La raiz es:" + r);
            }
        });
    }
    public void menu(View view){
        Intent intent4 = new Intent(this, MainActivity.class);
        startActivity(intent4);
    }
}