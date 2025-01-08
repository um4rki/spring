package uz.homework;

import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * Created by: Umar
 * DateTime: 1/8/2025 5:08 PM
 */
@Aspect
@Component
@EnableAspectJAutoProxy
public class TransformAspect {

    @Before("execution(* uz.homework.Transform.start(..))")
    public void before(){
        System.out.println("before");
    }

    @After("execution(* uz.homework.Transform.start(..))")
    public void after(){
        System.out.println("after");
    }

    @AfterReturning("execution(* uz.homework.Transform.start(..))")
    public void afterReturning(){
        System.out.println("afterReturning");
    }
}
