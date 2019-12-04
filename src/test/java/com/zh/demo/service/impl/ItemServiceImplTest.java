package com.zh.demo.service.impl;

import com.zh.demo.Application;
import com.zh.demo.bean.Item;
import com.zh.demo.service.ItemService;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@SpringBootTest(classes = Application.class)
@RunWith(SpringRunner.class)
public class ItemServiceImplTest {

    @Autowired
    private ItemService itemService;

    private static Item item;

    @BeforeClass
    public static void setUp() {
        item = new Item()
                .setName("test")
                .setInventory(100);
    }

    @Test
    public void addItem() {
        Integer id = itemService.addItem(item);
        System.out.println("id = " + id);
        assertNotNull(id);
    }

    @Test
    public void getItem() {
        Item item = itemService.getItem(1);

        assertNotNull(item);
    }

    @Test
    public void getItemList() {
        List<Item> itemList = itemService.getItemList();

        assertNotNull(itemList);
        assertTrue(itemList.size() > 0);
    }
}