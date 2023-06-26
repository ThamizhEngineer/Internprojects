package com.sw.Annotations.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class SingleInterceptor implements HandlerInterceptor {

	private final Logger LOG=LoggerFactory.getLogger(SingleInterceptor.class);
	
	@Override
	public boolean preHandle(HttpServletRequest request,HttpServletResponse response,Object handler) throws Exception{
		LOG.info("In preHandle method of Single Interceptor");
		return true;
	}
	@Override
	public void postHandle(HttpServletRequest request,HttpServletResponse response,Object handler ,ModelAndView modelandview) throws Exception{
		LOG.info("In postHandle method of Single Interceptor");
	}
	@Override
	public void afterCompletion(HttpServletRequest request,HttpServletResponse response,Object handler ,Exception ex)  throws Exception
	{
		LOG.info("In afterCompletion method of Single Interceptor");
		
	}
}
