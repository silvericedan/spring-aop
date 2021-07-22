package com.silvericedan.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//AOP
//how do we say this is a Configuration? with @Configuration
@Aspect
@Configuration
public class UseAccessAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    //What kind of method calls i would intercept?
    //execution(* PACKAGE.*.*(..))
    //* : any return type. so we intercept all methods no matter his return type
    //PACKAGE : in a specific package
    //* : any class
    //* : intercept all methods call
    //(..) : regardless of his arguments


    //terminology : the expression "execution(... " its called "point cut"
    // and whats its inside the method is called "advice"
    //the combination of "point cut" and "advice" its called an "Aspect"
    //the join point its a specific interception of a method call
    //join point is a specific execution instance
    //if there are 100 method calls, then it will be 100 joinPoints

    //the framework that makes sure that the aspect is call at the right time is call: Weaver
    //and the process of doing it its called: Weaving

    //joinPoint shows in the log what is the method we are intercepting
    @Before("execution(* com.silvericedan.spring.aop.springaop.business.*.*(..))")
    public void before(JoinPoint joinPoint){

        //one use can be to check user access before method executes
        logger.info(" Check for user access");
        logger.info(" Allowed execution for - {}", joinPoint);
    }


}
