package mvc.bestoftheyear.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import mvc.bestoftheyear.classes.Movies;
import mvc.bestoftheyear.classes.Songs;

@Controller
@RequestMapping("/")
public class BestYearContoller {

  @GetMapping("/")
  public String test() {
    return "homepage";
  }

  @GetMapping("/bestyear")
  public String bestYear(Model model, @RequestParam(name = "name") String nome) {
    model.addAttribute("nome", nome);

    return "index";
  }

  private List<Movies> listMovies() {
    return List.of(
        new Movies(1, "HarryPotter"),
        new Movies(2, "Creed"),
        new Movies(3, "FastAndFurious"));

  }

  private List<Songs> listSongs() {
    return List.of(
        new Songs(1, "HighestDebut"),
        new Songs(2, "DieWithASmile"),
        new Songs(3, "Dtmf"));

  }

  @GetMapping("/movies")
  public String getMovieList(Model model) {
    model.addAttribute("movies", listMovies());
    return "movies";
  }

  @GetMapping("/songs")
  public String getSongsList(Model model) {
    model.addAttribute("songs", listSongs());
    return "songs";
  }

  @GetMapping("/movies/{id}")
  public String moviesFilters(Model model, @PathVariable("id") int movieNumber) {
    model.addAttribute("movies", listMovies());
    model.addAttribute("currentMovie", movieNumber);

    return "movieFilter";
  }

  @GetMapping("/songs/{id}")
  public String songsFilter(Model model, @PathVariable("id") int songNumber) {
    model.addAttribute("songs", listSongs());
    model.addAttribute("currentSong", songNumber);
    return "songsFilter";
  }

}
