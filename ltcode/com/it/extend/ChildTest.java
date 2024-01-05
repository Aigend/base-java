package com.it.extend;

class Test{

}
public class ChildTest extends ParentTest{
    private String meal;

    public ChildTest(String meal) {
//        super("asda", 5);
        this.meal = meal;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    public void test(){
        super.test();
        System.out.println(this.meal);
        System.out.println(this.age);
        System.out.println(this.name);
    }
    public static void main(String[] args) {
        ParentTest parentTest = new ChildTest("mike");
        parentTest.test();
    }
}
