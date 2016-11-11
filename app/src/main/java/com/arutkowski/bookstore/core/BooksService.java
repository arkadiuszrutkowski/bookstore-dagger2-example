package com.arutkowski.bookstore.core;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class BooksService {
    private BooksRemoteClient client;
    private BooksRepository repository;

    @Inject
    public BooksService(BooksRemoteClient client, BooksRepository repository) {
        this.client = client;
        this.repository = repository;
    }
}
