package com.cy.pj.goods.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cy.pj.goods.pojo.Goods;
import com.cy.pj.goods.service.GoodsService;

@Controller
@RequestMapping("/goods/")
public class GoodsController {
	@Autowired
	private GoodsService goodsService;
    @RequestMapping("doFindGoods")
    @ResponseBody
	public List<Goods> doFindGoods(){
		return goodsService.findGoods();
	}//json 串:spring mvc 启动API将对象转换为JSON串
    
    @RequestMapping("ssm")
    @ResponseBody
    public String test()
    {
    	return "test";
    }
}
