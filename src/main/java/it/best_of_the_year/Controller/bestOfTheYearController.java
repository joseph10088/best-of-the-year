package it.best_of_the_year.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.best_of_the_year.model.Movie.Movie;
import it.best_of_the_year.model.Songs.Song;


@Controller
@RequestMapping("/")
public class bestOfTheYearController {
    @GetMapping("/")
    public String bestOfTheYear(@RequestParam(name = "name", required=false) String name, Model model) {
        model.addAttribute("name", name);
        return "best-of-the-year";
    }

    @GetMapping("/movies")
    public String movies(Model model) {
        model.addAttribute("movie", getBestMovie());
        return "movies";
    }

    @GetMapping("/songs")
    public String songs(Model model) {
        model.addAttribute("song", getBestSongs());
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
            model.addAttribute("movie", movieFor);
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
                model.addAttribute("song", songFor);
            }
        }
        return "song-details";
    }
    

    public List<Movie> getBestMovie(){
        List<Movie> m1 = new ArrayList<>();
        m1.add(new Movie("titanic", 2232));
        m1.add(new Movie("ted", 2255));
        m1.add(new Movie("john wick", 2286));
        return m1;
    }

    public List<Song> getBestSongs(){
        List<Song> s1 = new ArrayList<>();
        s1.add(new Song("yourself", 2342));
        s1.add(new Song("fallin'", 2346));
        s1.add(new Song("hope", 2339));
        return s1;
    }
    
}
