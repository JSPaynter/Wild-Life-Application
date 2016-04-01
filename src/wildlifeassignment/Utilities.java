package wildlifeassignment;

import javax.swing.*;
import java.text.*;
import java.util.Collections;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Utilities {
    
    public static void InfoBox(String info, String title){
        JOptionPane.showMessageDialog(null, info, "Information box : " + title, JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static DateFormat DateFormat() {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        return df;
    }
    
    public static void SortLists() {
        Collections.sort(BWA.watchList, Animal.animalNameCompare);
        Collections.sort(BWA.observers, Observer.observerNameCompare);
        Collections.sort(BWA.professionalObs, ProfessionalOb.proObserverNameCompare);
        Collections.sort(BWA.volunteerObs, VolunteerOb.volObserverNameCompare);
    }
    
    public static boolean NullCheck(JTextField textBox, String feedback, String title) {
        
        String text = textBox.getText();
        String newFeedback = feedback +  " can not be null.";
        if (text.isEmpty() == true) {
            InfoBox(newFeedback, title);
            textBox.requestFocus();
            return false;
        }
        else {
            return true;
        }
    }
    
    public static Date todaysDate() throws ParseException {
        Date date = new Date();
        String dateString = Utilities.DateFormat().format(date);
        date = Utilities.DateFormat().parse(dateString);
        return date;
    }
    
    public static boolean CheckBefore(Date date) {
        boolean check = false;
        try {
            if (date.before(todaysDate())) {
                check = true;
            }
            else {        
                check = false;
                InfoBox("Date must be before today.", "Yesterday checker");
            }
        } catch (ParseException ex) {}
        
        return check;
    }
    
        public static boolean CheckBefore(Date date1, Date date2) {
        boolean check = false;
        if (date1.before(date2)) {
            check = true;
        }
        else {
            check = false;
            InfoBox("First date must be before second date.", "Yesterday checker");
        }
        
        return check;
    }
}
