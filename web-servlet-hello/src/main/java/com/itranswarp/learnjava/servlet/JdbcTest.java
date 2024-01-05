package com.itranswarp.learnjava.servlet;

import java.sql.*;

public class JdbcTest {
    // JDBC连接的URL, 不同数据库有不同的格式:
    String JDBC_URL = "jdbc:mysql://10.143.16.72:3306/learnjdbc?useSSL=false&characterEncoding=utf8";
    String JDBC_USER = "root";
    String JDBC_PASSWORD = "super@man";

    public static void main(String[] args) {
        JdbcTest jdbcTest = new JdbcTest();
        try (Connection conn = DriverManager.getConnection(jdbcTest.JDBC_URL, jdbcTest.JDBC_USER, jdbcTest.JDBC_PASSWORD)) {
            try (Statement stmt = conn.createStatement()) {
                try (ResultSet rs = stmt.executeQuery("SELECT id, grade, name, gender FROM students WHERE gender=1")) {
                    while (rs.next()) {
                        long id = rs.getLong(1); // 注意：索引从1开始
                        long grade = rs.getLong(2);
                        String name = rs.getString(3);
                        int gender = rs.getInt(4);
                        System.out.println(name);
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
