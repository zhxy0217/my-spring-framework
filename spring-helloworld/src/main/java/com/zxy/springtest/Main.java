package com.zxy.springtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.i18n.LocaleContextHolder;

import java.util.Locale;

/**
 * @ClassName: Main
 * @author: ganquanzhong
 * @date: 2019/9/2 12:29
 */
public class Main {
//	@Autowired
//	static public MessageSource messageSource;

	public static void main(String[] args){

		ApplicationContext ac =new AnnotationConfigApplicationContext(JavaConfig.class);
		User user = (User) ac.getBean("user");
		System.out.println(user.toString());
		System.out.println("Hello world");

//		Locale locale = LocaleContextHolder.getLocale();
//		String msg = messageSource.getMessage("msg",null,locale);
	}

}
