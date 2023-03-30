package com.caseperish.demo;

import android.app.Application;

import com.fire.caseperish.CasePerish;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CasePerish.install(this,null);

    }
}
