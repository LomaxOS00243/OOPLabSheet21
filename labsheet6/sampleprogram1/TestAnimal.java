
package labsheet6.sampleprogram1;

//TestAnimal.java
/*A driver (test) class that contains the main() method for
testing the functionality of the Animal class*/


public class TestAnimal {
    public static void main( String args[]) {
        //String AntelopeContinents[] ;
        System.out.println("testing the no-argument constructor....");
        Animal animal1 = new Animal(); //tests no-arg constructor
        System.out.println(animal1); //tests toString() and the accessor methods
        String lionContinents[] = {}; //initialise an array of strings

        //tests 4-arg constructor and the 4 mutator methods
        System.out.println("\n\n\ntesting the 4-argument constructor....");
        animal1 = new Animal();
        System.out.println(animal1);
    }
}