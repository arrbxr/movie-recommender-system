package com.abhi.spring.basics.movierecommendersystem.lesson1;

public class ContentBasedFilter {

    public String[] getRecommendations(String movie){
        System.out.println("You search movie: " + movie);
        return new String[] {"Happy feet", "Ice age", "Shark Tale"};
    }

}
