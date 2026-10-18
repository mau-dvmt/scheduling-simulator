public class Process extends BlankProcess {
    int startTime;          // Time at which process has started being in execution
    int waitingTime;        // Time process has been in queue without execution
    int timeInService;      // Time process has already been executed
    int completionTime;     // Time at which process is completed

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getWaitingTime() {
        return waitingTime;
    }

    private void setWaitingTime(int waitingTime) {
        this.waitingTime = waitingTime;
    }

    public int getTimeInService() {
        return timeInService;
    }

    private void setTimeInService(int timeInService) {
        this.timeInService = timeInService;
    }

    public int getCompletionTime() {
        return completionTime;
    }

    public void setCompletionTime(int completionTime) {
        this.completionTime = completionTime;
    }

    // Constructor
    public Process() {
    }

    // Constructor
    public Process(String id, int arrivalTime, int serviceTime) {
        super(id, arrivalTime, serviceTime);
        this.waitingTime = 0;
        this.timeInService = 0;
        this.completionTime = -1;
    }

    // Copy Constructor
    public Process(Process other) {
        super(other.id, other.arrivalTime, other.serviceTime);
        this.waitingTime = 0;
        this.timeInService = 0;
        this.completionTime = -1;
    }

    public void execute() {
        this.setTimeInService(this.getTimeInService() + 1);
        return;
    }

    public void waiting() {
        this.setWaitingTime(this.getWaitingTime() + 1);
        return;
    }

    public void finish(int completionTime) {
        this.setCompletionTime(completionTime);
        System.out.println("Process " + this.id + " (" + this.arrivalTime + ", " + this.serviceTime + ")" +
                " finished at time " + this.completionTime);
        return;
    }

}
