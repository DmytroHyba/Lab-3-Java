package ua.lviv.iot;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.tourism.manager.TourismManagers;
import ua.lviv.iot.tourism.models.ColtureTour;
import ua.lviv.iot.tourism.models.Rating;
import ua.lviv.iot.tourism.models.StopAtTheHotel;
import ua.lviv.iot.tourism.models.Tours;


public class TourismManagerTest {

	private List<Tours> newTours;
	private TourismManagers tourismManagers;

	@BeforeEach
	public void beforeEach() {
		TourismManagers b = new TourismManagers();
		Tours buffer = new Tours();
		ColtureTour buff = new ColtureTour();
		StopAtTheHotel buf = StopAtTheHotel.FIVE_STARS;
		
		newTours = new ArrayList<>();
		newTours.add(new Tours(700, 12.01, "Egypt", "For maximum rest", Rating.EXPENSIVE));
		newTours.add(new Tours(610, 14.01, "Portugal", "For best rest", Rating.EXPENSIVE));
		newTours.add(new Tours(440, 18.01, "Spain", "For family", Rating.OUTSOLDET));
		newTours.add(new Tours(100, 19.01, "Russia", "For vodka", Rating.CHEAP));
		tourismManagers = new TourismManagers(newTours);
	}

	@Test
	public void testFindByDate() {
		Assertions.assertEquals(1, tourismManagers.findByDate(12.01).size());
		Assertions.assertEquals(1, tourismManagers.findByDate(18.01).size());
		Assertions.assertEquals(1, tourismManagers.findByDate(19.01).size());
	}
	
	@Test
	public void testSortByPrice() {
		Assertions.assertEquals(700, tourismManagers.sortByPrice(true).get(0).getPrice());
		Assertions.assertEquals(100, tourismManagers.sortByPrice(false).get(0).getPrice());
	}
	
	@Test
	public void testSortByRating() {
		Assertions.assertEquals(Rating.CHEAP, tourismManagers.sortByRating(true).get(0).getRating());
		Assertions.assertEquals(Rating.EXPENSIVE, tourismManagers.sortByRating(false).get(0).getRating());
	}
	
	@Test
	public void testFindByTypeOfTours() {
		Assertions.assertEquals(1, tourismManagers.findByTypeOfTours("For vodka").size());
		Assertions.assertEquals(1, tourismManagers.findByTypeOfTours("For family").size());
	}

}
