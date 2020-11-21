package com.project.reservation.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.reservation.entity.Reservation;

public interface ReservationRepo extends JpaRepository<Reservation, Integer> {

}
