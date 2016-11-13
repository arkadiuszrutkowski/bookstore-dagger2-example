package com.arutkowski.bookstore.di;

import com.arutkowski.bookstore.booklist.BookListActivity;

import dagger.Component;

@ActivityScope
@Component(dependencies = AppComponent.class)
public interface ActivityComponent {
    void inject(BookListActivity activity);
}
