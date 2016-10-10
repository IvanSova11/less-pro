package ua.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PreRemove;

import com.fasterxml.jackson.annotation.JsonIgnore;

	@Entity
	public class Cvartura {
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private long population;
	private String name;	
	private int nomer;	
	private int floor;// ������
	
	private int number_of_rooms;//������� �����
	@JsonIgnore
	@OneToMany(mappedBy="country")
	private List<Owner> recipes = new ArrayList<>();
	
	@PreRemove
	public void removeAllChilds(){
		for (Owner recipe : owner) {
			recipe.setCvartura(null);
		}
	}
	
	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public long getPopulation() {
		return population;
	}



	public void setPopulation(long population) {
		this.population = population;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getNomer() {
		return nomer;
	}



	public void setNomer(int nomer) {
		this.nomer = nomer;
	}



	public int getFloor() {
		return floor;
	}



	public void setFloor(int floor) {
		this.floor = floor;
	}



	public int getNumber_of_rooms() {
		return number_of_rooms;
	}



	public void setNumber_of_rooms(int number_of_rooms) {
		this.number_of_rooms = number_of_rooms;
	}



	public List<Owner> getRecipes() {
		return recipes;
	}



	public void setRecipes(List<Owner> recipes) {
		this.recipes = recipes;
	}



	public List<Owner> getOwner() {
		return owner;
	}



	public void setOwner(List<Owner> owner) {
		this.owner = owner;
	}



	public Utilities getUtilities() {
		return utilities;
	}



	public void setUtilities(Utilities utilities) {
		this.utilities = utilities;
	}



	public Owner getOvner() {
		return ovner;
	}



	public void setOvner(Owner ovner) {
		this.ovner = ovner;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Cvartura))
			return false;
		Cvartura other = (Cvartura) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@OneToMany(mappedBy="owner")
	//private Owner owner;
	private List<Owner> owner;
	@ManyToOne(fetch = FetchType.LAZY)
	private Utilities utilities;
	@ManyToOne(fetch = FetchType.LAZY)
	private Owner ovner;
	
}
