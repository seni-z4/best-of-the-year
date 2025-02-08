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

}
