package it.best_of_the_year.model.Movie;

public class Movie {
    
    private int id;

    private String titolo;

    private String trama;

    public Movie(String titolo, int id, String trama) {
        this.titolo = titolo;
        this.id = id;
        this.trama = trama;
    }

    public String getTitolo() {
    return titolo;
    }

    public int getId() {
    return id;
    }

    public String getTrama() {
        return trama;
    }

    @Override
    public String toString() {
        return this.titolo + " " + this.id;
    }
}
