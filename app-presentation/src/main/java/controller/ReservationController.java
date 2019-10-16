package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import data.entities.ReservationRequest;

@RestController
public class ReservationController extends BaseController {
	
	@PostMapping
	public void makeReservation(@RequestBody ReservationRequest reservationRequest) {
		
	}
	
	@GetMapping
	public void getReservation(@RequestBody ReservationRequest reservationRequest) {
		
	}
	

}
