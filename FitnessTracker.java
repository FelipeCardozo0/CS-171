
/*
THIS CODE WAS MY OWN WORK, IT WAS WRITTEN WITHOUT CONSULTING
CODE WRITTEN BY OTHER STUDENTS OR COPIED FROM ONLINE RESOURCES. Philip Cardozo
*/

// Comments added while building the code as asked in the pdf and also to help me remember to ask questions to ta's

public class FitnessTracker {
    private int totalSteps;
    private double totalDistance;
    private double caloriesBurned;

    public FitnessTracker(){//default
        totalSteps=0;
        totalDistance=0.0;//double
        caloriesBurned=0.0;

    }

    public     FitnessTracker(int totalSteps, double totalDistance,double caloriesBurned){
        this.totalSteps=totalSteps;//assign parameter to a instance variable, it gets updated to totalSteps
        this.totalDistance=totalDistance;
        this.caloriesBurned=caloriesBurned;

    }

    public void addSteps(int steps){//why static causes error
        //adds steps to totalSteps, calculates the corresponding distance (assume 2,000 steps = 1 mile) and updates
        // totalDistance, and calculates the calories burned (assume 1 mile burns 100 calories) and updates caloriesBurned
        totalSteps+=steps;
        totalDistance+= (double)steps/2000; //cant use totalSteps because then it calculates total distance based on steps every time
        caloriesBurned+= (double) steps /2000*100;

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
