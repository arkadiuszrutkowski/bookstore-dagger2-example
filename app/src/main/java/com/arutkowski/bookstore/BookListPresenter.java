package com.arutkowski.bookstore;

import com.arutkowski.bookstore.async.AsyncExecutor;
import com.arutkowski.bookstore.core.BooksService;

import javax.inject.Inject;

public class BookListPresenter {
    private BooksService service;
    private AsyncExecutor executor;

    @Inject
    public BookListPresenter(BooksService service, AsyncExecutor executor) {
        this.service = service;
        this.executor = executor;
    }
}
