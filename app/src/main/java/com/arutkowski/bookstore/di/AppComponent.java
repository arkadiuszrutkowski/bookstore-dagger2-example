package com.arutkowski.bookstore.di;

import com.arutkowski.bookstore.async.AsyncExecutor;
import com.arutkowski.bookstore.core.BooksService;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    AsyncExecutor asyncExecutor();

    BooksService booksService();
}
