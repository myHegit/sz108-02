package com.itheima.controller;

import com.itheima.pojo.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.crypto.KeySelector;
import java.util.List;

@Controller
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    /*
    * 查询所有
    * */
    @RequestMapping("/list")
    public String findAll(Model model) {
        //调用业务查询所有
        List<Items> list = itemsService.findAll();
        //塞给页面
        model.addAttribute("items",list);
        return "items";
    }

    /*
     * 添加
     * */
    @RequestMapping("/save")
    public String save(Items items) {
        //调用业务保存
        itemsService.save(items);
        //返回controller的list查询
        return "redirect:/items/list";
    }
}
