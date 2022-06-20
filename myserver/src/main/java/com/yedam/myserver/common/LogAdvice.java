package com.yedam.myserver.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//bean 등록을 @으로 대체
@Component
//aop : aspect와 동일
@Aspect
public class LogAdvice {
	@Pointcut("execution(* com.yedam..*Impl.*(..))") //expression
	//메소드로 pointcut 선언
	public void allpointcut() { //메소드명 : id
		
	}
	
	@Before("LogAdvice.allpointcut()")
	public void printLog(JoinPoint jp) {
		//parameter
		String name = jp.getSignature().getName();
		//                    인수가 있을 경우			 배열이 0보다 클 떄      1번째 배열             else(없을 경우)
		String arg = jp.getArgs() != null && jp.getArgs().length > 0 ? jp.getArgs()[0].toString() : "";
		System.out.println("[before] 로그" + name+ ":" + arg);
	}
}
