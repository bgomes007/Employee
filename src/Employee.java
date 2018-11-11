
public class Employee {
    private String name;
    private double salary;
    private int age;
    private String designation;

    public void setname(String name) {
        this.name = name;
    }

    public void setsalary(double salary) {
        this.salary = salary;
    }

    public void setage(int age) {
        this.age = age;
    }

    public void setdesignation(String designation) {
        this.designation = designation;
    }

    public String getname() {
        return name;
    }

    public double getsalary() {
        return salary;
    }

    public int getage() {
        return age;
    }

    public String getdesignation() {
        return designation;
    }

    public int paybonus(double salary) {
        if (salary < 5000) {
            return 100;
        }
        return 0;
    }

   

    }

