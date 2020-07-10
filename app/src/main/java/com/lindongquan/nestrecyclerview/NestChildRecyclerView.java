package com.lindongquan.nestrecyclerview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

/**
 * 用于RecyclerView嵌套ViewPager嵌套RecyclerView
 * 最外围的RecyclerView需要使用{@link NestParentRecyclerView}
 * 被嵌套的ViewPage中的Fragment，需要继承接口{@link INestChildFragment}
 * fragment中需要被联动的RecyclerView需要使用 {@link NestChildRecyclerView}
 */
public class NestChildRecyclerView extends RecyclerView {

    public NestChildRecyclerView(Context context) {
        super(context);
        init();
    }

    public NestChildRecyclerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public NestChildRecyclerView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    private void init() {
        setFocusable(false);
        setOverScrollMode(View.OVER_SCROLL_NEVER);
    }
}
