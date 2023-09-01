package mytimeapp;

public class MyTimeApp {

    public static void main(String[] args) {
        MyTime time = new MyTime(11, 30, 4, true);
        
        System.out.println("Time Given:");
        time.displayTime12();
        
        System.out.println("\nFast forward 1 second:");
        time.tickBySecond();
        time.displayTime12();
        
        System.out.println("\nFast forward 1 minute:");
        time.tickByMinute();
        time.displayTime12();
        
        System.out.println("\nFast forward 1 hour:");
        time.tickByHour();
        time.displayTime12();
        
        System.out.println("\nFast forward 77531 seconds:");
        time.advanceTime(77531);
        time.displayTime12();
      
    }
}