package it.best_of_the_year.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import it.best_of_the_year.model.Movie.Movie;
import it.best_of_the_year.model.Songs.Song;


@Controller
@RequestMapping("/")
public class bestOfTheYearController {
    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/movies")
    public String movies(Model model) {
        model.addAttribute("movies", getBestMovie());
        return "movies";
    }

    @GetMapping("/songs")
    public String songs(Model model) {
        model.addAttribute("songs", getBestSongs());
        return "songs";
    }

    @GetMapping("/movies/{id}")
    public String movieDetail(@PathVariable(name = "id", required=false) int id, Model model) {
        List<Movie> movie = getBestMovie();
        Movie movieFor = null;
        for (Movie m : movie) {
            if(m.getId() == id){
                movieFor = m;
            }
        }
        if(movieFor != null){
            model.addAttribute("movies", movieFor);
        }
        return "movies-details";
    }

    @GetMapping("/songs/{id}")
    public String getMethodName(@PathVariable(name = "id", required=false) int id, Model model) {
        List<Song> song = getBestSongs();
        Song songFor = null;
        for (Song s : song) {
            if(s.getId() == id){
                songFor = s;
            }
            if(songFor != null){
                model.addAttribute("songs", songFor);
            }
        }
        return "song-details";
    }
    

    public List<Movie> getBestMovie(){
        List<Movie> m1 = new ArrayList<>();
        m1.add(new Movie("creed", 2256, "Il leggendario lottatore Rocky Balboa torna sul ring per allenare un giovane campione: il figlio del suo vecchio avversario, Apollo Creed, che ha deciso di dedicarsi al pugilato nonostante il padre sia morto durante un incontro."));
        m1.add(new Movie("creed II", 2255, "Adonis Creed ha tutto. Tutto quello che un atleta e un uomo possono desiderare: il titolo di campione del mondo dei pesi massimi e l'amore di Bianca, a cui chiede di sposarlo. Ma a un passo dalla felicità, il passato torna e lo sfida. Il suo fantasma ha il volto e i muscoli di Viktor, figlio di Ivan Drago, che trentaquattro anni prima ha ucciso suo padre sul ring. Sconfitto da Rocky Balboa, abbandonato dalla consorte e dimenticato dal suo paese, Ivan cresce il figlio a sua immagine e cerca il riscatto al suo fianco. Adonis accetta di combattere contro Viktor ma Rocky non ci sta. Almeno fino a quando il suo pupillo non comprenderà la sola cosa per cui valga la pena incassare pugni e assestarne: la famiglia."));
        m1.add(new Movie("creed III", 2286, "Adonis Creed sta prosperando nella sua carriera e nella sua vita familiare. Quando un amico d'infanzia ed ex prodigio del pugilato ricompare dopo aver scontato la pena in carcere, è ansioso di dimostrare di meritare la sua occasione sul ring."));
        return m1;
    }

    public List<Song> getBestSongs(){
        List<Song> s1 = new ArrayList<>();
        s1.add(new Song("yourself", 2342, "eminem", 4,59));
        s1.add(new Song("fallin'", 2346, "alicia keys",3,30));
        s1.add(new Song("hope", 2339, "nf",4,24));
        return s1;
    }
    
}
