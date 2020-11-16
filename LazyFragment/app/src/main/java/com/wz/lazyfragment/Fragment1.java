package com.wz.lazyfragment;

import android.util.Log;
import android.view.View;

public class Fragment1  extends BaseFragment{
    @Override
    public void lazyLoad() {
        Log.i("MDL","lazyLoad--fragment1");
    }

    @Override
    public int getLayoutId() {
        return R.layout.item_fragment;
    }

    @Override
    protected void initEvent(View view) {

    }

    @Override
    protected void initView(View view) {
        Log.i("MDL","oniewCreate---fragment1");
    }
}
