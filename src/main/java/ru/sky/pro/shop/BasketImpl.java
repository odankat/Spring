package ru.sky.pro.shop;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;
import ru.sky.pro.shop.api.Basket;

import java.util.*;

@Component
@SessionScope

public class BasketImpl implements Basket {
   private final Set<Integer> baskets = new HashSet<>();

   @Override
   public List<Integer> add(List<Integer> id) {
      List<Integer> list = new ArrayList<>(List.of());
       baskets.addAll(id);
       list.addAll(baskets);
      return list;
   }
   @Override
   public List<Integer> get() {
      ArrayList<Integer> qwerty = new ArrayList<>();
      qwerty.addAll(baskets);
      return Collections.unmodifiableList(qwerty);
   }

}

