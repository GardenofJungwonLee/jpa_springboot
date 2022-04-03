package com.shop;

import com.shop.constant.ItemSellStatus;
import com.shop.entity.Item;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/test")
    public String test(){
        Item item = new Item();
        item.setItemNm("10");
        item.setId(30L);
        item.setItemSellStatus(ItemSellStatus.SOLD_OUT);

        return "test";
    }
}
