package com.wjk.tableview.common;

import android.util.Pair;

import java.util.Map;

/**
 * Created by JKWANG-PC on 2017/2/13.
 */

public class TableHeaderColumnModel {
    private static final int DEFAULT_COLUMN_WEIGHT = 1;

    private final Map<Integer, Pair<String,Integer>> columns;
    private int columnCount;

    public TableHeaderColumnModel(final Map<Integer, Pair<String,Integer>> columns) {
        this.columns = columns;
        this.columnCount = columns.size();
    }

    /**
     * Sets the column count to this model.
     *
     * @param columnCount
     *         The number of columns that shall be set.
     */
    public void setColumnCount(final int columnCount) {
        this.columnCount = columnCount;
    }

    /**
     * Gives the column count of this model.
     *
     * @return The number of columns that is currently set.
     */
    public int getColumnCount() {
        return columnCount;
    }

    public String getColumnValue(final int columnIndex){
        return columns.get(columnIndex).first;
    }

    /**
     * Gives the column weight (the relative width of a column) of the column at the given index.
     *
     * @param columnIndex
     *         The index of the column to receive the column weight.
     * @return The column weight of the column at the given index.
     */
    public int getColumnWeight(final int columnIndex) {
        Integer columnWeight = columns.get(columnIndex).second;
        if (columnWeight == null) {
            columnWeight = DEFAULT_COLUMN_WEIGHT;
        }
        return columnWeight;
    }
}
