package ua.lviv.iot.tourism.models;

public class Tours {

	private double price;
	private double date;
	private String name;
	private String typeOfTour;
	private Rating rating;
	

	public Tours(double price, double date, String name,
			String typeOfTour, Rating rating) {
		super();
		this.price = price;
		this.date = date;
		this.name = name;
		this.typeOfTour = typeOfTour;
		this.rating = rating;
		
		
	}

	


	@Override
	public String toString() {
		return "Tours [price=" + price + " " + date +
				", name=" + name+ ", typeOfTour=" +
				typeOfTour+", rating=" + rating + "]";
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDate() {
		return date;
	}

	public void setDate(double date) {
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setNmae(String name) {
		this.name = name;
	}

	public String getTypeOfTour() {
		return typeOfTour;
	}

	public void setTypeOfTour(String typeOfTour) {
		this.typeOfTour = typeOfTour;
	}

	public Rating getRating() {
		return rating;
	}

	public void setRating(Rating rating) {
		this.rating = rating;
	}

}