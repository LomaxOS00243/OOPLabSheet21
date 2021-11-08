package labsheet5.exercise1;

import labsheet4.Book;

import javax.swing.*;

public class TestBook {
    public static void main(String[] args) {

        String output;

        labsheet4.Book b1= new labsheet4.Book();
        output="Calling the no-argument Book constructor. The first Book object details are:\n\n"+b1.toString();

        labsheet4.Book b2= new Book("The Davinci Code", 19.99,"3452617232",348);

        output+="\n\nCalling the  multiBook constructor. The Second Book object details are:\n\n"+b2.toString();

        JOptionPane.showMessageDialog(null, output, "Book Object Data", JOptionPane.INFORMATION_MESSAGE);


    }
}
