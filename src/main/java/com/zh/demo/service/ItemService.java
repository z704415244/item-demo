package com.zh.demo.service;

import com.zh.demo.bean.Item;

import java.util.List;

public interface ItemService {
    Integer addItem(Item item);

    Item getItem(Integer id);

    List<Item> getItemList();
}
