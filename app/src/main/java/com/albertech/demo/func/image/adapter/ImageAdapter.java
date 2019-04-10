package com.albertech.demo.func.image.adapter;

import android.view.View;

import com.albertech.demo.R;
import com.albertech.demo.base.recycler.SelectableRecyclerAdapter;
import com.albertech.demo.func.image.ImageBean;



public class ImageAdapter extends SelectableRecyclerAdapter<ImageHolder, ImageBean> {

    @Override
    public int getItemViewType(int position) {
        return R.layout.item_image;
    }

    @Override
    protected ImageHolder getHolderByViewType(View itemView, int viewType) {
        return new ImageHolder(this, itemView);
    }
}
