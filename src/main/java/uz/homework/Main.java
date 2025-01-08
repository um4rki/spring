package uz.homework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by: Umar
 * DateTime: 1/8/2025 5:13 PM
 */
public class Main {
    public static void main(String[] args) {

//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("uz.homework");
        Transform bean = context.getBean(Transform.class);
        bean.start(new Transform());
    }
}
