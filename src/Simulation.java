
public class Simulation {
    public static void main(String[] args) {
        double averageWaitingTime = 0;
        int n = 1;
        while (n <= 100000){
            averageWaitingTime += simulation(10000);
            n+=1;
        }
        System.out.println(averageWaitingTime / n);


    }
    public static double simulation(double time){
        Computer computer1 = new Computer();
        Computer computer2 = new Computer();
        double waitingTime = 0;
        int numTasks = 0;
        double lastArrivalTime = 0;
        while (lastArrivalTime < time){
            Task task = new Task();
            numTasks+=1;
            lastArrivalTime += task.getInterarrivalTime();
            Computer freeComputer = freeComputer(computer1, computer2);
            double serviceStartTime = Math.max(lastArrivalTime,freeComputer.getFinishTime());
            freeComputer.setFinishTime(freeComputer.getFinishTime() + task.getServiceTime());
            waitingTime+= serviceStartTime - lastArrivalTime;
        }
        return waitingTime / numTasks;
    }
    public static Computer freeComputer(Computer c1, Computer c2){
        if (c1.getFinishTime() >= c1.getFinishTime()){
            return c1;
        }
        else {
            return c2;
        }
    }
}
