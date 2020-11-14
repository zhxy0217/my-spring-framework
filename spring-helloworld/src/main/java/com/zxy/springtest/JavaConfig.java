package com.zxy.springtest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: JavaConfig
 * @author: ganquanzhong
 * @date: 2019/9/2 11:43
 */

@Configuration
@ComponentScan
public class JavaConfig {

	@Bean
	public User user(){
		return new User(101,"ganquanzhong","pwd","13995978321","china");
	}
}
