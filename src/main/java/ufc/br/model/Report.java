package ufc.br.model;

import java.util.Date;

import javax.persistence.*;

@Entity
public class Report {
	@Id
	@GeneratedValue
	private Integer id;
	@OneToOne
	private Patient patient;
	@OneToOne
	private Grasp grasp;
	private String status;
	private int time;
	private int effortLevel;
	private Date date;
	private String message;
	private int sets;
	private int repetitions;
	public Report(){

	}
	
	public Report(Patient patient, Grasp grasp){
		this.patient = patient;
		this.grasp = grasp;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Grasp getGrasp() {
		return grasp;
	}

	public void setGrasp(Grasp grasp) {
		this.grasp = grasp;
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
