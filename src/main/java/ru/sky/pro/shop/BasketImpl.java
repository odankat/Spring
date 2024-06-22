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
      baskets.addAll(id);
      return null;
   }
   @Override
   public List<Integer> get() {
      ArrayList<Integer> qwerty = new ArrayList<>();
      qwerty.addAll(baskets);
      return Collections.unmodifiableList(qwerty);
   }

}

