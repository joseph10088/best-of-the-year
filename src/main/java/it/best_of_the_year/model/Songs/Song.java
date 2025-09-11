package it.best_of_the_year.model.Songs;

public class Song {

    private String titolo;

    private int id;

    public Song(String titolo, int id) {
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
