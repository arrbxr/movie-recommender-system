package com.abhi.spring.basics.movierecommendersystem.lesson2;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		RecommenderImplementation recommender = new RecommenderImplementation(new CollaborativeFilter());

		String[] res = recommender.recommendMovies("Dilwale");

		System.out.println(Arrays.toString(res));
	}

}
