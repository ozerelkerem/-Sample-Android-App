package com.example.sampleandroidproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.Random;

public class courselist_activity extends AppCompatActivity {
    private RecyclerView courselistRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courselist_activity);

        courselistRecyclerView = (RecyclerView) findViewById(R.id.courselistRecyclerView);
        courselistRecyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        courselistRecyclerView.setLayoutManager(layoutManager);

        String courses[] = {"bbg","mobil", "yazilim", "yapay zeka", "bbg2", "ders 1", "algoritma", "müzik", "resim", "spor"};
        Random rnd = new Random();
        Course list[] = new Course[10];
        int i = 0;
        for (;i<10;i++) {
            list[i] = new Course(courses[i],String.valueOf(rnd.nextInt(100)),
                    String.valueOf(rnd.nextInt(100)), String.valueOf(rnd.nextInt(100))
                    );
        }

        mAdapter = new MyAdapter(list);
        ((MyAdapter) mAdapter).context = getApplicationContext();
        courselistRecyclerView.setAdapter(mAdapter);


    }
}
