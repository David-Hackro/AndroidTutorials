package hackro.tutorials.androidtutorialssqlite1.Views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import hackro.tutorials.androidtutorialssqlite1.DBManager;
import hackro.tutorials.androidtutorialssqlite1.Models.Student;
import hackro.tutorials.androidtutorialssqlite1.R;

public class MainActivity extends AppCompatActivity {
//Example #1 SQLITE
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DBManager databaseManager = new DBManager(this);

        //String STUDENT_ID, String STUDENT_NAME, String STUDENT_LAST_NAME, String STUDENT_AGE
        Student student1 = new Student(4516454,"david","hackro",25);
        Student student2 = new Student(8761465,"tutoriales","hackro",41);
        Student student3 = new Student(9874517,"android","tutorials",13);
        Student student4 = new Student(1265487,"say","good bye dudes!",66);
/*
        //Insert  Student
        databaseManager.InsertStudent(student1);
        databaseManager.InsertStudent(student2);
        databaseManager.InsertStudent(student3);
        databaseManager.InsertStudent(student4);

        //show all Students
        for (Student student : databaseManager.getAllStudent())
                Log.e("Student: ",student.toString());
*/


        //update Student
          /*  student2.setSTUDENT_AGE(100);
            databaseManager.UpdateStudent(student2);*/

        //deleteStudent
        //databaseManager.DeleteStudent(8761465);


        //getStudentId
            Toast.makeText(this,databaseManager.getStudent(1265487).toString(),Toast.LENGTH_SHORT).show();



    }
}
