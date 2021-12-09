package labsheet10.exercise1;
import java.util.Date;


import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.GregorianCalendar;

public abstract class Lecturer implements Person {
    private String name;
    private String address;
    private GregorianCalendar dateOfBirth;
    private String staffID;
    private String[] coursesTaught;
    private GregorianCalendar dateOfAppointment;

    public Lecturer(String name, String address, GregorianCalendar dateOfBirth, String staffID, String[] coursesTaught,
                    GregorianCalendar dateOfAppointment) {
        setName(name);
        setAddress(address);
        setDateOfBirth(dateOfBirth);
        setStaffID(staffID);
        setCoursesTaught(coursesTaught);
        setDateOfAppointment(dateOfAppointment);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public GregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public void setDateOfBirth(GregorianCalendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getStaffID() {
        return staffID;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public String[] getCoursesTaught() {
        return coursesTaught;
    }

    public void setCoursesTaught(String[] coursesTaught) {
        this.coursesTaught = coursesTaught;
    }

    public GregorianCalendar getDateOfAppointment() {
        return dateOfAppointment;
    }

    public void setDateOfAppointment(GregorianCalendar dateOfAppointment) {
        this.dateOfAppointment = dateOfAppointment;
    }
    public abstract String getStatus();
    public abstract int getPointOnScale();

    @Override
    public String toString() {

        String str="";

        str+= "Lecturer name: " +name + "\n" +
                "Lecture Address: " + address + "\n" +
                "Lecture DateOfBirth: ";
        if(getDateOfBirth()!=null)
        {
            Date dob = getDateOfBirth().getTime();
            SimpleDateFormat dobFormat= new SimpleDateFormat("dd-MM-yyyy") ;
            String strDob= dobFormat.format(dob);

            str+=strDob;
        }
        else
            str+="Undefined";

        str+="\nLecture Staff ID: " + staffID + "\n" +
                "Lecture Courses Taught: " + Arrays.toString(coursesTaught) +"\n"+
                "Lecture Date of Appointment: " + dateOfAppointment+"\n"+
                "Lecture status: "+getStatus()+"\n"+
                "Lecture Point on scale: "+getPointOnScale();

        return str;
    }
}
