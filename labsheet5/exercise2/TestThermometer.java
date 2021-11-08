package labsheet5.exercise2;

import javax.swing.*;

public class TestThermometer {
    public static void main(String[] args) {

        String output=" ";
        int temperature;

        Thermometer temp = new Thermometer();

        Thermometer temp1 = new Thermometer(35);

        output+="Calling the single-argument constructor....setting the temperature of first thermometer to "+ temp1.getCurrentTemp()+"\n"+
                "First Thermometer:\n"+temp1.toString();


        output+="\n\nCalling the no-argument constructor....setting the temperature of second thermometer to "+ temp.getCurrentTemp()+"\n"+
                "First Thermometer:\n"+temp.toString();

        Thermometer temp3 = new Thermometer(25);

        temp.setTemperature(temp3);

        output+="\n\nCalling setTemperature....setting the temperature of second thermometer to "+temp.getCurrentTemp()+"\n"+
                "First Thermometer:\n"+temp.toString();

        JOptionPane.showMessageDialog(null, "****Thermometer Testing****\n\n"+output);

        temperature=Integer.parseInt(JOptionPane.showInputDialog("Please enter the current temperature of the first thermometer:"));

        Thermometer temp4 = new Thermometer(temperature);

        temp1.setTemperature(temp4);

        JOptionPane.showMessageDialog(null, "Calling setTemperature()....setting the temperature of second thermometer to "+ temp1.getCurrentTemp() +"\n"+ "First Thermometer:\n"+temp1.toString());



    }
}

