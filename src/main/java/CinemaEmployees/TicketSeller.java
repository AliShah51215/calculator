package CinemaEmployees;

   class TicketSeller extends BaseWorkers {

    public TicketSeller(String name, String surname, int employmentTime) {
        super(name, surname, employmentTime);
    }

    public TicketSeller(String name, String surname, int employmentTime, double salary) {
        super(name, surname, employmentTime, salary);
    }

    public double calculateMonthlySalary() {
        return super.getBasicSalary();
    }
}
