import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class SchedulingSchemes {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

    public SchedulingSchemes(String name) {
        this.name = name;
    }

    /** To do:
     * Modify the following functions to implement the scheduling schemes.
     * Each function should return the process that is to be executed next according to the scheme.
     */

    // First-Come-First-Served
    public static Process fcfs(LinkedList<Process> queue) {
        Process pNext = new Process();

        // add your code here

        return pNext;
    }

    // Shortest Process Next
    public static Process spn(LinkedList<Process> queue) {
        Process pNext = new Process();

        // add your code here

        return pNext;
    }

    // Shortest Remaining Time
    public static Process srt(LinkedList<Process> queue) {
        Process pNext = new Process();

        // add your code here

        return pNext;
    }

    // Highest Response Ratio Next
    public static Process hrrn(LinkedList<Process> queue) {
        Process pNext = new Process();

        // add your code here

        return pNext;
    }

    // Round Robin
    public static Process rr(LinkedList<Process> queue) {
        Process pNext = new Process();

        // add your code here

        return pNext;
    }
}
