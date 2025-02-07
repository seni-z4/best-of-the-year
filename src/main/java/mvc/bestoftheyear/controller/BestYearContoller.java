package mvc.bestoftheyear.controller;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import mvc.bestoftheyear.classes.Movies;

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

}
