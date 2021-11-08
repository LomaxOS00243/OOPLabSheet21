package labsheet7.exercise3;

public class Student {

    private String name;
    private int id;
    private String department;
    private static int count;

    public Student( String name, int id, String department) {

        setName(name);
        setId(id);
        setDepartment(department);
        count++;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Student.count = count;
    }

    @Override
    public String toString() {
        String str="Name: ";
        if(name==null) {
            str+="No Name specified " + "ID: ";
        }
        else
        {
            str+=name+" ID: ";
        }
        if(id==0)
        {
            str+="No ID specified "+ "Department: ";
        }
        else
        {
            str+=id+" Department: ";
        }
        if(department==null)
        {
            str+="No department specified";
            return str;
        }
        else

            str+=department;

        return str;
    }

}

