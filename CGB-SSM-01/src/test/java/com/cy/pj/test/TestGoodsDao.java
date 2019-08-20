package com.cy.pj.test;

import java.util.List;

import org.junit.Test;

import com.cy.pj.goods.dao.GoodsDao;
import com.cy.pj.goods.pojo.Goods;

public class TestGoodsDao extends TestBase{
     @Test
	 public void testGetRowCount() {
		 GoodsDao dao=
		 ctx.getBean("goodsDao",GoodsDao.class);
		 int rowCount=dao.getRowCount();
		 System.out.println(rowCount);
	 }
     @Test
     public void testFindGoods() {
    	 GoodsDao dao=
    	 ctx.getBean("goodsDao",GoodsDao.class);
    	 List<Goods> list=dao.findGoods();
    	 for(Goods g:list) {
    		System.out.println(g);
    	 }
     }
}
