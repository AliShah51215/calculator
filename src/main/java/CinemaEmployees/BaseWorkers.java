package CinemaEmployees;

import java.util.Calendar;

public abstract class BaseWorkers {
    private String name;
    private String surname;
    private int employmentTime;
    private double salary;
    protected final static double FixSalary;

    static {
        FixSalary = 3000.0;
    }

    public BaseWorkers(String name, String surname, int employmentTime) {
        this(name, surname, employmentTime, FixSalary);
    }


    public BaseWorkers(String name, String surname, int employmentTime, double salary) {
        this.name = name;
        this.surname = surname;
        this.employmentTime = employmentTime;
        this.salary = salary;
    }

    public double getBasicSalary() {
        return salary;
    }

    public int getEmploymentTime() {
        return Calendar.getInstance().get(Calendar.YEAR) - employmentTime;


    }


}



