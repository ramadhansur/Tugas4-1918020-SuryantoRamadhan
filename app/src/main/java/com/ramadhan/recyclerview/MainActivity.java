package com.ramadhan.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recylerView;

    String s1[], s2[];
    int images[] = {R.drawable.wa,R.drawable.ig,R.drawable.fb,R.drawable.twt,
            R.drawable.line,R.drawable.tele,R.drawable.yt};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recylerView = findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.aplikasi);
        s2 = getResources().getStringArray(R.array.deskripsi);

        AplikasiAdapter appAdapter = new AplikasiAdapter(this,s1,s2,images);
        recylerView.setAdapter(appAdapter);
        recylerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
