package com.xworkz.mvc;


import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.xworkz.configuration.Config;



public class MvcConfig extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	public MvcConfig() {
		System.out.println("created fiinit");
	}
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		System.out.println("runing root");
		
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("runing serv");
		Class[] ref1= {Config.class};
		return ref1;

	}

	@Override
	protected String[] getServletMappings() {
		String[] r= {"/"};
		return r;
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		// TODO Auto-generated method stub
		configurer.enable();
	}
	
	
		
		
	
	
	
	

}

