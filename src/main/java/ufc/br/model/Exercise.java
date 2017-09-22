package ufc.br.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Exercise {
	@Id
	@GeneratedValue
	private int id;
	@NotNull
	private String title;
	private String description;
	private boolean isUnlocked = false;

	public Exercise(String title){
		this.title = title;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public boolean isUnlocked() { return isUnlocked; }

	public void setUnlocked(boolean unlocked) { isUnlocked = unlocked; }

}
