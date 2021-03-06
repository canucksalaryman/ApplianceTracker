package com.kohler.appliancetracker;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;
import android.content.ContentValues;
import android.database.Cursor;

public class MyDBHandler extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "ApplianceTracker.db";
    private static final String TABLE_PRODUCTS = "Appliances";

    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_APPLIANCETYPE = "ApplianceType";
    public static final String COLUMN_APPLIANCEIMAGE = "ApplianceImage";
    public static final String COLUMN_PHOTO1 = "Photo1";
    public static final String COLUMN_PHOTO2 = "Photo2";
    public static final String COLUMN_PHOTO3 = "Photo3";
    public static final String COLUMN_PHOTO4 = "Photo4";
    public static final String COLUMN_PHOTO5 = "Photo5";

    public MyDBHandler(Context context, String name,
                       SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_PRODUCTS_TABLE = "CREATE TABLE " +
                TABLE_PRODUCTS + "("
                + COLUMN_ID + " INTEGER PRIMARY KEY," + COLUMN_APPLIANCETYPE
                + " TEXT," + COLUMN_APPLIANCEIMAGE + " TEXT" + COLUMN_PHOTO1 + " TEXT" + COLUMN_PHOTO2 + " TEXT"
                + COLUMN_PHOTO3 + " TEXT" + COLUMN_PHOTO4 + " TEXT" + COLUMN_PHOTO5 + " TEXT" + ")";
        db.execSQL(CREATE_PRODUCTS_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion,
                          int newVersion) {

    }

}
