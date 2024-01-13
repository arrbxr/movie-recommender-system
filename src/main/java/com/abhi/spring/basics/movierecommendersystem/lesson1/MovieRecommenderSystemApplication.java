package com.abhi.spring.basics.movierecommendersystem.lesson1;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		RecommenderImplementation recommender = new RecommenderImplementation();

		String[] res = recommender.recommendMovies("Dilwale");

		System.out.println(Arrays.toString(res));
	}

}
