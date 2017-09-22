package ufc.br.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Responsible {
	@Id
	@GeneratedValue
	private Integer id;
	@NotNull
	private String email;
	@NotNull
	private String password;
	@NotNull
	private String name;
	
	public Responsible(){
		
	}
	
	public Responsible(String email, String password, String name){
		this.email = email;
		this.password = password;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
