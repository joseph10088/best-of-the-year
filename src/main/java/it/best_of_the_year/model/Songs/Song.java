package it.best_of_the_year.model.Songs;


public class Song {

    private int id;

    private String titolo;

    private String artista;

    private int minuti;

    private int secondi;

    public Song(String titolo, int id, String artista, int minuti, int secondi) {
        this.titolo = titolo;
        this.id = id;
        this.artista = artista;
        this.minuti = minuti;
        this.secondi = secondi;
    }

    public String getTitolo() {
    return titolo;
    }

    public int getId() {
    return id;
    }

    public String getArtista() {
        return artista;
    }

    public int getMinuti() {
        return minuti;
    }

    public int getSecondi() {
        return secondi;
    }

    @Override
    public String toString() {
        return this.titolo + " " + this.id;
    }
}
