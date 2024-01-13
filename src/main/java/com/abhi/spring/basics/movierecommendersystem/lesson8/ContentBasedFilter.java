package com.abhi.spring.basics.movierecommendersystem.lesson8;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class ContentBasedFilter implements Filter {
    @Override
    public String[] getRecommendations(String movie){
        System.out.println("You search movie: " + movie);
        return new String[] {"Happy feet", "Ice age", "Shark Tale"};
    }

}
