package oop.pset1.model;

import java.util.List;

public class Summary {
    private List<String> topRatedMovies;

    private List<String> topAppearingGenres;

    public List<String> getTopRatedMovies() {
        return topRatedMovies;
    }

    public List<String> getTopAppearingGenres() {
        return topAppearingGenres;
    }

    public void setTopRatedMovies(List<String> topRatedMovies) {
        this.topRatedMovies = topRatedMovies;
    }

    public void setTopAppearingGenres(List<String> topAppearingGenres) {
        this.topAppearingGenres = topAppearingGenres;
    }


}