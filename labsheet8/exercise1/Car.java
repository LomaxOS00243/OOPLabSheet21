package labsheet8.exercise1;

import javax.swing.*;

public class Car extends Vehicle{
    private int maxPassengers;
    private String registrationNumber;


    public Car(double price,double length, double height,double weight,String manufacturer, String model, int maxPassengers, String registrationNumber) {
        super(price,length,height,weight,manufacturer,model);
        setMaxPassengers(maxPassengers);
        setRegistrationNumber(registrationNumber);
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if(isValidRegistrationNumber(registrationNumber))
            this.registrationNumber = registrationNumber;
        else
            this.registrationNumber="Invalid Registration Number";
    }

    private boolean isValidRegistrationNumber(String validReg){

            if(validReg.length()>=6 && validReg.length()<=12) {

                int firstTwo = Integer.parseInt(validReg.substring(0,2));

                if (Character.isDigit(firstTwo)) {
                    //String third = validReg.substring(3,4);
                    if (validReg.charAt(2) == '-') {
                        String upperCaseLetter = validReg.substring(3, 5);
                        if (Character.isUpperCase(upperCaseLetter.length())) {

                                if (upperCaseLetter.length() == 1 ) {
                                    if(validReg.charAt(4) == '-') {
                                        for (int i = 5; i < validReg.length(); i++) {
                                            if (Character.isDigit(validReg.charAt(i)))
                                                return true;

                                        }
                                    }

                                } else if (upperCaseLetter.length() == 2) {
                                    if( validReg.charAt(5) == '-') {
                                        for (int i = 6; i < validReg.length(); i++) {
                                            if (Character.isDigit(validReg.charAt(i)))
                                                return true;

                                        }
                                    }
                                }
                                else
                                    return false;

                        }
                        else
                            return false;
                    }
                    else
                        return false;
                }
                else
                    return false;
            }
            return false;


    }

    @Override
    public String toString() {
        return super.toString()+"\n"+"MaxPassengers: " + maxPassengers +"\n"+
                "RegistrationNumber: " + registrationNumber;
    }
}
