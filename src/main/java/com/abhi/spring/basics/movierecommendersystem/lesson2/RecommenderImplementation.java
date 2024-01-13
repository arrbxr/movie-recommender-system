package com.abhi.spring.basics.movierecommendersystem.lesson2;

public class RecommenderImplementation {
    private Filter filter;

    public RecommenderImplementation(Filter filter) {
        this.filter = filter;
    }

    public String[] recommendMovies(String movie){
        System.out.println("Name of filter in use: " + filter);

        return filter.getRecommendations(movie);
    }

}
