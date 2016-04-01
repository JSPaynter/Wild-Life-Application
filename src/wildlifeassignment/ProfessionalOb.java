package wildlifeassignment;

import java.util.*;

public class ProfessionalOb extends Observer{
    
    private Date contractStart, contractEnd;
    private double annualSalary;
    private int NoOfObs;

    public ProfessionalOb(String name, String address, String phoneNo, String email, Date start, Date end, double annualSalary) {
        super(name, address, phoneNo, email);
        this.contractStart = start;
        this.contractEnd = end;
        this.NoOfObs = 0;
        this.annualSalary = annualSalary;
        BWA.professionalObs.add(this);
    }

    public Date getContractStart() {
        return contractStart;
    }

    public void setContractStart(Date contractStart) {
        this.contractStart = contractStart;
    }

    public Date getContractEnd() {
        return contractEnd;
    }

    public void setContractEnd(Date contractEnd) {
        this.contractEnd = contractEnd;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public int getNoOfObs() {
        return NoOfObs;
    }

    public void setNoOfObs(int NoOfObs) {
        this.NoOfObs = NoOfObs;
    }
    
    public static Comparator<ProfessionalOb> proObserverNameCompare = new Comparator<ProfessionalOb>() {
    
    @Override
    public int compare(ProfessionalOb o1, ProfessionalOb o2) {
        
        String Observername1 = o1.getName().toUpperCase();
        String Observername2 = o2.getName().toUpperCase();
        
        return Observername1.compareTo(Observername2);
    }};
    
    
}
