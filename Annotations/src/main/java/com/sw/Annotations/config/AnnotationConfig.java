package com.sw.Annotations.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.sw.Annotations.interceptor.AnnotationInterceptor;
import com.sw.Annotations.interceptor.ProductListInterceptor;

@Component
public class AnnotationConfig implements WebMvcConfigurer{

		@Autowired
		AnnotationInterceptor annotationInterceptor;
		@Autowired 
		ProductListInterceptor  productListInterceptor;
		
		@Override
		public void addInterceptors(InterceptorRegistry registry) {
			registry.addInterceptor(annotationInterceptor);
		}	
		
		public void ListInterceptors( final InterceptorRegistry registry) {
			registry.addInterceptor( new ProductListInterceptor());
		}
}
