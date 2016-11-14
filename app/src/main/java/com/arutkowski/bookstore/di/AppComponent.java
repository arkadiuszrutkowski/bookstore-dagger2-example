package com.arutkowski.bookstore.di;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {

    ActivityComponent plusActivityComponent();
}
