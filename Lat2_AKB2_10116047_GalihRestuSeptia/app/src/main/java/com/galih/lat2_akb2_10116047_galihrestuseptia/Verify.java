package com.galih.lat2_akb2_10116047_galihrestuseptia;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/*
 * NIM       :  10116047
 * Nama      :  Galih Restu Septia
 * Kelas     :  IF-2
 * Matkul    :  Aplikasi Komputasi Bergerak
 *
 * Rabu 17 April 2019 17:12
 * Mulai membuat layout Verify
 *
 * Rabu 17 April 2019 18:00
 * Selesai membuat layout Verify dan menghubungkan ke Home
 *
 */

public class Verify extends AppCompatActivity {
    Button btn_send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);
        btn_send    = findViewById(R.id.btn_send);
        btn_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user_home_nav();
            }
        });
    }

    public void user_home_nav(){
        Intent intent   = new Intent(this, Home.class);
        startActivity(intent);
    }
}
