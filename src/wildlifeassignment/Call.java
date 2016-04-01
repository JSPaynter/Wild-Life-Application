package wildlifeassignment;

import java.util.*;

public class Call {
    
    private Observer observer;
    private Animal animal;
    private Date startDate, endDate;
    private String location, reason;

    public Call(wildlifeassignment.Observer observer, Animal animal, Date startDate, Date endDate, String location, String reason) {
        this.observer = observer;
        this.animal = animal;
        this.startDate = startDate;
        this.endDate = endDate;
        this.location = location;
        this.reason = reason;
    }

    public Observer getObserver() {
        return observer;
    }

    public void setObserver(Observer observer) {
        this.observer = observer;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
    
    
}
