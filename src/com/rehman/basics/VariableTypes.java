package com.rehman.basics;

public class VariableTypes {

    int instanceVariable = 10; // Instance Variable

    static int staticVariable = 20; // Static Variable

    public static void main(String[] Args) {

        int localVariable = 30; // Local Variable

//        1 --> Local variable
//        Local variables are accessed directly with their name

//        2 --> Static variable
//        Static variables are accessed using their class name in they present
//        ClassName.staticVariableName
//        We cannot use non-static variable in static class // !important

//        3 --> Instance variable
//        Instance variables are accessed using reference
//        - Create reference variable of the class in which instance variable present
//        - ClassName referenceVariable = new ClassName
//        referenceVariable.instanceVariable

        VariableTypes instanceVariableReference = new VariableTypes();

        System.out.println("Types Of Variables -");
        System.out.println("Local Variable = " + localVariable);
        System.out.println("Static Variable = " + VariableTypes.staticVariable);
        System.out.println("Instance Variable = " + instanceVariableReference.instanceVariable);
    }
}