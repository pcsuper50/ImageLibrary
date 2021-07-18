package com.example.putatoetechnology;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.putatoetechnology.adapter.RecycleAdapter;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recycler);

//        Myadapter myadapter=new Myadapter(getSupportFragmentManager(),getLifecycle());
//        recyclerView.setAdapter(myadapter);

            layoutManager=new LinearLayoutManager(MainActivity.this,
                    RecyclerView.VERTICAL,false);
            recyclerView.setLayoutManager(layoutManager);
            recyclerView.setAdapter(new RecycleAdapter());
    }
}