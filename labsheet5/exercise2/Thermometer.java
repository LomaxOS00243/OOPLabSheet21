package labsheet5.exercise2;

public class Thermometer {
    private int currentTemp;
    private int maxTemp;
    private int minTemp;
    public Thermometer(){
        setCurrentTemp(0);
        setMaxTemp(Integer.MIN_VALUE);
        setMinTemp(Integer.MAX_VALUE);

    }
    public Thermometer(int currentTemp){
        setCurrentTemp(currentTemp);

    }

    public int getCurrentTemp() {
        return currentTemp;
    }

    public void setCurrentTemp(int currentTemp) {
        this.currentTemp = currentTemp;
    }

    public int getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(int maxTemp) {
        this.maxTemp = maxTemp;
    }

    public int getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(int minTemp) {
        this.minTemp = minTemp;
    }
    public void setTemperature(Thermometer currentTemp){
        setCurrentTemp(currentTemp.getCurrentTemp());

        updateMaxMinTemp();

    }
    private void updateMaxMinTemp(){
        if(currentTemp>maxTemp)

            setMaxTemp(getCurrentTemp());

        if(currentTemp<minTemp)
            setMinTemp(getCurrentTemp());
    }

    @Override
    public String toString() {
        return "Current Temperature: " + currentTemp +"\n"+
                "Max Temperature: " + maxTemp +"\n"+
                "MinTemp:" + minTemp;
    }
}
