package com.abhi.spring.basics.movierecommendersystem.lesson5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {
    @Autowired
    private Filter contentBasedFilter;

    public RecommenderImplementation(Filter contentBasedFilter) {
        this.contentBasedFilter = contentBasedFilter;
    }

    public String[] recommendMovies(String movie){
        System.out.println("Name of filter in use: " + contentBasedFilter);

        return contentBasedFilter.getRecommendations(movie);
    }

}
