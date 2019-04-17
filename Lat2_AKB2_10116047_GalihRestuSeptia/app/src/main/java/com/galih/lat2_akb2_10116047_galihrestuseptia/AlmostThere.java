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
 * Rabu 17 April 2019 17:10
 * Mulai membuat layout AlmostThere
 *
 * Rabu 17 April 2019 17:30
 * Selesai membuat layout AlmostThere dan menghubungkan ke Verify
 *
 */

public class AlmostThere extends AppCompatActivity {
    Button btn_verify;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almost_there);
        btn_verify  = findViewById(R.id.btn_verify);
        btn_verify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verify_nav();
            }
        });
    }

    public void verify_nav(){
        Intent intent   = new Intent(this, Verify.class);
        startActivity(intent);
    }
}
