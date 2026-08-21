package com.rehman.oops.other;

class Address {
    int pincode;
    String city;
    String country;

    public Address(String city, String country, int pincode) {
        this.city = city;
        this.country = country;
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "pincode=" + pincode +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}

class User {
    int id;
    String name;
    int age;

    // Address is a nested object here
    Address address;

    public User(int id, String name, int age, Address address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}

public class NestedObject {

    public static void main(String[] args) {

        Address address1 = new Address("Wagholi", "India", 412207);
        Address address2 = new Address("Kolhapur", "India", 416115);

        User user1 = new User(1, "Yash", 23, address1);
        User user2 = new User(2, "Rehman", 24, address2);

        System.out.println(user1);
        System.out.println(user2);
    }
}