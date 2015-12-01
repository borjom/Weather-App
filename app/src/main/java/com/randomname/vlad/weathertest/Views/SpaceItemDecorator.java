package com.randomname.vlad.weathertest.Views;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class SpaceItemDecorator extends RecyclerView.ItemDecoration {
    private final int spacing;

    public SpaceItemDecorator(int spacing) {
        this.spacing = spacing;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent,
                               RecyclerView.State state) {
        int position = parent.getChildAdapterPosition(view);

        if (position == 0) {
            outRect.top = spacing;
        }

        outRect.bottom = spacing;
        outRect.left = spacing;
        outRect.right = spacing;
    }

}
