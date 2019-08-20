package com.cy.pj.test;

import java.sql.Connection;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

public class TestSpringRepositoryConfig 
    extends TestBase {
	@Test
	public void testSqlSessionFactory() {
		SqlSessionFactory ssf=
		ctx.getBean("sqlSessionFactory",
				SqlSessionFactory.class);
		System.out.println(ssf);
		Connection conn=
		ssf.openSession().getConnection();
		System.out.println(conn);
	}

}
