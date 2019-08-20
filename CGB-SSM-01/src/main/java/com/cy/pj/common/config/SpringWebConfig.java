package com.cy.pj.common.config;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

@Configuration 
@ComponentScan("com.cy.pj.goods.controller")
@EnableWebMvc //<mvc:annotation-driven/>
public class SpringWebConfig implements WebMvcConfigurer{
	//<mvc:default-servlet-handler/>
	@Override
	public void configureDefaultServletHandling(
			DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
	@Override
	public void configureViewResolvers(
		ViewResolverRegistry registry) {
		registry.enableContentNegotiation(new MappingJackson2JsonView());
		registry.jsp("/WEB-INF/pages/",".html");
	}
}
