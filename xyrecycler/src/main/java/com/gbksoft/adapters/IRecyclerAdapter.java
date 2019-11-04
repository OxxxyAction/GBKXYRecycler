package com.gbksoft.adapters;

import android.view.View;
import android.view.ViewGroup;

import com.gbksoft.adapters.recyclerview.holder.BaseViewHolder;
import com.gbksoft.template.models.CellModel;
import com.gbksoft.template.models.ColumnHeaderModel;
import com.gbksoft.template.models.RowHeaderModel;


public interface IRecyclerAdapter {

    View onCreateCornerView();

    BaseViewHolder onColumnHeaderCreateViewHolder(ViewGroup parent, int viewType);
    void onColumnHeaderBindViewHolder(BaseViewHolder holder, ColumnHeaderModel columnHeaderItemModel, int columnPosition);
    int getColumnHeaderItemViewType(int position);

    BaseViewHolder onRowHeaderCreateViewHolder(ViewGroup parent, int viewType);
    void onRowHeaderBindViewHolder(BaseViewHolder holder, RowHeaderModel rowHeaderItemModel, int rowPosition);
    int getRowHeaderItemViewType(int position);

    BaseViewHolder onCellCreateViewHolder(ViewGroup parent, int viewType);
    void onCellBindViewHolder(BaseViewHolder holder, CellModel cellItemModel, int columnPosition, int rowPosition);
    int getCellItemViewType(int position);
}
