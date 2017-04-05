package com.wjk.tableview.common;

/**
 * Created by JKWANG-PC on 2017/2/13.
 */

public class TableCellData {
    private String value;
    private int row;
    private int column;
    private int rowSpan;
    private int columnSpan;

    public TableCellData(String value, int row, int column) {
        this(value, row, column, 1, 1);
    }

    public TableCellData(String value, int row, int column, int rowSpan, int columnSpan) {
        this.value = value;
        this.row = row;
        this.column = column;
        this.rowSpan = rowSpan;
        this.columnSpan = columnSpan;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getRowSpan() {
        return rowSpan;
    }

    public void setRowSpan(int rowSpan) {
        this.rowSpan = rowSpan;
    }

    public int getColumnSpan() {
        return columnSpan;
    }

    public void setColumnSpan(int columnSpan) {
        this.columnSpan = columnSpan;
    }
}
