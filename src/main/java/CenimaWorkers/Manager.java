package CenimaWorkers;

class Manager extends BaseWorkers {

    private double bonus;
    private final static double FixSalary  = 5000.0;
    private final static double FixBonus = 500.0;

    public Manager(String name, String surname, int employmentTime) {
        this(name, surname, employmentTime, FixSalary ,  FixBonus);
    }

    public Manager (String name, String surname, int employmentTime, double salary) {
        this(name, surname, employmentTime, salary,  FixBonus);
    }

    public Manager (String name, String surname, double bonus, int employmentTime) {
        this(name, surname, employmentTime, bonus , FixSalary);
    }

    public Manager(String name, String surname, int employmentTime, double salary, double bonus) {
        super(name, surname, employmentTime, salary);
        this.bonus = bonus;
    }

    public double calculateMonthlySalary() {
        return super.getBasicSalary() + this.bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;


    }


}