package com.ch.ch06;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
// @ControllerAdvice 모든 컨트로러에서 발생한 에러 처리
@ControllerAdvice 
public class CommonController {
	@ExceptionHandler(Exception.class)
	public ModelAndView err(Exception e) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("ex",e);
		mav.setViewName("common_error");
		return mav;
	}
}
