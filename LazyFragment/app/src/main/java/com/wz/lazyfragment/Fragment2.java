package com.wz.lazyfragment;

import android.util.Log;
import android.view.View;

public class Fragment2 extends BaseFragment{
    @Override
    public void lazyLoad() {
        Log.i("MDL","lazyLoad--fragment2");
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
        Log.i("MDL","oniewCreate---fragment2");
    }
}
