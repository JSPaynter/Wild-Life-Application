package wildlifeassignment;

import java.util.*;

public class Observer {
    
    private String name, address, phoneNo, email;
    private ArrayList<Call> calls;

    public Observer(String name, String address, String phoneNo, String email) {
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
        this.email = email;
        calls = new ArrayList<>();
    }
    
    public void AddCall(Call call) {
        calls.add(call);
    }
    
    public void SetProOb() {
        
    }
    
    public void RemoveProOb() {
        
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Call> getCalls() {
        return calls;
    }

    public void setCalls(ArrayList<Call> calls) {
        this.calls = calls;
    }
    
    public static Comparator<Observer> observerNameCompare = new Comparator<Observer>() {
    
    @Override
    public int compare(Observer o1, Observer o2) {
        
        String Observername1 = o1.getName().toUpperCase();
        String Observername2 = o2.getName().toUpperCase();
        
        return Observername1.compareTo(Observername2);
    }};
    
    
}
