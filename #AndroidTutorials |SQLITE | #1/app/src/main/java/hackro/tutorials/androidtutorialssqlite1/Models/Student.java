package hackro.tutorials.androidtutorialssqlite1.Models;

/**
 * Created by david on 3/10/16.
 */

public class Student {

    private int STUDENT_ID;
    private String STUDENT_NAME;
    private String STUDENT_LAST_NAME;
    private int STUDENT_AGE;


    public Student(int STUDENT_ID, String STUDENT_NAME, String STUDENT_LAST_NAME, int STUDENT_AGE) {
        this.STUDENT_ID = STUDENT_ID;
        this.STUDENT_NAME = STUDENT_NAME;
        this.STUDENT_LAST_NAME = STUDENT_LAST_NAME;
        this.STUDENT_AGE = STUDENT_AGE;

    }

    public Student() {
    }

    public int getSTUDENT_ID() {
        return STUDENT_ID;
    }

    public void setSTUDENT_ID(int STUDENT_ID) {
        this.STUDENT_ID = STUDENT_ID;
    }

    public String getSTUDENT_NAME() {
        return STUDENT_NAME;
    }

    public void setSTUDENT_NAME(String STUDENT_NAME) {
        this.STUDENT_NAME = STUDENT_NAME;
    }

    public String getSTUDENT_LAST_NAME() {
        return STUDENT_LAST_NAME;
    }

    public void setSTUDENT_LAST_NAME(String STUDENT_LAST_NAME) {
        this.STUDENT_LAST_NAME = STUDENT_LAST_NAME;
    }

    public int getSTUDENT_AGE() {
        return STUDENT_AGE;
    }

    public void setSTUDENT_AGE(int STUDENT_AGE) {
        this.STUDENT_AGE = STUDENT_AGE;
    }

    @Override
    public String toString() {
        return "Student{" +
                "STUDENT_ID='" + STUDENT_ID + '\'' +
                ", STUDENT_NAME='" + STUDENT_NAME + '\'' +
                ", STUDENT_LAST_NAME='" + STUDENT_LAST_NAME + '\'' +
                ", STUDENT_AGE='" + STUDENT_AGE + '\'' +
                '}';
    }
}


