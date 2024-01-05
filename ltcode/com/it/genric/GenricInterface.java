package com.it.genric;

public interface GenricInterface <T>{
    void test(T t);
}

class GenricInterfaceTest implements GenricInterface<Integer>{
    @Override
    public void test(Integer i) {
        System.out.println(i);
        System.out.println(i.intValue());
    }

    public static void main(String[] args) {
        new GenricInterfaceTest().test(5);
    }
}

class GenricInterfaceTest2<T> implements GenricInterface<T>{
    @Override
    public void test(T t) {
        System.out.println(t);
    }

    public static void main(String[] args) {
//        String s = new String("####");
//        new GenricInterfaceTest2<String>().test("###");
        GenricInterfaceTest2<String> genricInterfaceTest2 = new GenricInterfaceTest2<>();
        genricInterfaceTest2.test("##");
//        new GenricInterfaceTest2<>().test("##");
    }
}