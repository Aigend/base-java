package com.it.annoation;

import java.util.ArrayList;
import java.util.List;

class InnerAnnoation{
    public void test() {

    }
}

class InnerAnnoation2 extends InnerAnnoation {

    /**
     * 重载父类的test方法
     */
    @Override
    public void test() {
    }

    /**
     * 被弃用的方法
     */
    @Deprecated
    public void oldMethod() {
    }

    /**
     * 忽略告警
     *
     * @return
     */
    @SuppressWarnings("rawtypes")
    public List processList() {
        List list = new ArrayList();
        return list;
    }

}
