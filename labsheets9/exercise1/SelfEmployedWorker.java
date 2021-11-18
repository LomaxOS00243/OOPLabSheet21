package labsheets9.exercise1;

public class SelfEmployedWorker extends Employee{

    private double estimatedIncome;

    public SelfEmployedWorker(String firstName, String lastName) {
        super(firstName, lastName);

    }

    public void setEstimatedIncome() {
        this.estimatedIncome = (int)(Math.random()*900)+400;
    }

    @Override
    public double earnings() {
        setEstimatedIncome();
        return estimatedIncome;
    }

    @Override
    public String toString() {
        return "self-employee worker's name is: "+super.toString();
    }
}
