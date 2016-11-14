package com.arutkowski.bookstore.di;

import com.arutkowski.bookstore.booklist.BookListActivity;

import dagger.Subcomponent;

@ActivityScope
@Subcomponent
public interface ActivityComponent {

    void inject(BookListActivity activity);
}
