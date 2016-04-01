package wildlifeassignment;

import java.text.ParseException;
import java.util.*;

public class VolunteerOb extends Observer {
    
    private Date initialRegDate;
    private String activityStatus;

    public VolunteerOb(Date initialRegDate, String name, String address, String phoneNo, String email) throws ParseException {
        super(name, address, phoneNo, email);
        this.initialRegDate = initialRegDate;
        this.activityStatus = "Passive";
        BWA.volunteerObs.add(this);
    }

    public Date getInitialRegDate() {
        return initialRegDate;
    }

    public void setInitialRegDate(Date initialRegDate) {
        this.initialRegDate = initialRegDate;
    }

    public String getActivityStatus() {
        return activityStatus;
    }

    public void setActivityStatus(String activityStatus) {
        this.activityStatus = activityStatus;
    }
    
    public static Comparator<VolunteerOb> volObserverNameCompare = new Comparator<VolunteerOb>() {
    
    @Override
    public int compare(VolunteerOb o1, VolunteerOb o2) {
        
        String Observername1 = o1.getName().toUpperCase();
        String Observername2 = o2.getName().toUpperCase();
        
        return Observername1.compareTo(Observername2);
    }};
    
}
