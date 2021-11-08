package labsheet5.exercise3;

public class BankAccount {
    private String owner;
    private int number;
    private static double interestRate;
    private static int count=1;

    public BankAccount(){
        owner="Owner not Available";
        number=1;
        interestRate=0;

    }
    public BankAccount(String owner,  double interestRate){
        setOwner(owner);
        setInterestRate(interestRate);
        incrementNumber();
        setNumber(count);

    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public  int getNumber() {
        return number;
    }

    public  void setNumber(int number) {
        this.number = number;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }

    public static void setCount(int count){
        BankAccount.count=count;
    }
    public static int getCount(){
        return count;
    }

    public static void incrementNumber(){
        count++;
    }

    @Override
    public String toString() {
        return  "Owner: " + owner +"   " +
                "Account Number:" + number+"   "+
                "Interest Rate: "+interestRate;
    }
}

