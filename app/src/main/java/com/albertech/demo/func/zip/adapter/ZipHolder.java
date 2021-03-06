package com.albertech.demo.func.zip.adapter;

import android.support.annotation.NonNull;
import android.view.View;

import com.albertech.common.base.recycler.select.SelectHolder;
import com.albertech.common.base.recycler.select.SelectRecyclerAdapter;
import com.albertech.demo.R;
import com.albertech.demo.func.zip.ZipBean;
import com.albertech.demo.util.DateUtil;
import com.albertech.demo.util.Res;
import com.albertech.demo.util.SizeUtil;


public class ZipHolder extends SelectHolder<SelectRecyclerAdapter<ZipHolder, ZipBean>, ZipBean> {

    public ZipHolder(SelectRecyclerAdapter<ZipHolder, ZipBean> adapter, @NonNull View itemView) {
        super(adapter, itemView);
    }


    @Override
    protected void onBind(int position, ZipBean bean) {
        setText(R.id.tv_item_file_name, bean.name);
        setText(R.id.tv_item_file_info,
                String.format(
                        Res.string(R.string.str_file_info),
                        SizeUtil.format(bean.size),
                        DateUtil.format(bean.date)));
        setImage(R.id.iv_item_file_icon, bean.icon);

        final boolean isSelecting = isSelecting();
        View v = $(R.id.cb_item_file_selection);
        v.setVisibility(isSelecting ? View.VISIBLE : View.INVISIBLE);
        v.setSelected(isSelected(position));
    }

}
