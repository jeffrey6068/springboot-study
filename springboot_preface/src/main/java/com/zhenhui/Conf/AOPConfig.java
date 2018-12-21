package com.zhenhui.Conf;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 * Created by Zhenhui
 * Date: 2018-09-26
 */
@Aspect
@Configuration
public class AOPConfig {
    @Around("@within(org.springframework.stereotype.Controller)")
    public Object functionAcessCheck(final ProceedingJoinPoint pjp)  throws Throwable {
        Object[] args = pjp.getArgs();
        System.out.println("args:"+ Arrays.asList(args));
        Object o = pjp.proceed();
        System.out.println("return :"+o);
        return o;
    }
}
