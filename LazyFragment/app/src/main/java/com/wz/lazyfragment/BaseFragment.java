package com.wz.lazyfragment;

import androidx.fragment.app.Fragment;

abstract class BaseFragment extends Fragment {

    private boolean isFirst = true;
    private boolean isVisible = true;

    @Override
    public void onResume() {
        super.onResume();
        if(isFirst && isVisible){
            lazyLoad();
        }
    }


    public abstract void lazyLoad();
}
