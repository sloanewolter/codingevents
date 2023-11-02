package org.launchcode.codingevents.models;

import jakarta.validation.constraints.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.util.Date;
import java.util.Objects;
@Entity
public class Event extends AbstractEntity {

    @NotBlank
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters")
    private String name;

    @Size(max = 500, message = "Description too long")
    private String description;

    @Email(message = "Invalid email, try again.")
    @NotBlank
    private String contactEmail;

    @NotBlank
    @NotNull
    private String location;

    @AssertTrue(message="You must be required to register for the event.")
    private boolean mustRegister;

    @DecimalMin(value= "1", message = "Number must be greater than 0.")
    private int numberOfAttendees;

    @Future(message="The event must take place in the future.")
    private Date date;

    private EventType type;



    public Event(String name, String description, String contactEmail, String location, boolean mustRegister, int numberOfAttendees,Date date, EventType type) {
        this.name = name;
        this.description = description;
        this.contactEmail = contactEmail;
        this.location = location;
        this.mustRegister = mustRegister;
        this.numberOfAttendees = numberOfAttendees;
        this.date= date;
        this.type = type;

    }
    public Event() {
        }

    public EventType getType() {
        return type;
    }

    public void setType(EventType type) {
        this.type = type;
    }

    public boolean isMustRegister() {
        return mustRegister;
    }

    public void setMustRegister(boolean mustRegister) {
        this.mustRegister = mustRegister;
    }

    public int getNumberOfAttendees() {
        return numberOfAttendees;
    }

    public void setNumberOfAttendees(int numberOfAttendees) {
        this.numberOfAttendees = numberOfAttendees;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return name;
    }


}
