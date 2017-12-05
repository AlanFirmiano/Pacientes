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
    private String pathAudio;

    public Midia(){}

    public Midia(String pathVideo, String pathAudio){
        this.pathVideo = pathVideo;
        this.pathAudio = pathAudio;
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

    public String getPathAudio() {
        return pathAudio;
    }

    public void setPathAudio(String pathAudio) {
        this.pathAudio = pathAudio;
    }
}
