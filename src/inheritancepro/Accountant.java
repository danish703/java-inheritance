/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancepro;

/**
 *
 * @author Dipendra
 */
public class Accountant extends Employee {
    private String timing;
    private String qualification;

    public String getTiming() {
        return timing;
    }

    public void setTiming(String timing) {
        this.timing = timing;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
    public Accountant(String q,String t,String eid, String d, String ea, String en, double s) {
        super(eid, d, ea, en, s);
        this.qualification=q;
        this.timing=t;
    }
    
}
