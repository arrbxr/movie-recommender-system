package com.abhi.spring.basics.movierecommendersystem.lesson5;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class CollaborativeFilter implements Filter {
    @Override
    public String[] getRecommendations(String movie){
        System.out.println("You use collaborative filter movie: " + movie);
        return new String[] {"Happy feet", "Ice age", "Shark Tale"};
    }
}
