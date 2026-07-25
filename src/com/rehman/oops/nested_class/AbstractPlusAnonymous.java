package com.rehman.oops.nested_class;

abstract class AbstractClass {

    abstract public void show();

    abstract public void hide();
}

public class AbstractPlusAnonymous {

    public static void main(String[] args) {

//        Since we know , we cannot create referenceObject of Abstract class
//        Here we are creating referenceObject of "Anonymous Class"

//        We can do this if we want to use interface of abstract class only once

        AbstractClass ref = new AbstractClass() {
            //            1
            public void show() {
                System.out.println("Inside new show");
            }

            //            2
            public void hide() {
                System.out.println("Inside new hide");
            }
        };

        ref.show();
        ref.hide();

    }
}
