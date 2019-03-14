package ua.lviv.iot.tourism.manager;

import ua.lviv.iot.tourism.models.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class TourismManager {

	private List<Tours> tour; 

	public TourismManager() {
	}
	
	public TourismManager(List<Tours> tour) {
		this.tour = tour;
	}

	public List<Tours> sortByPrice(boolean descending) {
		Comparator<Tours> comparator = 
			(Tours obj1, Tours obj2) -> 
			Double.compare((obj1.getPrice()),(obj2.getPrice()));
		List<Tours> toursList = tour;
		toursList.sort(comparator);
		if (descending) {
			Collections.reverse(toursList);
		}
		return toursList;
	}

	public List<Tours> sortByRating(boolean descending) {
		Comparator<Tours> comparator = 
			(Tours obj1, Tours obj2) ->
		(obj1.getRating()).compareTo(obj2.getRating());
		List<Tours> toursList = tour;
		toursList.sort(comparator);
		if (descending) {
			Collections.reverse(toursList);
		}
		return toursList;
	}

	public List<Tours> findByDate(double date) {
		List<Tours> toursList = tour;
		List<Tours> sortededSecurityList = toursList.stream()
				.filter(tours -> tours.getDate() == date)
				.collect(Collectors.toList());
		return sortededSecurityList;
	}

	public List<Tours> findByTypeOfTours(String typeOfTours) {
		List<Tours> toursList = tour;
		List<Tours> filteredToursList = toursList.stream()
				.filter(tours -> tours.getTypeOfTour() == typeOfTours)
				.collect(Collectors.toList());
		return filteredToursList;
	}

	

	public List<Tours> getTour() {
		return tour;
	}

	public void setTour(List<Tours> tour) {
		this.tour = tour;
	}
	
	public static void main(String[] args) {
		List<Tours> tour = new ArrayList<>();
		
		tour.add(new Tours(700, 12.01, "Egypt",   "For maximum rest", Rating.EXPENSIVE));
		tour.add(new Tours(610, 14.01, "Portugal","For best rest",    Rating.EXPENSIVE));
		tour.add(new Tours(440, 18.01, "Spain",   "For family",       Rating.OUTSOLDET));
		tour.add(new Tours(350, 19.01, "Russia",  "For vodka",        Rating.CHEAP));
		
		TourismManager manager = new TourismManager(tour);
		List<Tours> filteredTourist = manager.findByDate(0);
		System.out.println(filteredTourist);
		
		List<Tours> sortedTour =
				(new TourismManager(tour)).sortByPrice(true);
		System.out.println(sortedTour);
		
		List<Tours> sortedFilteredSecurities =
				(new TourismManager(filteredTourist)).sortByRating(true);
		System.out.println(sortedFilteredSecurities);
		
	}
}
