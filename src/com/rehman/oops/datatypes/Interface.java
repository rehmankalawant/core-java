package com.rehman.oops.datatypes;

//  INTERFACE

//  Interface is a reference type that acts as a structural blueprint for classes by specifying behavior without forcing a specific implementation

//  In simple ,  we can write the behavior (data-type , returns-what , access-modifier) of the variable and methods for a class


interface User {

//    1
//    By default, every variable in interface is "Final" and "Static"
//    So we need to initialize at the time of declaration

    String userName = "vikesh";

    int userAge = 24;

//    2
//    By default, every method in interface are "Public" and "Abstract"
//    So it is okay if we are not attached the keywords to it like , public abstract void createAccount();

    void createAccount();

    void deleteAccount();
}

public class Interface implements User {

//    We cannot create object of interface as same as Abstract
//    But we can use it as a reference
//    And that it is actually used for / created for
//    class Hello implements interfaceName

//    By this you have to implement all methods
//    Else compile time error occur


    public void createAccount() {
        System.out.println("Account Created");
    }

    public void deleteAccount() {
        System.out.println("Account Deleted");
    }


    public static void main(String[] args) {
        Interface refVariable = new Interface();

        refVariable.createAccount();
        refVariable.deleteAccount();

//        Since the variables are by-default static
//        They can be called by ClassName

        System.out.println("UserName - " + User.userName);
        System.out.println("UserAge - " + User.userAge);

    }


}
