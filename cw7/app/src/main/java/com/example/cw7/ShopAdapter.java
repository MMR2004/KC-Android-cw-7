package com.example.cw7;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ShopAdapter extends ArrayAdapter<Item> {

    List<Item> ShopItemList;


    public ShopAdapter(@NonNull Context context, int resource, @NonNull List<Item> objects) {
        super(context, resource, objects);
        ShopItemList = objects;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardlist, parent, false);

        Item currentItems = ShopItemList.get(position);

        TextView ItemName = v.findViewById(R.id.itemName);
        TextView ItemPrice = v.findViewById(R.id.itemPrice);
        ImageView ItemImage = v.findViewById(R.id.itemImage);

        ItemName.setText(currentItems.getItemName());
        ItemPrice.setText(String.valueOf(currentItems.getItemPrice()));
        ItemImage.setImageResource(currentItems.getItemImage());


        return v;
    }
}
