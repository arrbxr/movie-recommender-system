package com.abhi.spring.basics.movierecommendersystem.lesson6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {
     @Autowired
     @Qualifier("CBF")
     private Filter filter;

     // or we can use constructor based qualifier annotation
    // where we remove the autowired annotation from field and put it into constructorr
//    public RecommenderImplementation(@Qualifier("CF") Filter filter) {
//        this.filter = filter;
//    }

    public String[] recommendMovies(String movie){
        System.out.println("Name of filter in use: " + filter);

        return filter.getRecommendations(movie);
    }

}
