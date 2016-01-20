package com.example.jh.gradledemo;

import com.example.jh.gradledemo.GradleAppcation;

/**
 * Created by jh on 2016/1/19.
 */
public class Lib2 {
    public Lib2() {

    }

    public String getText() {
        return GradleAppcation.getInstance().getResources().getString(R.string.TestString);
    }
}
