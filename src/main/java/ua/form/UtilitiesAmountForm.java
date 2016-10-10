package ua.form;

import ua.entity.MeasuringSystem;
import ua.entity.Utilities;

public class UtilitiesAmountForm {

	private int id;
	
	private String amount;
	
	private Utilities utilities;
	
	private MeasuringSystem system;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public Utilities getIngredient() {
		return utilities;
	}

	public void setIngredient(Utilities utilities) {
		this.utilities = utilities;
	}

	public MeasuringSystem getSystem() {
		return system;
	}

	public void setSystem(MeasuringSystem system) {
		this.system = system;
	}
}
