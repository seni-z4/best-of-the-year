package mvc.bestoftheyear.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import mvc.bestoftheyear.classes.Movies;

@Controller
@RequestMapping("/")
public class MovieContoller {

  @GetMapping("/movies")
  public String getMovieList(Model model) {
    model.addAttribute("ListMovies", movieslists());
    return "movies";
  }

}
