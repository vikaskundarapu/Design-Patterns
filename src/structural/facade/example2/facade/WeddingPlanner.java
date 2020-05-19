package structural.facade.example2.facade;

import structural.facade.example2.bookings.CateringServices;
import structural.facade.example2.bookings.Hall;
import structural.facade.example2.bookings.Photographer;
import structural.facade.example2.bookings.TransportService;

/* Facade class to hide the complexity */
public class WeddingPlanner {
	private final Hall hall;
	private final CateringServices cateringServices;
	private final Photographer photographer;
	private final TransportService transportService;

	public WeddingPlanner() {
		super();
		this.hall = new Hall();
		this.cateringServices = new CateringServices();
		this.photographer = new Photographer();
		this.transportService = new TransportService();
	}

	/* simplified interface exposed to the client */
	public void planWedding() {
		hall.bookHall();
		cateringServices.bookCateringServices();
		photographer.bookPhotographer();
		transportService.arrangeTransport();
	}
}
