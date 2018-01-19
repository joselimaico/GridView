package com.example.root.gridview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by root on 1/5/18.
 */

public class ImageAdapter extends BaseAdapter {
    private Context mContext;
    public Integer[] mThumbsID = {R.drawable.dubai, R.drawable.ec,
            R.drawable.epn, R.drawable.breakingbad, R.drawable.sahara,
            R.drawable.salah
    };
    public ImageAdapter(Context c){
        mContext = c;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public int getCount() {
        return mThumbsID.length;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null)
        {
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(185,185));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8,8,8,8);
        }
        else
        {
            imageView = (ImageView) convertView;
        }
        imageView.setImageResource(mThumbsID[position]);
        return imageView;
    }

}
