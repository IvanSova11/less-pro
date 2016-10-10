package ua.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Utilities {  //��������� ���������
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private int consumed;//�������
	
	private int paid; //��������
	
	private int Indexes; //���������
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Cvartura cvartura;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Owner owner;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Indexes;
		result = prime * result + consumed;
		result = prime * result
				+ ((cvartura == null) ? 0 : cvartura.hashCode());
		result = prime * result + id;
		result = prime * result + ((owner == null) ? 0 : owner.hashCode());
		result = prime * result + paid;
		return result;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getConsumed() {
		return consumed;
	}

	public void setConsumed(int consumed) {
		this.consumed = consumed;
	}

	public int getPaid() {
		return paid;
	}

	public void setPaid(int paid) {
		this.paid = paid;
	}

	public int getIndexes() {
		return Indexes;
	}

	public void setIndexes(int indexes) {
		Indexes = indexes;
	}

	public Cvartura getCvartura() {
		return cvartura;
	}

	public void setCvartura(Cvartura cvartura) {
		this.cvartura = cvartura;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Utilities other = (Utilities) obj;
//		if (Indexes != other.Indexes)
//			return false;
//		if (consumed != other.consumed)
//			return false;
//		if (cvartura == null) {
//			if (other.cvartura != null)
//				return false;
//		} else if (!cvartura.equals(other.cvartura))
//			return false;
//		if (id != other.id)
//			return false;
//		if (owner == null) {
//			if (other.owner != null)
//				return false;
//		} else if (!owner.equals(other.owner))
//			return false;
//		if (paid != other.paid)
//			return false;
//		return true;
	}
	
	
	
	
	