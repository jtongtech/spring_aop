package com.in28minutes.spring.aop.springaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {
	@Pointcut("execution(* com.in28minutes.spring.aop.springaop.data.*.*(..))")
	public void dataLayerExecution() {
	}

	@Pointcut("execution(* com.in28minutes.spring.aop.springaop.business.*.*(..))")
	public void businessLayerExecution() {
	}

	@Pointcut("execution(* com.in28minutes.spring.aop.springaop.business.*.*(..)) && execution(* com.in28minutes.spring.aop.springaop.data.*.*(..))")
	public void allLayerExecution() {
	}

	@Pointcut("bean(*dao*)")
	public void beanIncludingDao() {
	}

	@Pointcut("within(com.in28minutes.spring.aop.springaop.data..*)")
	public void dataLayerExecutionWithWithin() {
	}
}
