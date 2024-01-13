package com.abhi.spring.basics.movierecommendersystem.lesson3;

import org.springframework.stereotype.Component;


public class ContentBasedFilter implements Filter {
    @Override
    public String[] getRecommendations(String movie){
        System.out.println("You search movie: " + movie);
        return new String[] {"Happy feet", "Ice age", "Shark Tale"};
    }

}
