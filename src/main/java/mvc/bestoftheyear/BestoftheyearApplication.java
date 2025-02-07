package mvc.bestoftheyear;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import mvc.bestoftheyear.classes.Movies;
import mvc.bestoftheyear.classes.Songs;

@SpringBootApplication
public class BestoftheyearApplication {

	public static void main(String[] args) {
		SpringApplication.run(BestoftheyearApplication.class, args);

	}

	// @Bean
	// public List<Movies> movieslists() {
	// return List.of(
	// new Movies(1, "HarryPotter"),
	// new Movies(2, "Creed"),
	// new Movies(3, "FastAndFurious"));
	// }

	// @Bean
	// public List<Songs> Songlists() {
	// return List.of(
	// new Songs(1, "HighestDebut"),
	// new Songs(2, "DieWithASmile"),
	// new Songs(3, "Dtmf"));
	// }

}
