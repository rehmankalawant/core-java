package com.rehman.oops.constructor;

public class CopyConstructor {

    int identityNumber;
    String studentName;

//    1 --> Constructor For String

    CopyConstructor(int id, String name) {

//        int identityNumber = id;
//      scope issue happens in copy-constructor if locally declare and initialized

        identityNumber = id;
        studentName = name;
        System.out.println("Hello From Parameterized Constructor");
        System.out.println("Your is Id = " + id + " , and name = " + name);
    }

//    2 --> Constructor For Numbers

//    CopyConstructor copyObject ---> Type of inside element of the copyObject are from CopyConstructor Class

    CopyConstructor(CopyConstructor copyObject) {
        identityNumber = copyObject.identityNumber;
        studentName = copyObject.studentName;

        System.out.println("Hello From Copy Constructor");
        System.out.println("Copied_Id = " + identityNumber + " , Copied_Name = " + studentName);
    }


    public static void main(String[] Args) {

//        Student Constructor
        CopyConstructor studentConstructor = new CopyConstructor(1, "Rehman");

        System.out.println("-----------------------------------------------");

//        Copy Constructor
//        Copying value from upper studentConstructor object
        CopyConstructor copiedObjectConstructor = new CopyConstructor(studentConstructor);


    }
}