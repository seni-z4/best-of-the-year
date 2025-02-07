package mvc.bestoftheyear.classes;

import java.util.List;

import org.springframework.context.annotation.Bean;

public class Movies {

  private int id;
  private String titolo;

  public Movies(int id, String titolo) {
    this.id = id;
    this.titolo = titolo;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitolo() {
    return titolo;
  }

  public void setTitolo(String titolo) {
    this.titolo = titolo;
  }

  @Override
  public String toString() {
    return "id=" + id + ", titolo=" + titolo;
  }

}
