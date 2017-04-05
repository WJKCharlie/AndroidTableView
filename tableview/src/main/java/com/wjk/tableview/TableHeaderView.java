package com.wjk.tableview;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by JKWANG-PC on 2017/2/13.
 */

class TableHeaderView extends LinearLayout {

    protected TableHeaderAdapter adapter;

    public TableHeaderView(Context context) {
        super(context);

        setOrientation(LinearLayout.HORIZONTAL);
        setGravity(Gravity.CENTER_VERTICAL);

        final LayoutParams layoutParams = new LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        setLayoutParams(layoutParams);
    }

    /**
     * Sets the {@link TableHeaderAdapter} that is used to render the header views of every single column.
     *
     * @param adapter
     *         The {@link TableHeaderAdapter} that should be set.
     */
    public void setAdapter(final TableHeaderAdapter adapter) {
        this.adapter = adapter;
        renderHeaderViews();
    }

    @Override
    public void invalidate() {
        renderHeaderViews();
        super.invalidate();
    }

    /**
     * This method renders the header views for every single column.
     */
    protected void renderHeaderViews() {
        removeAllViews();

        for (int columnIndex = 0; columnIndex < adapter.getColumnCount(); columnIndex++) {
            View headerView = adapter.getHeaderView(columnIndex, this);
            if (headerView == null) {
                headerView = new TextView(getContext());
            }

            if(columnIndex%2==0){
                headerView.setBackgroundColor(ContextCompat.getColor(getContext(),R.color.color_header_even));
            } else {
                headerView.setBackgroundColor(ContextCompat.getColor(getContext(),R.color.color_header_odd));
            }

            final int width = 0;
            final int height = LayoutParams.MATCH_PARENT;
            final int weight = adapter.getColumnWeight(columnIndex);
            final LayoutParams headerLayoutParams = new LayoutParams(width, height, weight);
            addView(headerView, headerLayoutParams);
        }
    }
}
