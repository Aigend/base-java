package com.it.practice;
import java.util.logging.Logger;
import java.lang.reflect.*;
class User{
    private String name = "init";
    private int age;
    public User() {}
    public User(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
    private String getName() {
        return name;
    }
    private void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "User [name=" + name + ", age=" + age + "]";
    }
}
public class ReflectTest {
    static String strClassName = ReflectTest.class.getName();

    static Logger logger = Logger.getLogger(strClassName);
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        logger.warning("根据类名:  \t" + User.class);
        User user = new User();
        logger.info("根据对象:  \t" + user.getClass());
        logger.info("根据全限定类名:\t" + Class.forName("com.it.practice.User"));
        // 常用的方法
        Class<User> userClass = User.class;
        logger.info("获取全限定类名:\t" + userClass.getName());
        logger.info("获取类名:\t" + userClass.getSimpleName());
        logger.info("实例化:\t" +  userClass.newInstance());
    }
}
