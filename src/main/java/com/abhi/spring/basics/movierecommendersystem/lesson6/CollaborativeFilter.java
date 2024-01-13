package com.abhi.spring.basics.movierecommendersystem.lesson6;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("CF")
@Primary
public class CollaborativeFilter implements Filter {
    @Override
    public String[] getRecommendations(String movie){
        System.out.println("You use collaborative filter movie: " + movie);
        return new String[] {"Happy feet", "Ice age", "Shark Tale"};
    }
}
