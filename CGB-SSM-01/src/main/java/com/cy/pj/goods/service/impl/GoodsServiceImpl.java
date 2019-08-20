package com.cy.pj.goods.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cy.pj.goods.dao.GoodsDao;
import com.cy.pj.goods.pojo.Goods;
import com.cy.pj.goods.service.GoodsService;
@Service
public class GoodsServiceImpl implements GoodsService {
	@Autowired
	private GoodsDao goodsDao;
	@Override
	public List<Goods> findGoods() {
		//...
		List<Goods> list=goodsDao.findGoods();
		//...
		return list;
	}
}
