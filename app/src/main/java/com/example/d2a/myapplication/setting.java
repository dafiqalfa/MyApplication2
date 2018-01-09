package com.example.d2a.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.net.Uri;

/**
 * Created by GENIUS on 11/2/2017.
 */


public class setting extends AppCompatActivity {
    private TextView textlink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting);
        textlink = (TextView) findViewById(R.id.ser);
        textlink.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent webIntent = new Intent(android.content.Intent.ACTION_VIEW); webIntent.setData(Uri.parse("https://www.google.com")); startActivity(webIntent);

            }
        });
    }


    public void bantuan(View view) {
        startActivity(new Intent(this, bantuan.class));
    }

    /**
     * Shows a message that the ice cream sandwich image was clicked.
     */
    public void versiapp(View view) {
        displayToast(getString(R.string.versiapp));
    }

    /**
     * Shows a message that the froyo image was clicked.
     */


    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

}

