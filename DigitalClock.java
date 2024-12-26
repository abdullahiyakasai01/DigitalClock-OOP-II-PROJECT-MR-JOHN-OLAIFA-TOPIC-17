
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;

// Main class to handle the digital clock 
public class DigitalClock {

    // Formatter to display time in HH:mm:ss format SPECIFICALLY
    private final DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    public void startClock() {
        Timer timer = new Timer(); // CREATING NEW Timer named timer 

        // Schedule the timer to update every second
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                clearConsole();
                displayTime();
            }
        }, 0, 1000); // Initial delay 0ms, period 1000ms (1 second)
    }

    private void displayTime() {
        // Get the current time
        LocalTime currentTime = LocalTime.now();
        // Format and display the current time
        System.out.println("\n=========================");
        System.out.println(" DIGITAL CLOCK FOR OOPII PROJECT ");
        System.out.println("=========================");
        System.out.println("     " + currentTime.format(timeFormatter));
        System.out.println("=========================");

        System.out.println("AS WE CAN SEE, THE TIME IS FUNCTIONING IN  REAL-TIME AND VERY MUCH UPDATING ITSELF WITHOUT ANY ERRORS");
    }

    private void clearConsole() {
        // Clear console for a smooth real-time clock display
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

// THE MAIN METHOD
    public static void main(String[] args) {
        DigitalClock clock = new DigitalClock(); // CREATING A NEW CLOCK NAMED clock
        clock.startClock();
    }
}
