package com.example.demo.services;

import java.awt.print.Book;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Booking;
import com.example.demo.repository.BookingRepo;

@Service
public class BookingService {

	@Autowired
	private BookingRepo bookingRepo;
	
	public Booking createBooking(Booking booking) {
		booking.setStatus(Booking.Status.PENDING);
		return bookingRepo.save(booking);
	}
	
	public List<Booking>getAllBooking(){
		return bookingRepo.findAll();
	}
	public List<Booking>getPendingBookings(){
		return bookingRepo.findByStatus(Booking.Status.PENDING);
	}
	public Booking updateStatus(Long id, Booking.Status status) {
		Booking booking=bookingRepo.findById(id).orElseThrow();
		return bookingRepo.save(booking);
	}
}
