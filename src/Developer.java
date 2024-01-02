public class Developer extends Worker{
    private Level level;

    public Developer(String name, double salary, boolean isOnVacation, Level level) {
        super(name, salary, isOnVacation);
        this.level = level;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    @Override
    public double calculateMonthSalary() {
        switch (level){
            case JUNIOR:
                return super.getSalary();
            case MIDDLE:
                return super.getSalary() + (super.getSalary()*0.10);
            case SENIOR:
                return super.getSalary() + (super.getSalary()*0.20);
            default:
                return super.getSalary();
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
