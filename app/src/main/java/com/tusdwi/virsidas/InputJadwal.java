package com.tusdwi.virsidas;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.tusdwi.virsidas.model.InputJadwalModel;

public class InputJadwal extends AppCompatActivity implements View.OnClickListener {
    private EditText jam1, jam2, jam3, jam4, jam5, jam6, jam7;
    private FirebaseAuth mAuth;
    private Button Simpan;
    //Membuat Kode Permintaan
    private int RC_SIGN_IN = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_jadwal);

        //toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Simpan = findViewById(R.id.save);
        Simpan.setOnClickListener(this);
        jam1 = findViewById(R.id.Pelajaran);
        jam2 = findViewById(R.id.jam2);
        jam3 = findViewById(R.id.jam3);
        jam4 = findViewById(R.id.jam4);
        jam5 = findViewById(R.id.jam5);
        jam6 = findViewById(R.id.jam6);
        jam7 = findViewById(R.id.jam7);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.save:
                //Mendapatkan Instance dari Database
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference getReference;

                //Menyimpan Data yang diinputkan User kedalam Variable
                String getJam1= jam1.getText().toString();
                String getJam2= jam2.getText().toString();
                String getJam3= jam3.getText().toString();
                String getJam4= jam4.getText().toString();
                String getJam5= jam5.getText().toString();
                String getJam6= jam6.getText().toString();
                String getJam7= jam7.getText().toString();

                getReference = database.getReference();


                    getReference.child("Jadwal").child("Kelas1A").child("Senin").push()
                            .setValue(new InputJadwalModel(getJam1,getJam2,getJam3,getJam4,getJam5,getJam6,getJam7))
                            .addOnSuccessListener(this, new OnSuccessListener() {
                                @Override
                                public void onSuccess(Object o) {
                                    //Peristiwa ini terjadi saat user berhasil menyimpan datanya kedalam Database
                                    jam1.setText("");
                                    jam2.setText("");
                                    jam3.setText("");
                                    jam4.setText("");
                                    jam5.setText("");
                                    jam6.setText("");
                                    jam7.setText("");

                                    Toast.makeText(InputJadwal.this, "Data Tersimpan", Toast.LENGTH_SHORT).show();
                                }
                            });
                }

        }
    }