package com.example.aspect;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	public static final Log LOGGER = LogFactory.getLog(LoggingAspect.class);
	
	@Before(value = "execution(*    com.application.MyController.display(..)")
	public void before() {
		LOGGER.info("going inside login method");
	}
	
/*	@AfterReturning("execution(* com.application.MyController.loginUser(..)")
	public void afterreturn(JoinPoint j,Object val) {
		LOGGER.info("login method is complete without any exception");
	    LOGGER.info(j.getSignature());
	    LOGGER.info(val);
	}*/
	
	/*@AfterThrowing(pointcut = "execution(* com.application.MyController.loginUser(..)", throwing = "exception")
	public void afterthrowing(ArithmeticException exception) {
		LOGGER.info("Exception Occured");
		LOGGER.error(exception.getMessage());
	}*/
	
	/*public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		LOGGER.info("@Around:before proceeding part of around advice");
		proceedingJoinPoint.proceed();
		LOGGER.info("@Around:After the proceeding part of around advide");
	}*/
}
