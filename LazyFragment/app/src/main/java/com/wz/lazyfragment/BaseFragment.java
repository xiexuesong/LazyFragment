package com.wz.lazyfragment;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

abstract class BaseFragment extends Fragment {

    private boolean isFirst = true;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(getLayoutId(),container,false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
        initEvent(view);
    }



    @Override
    public void onResume() {
        super.onResume();
        if(isFirst){
            lazyLoad();
            isFirst = false;
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i("MDL","onDestroyView"  +  hashCode());
    }



    public abstract void lazyLoad();
    public abstract int getLayoutId();
    protected abstract void initEvent(View view);
    protected abstract void initView(View view);
}
