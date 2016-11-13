package com.arutkowski.bookstore.di;

import com.arutkowski.bookstore.booklist.BookListActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {

    void inject(BookListActivity activity);
}
