package ru.sky.pro.shop.Service;
import org.springframework.stereotype.Service;
import ru.sky.pro.shop.BasketImpl;
import ru.sky.pro.shop.Interface.Store;

import java.util.Collections;
import java.util.List;

@Service
public class StoreImpl implements Store {
    private final BasketImpl basket;

    public StoreImpl(BasketImpl basket) {
        this.basket = basket;
    }

    @Override
    public List<Integer> add(List<Integer> id) {
        basket.add(id);
        return id;
    }
    @Override
    public List<Integer> get() {
        return basket.get();
    }



}
