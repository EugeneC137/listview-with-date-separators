package com.kunal.example.listviewwithsectionheaders;

import java.util.ArrayList;
import java.util.TreeSet;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by kunal on 4/3/16.
 */
public class ListAdapter extends BaseAdapter {

    private static final int TYPE_ITEM = 0;
    private static final int TYPE_SEPARATOR = 1;

    private ArrayList<Item> mData = new ArrayList<Item>();
    private TreeSet<Integer> sectionHeader = new TreeSet<Integer>();

    private LayoutInflater mInflater;

    public ListAdapter(Context context) {
        mInflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public void addItem(final Item item) {
        mData.add(item);
        notifyDataSetChanged();
    }

    public void addSectionHeaderItem(final Item item) {
        mData.add(item);
        sectionHeader.add(mData.size() - 1);
        notifyDataSetChanged();
    }

    @Override
    public int getItemViewType(int position) {
        return sectionHeader.contains(position) ? TYPE_SEPARATOR : TYPE_ITEM;
    }

    @Override
    public int getViewTypeCount() {
        return 2;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Item getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        int rowType = getItemViewType(position);

        if (convertView == null) {
            holder = new ViewHolder();
            switch (rowType) {
                case TYPE_ITEM:
                    convertView = mInflater.inflate(R.layout.snippet_item1, null);
                    holder.itemName = (TextView) convertView.findViewById(R.id.textview_name);
                    holder.itemPhoneNumber = (TextView) convertView.findViewById(R.id.textview_phonenumber);
                    break;
                case TYPE_SEPARATOR:
                    convertView = mInflater.inflate(R.layout.snippet_item2, null);
                    holder.itemDate = (TextView) convertView.findViewById(R.id.textview_date);
                    break;
            }
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        switch(rowType)
        {
            case TYPE_ITEM:
                holder.itemName.setText(mData.get(position).getItemName());
                holder.itemPhoneNumber.setText(mData.get(position).getItemPhoneNumber());
                break;
            case TYPE_SEPARATOR:
                holder.itemDate.setText(mData.get(position).getItemDate());
                break;
        }

        return convertView;
    }

    public static class ViewHolder {
        public TextView itemName;
        public TextView itemDate;
        public TextView itemPhoneNumber;
    }

}