package com.zh.demo.service.impl;

import com.zh.demo.bean.Item;
import com.zh.demo.dao.ItemMapper;
import com.zh.demo.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemMapper itemMapper;

    @Override
    public Integer addItem(Item item) {
        // get id after insert complete
        itemMapper.insertSelective(item);

        return item.getId();
    }

    @Override
    public Item getItem(Integer id) {
        return itemMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Item> getItemList() {
        return itemMapper.selectItemList();
    }

}
