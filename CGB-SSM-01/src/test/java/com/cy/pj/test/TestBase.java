package com.cy.pj.test;
import org.junit.Before;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.cy.pj.common.config.SpringRepositoryConfig;
import com.cy.pj.common.config.SpringServiceConfig;
public class TestBase {
    protected AnnotationConfigApplicationContext ctx;
	@Before
	public void init() {
		ctx=new AnnotationConfigApplicationContext(
			SpringRepositoryConfig.class,
			SpringServiceConfig.class);
	}
}
