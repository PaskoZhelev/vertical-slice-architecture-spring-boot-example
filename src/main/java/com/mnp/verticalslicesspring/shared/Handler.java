package com.mnp.verticalslicesspring.shared;

public interface Handler<T, R> {

    R handle(T t);
}
