import java.util.ArrayList;

public class Studio {

	private String name;// name of the studio
	private double pricePerHour;

	public Studio(String name, double pricePerHour) {// creates a Studio
		super();
		this.name = name;
		this.pricePerHour = pricePerHour;
	}

	// setters and getters
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setPricePerHour(double pricePerHour) {
		this.pricePerHour = pricePerHour;
	}

	public double getPricePerHour() {
		return pricePerHour;
	}

}