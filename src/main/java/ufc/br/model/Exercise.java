package ufc.br.model;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class Exercise {
	@Id
	@GeneratedValue
	private int id;
	@NotNull
	private String title;
	private String description;
	@OneToOne(cascade={CascadeType.ALL})
	private Midia midia;
	@Autowired
	@ManyToMany(cascade={CascadeType.ALL})
	private List<Object> objects;

	public Exercise(){

	}
	public Exercise(String title){
		this.title = title;
	}

	public Integer getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Midia getMidia() {
		return midia;
	}

	public void setMidia(Midia midia) {
		this.midia = midia;
	}

	public List<Object> getObjects() {
		return objects;
	}

	public void setObjects(List<Object> objects) {
		this.objects = objects;
	}

}
