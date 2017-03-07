package com.sourabh.interceptor;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class DayOfWeekBasedAccessInterceptor extends HandlerInterceptorAdapter{

	@SuppressWarnings("static-access")
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		Calendar cal = Calendar.getInstance();
		
		int dayOfWeek = cal.get(cal.DAY_OF_WEEK);
		if(dayOfWeek == 5){//DayOfWeek = 5 = THURSDAY
			response.getWriter().write("The website is closed on this day please try another day of the week");
			System.out.println("Handler Interceptor Adapter : Spring MVC called preHandler method for "+
					request.getRequestURI().toString()+" With Output : False");
			return false;
		}
		System.out.println("Handler Interceptor Adapter : Spring MVC called preHandler method for "+
				request.getRequestURI().toString()+" With Output : True");
		
		return true;
	}
	/*
	 * This website will not gonna work on THURSDAY it requested for the URL
	 * on THURSDAY
	 * otherwise it will work on other week days
	 */
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("Handler Interceptor Adapter : Spring MVC called postHandler method for "+
										request.getRequestURI().toString());
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("Handler Interceptor Adapter : Spring MVC called afterCompletion method for "+
				request.getRequestURI().toString());
	}
	
}
