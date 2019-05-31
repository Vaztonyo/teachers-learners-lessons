package net.lessons.database;

import java.sql.*;

public class DatabaseMethods {
    private final String TEACHERS_DATABASE_URL = "jdbc:postgresql://127.0.0.1:5432/teachers";
    private final String user = "codex1";
    private final String pass = "pg123";

    public final Connection connectToDB() throws SQLException, ClassNotFoundException {

        Class.forName("org.postgresql.Driver");
        Connection conn = DriverManager.getConnection(TEACHERS_DATABASE_URL, user, pass);
        System.out.println("Connection Successful");
        return conn;
    }

    public void addTeacherToDB(String firstName, String lastName, String email) throws SQLException, ClassNotFoundException {
       Connection connect =  connectToDB();

        final String INSERT_NAME_SQL = "insert into teacher (first_name, last_name, email) values (?, ?, ?)";

        PreparedStatement addDataPreparedStatement;

        try {
            addDataPreparedStatement = connect.prepareStatement(INSERT_NAME_SQL);
            addDataPreparedStatement.setString(1, firstName);
            addDataPreparedStatement.setString(2, lastName);
            addDataPreparedStatement.setString(3, email);
            addDataPreparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void addLearnerToDB(String firstName, String lastName, String email) throws SQLException, ClassNotFoundException {
        Connection connect =  connectToDB();

        final String INSERT_NAME_SQL = "insert into learner (first_name, last_name, email) values (?, ?, ?)";

        PreparedStatement addDataPreparedStatement;

        try {
            addDataPreparedStatement = connect.prepareStatement(INSERT_NAME_SQL);
            addDataPreparedStatement.setString(1, firstName);
            addDataPreparedStatement.setString(2, lastName);
            addDataPreparedStatement.setString(3, email);
            addDataPreparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    


}
