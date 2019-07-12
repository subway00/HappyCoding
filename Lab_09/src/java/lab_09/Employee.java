package lab_09;

import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable{
    private int id;
    private String firstName;
    private String LastName;
    private Date birthday;
    private float salary;
    
    public Employee(){
        
    }
    public Employee(int id, String firstName, String LastName, Date birthday, float salary) {
        this.id = id;
        this.firstName = firstName;
        this.LastName = LastName;
        this.birthday = birthday;
        this.salary = salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public float getSalary() {
        return salary;
    }
    //
    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + LastName + ", birthDate=" + birthday + 
                ", salary=" + salary + "}";
    }
}
