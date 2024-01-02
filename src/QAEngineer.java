public class QAEngineer extends Worker{
    private int projectAmount;

    public QAEngineer(String name, double salary, boolean isOnVacation, int projectAmount) {
        super(name, salary, isOnVacation);
        this.projectAmount = projectAmount;
    }

    public int getProjectAmount() {
        return projectAmount;
    }

    public void setProjectAmount(int projectAmount) {
        this.projectAmount = projectAmount;
    }

    @Override
    public double calculateMonthSalary() {
        return super.getSalary() + (projectAmount>1 ? (projectAmount-1)*200 : 0);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
