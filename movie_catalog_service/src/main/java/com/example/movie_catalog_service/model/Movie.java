package com.example.movie_catalog_service.model;

public class Movie {

	private String movieId;
	private String name;
	private String description;
	
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Movie() {
		super();
	}
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Movie(String movieId, String name, String description) {
		super();
		this.movieId = movieId;
		this.name = name;
		this.description = description;
	}
	
	
}
