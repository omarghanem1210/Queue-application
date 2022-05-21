import java.util.Random;

public class Task {
    private double ServiceTime;
    private double InterarrivalTime;

    public Task() {
        this.ServiceTime = randomExponentialNumber(25);
        this.InterarrivalTime = randomExponentialNumber(20);
    }

    public Task(double ServiceTime, double InterarrivalTime) {
        this.ServiceTime = ServiceTime;
        this.InterarrivalTime = InterarrivalTime;
    }

    public double getServiceTime() {
        return ServiceTime;
    }

    public double getInterarrivalTime() {
        return InterarrivalTime;
    }

    public double randomExponentialNumber(double mean){
        Random rand = new Random();
        double lambda = 1 / mean;
        return (-1/lambda) * Math.log(1-rand.nextDouble());
    }
}
