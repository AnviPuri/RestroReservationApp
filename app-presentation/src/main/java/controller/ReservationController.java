package controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import data.entities.ReservationRequest;

@RestController
public class ReservationController extends BaseController {
	
	public void makeReservation(@RequestBody ReservationRequest reservationRequest) {
		
	}

}
