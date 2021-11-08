package labsheet6.exercise1;

import javax.swing.*;

public class TestPerson {
    public static void main(String[] args) {

        String output=" ";
        String firstName, lastName;

        Person person1 = new Person();

        output+="Calling the Person() constructor....\n"+"Value of first person object is: \n"+person1.toString();

        firstName= JOptionPane.showInputDialog("Please enter the first name of the second person");
        lastName= JOptionPane.showInputDialog("Please enter the last name of the second person");

        Person person2 = new Person(firstName, lastName);

        output+="\n\nCalling the Person(String, String) constructor after getting the user-supplied value...\n"+
                "Value of second person object is: \n"+person2.toString();

        JOptionPane.showMessageDialog(null, "****Person Class Tester****\n\n"+output);

    }
}

