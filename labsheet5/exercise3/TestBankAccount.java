package labsheet5.exercise3;

import javax.swing.*;

public class TestBankAccount {
    public static void main(String[] args) {

        String output=" ";

        BankAccount bankAccount = new BankAccount();

        output+="Calling the no-argument BackAccount constructor. The first BankAccount object details are: \n\n"+bankAccount.toString()+"\n\n";

        BankAccount bankAccount1 = new BankAccount("Rocky Rich",0.75);


        output+="Calling the multi-argument BackAccount constructor. The second BankAccount object details are: \n\n"+bankAccount1.toString()+"\n\n";

        BankAccount bankAccount2 = new BankAccount("Lomax",34.90);

        output+="Calling the multi-argument BackAccount constructor. The third BankAccount object details are: \n\n"+bankAccount2.toString()+"\n\n";
        bankAccount.setInterestRate(0.5);

        output+="Now calling the setInterestRate() method to change the interest rate to "+bankAccount.getInterestRate()+"\n\n";

        output+="The first BankAccount object details are: \n\n"+bankAccount.toString()+"\n\n";

        output+="The Second BankAccount object details are: \n\n"+bankAccount1.toString()+"\n\n";

        output+="The third BankAccount object details are: \n\n"+bankAccount2.toString()+"\n\n";

        output+="The number of BankAccount objects created is: "+ bankAccount.getCount();

        JOptionPane.showMessageDialog(null,output);



    }
}

