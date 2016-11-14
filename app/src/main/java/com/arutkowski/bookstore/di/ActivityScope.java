package com.arutkowski.bookstore.di;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

@Retention(RetentionPolicy.SOURCE)
@Scope
public @interface ActivityScope {
}
