package com.yedam.myserver.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class AfterLog {

	//LogAdvice에서 사용한 pointcut 입력하면 바로 사용가능
	@AfterReturning(pointcut = "LogAdvice.allpointcut()", returning = "obj")
	public void pringLog(JoinPoint jp, Object obj) {
		//return값
		String name = jp.getSignature().getName();
		System.out.println("[after] 로그" + name);
		System.out.println(obj);
	}
}
