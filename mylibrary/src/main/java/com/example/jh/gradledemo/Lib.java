package com.example.jh.gradledemo;

/**
 * Created by jh on 2016/1/19.
 */
public class Lib {

    public Lib() {

    }

        public String getText() {
        return GradleAppcation.getInstance().getResources().getString(R.string.TestString);
    }
}
