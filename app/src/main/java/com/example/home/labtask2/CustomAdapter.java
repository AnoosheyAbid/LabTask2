package com.example.home.labtask2;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

import static com.example.home.labtask2.R.layout.frame1;
import static com.example.home.labtask2.R.layout.frame2;

/**
 * Created by home on 10/10/2017.
 */

public class CustomAdapter extends ArrayAdapter<Contacts> {

    Contacts c = new Contacts();
    Button button;

    class ViewHolder {
        TextView vname, vphone, vgender;
        Button b;
    }

    public static final String TAG = "MTAG";

    public CustomAdapter(@NonNull Context context, List<Contacts> items) {
        super(context, 0, items);
    }

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;
        ViewHolder vh;
        c = getItem(position);
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.frame1, parent, false);

            TextView nameview = (TextView) view.findViewById(R.id.text4);
            //TextView phoneview = (TextView) view.findViewById(R.id.text2);
            //TextView genderview = (TextView) view.findViewById(R.id.text3);
            Button b= (Button)view.findViewById(R.id.button);

            vh = new ViewHolder();
            vh.vname = nameview;
            //vh.vphone = phoneview;
            //vh.vgender = genderview;
            vh.b=b;
            view.setTag(vh);

        }

        vh = (ViewHolder) view.getTag();

        vh.vname.setText(c.getName());
        vh.b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getContext(),MainActivity.class);
                getContext().startActivity(intent);
            }});
       // vh.vphone.setText(c.getPhone());
        //vh.vgender.setText(c.getGender());
        return view;

    }
}
