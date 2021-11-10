package labsheet8.exercise1;

public class Bicycle extends Vehicle{
    private int gear;
    private boolean hasBell;

    public Bicycle(double price,double length, double height,double weight,String manufacturer, String model,int gear, boolean hasBell) {
        super(price,length,height,weight,manufacturer,model);
        setGear(gear);
        setHasBell(hasBell);
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public boolean isHasBell() {
        return hasBell;
    }

    public void setHasBell(boolean hasBell) {
        this.hasBell = hasBell;
    }

    @Override
    public String toString() {
        return  super.toString()+"\n"+"Gear Count: " + gear +"\n"+
                "HasBell: " + hasBell ;
    }
}
