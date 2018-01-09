package com.example.d2a.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Sahdan on 06/11/2017.
 */

public class bio extends Activity {
    Button kirim;
    EditText namaa,emaill,nohpp,noidentitass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bio);

        kirim = (Button)findViewById(R.id.pesantiket);

        namaa = (EditText)findViewById(R.id.namalengkap);
        emaill = (EditText)findViewById(R.id.email);
        nohpp = (EditText)findViewById(R.id.nohp);
        noidentitass = (EditText)findViewById(R.id.noidentitas);
        kirim.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                kirimTeksPesan();
            }
        });
    }

    protected void kirimTeksPesan(){
        Log.i("Kirim Pesan", "");
        String noHP = "08112828697";
        String isiNama = namaa.getText().toString();
        String isiEmail = emaill.getText().toString();
        String isiNoHP = nohpp.getText().toString();
        String isiIdentitas = noidentitass.getText().toString();



        try {
            android.telephony.SmsManager smsManager = android.telephony.SmsManager.getDefault();
            smsManager.sendTextMessage(noHP, null, "Pesanan Tiket Kereta\n"+"Nama:\n"+isiNama+"\n Email:\n"+isiEmail+"\n No.HP:\n"+isiNoHP+"\n No.Identitas\n"+isiIdentitas, null, null);
            Toast.makeText(getApplicationContext(), "Pesan Sukses", Toast.LENGTH_LONG).show();
        }

        catch (Exception e){
            Toast.makeText(getApplicationContext(), "Pesan Gagal, Coba lagi", Toast.LENGTH_LONG).show();
            e.printStackTrace();
        }
    }


}