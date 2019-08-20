package com.cy.pj.goods.dao;
import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.cy.pj.goods.pojo.Goods;
public interface GoodsDao {
    /**获取商品总数*/
	@Select("select count(*) from goods")
	int getRowCount();
	@Select("select * from goods")
	List<Goods> findGoods();
}

