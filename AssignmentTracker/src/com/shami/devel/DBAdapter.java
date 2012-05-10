package com.shami.devel;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DBAdapter {
	
	public static final String KEY_ROWID= "id";
	public static final String KEY_TITLE="title";
	public static final String KEY_DUEDATE = "duedate";
	public static final String KEY_COURSE = "course";
	public static final String KEY_NOTES = "notes";
	private static final String TAG = "DBAdapter";
	
	
	private static final String DATABASE_NAME = "AssignmentsDB";
	private static final String DATABASE_TABLE = "assignments";
	private static final int DATABASE_VERSION = 2;
	
	private static final String DATABASE_CREATE = 
			"CREATE TABLE IF NOT EXISTS " + DATABASE_TABLE + 
			" (id integer primary key autoincrement, title VARCHAR not null, duedate Date, course VARCHAR, notes VARCHAR);";
	
	
	private final Context context;
	private DatabaseHelper DBHelper;
	private SQLiteDatabase db;
	
	public DBAdapter(Context ctx){
		this.context = ctx;
		DBHelper = new DatabaseHelper(context);
	}
	
	private static class DatabaseHelper extends SQLiteOpenHelper{
		
		DatabaseHelper (Context context){
			super(context, DATABASE_NAME, null, DATABASE_VERSION);
		}
		@Override
		public void onCreate(SQLiteDatabase db) {
			try{
			db.execSQL(DATABASE_CREATE);
			}
			catch (SQLException ex){
				ex.printStackTrace();
			}
			
		}

		@Override
		public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
			Log.w(TAG, "Upgrading Database from version " + oldVersion + " to " + newVersion + 
					" , Which will destroy old data");
			db.execSQL("Drop table if exists assignments;");
			onCreate(db);
			
		}
		
	}
	
	public DBAdapter open() throws SQLException{
		db = DBHelper.getWritableDatabase();
		return this;
	}
	
	public void close(){
		DBHelper.close();
	}
	
	public long insertRecord(String title, String course, String dueDate, String notes){
		ContentValues initialValues = new ContentValues();
		initialValues.put(KEY_TITLE, title);
		initialValues.put(KEY_DUEDATE, dueDate);
		initialValues.put(KEY_COURSE, course);
		initialValues.put(KEY_NOTES, notes);
		return db.insert(DATABASE_TABLE, null, initialValues);
	}
	
	public boolean deleteRecord(long id){
		return db.delete(DATABASE_TABLE, KEY_ROWID+"="+id, null) >0;
	}
	
	public Cursor getAllRecords(){
		return db.query(DATABASE_TABLE, new String[]{KEY_ROWID, KEY_TITLE, KEY_COURSE,KEY_DUEDATE
				, KEY_NOTES}, null, null, null, null, null);
	}
	
	public Cursor getRecord(long id) throws SQLException{
		Cursor result = db.query(true, DATABASE_TABLE, new String[]{KEY_ROWID, KEY_TITLE, 
				KEY_COURSE, KEY_DUEDATE, KEY_NOTES}, KEY_ROWID+"="+id, null, null, null, null, null);
		if (result != null){
			result.moveToFirst();
		}
		return result;
	}
	
	public boolean updateRecord(long id, String title, String course, String dueDate, String notes){
		ContentValues args = new ContentValues();
		args.put(KEY_TITLE, title);
		args.put(KEY_COURSE, course);
		args.put(KEY_NOTES, notes);
		args.put(KEY_DUEDATE, dueDate);
		
		return db.update(DATABASE_TABLE, args, KEY_ROWID+"="+id, null) >0;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}