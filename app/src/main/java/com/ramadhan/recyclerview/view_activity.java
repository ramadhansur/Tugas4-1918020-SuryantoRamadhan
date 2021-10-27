package com.ramadhan.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class view_activity extends AppCompatActivity {

    ImageView mainImageView;
    TextView aplikasi, deskripsi;

    String data1, data2;
    int myImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        mainImageView = findViewById(R.id.mainImageView);
        aplikasi = findViewById(R.id.judul);
        deskripsi = findViewById(R.id.deskripsi);

        getData();
        setData();

    }

    private void getData(){
        if (getIntent().hasExtra("myImage")&& getIntent().hasExtra("data1")&&
                getIntent().hasExtra("data2")){

            data1 = getIntent().getStringExtra("data1");
            data2 = getIntent().getStringExtra("data2");
            myImage = getIntent().getIntExtra("myImage", 1);

        }else{
            Toast.makeText(this, "no data", Toast.LENGTH_SHORT).show();
        }
    }
    protected void setData(){
        aplikasi.setText(data1);
        deskripsi.setText(data2);
        mainImageView.setImageResource(myImage);
    }

}