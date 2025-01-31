
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
        totalDistance=0.0;//Can it be 0?
        caloriesBurned=0.0;

    }

    public     FitnessTracker(int totalSteps, double totalDistance,double caloriesBurned){
        this.totalSteps=totalSteps;
        this.totalDistance=totalDistance;
        this.caloriesBurned=caloriesBurned;

    }

    public void addSteps(int steps){//why static causes error
        //adds steps to totalSteps, calculates the corresponding distance (assume 2,000 steps = 1 mile) and updates
        // totalDistance, and calculates the calories burned (assume 1 mile burns 100 calories) and updates caloriesBurned
        totalSteps+=steps;
        totalDistance+= (double) steps /2000; //cant recalculate total distance based on  steps every time
        caloriesBurned+= (double) steps /20;

    }

    public int getTotalSteps(){
        return totalSteps;

    }

    public double getTotalDistance(){//miles
        return totalDistance;

    }

    public double getCaloriesBurned(){
        return caloriesBurned;

    }

    public  void resetTracker(){//no return
        totalSteps=0;
        totalDistance=0.0;
        caloriesBurned=0.0;
    }

    public String getProgress(double goalDistance){
        ////concatenation-System.out.print("You have completed "+totalDistance/goalDistance*100+"% of your goal!");
        return "You have completed "+totalDistance/goalDistance*100+"% of your goal!";

    }
}
