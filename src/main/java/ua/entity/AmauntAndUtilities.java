package ua.entity;

	import java.util.ArrayList;
	import java.util.List;

	import javax.persistence.Entity;
	import javax.persistence.FetchType;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Index;
	import javax.persistence.JoinColumn;
	import javax.persistence.JoinTable;
	import javax.persistence.ManyToMany;
	import javax.persistence.ManyToOne;
	import javax.persistence.Table;

	@Entity
	@Table(indexes=@Index(columnList="amount"))
	
	public class AmauntAndUtilities {
		
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int id;
		@ManyToOne(fetch=FetchType.LAZY)
		private Utilities utilities;
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public Utilities getUtilities() {
			return utilities;
		}

		public void setUtilities(Utilities utilities) {
			this.utilities = utilities;
		}

		public MeasuringSystem getMeasuringSystem() {
			return measuringSystem;
		}

		public void setMeasuringSystem(MeasuringSystem measuringSystem) {
			this.measuringSystem = measuringSystem;
		}

		public int getAmount() {
			return amount;
		}

		public void setAmount(int amount) {
			this.amount = amount;
		}

		public void setOwners(List<Owner> owners) {
			this.owners = owners;
		}

		@ManyToOne(fetch=FetchType.LAZY)
		private MeasuringSystem measuringSystem;
		
		private int amount;
		@ManyToMany(fetch = FetchType.LAZY)
		@JoinTable(name = "AmountAndIngredient_Recipe", joinColumns = 
		@JoinColumn(name = "amountAndIngredient_id"), inverseJoinColumns = 
		@JoinColumn(name = "recipe_id"))
		private List<Owner> owners = new ArrayList<>();

		

		public List<Owner> getOwners() {
			return owners;
		}

		public void setRecipes(List<Owner> owners) {
			this.owners = owners;
		}
		

}
