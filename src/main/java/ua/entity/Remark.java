package ua.entity;

//import java.lang.reflect.GenericArrayType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Remark {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String message;
	//private Cvartura cvartura;
	
		
		
		@ManyToOne
		private Owner owner;
		@ManyToOne
		private Cvartura cvartura;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
		public Owner getOwner() {
			return owner;
		}
		public void setOwner(Owner owner) {
			this.owner = owner;
		}
		public Cvartura getCvartura() {
			return cvartura;
		}
		public void setCvartura(Cvartura cvartura) {
			this.cvartura = cvartura;
		}
		
		

}
