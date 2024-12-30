package com.xiaxi.train.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MemberLog {

    @Pointcut("com.xiaxi.common.aspect.LogAspect.controllerPointcut()")
    public void memberControllerMethods() {}
}
