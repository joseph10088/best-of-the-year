package it.best_of_the_year.model.Movie;

public class Movie {

    private String titolo;

    private int id;

    public Movie(String titolo, int id) {
        this.titolo = titolo;
        this.id = id;
    }

    public String getTitolo() {
    return titolo;
    }

    public int getId() {
    return id;
    }

    @Override
    public String toString() {
        return this.titolo + " " + this.id;
    }
}
