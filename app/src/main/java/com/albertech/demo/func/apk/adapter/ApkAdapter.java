package com.albertech.demo.func.apk.adapter;

import android.view.View;

import com.albertech.demo.R;
import com.albertech.demo.base.recycler.SelectableRecyclerAdapter;
import com.albertech.demo.func.apk.ApkBean;



public class ApkAdapter extends SelectableRecyclerAdapter<ApkHolder, ApkBean> {

    @Override
    public int getItemViewType(int position) {
        return R.layout.item_file;
    }

    @Override
    protected ApkHolder getHolderByViewType(View itemView, int viewType) {
        return new ApkHolder(this, itemView);
    }
}