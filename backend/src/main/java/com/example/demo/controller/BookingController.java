package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Booking;
import com.example.demo.services.BookingService;

@RestController
@RequestMapping("/api/bookings")
@CrossOrigin
public class BookingController {

    @Autowired
    private BookingService bookingService;

    // ✅ Create booking
    @PostMapping
    public Booking createBooking(@RequestBody Booking booking) {
        return bookingService.createBooking(booking);
    }

    // ✅ Get all bookings
    @GetMapping
    public List<Booking> getAllBookings() {
        return bookingService.getAllBooking(); // fixed name
    }

    // ✅ Get pending bookings
    @GetMapping("/pending")
    public List<Booking> getPendingBookings() {
        return bookingService.getPendingBookings();
    }

    // ✅ Update booking status (Pickup / Complete)
    @PutMapping("/{id}/status") // fixed typo
    public Booking updateBooking(@PathVariable Long id,
                                @RequestParam Booking.Status status) {
        return bookingService.updateStatus(id, status);
    }
}