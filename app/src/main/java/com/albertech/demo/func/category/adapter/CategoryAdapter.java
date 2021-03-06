package com.albertech.demo.func.category.adapter;

import android.view.View;

import com.albertech.common.base.recycler.normal.BaseRecyclerAdapter;
import com.albertech.demo.R;
import com.albertech.demo.func.category.CategoryBean;
import com.albertech.demo.func.category.ICategoryContract;


public class CategoryAdapter extends BaseRecyclerAdapter<CategoryHolder, CategoryBean> {

    public CategoryAdapter() {
        updateData(ICategoryContract.CategoryModel.getCategories());
    }


    @Override
    public int getItemViewType(int position) {
        return R.layout.item_category;
    }

    @Override
    protected CategoryHolder getHolderByViewType(View itemView, int viewType) {
        return new CategoryHolder(this, itemView);
    }

}
