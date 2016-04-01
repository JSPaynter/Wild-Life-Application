package wildlifeassignment;

import java.text.ParseException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BWA {

    public static ArrayList<Observer> observers = new ArrayList<>();
    public static ArrayList<VolunteerOb> volunteerObs = new ArrayList<>();
    public static ArrayList<ProfessionalOb> professionalObs = new ArrayList<>();    
    public static ArrayList<Animal> watchList = new ArrayList<>();
    public static ArrayList<Observation> recentObservations = new ArrayList<>();
    
    public static void main(String[] args) {      
        
    }
    
    public static void NewData() {
        //Intergrating new data
        
        Animal animal1 = new Animal("Robin", 2);
        Animal animal2 = new Animal("Zebra", 4);
        Animal animal3 = new Animal("T-Rex", 5);
        Animal animal4 = new Animal("Icelandic Horse", 1);
        Observation observation1, observation2, observation3;
        try {    
            VolunteerOb observer1 = new VolunteerOb(Utilities.DateFormat().parse("07/6/2011"), "Jordan", "Wonderland", "07584587586", "Something@that.co.uk");
            VolunteerOb observer2 = new VolunteerOb(Utilities.DateFormat().parse("25/12/2011"), "Gemma", "London", "07587458758", "This@That.com");
            ProfessionalOb proOb1 = new ProfessionalOb("Jordan", "Wonderland", "07584587586", "Something@that.co.uk", Utilities.DateFormat().parse("07/6/2011"), Utilities.DateFormat().parse("07/6/2016"), 35000.00);
            ProfessionalOb proOb2 = new ProfessionalOb("Gemma", "London", "07587458758", "This@That.com",Utilities.DateFormat().parse("25/12/2011"),  Utilities.DateFormat().parse("25/12/2016"), 33500.00);
            proOb1.setNoOfObs(2);            
            BWA.observers.add(proOb1);
            BWA.observers.add(observer2);            
            observation1 = new Observation(animal1, proOb1, Utilities.DateFormat().parse("07/12/2012") , "Forest", "Confident" ,"High up in the tree", 10);
            observation2 = new Observation(animal3, observer2, Utilities.DateFormat().parse("21/08/2013") , "Jungle", "Not-Confident" ,"In the bushes", 10);
            observation3 = new Observation(animal4, proOb1, Utilities.DateFormat().parse("17/11/2014") , "Beach", "Confident" ,"on teh rocks", 10);
            animal1.getObservations().add(observation1);
            animal3.getObservations().add(observation2);
            animal4.getObservations().add(observation3);
            recentObservations.add(observation1);
            recentObservations.add(observation2);
            recentObservations.add(observation3);
        } catch (ParseException ex) {}
        
        Utilities.SortLists();
    }
    
}
