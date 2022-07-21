package com.silvericedan.spring.aop.springaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {

  @Pointcut("execution(* com.silvericedan.spring.aop.springaop.data.*.*(..))")
  public void dataLayerExecution(){}

  @Pointcut("execution(* com.silvericedan.spring.aop.springaop.business.*.*(..))")
  public void businessLayerExecution(){}

  //combine the jointpoints and intercept all layers
  @Pointcut("com.silvericedan.spring.aop.springaop.aspect.CommonJoinPointConfig.dataLayerExecution() && com.silvericedan.spring.aop.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()")
  public void allLayerExecution(){}

  @Pointcut("bean(dao*)")
  public void beanStartingWithDao(){}

  @Pointcut("bean(*dao*)")
  public void beanContainingDao(){}

  @Pointcut("within( com.silvericedan.spring.aop.springaop.data..*)")
  public void dataLayerExecutionWithWithin(){}
}
