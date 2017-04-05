package com.wjk.tableview.toolkits;

import android.content.Context;
import android.graphics.Typeface;
import android.view.Gravity;
import android.widget.GridLayout;
import android.widget.TextView;

import com.wjk.tableview.R;
import com.wjk.tableview.TableDataAdapter;
import com.wjk.tableview.common.TableCellData;

import java.util.List;

/**
 * Created by JKWANG-PC on 2017/2/16.
 */

public final class SimpleTableDataAdapter extends TableDataAdapter {

    private float textSize = 16;
    private int paddingLeft = 20;
    private int paddingTop = 15;
    private int paddingRight = 20;
    private int paddingBottom = 15;
    private int typeface = Typeface.NORMAL;
    private int textColor = 0x99000000;

    public SimpleTableDataAdapter(Context context, List<TableCellData> data, int columnCount) {
        super(context, data, columnCount);
    }

    @Override
    protected void addGridLayoutView(Context context, List<TableCellData> cellDatas) {

        for (int i = 0, n = cellDatas.size(); i < n; ++i) {
            TableCellData cellData = cellDatas.get(i);
            TextView view = new TextView(context);
            view.setText(cellData.getValue());
            GridLayout.Spec rowSpec = GridLayout.spec(cellData.getRow(), cellData.getRowSpan());
            GridLayout.Spec colomnSpce = GridLayout.spec(cellData.getColumn(), cellData.getColumnSpan());
            GridLayout.LayoutParams params = new GridLayout.LayoutParams(rowSpec, colomnSpce);
            params.setGravity(Gravity.FILL);
            params.width = (int) (tableDataViewWidth * cellData.getColumnSpan() / columnCount);
            params.height = GridLayout.LayoutParams.WRAP_CONTENT;

            if (cellData.getRow() % 2 == 0) {
                if (cellData.getRow() > 0) {
                    view.setBackgroundResource(R.drawable.tv_border_even);
                } else {
                    view.setBackgroundResource(R.drawable.tv_border_first_row);
                }
            } else {
                view.setBackgroundResource(R.drawable.tv_border_odd);
            }
            view.setGravity(Gravity.CENTER);
            view.setTextSize(textSize);
            view.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
            view.setTypeface(view.getTypeface(), typeface);
            view.setTextColor(textColor);
            tableDataView.addView(view, params);
        }
    }

    public void setTextSize(float textSize) {
        this.textSize = textSize;
    }

    public void setPaddings(final int left, final int top, final int right, final int bottom) {
        this.paddingLeft = left;
        this.paddingTop = top;
        this.paddingRight = right;
        this.paddingBottom = bottom;
    }

    public void setPaddingLeft(int paddingLeft) {
        this.paddingLeft = paddingLeft;
    }

    public void setPaddingTop(int paddingTop) {
        this.paddingTop = paddingTop;
    }

    public void setPaddingRight(int paddingRight) {
        this.paddingRight = paddingRight;
    }

    public void setPaddingBottom(int paddingBottom) {
        this.paddingBottom = paddingBottom;
    }

    public void setTypeface(int typeface) {
        this.typeface = typeface;
    }

    public void setTextColor(int textColor) {
        this.textColor = textColor;
    }
}
