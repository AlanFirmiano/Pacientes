package ufc.br.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Recommendation {
    @Id
    @GeneratedValue
    private int id;
    @ManyToMany(cascade={CascadeType.ALL})
    private List<Serie> serie;

    public Recommendation(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Serie> getSerie() {
        return serie;
    }

    public void setSerie(List<Serie> serie) {
        this.serie = serie;
    }

}
