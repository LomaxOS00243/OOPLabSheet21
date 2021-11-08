package labsheet7.exercise3;

import java.util.Arrays;

public class Institute {
    private String name;
    private Department department[];



    public Institute(String name, Department[] department) {
        setName(name);
        setDepartment(department);


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department[] getDepartment() {

        return department;
    }

    public void setDepartment(Department[] department) {
        if(department!=null)
            this.department = Arrays.copyOf(department,department.length);

    }


    public int getTotalStudent(){

        return Student.getCount();
    }

    @Override
    public String toString() {
        String str="Name: " + name + "\n" +
                "Department:\n";

        if(department==null)
        {
            str+="No department specified";
            return str;
        }

        for(int i = 0; i<getDepartment().length;i++)
            if(department[i]!=null){
                str+=department[i]+"\n";
            }

        return str;
    }
}

