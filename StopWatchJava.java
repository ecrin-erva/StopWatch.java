
package stopwatch.java;
import java.util.Random;
public class StopWatchJava {
private long startTime;
private long endTime;

public StopWatchJava() {
    startTime = System.currentTimeMillis();
}

public long getStartTime() {
    return startTime;
}

public long getEndTime() {
    return endTime;
}

public void start() {
    startTime = System.currentTimeMillis();
}

public void stop() {
    endTime = System.currentTimeMillis();
}

public long getElapsedTime() {
    return endTime - startTime;
}
    public static void main(String[] args) {
        int[] numbers = new int[100000];
    Random random = new Random();

    for (int i = 0; i < numbers.length; i++) {
        numbers[i] = random.nextInt(100000);
    }

    StopWatchJava stopwatch = new StopWatchJava();

    stopwatch.start();

    for (int i = 0; i < numbers.length - 1; i++) {
        int minIndex = i;

        for (int j = i + 1; j < numbers.length; j++) {
            if (numbers[j] < numbers[minIndex]) {
                minIndex = j;
            }
        }

        int temp = numbers[i];
        numbers[i] = numbers[minIndex];
        numbers[minIndex] = temp;
    }

    stopwatch.stop();

    System.out.println("Sorting time: "
            + stopwatch.getElapsedTime() + " milliseconds");
}

}
    
    

