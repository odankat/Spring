package ru.sky.pro.shop.api;

import java.util.List;

public interface Basket {
    List<Integer> add(List<Integer> id);

    List<Integer> get();
}
