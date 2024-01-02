public class Worker {
    private String name;
    private double salary;
    private boolean isOnVacation;

    public Worker(String name, double salary, boolean isOnVacation) {
        this.name = name;
        this.salary = salary;
        this.isOnVacation = isOnVacation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isOnVacation() {
        return isOnVacation;
    }

    public void setOnVacation(boolean onVacation) {
        isOnVacation = onVacation;
    }
    public double calculateMonthSalary(){
        return salary;
    }

    @Override
    public String toString() {
        return "Salary for " + name + " this month: " + calculateMonthSalary();
    }
}
