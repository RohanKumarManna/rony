package com.example.rony;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;


public class MainActivity extends Activity {
    ListView list;
    String[] name = {
            "Manishi Nath Manna",
            "Ruma Manna",
            "Rohan Kumar Manna",
            "Rimita Manna"

    } ;
    String[] relation = {
            "Father",
            "Mother",
            "Brother",
            "Sister"

    } ;
    Integer[] imageId = {
            R.drawable.image1,
            R.drawable.image2,
            R.drawable.image3,
            R.drawable.image4,

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        comp adapter = new comp(MainActivity.this, name, relation, imageId);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
    }

}