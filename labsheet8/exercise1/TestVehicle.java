package labsheet8.exercise1;

import javax.swing.*;

public class TestVehicle {
    public static void main(String[] args) {
        String output=" ";



        Car car = new Car(10000.0,4.5,1.25,20000.0,"Ferrari","F2",2,"23-KL-23333");

        output+="Testing the Car Constructor\n\n"+car;

        Bicycle bike = new Bicycle(500.0,1.5,1.0,50.0,"Releigh","Mountainbike",4,true);

        output+="\n\n\n Testing The Bicycle Constructor\n\n\n"+bike;

        JOptionPane.showMessageDialog(null,output);
    }
}
