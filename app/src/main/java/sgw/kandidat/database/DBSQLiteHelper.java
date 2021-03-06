package sgw.kandidat.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBSQLiteHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "db_kursach";

    public DBSQLiteHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(TablesPresenterClass.Kandidat.CREATE_TABLE);
        sqLiteDatabase.execSQL(TablesPresenterClass.Ocinka.CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TablesPresenterClass.Kandidat.TABLE_NAME);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TablesPresenterClass.Ocinka.TABLE_NAME);
        onCreate(sqLiteDatabase);

    }
}