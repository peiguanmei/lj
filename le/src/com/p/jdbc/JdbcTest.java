package com.p.jdbc;

import java.sql.*;

/**
 * Created by p on 2017/7/13.
 */
public class JdbcTest {
    public static void main(String[] args) {
        JdbcTest jt = new JdbcTest();
        try {
            jt.testJdbc("3", 3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public int testJdbc(String code, int level) throws SQLException {
        int total = 0;
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            //conn = DriverManager.getConnection()
            String subCode = "3";
            if (level > 0) {
                total += testJdbc(subCode, --level);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            if (rs != null) {
                rs.close();
            }
            if (pstmt != null) {
                pstmt.close();
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (Exception e) {

                }
            }
        }
        return total;
    }
}
