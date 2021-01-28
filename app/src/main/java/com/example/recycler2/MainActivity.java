package com.example.recycler2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {



    RecyclerView recyclerView;
    String contactList[]={"Hrithik","Sadhu","Rajib"};
    int imgList[]={R.drawable.a1,R.drawable.b1,R.drawable.c1};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerview);


        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(linearLayoutManager);

        Adapter adapter= new Adapter(MainActivity.this,contactList,imgList);
        recyclerView.setAdapter(adapter);

    }
}