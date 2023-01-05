package com.example.mybiodataapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Declaration
        EditText inpName = (EditText) findViewById(R.id.inpName);
        EditText inpAlamat = (EditText) findViewById(R.id.inpAlamat);
        EditText inpNoHp = (EditText) findViewById(R.id.inpNoHp);
        Button btnClear = (Button) findViewById(R.id.btnClear);
        Button btnExit = (Button) findViewById(R.id.btnExit);

//        Logic button
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inpName.setText("");
                inpAlamat.setText("");
                inpNoHp.setText("");
            }
        });

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishAffinity();
            }
        });

    }
}