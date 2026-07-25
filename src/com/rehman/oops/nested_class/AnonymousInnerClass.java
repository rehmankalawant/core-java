package com.rehman.oops.nested_class;

class AnimalSound {

    public void sound() {
        System.out.println("Dog is barking");
    }

}

public class AnonymousInnerClass {

    public static void main(String[] args) {

//        Overriding at the time of creating reference object
//        Use only when the method is used for once
//        here the ref is referenceVariable of the anonymous class not of the AnonymousInnerClass

        AnimalSound ref = new AnimalSound() {
            public void sound() {
                System.out.println("Cat is Meow Meow");
            }
        };

        ref.sound();
    }

}
