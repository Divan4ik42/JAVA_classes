package edu.Divan.model;

import java.time.LocalDateTime;

public class Record {
    private String id; // db  видит его хорошо если стринг
    private String name;
    private Client client;
    private Chamber chamber;
    private LocalDateTime checkIn;
    private LocalDateTime eventDate;
    private Event event;
    private String description;
    private LocalDateTime created_at;
    private LocalDateTime modified_at;

}
