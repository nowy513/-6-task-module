package com.kodilla.jdbc;

import org.junit.Assert;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DbManagerTestSuite {
    @Test
    public void testConnection() throws SQLException {
        //Given
        //when
        DbManager dbManager = DbManager.getInstance();
        //then
        Assert.assertNotNull(dbManager);
    }

    @Test
    public void testSelectedUsers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();

        //when
        String sqlQuerry = "SELECT * FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuerry);

        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getInt("ID") + "," + rs.getString("FIRSTNAME") + "," + rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();
        Assert.assertEquals(5, counter);
    }

    @Test
    public void testSelectUsersAndPosts() throws SQLException {
//        Given
        DbManager dbManager = DbManager.getInstance();

//        When
        String sqlQuery = "SELECT U.ID, U.FIRSTNAME, U.LASTNAME, COUNT(*) AS POSTS_NUMBER\n" +
                "FROM POSTS P\n" +
                "JOIN USERS U ON U.ID = P.USER_ID\n" +
                "GROUP BY P.USER_ID\n" +
                "HAVING COUNT(*) >= 2;\n";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

//        Then
        int counter = 0;
        while (rs.next()){
            System.out.println(rs.getString("FIRSTNAME") + "," + rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();
        assertEquals(1, counter);
    }

}
