package ua.entity;

import java.time.LocalTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
//�������
public class Owner {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private LocalTime time;
	

	@Override
	public String toString() {
		return "Owner [id=" + id + ", name=" + name + ", time=" + time
				+ ", cvartura=" + cvartura + ", owner=" + owner + "]";
	}

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

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	public Cvartura getCvartura() {
		return cvartura;
	}

	public void setCvartura(Cvartura cvartura) {
		this.cvartura = cvartura;
	}

	public List<Owner> getOwner() {
		return owner;
	}

	public void setOwner(List<Owner> owner) {
		this.owner = owner;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	public Cvartura cvartura;
	
	@OneToMany(mappedBy = "committee")
	private List<Owner> owner;
	
	public List<AmountAndUtilities> getAmountAndUtilities() {
		return amountAndUtilities;
	}

	public void setAmountAndUtilities(
			List<AmountAndUtilities> amountAndUtilities) {
		this.amountAndUtilities = amountAndUtilities;
	}

	
	
}
