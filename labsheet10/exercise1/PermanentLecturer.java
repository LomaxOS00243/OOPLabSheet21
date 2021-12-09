package labsheet10.exercise1;

import java.util.GregorianCalendar;

public class PermanentLecturer extends Lecturer {
    private String pensionEntitlement;
    private String status;

    public PermanentLecturer(String name, String address, GregorianCalendar dob,String staffID,String []courseTaught,GregorianCalendar doApp,String pensionEntitlement, String status) {
        super(name,address,dob,staffID,courseTaught,doApp);
        setPensionEntitlement(pensionEntitlement);

    }

    public String getPensionEntitlement() {
        return pensionEntitlement;
    }

    public void setPensionEntitlement(String pensionEntitlement) {
        this.pensionEntitlement = pensionEntitlement;
    }

    public String getStatus() {
        return "Part-time e Senior Research Fellow";
    }

    @Override
    public int getPointOnScale() {
        return 0;
    }



    @Override
    public String toString() {
        return super.toString()+"\nPensionEntitlement: " + pensionEntitlement + "\n" +
                "Status: " + getStatus() + "\n" ;
    }
}
