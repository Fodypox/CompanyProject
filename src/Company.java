import java.util.ArrayList;
import java.util.Scanner;

public class Company {
    private String name;
    private ArrayList<Worker> workers;

    public Company(String name) {
        this.name = name;
        this.workers = new ArrayList<>();
    }

    public void addWorker(Worker worker){
        workers.add(worker);
    }

    public void showAllWorkers(){
        for (Worker worker:workers) {
            System.out.println(worker.toString());
        }
    }

    public void showWorkersByPosition(){
        System.out.println("Aavailable positions: QAEngineer, Developer, FreelanceDeveloper, ProjectManager");
//        Asking user to choose a position
        Scanner scanner = new Scanner(System.in);
        String position = scanner.nextLine();

        System.out.println("Workers in position "+ position+":");
        for (Worker worker:workers) {
            if (getPosition(worker).equals(position)){
                System.out.println(worker.toString());
            }


        }
    }
    private String getPosition(Worker worker){
        if (worker instanceof QAEngineer){
            return "QAEngineer";
        }else if(worker instanceof Developer){
            return "Developer";
        }else if (worker instanceof FreelanceDeveloper){
            return "FreelanceDeveloper";
        }else if (worker instanceof ProjectManager){
            return "ProjectManager";
        }else {
            return "";
        }
    }

    public void removeWorker(){
        for (int i = 0; i < workers.size(); i++) {
            System.out.println((i+1)+". "+workers.get(i).toString());
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select the worker by index");
        int selectedWorker = scanner.nextInt();
        if (selectedWorker>=1 && selectedWorker<=workers.size()){
            workers.remove(selectedWorker-1);
        }else {
            System.out.println("invalid index");
        }
    }
    public double totalSalaryToPayThisMonth(){
        double totalSalary = 0;
        for (Worker worker:workers) {
            if (!worker.isOnVacation()){
                totalSalary+=worker.calculateMonthSalary();
            }
        }
        return totalSalary;
    }
}
