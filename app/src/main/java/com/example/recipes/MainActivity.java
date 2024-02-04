package com.example.recipes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    List<FoodData> myFoodList;
    FoodData mFoodData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView)findViewById(R.id.recyclerView);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(MainActivity.this,1);
        mRecyclerView.setLayoutManager(gridLayoutManager);

        myFoodList = new ArrayList<>();

        mFoodData = new FoodData("Dish","Random","Rs. 800",R.drawable.image);
        myFoodList.add(mFoodData);

        mFoodData = new FoodData("Dish2","Random2","Rs. 500",R.drawable.image2);
        myFoodList.add(mFoodData);

        mFoodData = new FoodData("Dish3","Random3","Rs. 600",R.drawable.image3);
        myFoodList.add(mFoodData);

        mFoodData = new FoodData("Dish4","Random4","Rs. 700",R.drawable.image4);
        myFoodList.add(mFoodData);

        MyAdapter myAdapter = new MyAdapter(MainActivity.this,myFoodList);
        mRecyclerView.setAdapter(myAdapter);
    }

}
