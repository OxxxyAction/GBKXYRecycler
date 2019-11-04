package com.gbksoft;

import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.gbksoft.adapters.BaseRecyclerAdapter;
import com.gbksoft.adapters.recyclerview.CellRecyclerView;
import com.gbksoft.handlers.ScrollHandler;
import com.gbksoft.layoutmanagers.CellLayoutManager;
import com.gbksoft.layoutmanagers.ColumnHeaderLayoutManager;
import com.gbksoft.listeners.HorizontalScrollListener;
import com.gbksoft.listeners.VerticalScrollListener;


public interface IXYRecycler {

    void addView(View child, ViewGroup.LayoutParams params);

    boolean hasFixedWidth();

    boolean isShowHorizontalDividers();
    
    boolean isShowVerticalDividers();

    CellRecyclerView getCellRecyclerView();

    CellRecyclerView getColumnHeaderRecyclerView();

    CellRecyclerView getRowHeaderRecyclerView();

    ColumnHeaderLayoutManager getColumnHeaderLayoutManager();

    CellLayoutManager getCellLayoutManager();

    LinearLayoutManager getRowHeaderLayoutManager();

    HorizontalScrollListener getHorizontalScrollListener();

    VerticalScrollListener getVerticalRecyclerViewListener();

    DividerItemDecoration getHorizontalItemDecoration();
    
    DividerItemDecoration getVerticalItemDecoration();

    void scrollToColumnPosition(int column);

    void scrollToColumnPosition(int column, int offset);

    void scrollToRowPosition(int row);

    void scrollToRowPosition(int row, int offset);

    int getDividerColor();

    void remeasureColumnWidth(int column);

    int getRowHeaderWidth();

    void setRowHeaderWidth(int rowHeaderWidth);

    BaseRecyclerAdapter getAdapter();

    ScrollHandler getScrollHandler();
}
