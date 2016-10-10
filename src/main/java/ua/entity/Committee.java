package ua.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Committee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String surname;
	private String position;
	private String email;
	
	@OneToMany(mappedBy = "committee")
	private List<Cvartura> competition;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Cvartura> getCompetition() {
		return competition;
	}

	public void setCompetition(List<Cvartura> competition) {
		this.competition = competition;
	}

	@Override
	public String toString() {
		return "Committee [id=" + id + ", name=" + name + ", surname="
				+ surname + ", position=" + position + ", email=" + email
				+ ", competition=" + competition + "]";
	}

	
	

	
}
