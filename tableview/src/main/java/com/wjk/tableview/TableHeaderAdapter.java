package com.wjk.tableview;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wjk.tableview.common.TableHeaderColumnModel;

/**
 * Created by JKWANG-PC on 2017/2/13.
 */

public abstract class TableHeaderAdapter {

    private final Context context;
    protected final TableHeaderColumnModel columnModel;

    protected TableHeaderAdapter(final Context context, final TableHeaderColumnModel columnModel) {
        this.context = context;
        this.columnModel = columnModel;
    }


    public Context getContext() {
        return context;
    }

    public LayoutInflater getLayoutInflater() {
        return (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public Resources getResources() {
        return getContext().getResources();
    }

    protected int getColumnWeight(final int columnIndex) {
        return columnModel.getColumnWeight(columnIndex);
    }

    protected void setColumnCount(final int columnCount) {
        columnModel.setColumnCount(columnCount);
    }

    protected int getColumnCount() {
        return columnModel.getColumnCount();
    }

    /**
     * Method that gives the header views for the different columns.
     *
     * @param columnIndex
     *         The index of the column to return the header view.
     * @param parentView
     *         The view to which the returned view will be added.
     * @return The created header view for the given column.
     */
    public abstract View getHeaderView(int columnIndex, ViewGroup parentView);
}
