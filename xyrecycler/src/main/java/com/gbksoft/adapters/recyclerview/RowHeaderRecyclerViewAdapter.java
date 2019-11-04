package com.gbksoft.adapters.recyclerview;

import android.content.Context;
import android.view.ViewGroup;

import com.gbksoft.adapters.IRecyclerAdapter;
import com.gbksoft.adapters.recyclerview.holder.BaseViewHolder;
import com.gbksoft.template.models.RowHeaderModel;

import java.util.List;


public class RowHeaderRecyclerViewAdapter<RH> extends BaseRecyclerViewAdapter<RH> {

    public RowHeaderRecyclerViewAdapter(Context context, List<RH> items, IRecyclerAdapter recyclerAdapter) {
        super(context, items);
        this.recyclerAdapter = recyclerAdapter;
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return recyclerAdapter.onRowHeaderCreateViewHolder(parent, viewType);
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        recyclerAdapter.onRowHeaderBindViewHolder(holder, (RowHeaderModel) getItem(position), position);
    }

    @Override
    public int getItemViewType(int position) {
        return recyclerAdapter.getRowHeaderItemViewType(position);
    }
}
