package com.rehman.method_reusability;

// import like this if going to use method from another class or file

public class MainFile {

    public static void main(String[] args) {

//        1 --> toAdd()
//        toAdd() method is public + static
//        - public - accessible throughout the application / project scope
//        - static - can be accessible by binding method with classname

        int resultAddition = ReusableMethods.toAdd(10, 4);

        System.out.println("Addition is " + resultAddition);

//        2 --> electionEligible()
//        electionEligible() method is private
//        - Accessible only within the same class where it defined

//        3 --> multiplyNumbers()
//        multiplyNumbers() method is public + non-static (instance method)
//        For this we have to create a reference variable of that class where it is defined

        ReusableMethods referenceVariable = new ReusableMethods();

        int resultMultiply = referenceVariable.multiplyNumbers(10, 8);

        System.out.println("Multiplicatiom is " + resultMultiply);
    }


}