package com.example.ratings_data_service.model;

public class Rating {

	private String movieId;
	private double rating;
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public Rating(String movieId, double rating) {
		super();
		this.movieId = movieId;
		this.rating = rating;
	}
	public Rating() {
		super();
	}
	
	
}
