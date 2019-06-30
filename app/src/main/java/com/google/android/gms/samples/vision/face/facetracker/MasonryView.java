package com.google.android.gms.samples.vision.face.facetracker;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

class MasonryView extends RecyclerView.ViewHolder {
    ImageView imageView;
    TextView textView;

    public MasonryView(View itemView) {
        super(itemView);

        imageView = (ImageView) itemView.findViewById(R.id.content);
        textView = (TextView) itemView.findViewById(R.id.text);

    }
}
