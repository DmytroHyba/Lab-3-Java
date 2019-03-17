package ua.lviv.iot.tourism.models;

public class FamilyTour extends Tours {

	private StopAtTheHotel hotel;

	
	
	public FamilyTour(double price, double date, String name,
			String typeOfTour, Rating rating, StopAtTheHotel hotel) {
		super(price, date, name, typeOfTour, rating);
		this.hotel = hotel;
	}

	public StopAtTheHotel getHotel() {
		return hotel;
	}

	public void setHotel(StopAtTheHotel hotel) {
		this.hotel = hotel;
	}

}