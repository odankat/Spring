package ru.sky.pro.shop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.sky.pro.shop.service.StoreImpl;
import java.util.List;

@RestController
@RequestMapping("/order")

public class ControllerStore {
    private final StoreImpl storeImpl;

    public ControllerStore(StoreImpl storeImpl) {
        this.storeImpl = storeImpl;
    }

    @GetMapping("/add")
    public List<Integer> add(@RequestParam List<Integer> id) {
       return storeImpl.add(id);
    }
    @GetMapping("/get")
    public List<Integer> get() {
        return storeImpl.get();
    }

}
