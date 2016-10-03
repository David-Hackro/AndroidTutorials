package hackro.tutorials.androidtutorialssqlite1.Helpers;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import hackro.tutorials.androidtutorialssqlite1.Interfaces.DBValues;

/**
 * Created by david on 3/10/16.
 */

public class DBHelper extends SQLiteOpenHelper implements DBValues {


    public DBHelper(Context context) {
        super(context, DBNAME, null, DB_SCHEMA_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        Log.e("sentence",CreateTableUsers);
        sqLiteDatabase.execSQL(CreateTableUsers);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
