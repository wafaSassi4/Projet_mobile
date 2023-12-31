//package com.example.myapplication.helper;

//import android.content.Context;
//import android.database.sqlite.SQLiteDatabase;
//import android.database.sqlite.SQLiteOpenHelper;

//public class SqLiteHelper extends SQLiteOpenHelper {
//  private static final String TABLE_NAME = "table_histories";
//  public static final String COL_ID = "ID";
//  public static final String COL_NAME = "USERNAME";
//  public static final String COL_CONSULT = "CONSULTATION";
//  private static final String CREATE_TAB = "CREATE TABLE " + TABLE_NAME +
//          " (" + COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
//          + COL_NAME + " TEXT NOT NULL, "
//          + COL_CONSULT + " TEXT NOT NULL);";

//  public SqLiteHelper(Context context) {
//      super(context, "mydatabase.db", null, 1);
//
//  public SqLiteHelper(Context context, String nomBdd, Object o, int version) {
//      super(context, nomBdd, (SQLiteDatabase.CursorFactory) o, version);
//  }

//  @Override
//  public void onCreate(SQLiteDatabase db) {
//      db.execSQL(CREATE_TAB);
//  }

//  @Override
//  public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
//      db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
//      onCreate(db);
//  }
//}