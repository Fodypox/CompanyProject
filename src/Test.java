public class Test {
    public static void main(String[] args) {

        Developer d1 = new Developer("Dilber", 4000, true, Level.MIDDLE);
        FreelanceDeveloper fd1 = new FreelanceDeveloper("Deniz", 4000, false, Level.MIDDLE, 210);
        QAEngineer qe1 = new QAEngineer("Liliia", 5000, false, 3);
        ProjectManager pm1 = new ProjectManager("Mert", 6000, false, 5);
        Developer d2 = new Developer("Saraa", 6000, false, Level.SENIOR);
        QAEngineer qe2 = new QAEngineer("Haydar", 4500, true, 3);

        Company company = new Company("Google");
        company.addWorker(d1);
        company.addWorker(fd1);
        company.addWorker(qe1);
        company.addWorker(pm1);
        company.addWorker(d2);
        company.addWorker(qe2);

        System.out.println("------------- showing all worker information -------------");
        company.showAllWorkers();

        System.out.println("total money amount to pay for all workers: " + company.totalSalaryToPayThisMonth());

        System.out.println("------------- showing workers by position -------------");
        company.showWorkersByPosition();

        System.out.println("------------- removing one worker -------------");
        company.removeWorker();

        System.out.println("------------- showing all workers after removing one -------------");
        company.showAllWorkers();

    }
}
