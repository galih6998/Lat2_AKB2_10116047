package com.galih.lat2_akb2_10116047_galihrestuseptia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/*
 * NIM       :  10116047
 * Nama      :  Galih Restu Septia
 * Kelas     :  IF-2
 * Matkul    :  Aplikasi Komputasi Bergerak
 *
 * Selasa 16 April 2019 19:00
 * Mulai membuat layout Login
 *
 * Selasa 16 April 2019 20:00
 * Selesai membuat layout Login dan menghubungkan ke Register
 *
 */

public class MainActivity extends AppCompatActivity {
    TextView register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        register    = findViewById(R.id.txt_register);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                register_nav();
            }
        });
    }

    public void register_nav(){
        Intent intent  = new Intent(this, Register.class);
        startActivity(intent);
    }
}
