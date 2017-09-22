package ufc.br.model;

import javax.persistence.*;

@Entity
public class Grasp {
    @Id
    @GeneratedValue
    private int id;
    @OneToOne
    private Exercise exercise;
    @OneToOne
    private Level level;
    @OneToOne
    private Midia midia;
    @OneToOne
    private Recommendation recommendation;

    public Grasp() {

    }

    public Grasp(Exercise exercise, Level level,Midia midia,Recommendation recommendation){
        this.exercise = exercise;
        this.level = level;
        this.midia = midia;
        this.recommendation = recommendation;
    }

    public Midia getMidia() {
        return midia;
    }

    public void setMidia(Midia midia) {
        this.midia = midia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Exercise getExercise() {
        return exercise;
    }

    public void setExercise(Exercise exercise) {
        this.exercise = exercise;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public Recommendation getRecommendation() { return recommendation; }

    public void setRecommendation(Recommendation recommendation) { this.recommendation = recommendation; }
    
}
