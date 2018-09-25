package com.in28minutes.spring.aop.springaop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class BeforeAspect {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Before("execution(* com.in28minutes.spring.aop.springaop.business.*.*(..))")
	public void before() {
		logger.info("intercepted Method Calls {}");
	}
}
