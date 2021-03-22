package sdanilov.OOPFirst;

/**
 * Class: Employee
 * 
 * Author: Danilov Sergey
 * 
 * Date: 3/19/2021
 */

public class Employee {
    int id;
    String firstName;
    String lastName;
    int salary;

    public Employee(int id, String firstName, String lastName, int salary){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary=  salary;
    }

    public int getID(){
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName(){
        return firstName +  " " + lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary > 0){
            this.salary = salary;
        }
    }

    public int getAnnualSalary(){
        return salary*12;
    }

    public int raiseSalary(int percent){
        if (percent >= 0 && percent <= 100){
            float raise = (salary / 100.0f) * percent;
            this.salary = this.salary +  (int)raise;
        }
        return this.salary;
    }

    @Override
    public String toString() {
        return String.format("Employee[id=%d,name=%s,salary=%d]", id, getName(), salary);
    }
    
}
