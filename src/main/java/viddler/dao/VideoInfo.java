package main.java.viddler.dao;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by iceman on 6/21/2017.
 */
public class VideoInfo {

    @Id
    @GeneratedValue
    @Column(name = "movie_id")
    int movieId;

    @Column(name = "movie_location")
    String movieLocation;

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieLocation() {
        return movieLocation;
    }

    public void setMovieLocation(String movieLocation) {
        this.movieLocation = movieLocation;
    }
}
