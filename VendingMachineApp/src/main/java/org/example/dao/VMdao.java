package org.example.dao;

import org.example.dto.Item;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public interface VMdao {
    List<Item> getAllItems();
    double getMoney();
    void removeOneInv(String name);
    int getInv(String name);
    Item gettItem(String name);

    Map<String, BigDecimal> getSttockItemNames();
}
