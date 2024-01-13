package com.abhi.spring.basics.movierecommendersystem.lesson8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);

		ContentBasedFilter contentBasedFilter = appContext.getBean(ContentBasedFilter.class);

//		CollaborativeFilter recommender = appContext.getBean(CollaborativeFilter.class);
//		CollaborativeFilter recommender2 = appContext.getBean(CollaborativeFilter.class);
//		CollaborativeFilter recommender3 = appContext.getBean(CollaborativeFilter.class);
//
//		System.out.println(recommender);
//		System.out.println(recommender2);
//		System.out.println(recommender3);

		System.out.println(contentBasedFilter);
	}

}
