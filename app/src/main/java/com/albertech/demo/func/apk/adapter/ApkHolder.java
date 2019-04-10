package com.albertech.demo.func.apk.adapter;

import android.support.annotation.NonNull;
import android.view.View;
import android.widget.CheckBox;

import com.albertech.demo.R;
import com.albertech.demo.base.recycler.SelectableHolder;
import com.albertech.demo.base.recycler.SelectableRecyclerAdapter;
import com.albertech.demo.func.apk.ApkBean;
import com.albertech.demo.util.DateUtil;
import com.albertech.demo.util.Res;
import com.albertech.demo.util.SizeUtil;


public class ApkHolder extends SelectableHolder<SelectableRecyclerAdapter<ApkHolder, ApkBean>, ApkBean> {

    public ApkHolder(SelectableRecyclerAdapter<ApkHolder, ApkBean> adapter, @NonNull View itemView) {
        super(adapter, itemView);
    }


    @Override
    protected void onBind(int position, ApkBean bean) {
        setText(R.id.tv_item_file_name, bean.name);
        setText(R.id.tv_item_file_info,
                String.format(
                        Res.string(R.string.str_file_info),
                        SizeUtil.format(bean.size),
                        DateUtil.format(bean.date)));
        setImage(R.id.iv_item_file_icon, bean.icon);

        CheckBox cb = $(R.id.cb_item_file_selection);
        cb.setVisibility(isSelecting() ? View.VISIBLE : View.INVISIBLE);
        cb.setChecked(isSelected(position));
    }
}
