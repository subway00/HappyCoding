import java.util.Date;
public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private float salary;
    
    public Employee( int id, String firstName, String lastName, Date birDate, float salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birDate;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public float getSalary() {
        return salary;
    }
    @Override
    public String toString() {
        return "Employee {" + "id=" + id + ",firstName=" + firstName + ",lastName=" 
                + lastName + ",birthDate=" + birthDate + ",salary=" + salary +'}';
    }
}
