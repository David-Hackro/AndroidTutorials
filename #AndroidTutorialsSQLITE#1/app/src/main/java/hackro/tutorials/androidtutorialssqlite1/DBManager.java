package hackro.tutorials.androidtutorialssqlite1;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import hackro.tutorials.androidtutorialssqlite1.Helpers.DBHelper;
import hackro.tutorials.androidtutorialssqlite1.Interfaces.DBMethods;
import hackro.tutorials.androidtutorialssqlite1.Interfaces.DBValues;
import hackro.tutorials.androidtutorialssqlite1.Models.Student;

/**
 * Created by david on 3/10/16.
 */

public class DBManager implements DBValues, DBMethods {

    private DBHelper helper;
    private SQLiteDatabase db;
    private ContentValues contentValues;

    private List<Student> students;


    public DBManager(Context context) {
        helper = new DBHelper(context);
        db = helper.getWritableDatabase();
    }


    //this method is "student"
    ContentValues ContentValues(Student student) {//Entity Student
        contentValues = new ContentValues();
        contentValues.put(STUDENT_ID, student.getSTUDENT_ID());
        contentValues.put(STUDENT_NAME, student.getSTUDENT_NAME());
        contentValues.put(STUDENT_LAST_NAME, student.getSTUDENT_LAST_NAME());
        contentValues.put(STUDENT_AGE, student.getSTUDENT_AGE());
        return contentValues;
    }


    @Override
    public void InsertStudent(Student student) {
        db.insert(TABLE_STUDENTS, null, ContentValues(student));
    }

    @Override
    public void DeleteStudent(int ID_STUDENT) {
        db.delete(TABLE_STUDENTS, STUDENT_ID + "=?", new String[]{String.valueOf(ID_STUDENT)}); //lol
    }

    @Override
    public void UpdateStudent(Student student) {
        try {
            db.update(TABLE_STUDENTS, ContentValues(student), STUDENT_ID + "=?", new String[]{String.valueOf(student.getSTUDENT_ID())});
        } catch (Exception e) {
            Log.e("Exception: ", e.getMessage());
        }
    }

    @Override
    public Student getStudent(int ID_STUDENT) {
        Student student = new Student();
        String[] param = {String.valueOf(ID_STUDENT)};
        Cursor cursor = db.query(TABLE_STUDENTS, null, STUDENT_ID + "=?", param, null, null, null, null);

        if (cursor != null) {
            while (cursor.moveToNext()) {
                student.setSTUDENT_ID(cursor.getInt(0));
                student.setSTUDENT_NAME(cursor.getString(1));
                student.setSTUDENT_LAST_NAME(cursor.getString(2));
                student.setSTUDENT_AGE(cursor.getInt(3));

            }
            cursor.close();
        }
        return student;
    }

    @Override
    public List<Student> getAllStudent() {

        students = new ArrayList<Student>();
        Cursor cursor = db.query(TABLE_STUDENTS, null, null, null, null, null, null, null);
        if (cursor != null) {
            while (cursor.moveToNext()) {
                students.add(new Student(
                        cursor.getInt(0),
                        cursor.getString(1),
                        cursor.getString(2),
                        cursor.getInt(3)
                ));
            }
            cursor.close();
        }

        return students;
    }
}
