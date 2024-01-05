package com.itheima.aware;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;

public class HelloBeanFactoryAware implements BeanNameAware,BeanFactoryAware{
    private BeanFactory bf;
    @Override
    public void setBeanName(String arg0) {
        System.out.println("回调setBeanName方法  id属性是"+arg0);

    }
    public void init(){
        System.out.println("正在执行初始化方法init");
    }

    /*
     * 重写setBeanFactory方法
     * @see org.springframework.beans.factory.BeanFactoryAware#setBeanFactory(org.springframework.beans.factory.BeanFactory)
     */
    @Override
    public void setBeanFactory(BeanFactory arg0) throws BeansException {
        System.out.println("@@");
        this.bf=arg0;

    }
    public BeanFactory getBf() {
        return bf;
    }
}