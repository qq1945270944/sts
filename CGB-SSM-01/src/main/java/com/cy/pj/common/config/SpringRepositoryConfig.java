package com.cy.pj.common.config;
import javax.sql.DataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.alibaba.druid.pool.DruidDataSource;
/**
 * 使用注解描述的类为配置类
 */
@Configuration
@MapperScan("com.cy.pj.goods.dao")//扫描dao
public class SpringRepositoryConfig {
	//@Bean描述的方法,其返回值会交给Spring容器管理
	@Bean(value="druid",initMethod="init",destroyMethod="close")
	public DataSource dataSource() {
		DruidDataSource ds=new DruidDataSource();
		ds.setUrl("jdbc:mysql:///jtshop?serverTimezone=GMT%2B8");
		ds.setUsername("root");
		ds.setPassword("root");
		return ds;
	}
	/**整合mybatis框架*/
	@Autowired
	@Bean
	public SqlSessionFactory sqlSessionFactory(
			@Qualifier("druid")DataSource dataSource) 
			throws Exception {
	  //构建SqlSessionFactoryBean对象
	  SqlSessionFactoryBean factoryBean =
	  new SqlSessionFactoryBean();
	  factoryBean.setDataSource(dataSource);
	  //调用FactoryBean的getObject方法创建SqlSessionFactory
	  //底层会使用SqlSessionFactoryBuilder创建
	  return factoryBean.getObject();
	}
	
}
