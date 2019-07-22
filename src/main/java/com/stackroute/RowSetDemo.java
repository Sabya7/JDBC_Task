package com.stackroute;

import com.sun.rowset.JdbcRowSetImpl;
import javax.sql.RowSet;
import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;
import java.sql.Connection;
import java.sql.DriverManager;


public class RowSetDemo {

    public void jdbcRowSet() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "Root@123");) {
            RowSet rowSet=new JdbcRowSetImpl(connection);
            rowSet.setCommand("Select * from employee");
            rowSet.execute();
            rowSet.addRowSetListener(new RowSetListener() {
                @Override
                public void rowSetChanged(RowSetEvent event) {
                    System.out.println("row set changed");
                }

                @Override
                public void rowChanged(RowSetEvent event) {
                    System.out.println("row changed");
                }

                @Override
                public void cursorMoved(RowSetEvent event) {
                    System.out.println("cursor moved");
                }
            });
            while(rowSet.next())
            {
                System.out.println("id"+rowSet.getInt(1)+"name"+rowSet.getString(2));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
