package com.google.android.gms.samples.vision.face.facetracker;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MasonryAdapter extends RecyclerView.Adapter<MasonryView> {
    private Context context;

    int[] imgList = {R.drawable.content1, R.drawable.content2, R.drawable.content3, R.drawable.content4};

    String[] nameList = {"$166.99", "$520.99", "$419.99", "259.99"};

    public MasonryAdapter(Context context) {
        this.context = context;
    }

    @Override
    public MasonryView onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.content_card, parent, false);
        MasonryView masonryView = new MasonryView(layoutView);

        return masonryView;
    }

    @Override
    public void onBindViewHolder(MasonryView holder, int position) {
        holder.imageView.setImageResource(imgList[position]);
        holder.textView.setText(nameList[position]);
    }

    @Override
    public int getItemCount() {
        return nameList.length;
    }
}
