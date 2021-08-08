package aopannotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class KeyAspect {

	public KeyAspect(){
		
	}
	@Before("execution(* aopannotation.OpenDoor.openDoorWithKey(..))")
	public void insertKey(JoinPoint joinpoint){
		System.out.println("Insert Key "+joinpoint.getArgs()[0]);
	}
	
	@After("execution(* aopannotation.OpenDoor.openDoorWithKey(..))")
	public void removeKey(){
		System.out.println("Remove Key");
	}
	
	@Around("execution(* aopannotation.CloseDoor.closeDoorWithPassword(..))")
	public Object aroundDoor(ProceedingJoinPoint joinpoint){
		System.out.println("Before ..");
		Object obj = null;
		try {
			obj = joinpoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("After "+obj);
		return obj;
	}
	}
