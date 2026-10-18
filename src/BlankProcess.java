public class BlankProcess {
    String id;          // The processes identification
    int arrivalTime;    // Time when the process is added to the queue
    int serviceTime;      // Time required for execution

    public String getId() {
        return id;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    private void setArrivalTime(int arrival_time) {
        this.arrivalTime = arrival_time;
    }

    public int getServiceTime() {
        return serviceTime;
    }

    private void setServiceTime(int service_time) {
        this.serviceTime = service_time;
    }

    // Constructor
    public BlankProcess() {
    }

    // Constructor
    public BlankProcess(String id, int arrivalTime, int serviceTime) {
        this.id = id;
        this.arrivalTime = arrivalTime;
        this.serviceTime = serviceTime;
    }

    // Copy Constructor
    public BlankProcess(BlankProcess other) {
        this.id = other.id;
        this.arrivalTime = other.arrivalTime;
        this.serviceTime = other.serviceTime;
    }

}
