/*
THIS CODE WAS MY OWN WORK, IT WAS WRITTEN WITHOUT CONSULTING
CODE WRITTEN BY OTHER STUDENTS OR COPIED FROM ONLINE RESOURCES. _Your_Name_Here_
*/

public class FitnessTracker {
    private int totalSteps;
    private double totalDistance;
    private double caloriesBurned;

    public FitnessTracker() {
        this.totalSteps = 0;
        this.totalDistance = 0.0;
        this.caloriesBurned = 0.0;
    }

    public FitnessTracker(int totalSteps, double totalDistance, double caloriesBurned) {
        this.totalSteps = totalSteps;
        this.totalDistance = totalDistance;
        this.caloriesBurned = caloriesBurned;
    }

    public void addSteps(int steps) {
        totalSteps += steps;
        double newDistance = steps / 2000.0;
        totalDistance += newDistance;
        caloriesBurned += newDistance * 100;
    }

    public int getTotalSteps() {
        return totalSteps;
    }

    public double getTotalDistance() {
        return totalDistance;
    }

    public double getCaloriesBurned() {
        return caloriesBurned;
    }

    public void resetTracker() {
        totalSteps = 0;
        totalDistance = 0.0;
        caloriesBurned = 0.0;
    }

    public String getProgress(double goalDistance) {
        double percentage = (totalDistance / goalDistance) * 100;
        return String.format("You have completed %.1f%% of your goal.", percentage);
    }
}
