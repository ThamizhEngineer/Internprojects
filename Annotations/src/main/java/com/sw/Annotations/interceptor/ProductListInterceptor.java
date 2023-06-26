package com.sw.Annotations.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class ProductListInterceptor implements HandlerInterceptor{
	
	private final Logger LOG=LoggerFactory.getLogger(ProductListInterceptor.class);
	
	@Override
	public boolean preHandle(HttpServletRequest request,HttpServletResponse response,Object handler) throws Exception{
		LOG.info("In preHandle method of ProductList Interceptor");
		return true;
	}
	@Override
	public void postHandle(HttpServletRequest request,HttpServletResponse response,Object handler ,ModelAndView modelandview)
			 throws Exception{
		LOG.info("In postHandle method of ProductList Interceptor");
	}
	@Override
	public void afterCompletion(HttpServletRequest request,HttpServletResponse response,Object handler ,Exception ex)  throws Exception
	{
		LOG.info("In sfterCompletion method of ProductList Interceptor");
		
	}

}
