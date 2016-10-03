package hackro.tutorials.androidtutorialssqlite1.Interfaces;

import android.database.Cursor;

import java.util.List;

import hackro.tutorials.androidtutorialssqlite1.Models.Student;

/**
 * Created by david on 3/10/16.
 */

public interface DBMethods {

    void InsertStudent(Student student);
    void DeleteStudent(int ID_STUDENT);
    void UpdateStudent(Student student);
    Student getStudent(int ID_STUDENT);
    List<Student> getAllStudent();

}
