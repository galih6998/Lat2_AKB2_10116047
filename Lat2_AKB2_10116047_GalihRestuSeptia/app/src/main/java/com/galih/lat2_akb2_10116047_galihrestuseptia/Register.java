package com.galih.lat2_akb2_10116047_galihrestuseptia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

/*
 * NIM       :  10116047
 * Nama      :  Galih Restu Septia
 * Kelas     :  IF-2
 * Matkul    :  Aplikasi Komputasi Bergerak
 *
 * Selasa 16 April 2019 19:02
 * Mulai membuat layout Register
 *
 * Selasa 16 April 2019 21:00
 * Selesai membuat layout Register dan menghubungkan ke AlmostThere
 *
 */

public class Register extends AppCompatActivity {
    Button btn_register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        btn_register    =  findViewById(R.id.btn_register);
        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                almost_there_nav();
            }
        });
    }

    public void almost_there_nav(){
        Intent intent   = new Intent(this, AlmostThere.class);
        startActivity(intent);
    }
}
