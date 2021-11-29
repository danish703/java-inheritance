
package inheritancepro;
public class Employee {
    private String empId;
    protected double bonous=20000;
    public String designation;
    public String empAddress;
    private String empName;
    private double salary;
    
    public Employee(String eid,String d,String ea,String en,double s){
        this.empId=eid;
        this.designation=d;
        this.empAddress=ea;
        this.empName = en;
        this.salary = s;
        System.out.println("Employee is created...");
    }

   public double getSalary(){
       return this.salary;
   }
   
   public void setSalary(double s){
       this.salary = s;
   }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    } 
  
}
