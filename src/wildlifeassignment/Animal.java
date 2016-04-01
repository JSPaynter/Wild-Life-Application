package wildlifeassignment;

import java.util.*;

public class Animal {
    
    private String name;
    private int threatLevel;
    private ArrayList<Observation> observations;

    public Animal(String name, int threatLevel) {
        this.name = name;
        this.threatLevel = threatLevel;
        observations = new ArrayList<>();
        BWA.watchList.add(this);
    }
    
    public void AddObservation(Observation observation) {
        observations.add(observation);
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getThreatLevel() {
        return threatLevel;
    }

    public void setThreatLevel(int threatLevel) {
        this.threatLevel = threatLevel;
    }

    public ArrayList<Observation> getObservations() {
        return observations;
    }

    public void setObservations(ArrayList<Observation> observations) {
        this.observations = observations;
    }
    
    public static Comparator<Animal> animalNameCompare = new Comparator<Animal>() {
    
    @Override
    public int compare(Animal a1, Animal a2) {
        
        String Animalname1 = a1.getName().toUpperCase();
        String Animalname2 = a2.getName().toUpperCase();
        
        return Animalname1.compareTo(Animalname2);
    }};

}
