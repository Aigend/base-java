package com.base;
class  Address{
    String detail;

    public Address(String detail) {
        this.detail = detail;
    }
}

class User implements Cloneable{
    int age;
    Address address;

    public User(int age) {
        this.age = age;
        this.address = new Address("广州天河");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (User)super.clone();
    }
}

public class ObjectTest {
//    private
    public static void main(String[] args) throws CloneNotSupportedException {
        User u1 = new User(29);
        User u2 = (User) u1.clone();
        //判读u1和u2
        System.out.println(u1 == u2); // false
        System.out.println(u1.address == u2.address); //true

    }
}
