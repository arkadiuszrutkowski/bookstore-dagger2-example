package com.arutkowski.bookstore.di;

import com.arutkowski.bookstore.async.AndroidAsyncExecutor;
import com.arutkowski.bookstore.async.AsyncExecutor;
import com.arutkowski.bookstore.core.BooksRemoteClient;
import com.arutkowski.bookstore.core.BooksRepository;
import com.arutkowski.bookstore.data.BooksRemoteHttpClient;
import com.arutkowski.bookstore.data.BooksSqlLiteRepository;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Provides
    @Singleton
    AsyncExecutor provideAsyncExecutor() {
        return new AndroidAsyncExecutor();
    }

    @Provides
    @Singleton
    BooksRemoteClient provideBooksRemoteClient() {
        return new BooksRemoteHttpClient();
    }

    @Provides
    @Singleton
    BooksRepository provideBooksRepository() {
        return new BooksSqlLiteRepository();
    }
}
