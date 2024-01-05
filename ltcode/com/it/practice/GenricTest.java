package com.it.practice;

public class GenricTest {
    public static void main(String[] args) {
        ObjectPoint floatPoint = new ObjectPoint();
        floatPoint.setX(100.12f);
        // 因为编译器也不知道你传进去的是什么，而floatPoint.getX()返回的类型是Object，所以编译时，将Object强转成String是成立的。必然不会报错。
        String floatX = (String)floatPoint.getX(); //
    }
}

class ObjectPoint{
    private Object x ;
    private Object y ;
    public void setX(Object x){
        this.x = x ;
    }
    public void setY(Object y){
        this.y = y ;
    }
    public Object getX(){
        return this.x ;
    }
    public Object getY(){
        return this.y ;
    }
}