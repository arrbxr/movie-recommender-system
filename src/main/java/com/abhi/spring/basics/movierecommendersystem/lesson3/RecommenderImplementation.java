package com.abhi.spring.basics.movierecommendersystem.lesson3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {
    @Autowired
    private Filter filter;
    public RecommenderImplementation(Filter filter) {
        this.filter = filter;
    }

    public String[] recommendMovies(String movie){
        System.out.println("Name of filter in use: " + filter);

        return filter.getRecommendations(movie);
    }

}
