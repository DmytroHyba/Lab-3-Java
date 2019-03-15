package ua.lviv.iot.tourism.models;

public class ColtureTour extends Tours {

	private String popularPlaces;
	
	public ColtureTour(double price, double date, String name, String typeOfTour, Rating rating, String popularPlaces) {
		super(price, date, name, typeOfTour, rating);
		this.popularPlaces = popularPlaces;
		
	}
	
	public String getPopularPlaces() {
		return popularPlaces;
		
    }

	public void setPopularPlaces(String popularPlaces) {
	this.popularPlaces = popularPlaces;
    }
}