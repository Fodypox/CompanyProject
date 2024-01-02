public class FreelanceDeveloper extends Developer{
    private int workedHours;

    public FreelanceDeveloper(String name, double salary, boolean isOnVacation, Level level, int workedHours) {
        super(name, salary, isOnVacation, level);
        this.workedHours = workedHours;
    }

    public int getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(int workedHours) {
        this.workedHours = workedHours;
    }

    @Override
    public double calculateMonthSalary() {
        double baseSalary = super.calculateMonthSalary();
        if (workedHours > 200){
            baseSalary += 1000;
        }
        return baseSalary;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
