
/*
THIS CODE WAS MY OWN WORK, IT WAS WRITTEN WITHOUT CONSULTING
CODE WRITTEN BY OTHER STUDENTS OR COPIED FROM ONLINE RESOURCES. Philip Cardozo
*/


public class FitnessTester {


public static void main(String[] args) {
    FitnessTracker tracker = new FitnessTracker();

    tracker.addSteps(5000);//whats d diff FitnessTracker.addSteps(5000);
    System.out.println(tracker.getTotalDistance());
    System.out.println(tracker.getTotalSteps());
    System.out.println(tracker.getCaloriesBurned());
    tracker.addSteps(3000);
    System.out.println(tracker.getTotalDistance());
    System.out.println(tracker.getTotalSteps());
    System.out.println(tracker.getCaloriesBurned());

    tracker.resetTracker();
    System.out.println(tracker.getTotalDistance());
    System.out.println(tracker.getCaloriesBurned());
    System.out.println(tracker.getTotalSteps());

    System.out.println(tracker.getProgress(1));
    System.out.println(tracker.getProgress(10));

    tracker.addSteps(7000);
    System.out.println(tracker.getProgress(1));
    System.out.println(tracker.getProgress(10));
}

}
