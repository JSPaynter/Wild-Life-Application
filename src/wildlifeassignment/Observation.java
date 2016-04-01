package wildlifeassignment;

import java.util.*;

public class Observation implements Comparable<Observation> {
    
    private Animal animal;
    private Observer observer;
    private Date date;
    private String location, confidence, description;
    private int NoOfObs;

    public Observation(Animal animal, wildlifeassignment.Observer observer, Date date, String location, String confidence, String description, int NoOfObs) {
        this.animal = animal;
        this.observer = observer;
        this.date = date;
        this.location = location;
        this.confidence = confidence;
        this.description = description;
        this.NoOfObs = NoOfObs;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Observer getObserver() {
        return observer;
    }

    public void setObserver(Observer observer) {
        this.observer = observer;
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

    public String getConfidence() {
        return confidence;
    }

    public void setConfidence(String confidence) {
        this.confidence = confidence;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNoOfObs() {
        return NoOfObs;
    }

    public void setNoOfObs(int NoOfObs) {
        this.NoOfObs = NoOfObs;
    }
    
    @Override
    public int compareTo(Observation o) {
        if (getDate() == null || o.getDate() == null) {
            return 0;
        }        
        return o.getDate().compareTo(getDate());
    };
    
    
}
