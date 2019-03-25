package com.example.dell.recipebywx.utils;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by dell on 2018/12/30.
 */

/**
 * recyclerView的间距类
 */
public class SpaceItemDecoration extends RecyclerView.ItemDecoration {
    private int horizontal;
    private int vertical;
    public SpaceItemDecoration(int horizontal, int vertical) {
        this.horizontal = horizontal;
        this.vertical = vertical;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {

        if (parent.getChildLayoutPosition(view)%2 == 0)
        {
            outRect.right = horizontal/2;
        }
        if (parent.getChildLayoutPosition(view)%2 == 1)
        {
            outRect.left = horizontal/2;
        }
        if(parent.getChildPosition(view) != -1)
            outRect.top = vertical;
    }
}
