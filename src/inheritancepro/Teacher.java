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
public class Teacher extends Employee {
    private String courseTeaches;
    private String qualification;
    
    public Teacher(String c,String q,String eid, String d, String ea, String en, double s) {
        super(eid, d, ea, en, s);
        this.qualification=q;
        this.courseTeaches=c;
    }

    public String getCourseTeaches() {
        return courseTeaches;
    }

    public void setCourseTeaches(String courseTeaches) {
        this.courseTeaches = courseTeaches;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
    
    public double getBonous(){
        return this.bonous;
    }
    public void setBonous(double b){
        this.bonous=b;
    }
}
