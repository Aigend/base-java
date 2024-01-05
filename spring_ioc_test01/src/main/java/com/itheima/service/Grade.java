package com.itheima.service;

public class Grade {
    public Integer gradeId;

    public Integer getGradeId() {
        return gradeId;
    }

    public String gradeName;
    public Grade(Integer gradeId, String gradeName) {
        System.out.println("正在执行 Course 的有参构造方法，参数分别为：gradeId=" + gradeId + ",gradeName=" + gradeName);
        this.gradeId = gradeId;
        this.gradeName = gradeName;
    }
    @Override
    public String toString() {
        return "Grade{" +
                "gradeId=" + gradeId +
                ", gradeName='" + gradeName + '\'' +
                '}';
    }
}