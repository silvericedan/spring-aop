package com.silvericedan.spring.aop.springaop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//AOP
//how do we say this is a Configuration? with @Configuration
@Aspect
@Configuration
public class BeforeAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    //What kind of method calls i would intercept?
    //execution(* PACKAGE.*.*(..))
    //* : any return type. so we intercept all methods no matter his return type
    //PACKAGE : in a specific package
    //* : any class
    //* : intercept all methods call
    //(..) : regardless of his arguments

    @Before("execution(* com.silvericedan.spring.aop.springaop.business.*.*(..))")
    public void before(){
        logger.info(" Intercepted Method Calls");
    }

}
