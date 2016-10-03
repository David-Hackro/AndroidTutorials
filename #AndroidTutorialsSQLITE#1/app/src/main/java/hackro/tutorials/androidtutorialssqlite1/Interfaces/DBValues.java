package hackro.tutorials.androidtutorialssqlite1.Interfaces;

/**
 * Created by david on 3/10/16.
 */

public interface DBValues {

    final int DB_SCHEMA_VERSION = 1;
    final String DBNAME = "School";

    final String TABLE_STUDENTS = "Students";

    final String STUDENT_ID = "student_id";
    final String STUDENT_NAME = "student_name";
    final String STUDENT_LAST_NAME = "student_last_name";
    final String STUDENT_AGE = "student_age";

    final String CreateTableUsers =
            "create table " + TABLE_STUDENTS + " (" + STUDENT_ID + " int primary key, " +
                    STUDENT_NAME+" text not null, "+
                    STUDENT_LAST_NAME+" text not null, "+
                    STUDENT_AGE+" integer)";



}
