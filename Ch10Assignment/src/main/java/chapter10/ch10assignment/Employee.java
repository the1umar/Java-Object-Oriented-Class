package chapter10.ch10assignment;

/**
 *
 * @author Elite
 */
public class Employee extends Person {
    private String employeeID;
    
    public Employee(){
        super();
        employeeID = null;
    }
    
    public Employee(String n, String num, String em, String empID){
        super(n, num, em);
        employeeID = empID;
    }
    
    public void setEmpID(String empID) {
        employeeID = empID;
    }
    
    public String getEmpID() {
        return employeeID;
    }
    
    @Override
    public String toString() { //toString to print allthe stuff
        return super.toString() + "\nEmployee ID: " + this.employeeID;
    }
}
