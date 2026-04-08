package com.example.demo.entity;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime dateTime;

    @Enumerated(EnumType.STRING)
    private PaymentMode payment;

    @Enumerated(EnumType.STRING)
    private Status status;

    @Enumerated(EnumType.STRING)
    private WasteType wasteType;

    @ManyToOne
    private UserEntity user;

    @ManyToOne
    private CollectorEntity collector;

    // ENUMS

    public enum WasteType {
        DRY, WET, PLASTIC, E_WASTE
    }

    public enum PaymentMode {
        ONLINE, CASH
    }

    public enum Status {
        PENDING, COMPLETED
    }
}