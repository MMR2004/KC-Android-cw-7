package com.example.cw7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Item> itemArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Item cheese = new Item("Cheese", R.drawable.cheese, 2.0);
        Item chocolate = new Item("Chocolate", R.drawable.chocolate, 5.0);
        Item coffee = new Item("Coffee", R.drawable.coffee, 7.0);
        Item donut = new Item("Donut", R.drawable.donut, 3.0);
        Item fries = new Item("Fries", R.drawable.fries, 5.0);
        Item honey = new Item("Honey", R.drawable.honey, 15.0);

        itemArrayList.add(cheese);
        itemArrayList.add(chocolate);
        itemArrayList.add(coffee);
        itemArrayList.add(donut);
        itemArrayList.add(fries);
        itemArrayList.add(honey);

        ListView itemListview = findViewById(R.id.listView);

        ShopAdapter p = new ShopAdapter(this, 0,itemArrayList);

        itemListview.setAdapter(p);

    }
}