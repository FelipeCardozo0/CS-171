/*
THIS CODE WAS MY OWN WORK, IT WAS WRITTEN WITHOUT CONSULTING
CODE WRITTEN BY OTHER STUDENTS OR COPIED FROM ONLINE RESOURCES. Philip Cardozo
*/

public class FitnessTracker {
    private int totalSteps;
    private double totalDistance;
    private double caloriesBurned;

    public FitnessTracker(){
        totalSteps=0;
        totalDistance=0;
        caloriesBurned=0;

    }
    public static void main(String[] args) {

    }

    public void addSteps(int steps){//why static causes error
        //adds steps to totalSteps, calculates the corresponding distance (assume 2,000 steps = 1 mile) and updates
        // totalDistance, and calculates the calories burned (assume 1 mile burns 100 calories) and updates caloriesBurned
        totalSteps++;
        //(assume 2,000 steps = 1 mile)
    }

    public double getTotalSteps(){
        return (double) totalSteps /2000;

    }

    public double getTotalDistance(){//miles
        return (double) totalSteps /2000;

    }

    public double getCaloriesBurned(){
        //assume 1 mile burns 100 calories)
        return (double)totalSteps/10;//1000*100

    }

    public  void resetTracker(){//no return
        totalSteps=0;
        totalDistance=0;
        caloriesBurned=0;
    }

    public String getProgress(double goalDistance){
        return "You have completed "+goalDistance/totalDistance*100+"% of your goal!";

    }
}
