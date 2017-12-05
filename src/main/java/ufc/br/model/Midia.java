package ufc.br.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Midia {
    @Id
    @GeneratedValue
    private int id;
    private String pathVideo;
    private String title;

    public Midia(){}

    public Midia(String pathVideo, String title){
        this.pathVideo = pathVideo;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPathVideo() {
        return pathVideo;
    }

    public void setPathVideo(String pathVideo) {
        this.pathVideo = pathVideo;
    }

    public String getPathTitle() {
        return title;
    }

    public void setPathTitle(String pathAudio) {
        this.title = title;
    }
}
