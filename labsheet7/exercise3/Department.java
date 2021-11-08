package labsheet7.exercise3;

import java.util.Arrays;

public class Department {
    private String name;
    private Student student[];

    public Department(String name, Student[] student) {
        setName(name);
        setStudent(student);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudent() {
        return Arrays.copyOf(student,student.length);
    }

    public void setStudent(Student[] student) {
        /*for(int i =0; i<student.length;i++)
            if(student[i]!=null)
                this.student = student[i];
            else
                break;*/
        if(student!=null)
            this.student=Arrays.copyOf(student,student.length);

    }

    @Override
    public String toString() {
        String output="Name: " + name +"\n"+
                "List of Students: \n";

        if(student==null){
            output+="No student specified";
            return output;
        }




        for(int i=0; i<  getStudent().length; i++)
            if(student[i]!=null){
                output+=student[i]+"\n ";
            }


        return output;
    }
}
