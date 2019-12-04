package com.zh.demo.controller;

import com.zh.demo.bean.Item;
import com.zh.demo.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping("/get")
    public Item getItem(@RequestParam Integer id) {
        return itemService.getItem(id);
    }

    @PostMapping("/add")
    public Integer addItem(@RequestBody Item item) {
        return itemService.addItem(item);
    }

    @GetMapping("/list")
    public List<Item> listItem() {
        return itemService.getItemList();
    }

}
