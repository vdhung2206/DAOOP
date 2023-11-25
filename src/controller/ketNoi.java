package controller;

import java.sql.Connection;
import java.sql.DriverManager;

public class ketNoi {

    public static Connection taoKetNoi() throws Exception {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databasename=DoAnOOP;"
                + "username=sa;password=duyhung21;encrypt=false");
        return conn;
    }
}
