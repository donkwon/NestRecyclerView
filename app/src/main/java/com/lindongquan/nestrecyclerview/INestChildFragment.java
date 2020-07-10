package com.lindongquan.nestrecyclerview;

/**
 * 用于RecyclerView嵌套ViewPager嵌套RecyclerView
 * 最外围的RecyclerView需要使用{@link NestParentRecyclerView}
 * 被嵌套的ViewPage中的Fragment，需要继承接口{@link INestChildFragment}
 * fragment中需要被联动的RecyclerView需要使用 {@link NestChildRecyclerView}
 */
public interface INestChildFragment {

    NestChildRecyclerView getRecyclerView();

}
