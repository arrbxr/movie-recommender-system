package com.abhi.spring.basics.movierecommendersystem.lesson4;

import org.springframework.stereotype.Component;

@Component
public class CollaborativeFilter implements Filter {
    @Override
    public String[] getRecommendations(String movie){
        System.out.println("You use collaborative filter movie: " + movie);
        return new String[] {"Happy feet", "Ice age", "Shark Tale"};
    }
}
