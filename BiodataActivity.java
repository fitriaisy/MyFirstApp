package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class BiodataActivity extends AppCompatActivity {

    //Deklarasi variabel
    TextView tvNama, tvNim, tvProdi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);

        //Inisialisasi variable
        tvNama = findViewById(R.id.tvNama);
        tvNim = findViewById(R.id.tvNim);
        tvProdi = findViewById(R.id.tvProdi);

        //Opsi 1: Ambil dari bundle
        Bundle bundle = getIntent().getExtras();
        tvNama.setText(bundle.getString("KeyNama"));
        tvNim.setText(bundle.getString("KeyNim"));
        tvProdi.setText(bundle.getString("KeyProdi"));

    }
}