package com.example.d2a.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class lensa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lensa);
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


    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle app bar item clicks here. The app bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId()) {
            case R.id.action_status:
                displayToast(getString(R.string.statustour));
                return true;
            case R.id.action_favorites:
                System.exit(0);
                return true;
            case R.id.action_contact:
                startActivity(new Intent(this, tentang.class));
                return true;

            default:
                // Do nothing
        }
        return super.onOptionsItemSelected(item);
    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}