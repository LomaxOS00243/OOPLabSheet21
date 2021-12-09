package labsheet7.exercise3;

import javax.swing.*;
import java.util.Arrays;

public class TestCollegeApp {
    public static void main(String[] args) {



        Student student1 = new Student("Jake",145332,"Computing");
        Student student2 = new Student("Mary",234532,"Creative Media");
        Student student3 = new Student("Tommy",453434,"Computing");
        Student student4 = new Student("Peter",789332,"Creative Media");


        Student compStudent[]= new Student[10];
        compStudent[0]=student1;
        compStudent[1]=student3;


        Student creatStudent[]= new Student[9];
        creatStudent[0]=student2;
        creatStudent[1]=student4;


        Department computing = new Department("Computing",compStudent);
        Department creativeMedia = new Department("Creative Media", creatStudent);

        Department department[]= new Department[5];
        department[0]=computing;
        department[1]=creativeMedia;




        Institute institute= new Institute("Institute of Technology, Tralee", department);



        JOptionPane.showMessageDialog(null, institute + "\nTotal of students is: "+institute.getTotalStudent());

        int subComputer=0;
        int subCreativeMedia=0;

        for(int i=0; i<department.length;i++){
            if(department[i]!=null && department[i].equals(computing))
                subComputer=i;
            if(department[i]!=null && department[i].equals(creativeMedia))
                subCreativeMedia=i;

        }


    }
}

