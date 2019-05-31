package net.lessons;
import net.lessons.database.DatabaseMethods;
import net.lessons.subjects.Subjects;

import java.sql.SQLException;

public class Teachers extends Person {

    public Teachers(String firstName, String lastName, String email){
        super(firstName, lastName, email);
    }
     static DatabaseMethods db = new DatabaseMethods();

    public static void main(String[] args) {
        try {
            db.addTeacherToDB("Roberto", "Carlos", "roberto_carlos6@yahoo.com");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
