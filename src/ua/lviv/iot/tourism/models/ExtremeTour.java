package ua.lviv.iot.tourism.models;

public class ExtremeTour extends Tours {

	private String place;
		


	public ExtremeTour(double price, double date, String name, String typeOfTour, Rating rating, String place) {
		super(price, date, name, typeOfTour, rating);
		this.place = place;
		
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

}