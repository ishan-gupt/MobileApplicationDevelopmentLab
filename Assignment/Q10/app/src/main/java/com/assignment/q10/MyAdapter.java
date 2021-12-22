package com.assignment.q10;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

class MyAdapter extends BaseAdapter {
    private final List<Item> mItems = new ArrayList<Item>();
    private final LayoutInflater mInflater;
    public MyAdapter(Context context) {
        mInflater = LayoutInflater.from(context);
        mItems.add(new Item("1",       R.drawable.img));
        mItems.add(new Item("2",   R.drawable.img));
        mItems.add(new Item("3", R.drawable.img));
        mItems.add(new Item("4",      R.drawable.img));
        mItems.add(new Item("5",     R.drawable.img));
        mItems.add(new Item("6",      R.drawable.img));
        mItems.add(new Item("7",       R.drawable.img));
        mItems.add(new Item("8",   R.drawable.img));
        mItems.add(new Item("9", R.drawable.img));
        mItems.add(new Item("10",      R.drawable.img));
        mItems.add(new Item("11",     R.drawable.img));
        mItems.add(new Item("12",      R.drawable.img));
        mItems.add(new Item("13",   R.drawable.img));
        mItems.add(new Item("14", R.drawable.img));
        mItems.add(new Item("15",      R.drawable.img));
        mItems.add(new Item("16",     R.drawable.img));
        mItems.add(new Item("17",      R.drawable.img));
        mItems.add(new Item("18",      R.drawable.img));
        mItems.add(new Item("19",      R.drawable.img));
        mItems.add(new Item("20",      R.drawable.img));
    }
    @Override
    public int getCount() {
        return mItems.size();
    }
    @Override
    public Item getItem(int i) {
        return mItems.get(i);
    }
    @Override
    public long getItemId(int i) {
        return mItems.get(i).drawableId;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = view;
        ImageView picture;
        TextView title;
        if (v == null) {
            v = mInflater.inflate(R.layout.mylist, viewGroup,
                    false);
            v.setTag(R.id.icon, v.findViewById(R.id.icon));
            v.setTag(R.id.title, v.findViewById(R.id.title));
        }
        picture = (ImageView) v.getTag(R.id.icon);
        title = (TextView) v.getTag(R.id.title);
        Item item = getItem(i);
        picture.setImageResource(item.drawableId);
        title.setText(item.name);
        return v;
    }
    private static class Item {
        public final String name;
        public final int drawableId;
        Item(String name, int drawableId) {
            this.name = name;
            this.drawableId = drawableId;
        }
    }
}