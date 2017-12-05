package ufc.br.model;

import java.util.Date;

import javax.persistence.*;

@Entity
public class Report {
	@Id
	@GeneratedValue
	private Integer id;
	@OneToOne(cascade={CascadeType.MERGE})
	private Permition permition;
	private String status;
	private int time;
	private int effortLevel;
	private Date date;
	private String message;
	private int sets;
	private int repetitions;

	public Report(){

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Permition getPermition() { return permition; }

	public void setPermition(Permition permition) {
		this.permition = permition;
	}

	public String getStatus() { return status; }

	public void setStatus(String status) {
		this.status = status;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getEffortLevel() {
		return effortLevel;
	}

	public void setEffortLevel(int effortLevel) {
		this.effortLevel = effortLevel;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getSets() { return sets; }

	public void setSets(int sets) { this.sets = sets; }

	public int getRepetitions() { return repetitions; }

	public void setRepetitions(int repetitions) { this.repetitions = repetitions; }

}
