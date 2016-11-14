package com.arutkowski.bookstore.booklist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.arutkowski.bookstore.R;
import com.arutkowski.bookstore.di.AppComponent;
import com.arutkowski.bookstore.di.AppModule;
import com.arutkowski.bookstore.di.DaggerAppComponent;

import javax.inject.Inject;

public class BookListActivity extends AppCompatActivity {

    @Inject
    BookListPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_list);

        AppComponent component = DaggerAppComponent.builder()
                .appModule(new AppModule())
                .build();

        component.plusActivityComponent()
                .inject(this);

        presenter.hashCode();
    }
}
