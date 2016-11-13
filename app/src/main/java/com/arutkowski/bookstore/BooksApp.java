package com.arutkowski.bookstore;

import android.app.Application;
import android.content.Context;

import com.arutkowski.bookstore.di.AppComponent;
import com.arutkowski.bookstore.di.AppModule;
import com.arutkowski.bookstore.di.DaggerAppComponent;

public class BooksApp extends Application {
    private AppComponent appComponent;

    public AppComponent getAppComponent() {
        return appComponent;
    }

    public static BooksApp get(Context context) {
        return (BooksApp) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule())
                .build();
    }
}
