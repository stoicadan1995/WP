package com.example.kp.lab2onpw;

import android.content.Context;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

public class Adapter extends ArrayAdapter<Integer> {

    private List<Integer> sizes;

    Context contextGlobal;

    TextView colorName;
    RelativeLayout exampleBox;

    private final LayoutInflater mInflater;

    public Adapter(Context context) {
        super(context, R.layout.list_item);
        contextGlobal = context;

        mInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public void setData(List<Integer> data) {

        clear();
        if (data != null) {
            addAll(data);
            notifyDataSetChanged();
        }
        sizes = data;
    }

    public Integer getItem(int position) {
        return sizes.get(position);
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        View view;
        if (convertView == null) {
            view =  mInflater.inflate(R.layout.list_item, parent, false);
        } else {
            view = convertView;
        }

        TextView sizeName = (TextView) view.findViewById(R.id.sizeName);

        final Integer currentSize = getItem(position);

        sizeName.setText("Size : " + String.valueOf(currentSize));

        return view;
    }
}
