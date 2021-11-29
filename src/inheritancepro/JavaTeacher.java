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
public class JavaTeacher extends Teacher{
    private String timing;
    private String syllabus;
    public JavaTeacher(String t,String sy,String c,String q, String eid, String d, String ea, String en, double s) {
        super(c, q, eid, d, ea, en, s);
        this.timing=t;
        this.syllabus=sy;
    }

    public String getTiming() {
        return timing;
    }

    public void setTiming(String timing) {
        this.timing = timing;
    }

    public String getSyllabus() {
        return syllabus;
    }

    public void setSyllabus(String syllabus) {
        this.syllabus = syllabus;
    }
    
}
