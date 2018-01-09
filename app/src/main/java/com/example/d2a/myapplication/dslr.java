package com.example.d2a.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class dslr extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dslr);
        Button btn1 =(Button)findViewById(R.id.button);
        Button btn2 =(Button)findViewById(R.id.button2);

        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                displayToast(getString(R.string.pesan));
                //menghubungkan antar activity dengan intent

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                displayToast(getString(R.string.simpan));
                //menghubungkan antar activity dengan intent

            }
        });
    }





    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}

