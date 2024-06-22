package ru.sky.pro.shop.service;

import org.springframework.stereotype.Service;
import ru.sky.pro.shop.BasketImpl;
import ru.sky.pro.shop.api.Store;

import java.util.List;

@Service
public class StoreImpl implements Store {
    private final BasketImpl basket;

    public StoreImpl(BasketImpl basket) {
        this.basket = basket;
    }

    @Override
    public List<Integer> add(List<Integer> id) {
        return basket.add(id);
    }

    @Override
    public List<Integer> get() {
        return basket.get();
    }


}
