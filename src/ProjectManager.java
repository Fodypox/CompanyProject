public class ProjectManager extends Worker{
    private int yearsOfExperience;

    public ProjectManager(String name, double salary, boolean isOnVacation, int yearsOfExperience) {
        super(name, salary, isOnVacation);
        this.yearsOfExperience = yearsOfExperience;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public double calculateMonthSalary() {
        return super.getSalary() + (yearsOfExperience * 100);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
