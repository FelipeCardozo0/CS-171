/*
THIS CODE WAS MY OWN WORK, IT WAS WRITTEN WITHOUT CONSULTING
CODE WRITTEN BY OTHER STUDENTS OR COPIED FROM ONLINE RESOURCES. _Your_Name_Here_
*/

public class FitnessTester {
    public static void main(String[] args) {
        FitnessTracker tracker = new FitnessTracker();

        tracker.addSteps(5000);
        System.out.println("Steps: " + tracker.getTotalSteps());
        System.out.println("Distance: " + tracker.getTotalDistance() + " miles");
        System.out.println("Calories Burned: " + tracker.getCaloriesBurned());

        tracker.addSteps(3000);
        System.out.println("Updated Steps: " + tracker.getTotalSteps());
        System.out.println("Updated Distance: " + tracker.getTotalDistance() + " miles");
        System.out.println("Updated Calories Burned: " + tracker.getCaloriesBurned());

        tracker.resetTracker();
        System.out.println("After Reset - Steps: " + tracker.getTotalSteps());
        System.out.println("After Reset - Distance: " + tracker.getTotalDistance() + " miles");
        System.out.println("After Reset - Calories Burned: " + tracker.getCaloriesBurned());
    }
}
