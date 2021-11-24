package com.oslac.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
   ArrayList<String> name = new ArrayList<>();
   ArrayList<String> mobile_number = new ArrayList<>();
   ArrayList<Integer> image = new ArrayList<>();
   RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);

        name.add("Ramesh");
        mobile_number.add("1234565789");
        image.add(R.drawable.person1);

        name.add("Mukesh");
        mobile_number.add("4567865789");
        image.add(R.drawable.person2);

        name.add("Himesh");
        mobile_number.add("45689589");
        image.add(R.drawable.person3);

        name.add("Himesh");
        mobile_number.add("45689589");
        image.add(R.drawable.person3);

        name.add("Himesh");
        mobile_number.add("45689589");
        image.add(R.drawable.person3);

        name.add("Himesh");
        mobile_number.add("45689589");
        image.add(R.drawable.person3);

        name.add("Himesh");
        mobile_number.add("45689589");
        image.add(R.drawable.person3);

        name.add("Himesh");
        mobile_number.add("45689589");
        image.add(R.drawable.person3);

        name.add("Himesh");
        mobile_number.add("45689589");
        image.add(R.drawable.person3);

        name.add("Himesh");
        mobile_number.add("45689589");
        image.add(R.drawable.person3);

        name.add("Himesh");
        mobile_number.add("45689589");
        image.add(R.drawable.person3);
        name.add("Himesh");
        mobile_number.add("45689589");
        image.add(R.drawable.person3);
        name.add("Ramesh");
        mobile_number.add("1234565789");
        image.add(R.drawable.person1);

        name.add("Mukesh");
        mobile_number.add("4567865789");
        image.add(R.drawable.person2);

        name.add("Himesh");
        mobile_number.add("45689589");
        image.add(R.drawable.person3);

        name.add("Himesh");
        mobile_number.add("45689589");
        image.add(R.drawable.person3);

        name.add("Himesh");
        mobile_number.add("45689589");
        image.add(R.drawable.person3);

        name.add("Himesh");
        mobile_number.add("45689589");
        image.add(R.drawable.person3);

        name.add("Himesh");
        mobile_number.add("45689589");
        image.add(R.drawable.person3);

        name.add("Himesh");
        mobile_number.add("45689589");
        image.add(R.drawable.person3);

        name.add("Himesh");
        mobile_number.add("45689589");
        image.add(R.drawable.person3);

        name.add("Himesh");
        mobile_number.add("45689589");
        image.add(R.drawable.person3);

        name.add("Himesh");
        mobile_number.add("45689589");
        image.add(R.drawable.person3);
        name.add("Himesh");
        mobile_number.add("45689589");
        image.add(R.drawable.person3);


        recyclerAdapter recyclerAdapter = new recyclerAdapter(name,mobile_number,image,this);
        recyclerView.setAdapter(recyclerAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}