package com.cs.ebm.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Aspect
@Component
public class LoggingAspect {

    @Pointcut("execution(* com.cs.ebm..*.*(..))")
    public void myPointcut() {

    }

    @Around("myPointcut()")
    public Object applicationLogger(ProceedingJoinPoint pjp) throws Throwable {

        ObjectMapper mapper = new ObjectMapper();

        // before method invocation
        String methodName = pjp.getSignature().getName();
        String className = pjp.getTarget().getClass().getName(); // Use getName() to get the fully-qualified class name
        Object[] arg = pjp.getArgs();
        log.info("Method Invoke " + className + " : " + methodName + "() " + mapper.writeValueAsString(arg));

        // for executing the method
        Object object = pjp.proceed();

        // after the method execution
        log.info(className + " : " + methodName + "() Response : " + mapper.writeValueAsString(object));
        return object;
    }
}
