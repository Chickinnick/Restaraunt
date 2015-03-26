package com.nick.restaraunt;

import android.support.v7.app.ActionBarActivity;


public class DatabaseActivity extends ActionBarActivity {

  /*  @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database);

        SQLiteDatabase db = openOrCreateDatabase("CINEMA", MODE_PRIVATE, null);
        String a = db.getPath();

        Log.d("PATH", a);
        db.execSQL("CREATE TABLE IF NOT EXISTS MyTable (Number Int, Name VARCHAR, Data Int, Directed VARCHAR, Company VARCHAR, Genre VARCHAR);");
        db.execSQL("INSERT INTO MyTable VALUES(1,'Terminator',1984,'J.Cameron','Hemdale Film','Fantasy');");
        Cursor c = db.rawQuery("SELECT* FROM MyTable", null);
        c.moveToFirst();
        Log.d("ME", c.getString(c.getColumnIndex("Name")));
        db.close();


    }*/
}
