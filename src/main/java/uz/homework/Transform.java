package uz.homework;

import lombok.Setter;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by: Umar
 * DateTime: 1/8/2025 5:02 PM
 */
@Component
public class Transform {

    public List<Integer> startNumber(){
        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        if(new Random().nextBoolean()){
            throw new RuntimeException();
        }
        return numbers;
    }

    public void start(Transform transform){
        List<Integer> integers = startNumber();
        System.out.println(integers);
    }



}
