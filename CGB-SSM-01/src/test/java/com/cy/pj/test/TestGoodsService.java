package com.cy.pj.test;

import java.util.List;

import org.junit.Test;

import com.cy.pj.goods.pojo.Goods;
import com.cy.pj.goods.service.GoodsService;

public class TestGoodsService extends TestBase{
	@Test
	public void testFindGoods() {
		GoodsService gs=
		ctx.getBean("goodsServiceImpl", GoodsService.class);
	    List<Goods> list=gs.findGoods();
	    for(Goods g:list) {
	    	System.out.println(g);
	    }
	}
}
