package module3.offline2.Task3;

public class Main {


    public static void main(String[] args) {
        Worker worker1 = new Worker("Tom", "Jons", 25, false, "Royal street", 500);
        Worker worker2 = new Worker("Tom", "Jons", 25, false, "Royal street", 500);
        Worker worker3 = new Worker("Tom", "Jons", 25, false, "Royal street", 500);
        Worker worker4 = new Worker("Tom", "Jons", 25, false, "Royal street", 500);
        Worker worker5 = new Worker("Tom", "Jons", 25, false, "Royal street", 500);
        Worker worker6 = new Worker("Tom", "Jons", 25, false, "Royal street", 500);
        Worker worker7 = new Worker("Tom", "Jons", 25, false, "Royal street", 500);
        Worker worker8 = new Worker("Tom", "Jons", 25, false, "Royal street", 500);
        Worker worker9 = new Worker("Tom", "Jons", 25, false, "Royal street", 500);
        Worker worker10 = new Worker("Tom", "Jons", 25, false, "Royal street", 500);

        Worker workers[] = new Worker[10];
        workers[0] = worker1;
        workers[1] = worker2;
        workers[2] = worker3;
        workers[3] = worker4;
        workers[4] = worker5;
        workers[5] = worker6;
        workers[6] = worker7;
        workers[7] = worker8;
        workers[8] = worker9;
        workers[9] = worker10;

        int workersFromList = 0;

        Worker[] workersList = new Worker[10];
        for (int i = 0; i < workersList.length; i++) {
            workersFromList += workersList[i].getSalary();
        }

        System.out.println(workersFromList);









    }

}
