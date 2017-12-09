package com.example.asus.character_fairry;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.asus.character_fairry.adapter.CharacterListAdapter;
import com.example.asus.character_fairry.db.CharacterDbHelper;
import com.example.asus.character_fairry.model.CharacterItem;

import java.util.ArrayList;

import com.example.asus.character_fairry.adapter.CharacterListAdapter;
import com.example.asus.character_fairry.db.CharacterDbHelper;
import com.example.asus.character_fairry.model.CharacterItem;

public class Category extends AppCompatActivity {

    private CharacterDbHelper mHelper;//เข้าถึงdb
    private SQLiteDatabase mDb;//ตัวอ้างอิงdb
    private ArrayList<CharacterItem> mCartoonItemsList = new ArrayList<>();
    private CharacterListAdapter mAdapter;
    String mType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        Intent intent = getIntent();
        mType = intent.getStringExtra("type");
        mHelper = new CharacterDbHelper(this);
        mDb = mHelper.getReadableDatabase();
        loadDataFromDb();//จะคิวรีข้อมูล ทุกแถว ทุกคอลัม
        mAdapter = new CharacterListAdapter(
                this,
                R.layout.item,//<4>layout->new->layout reso->จะได้item.xml  <5>สร้างแพคเกจ adapter -> สร้างPhoneListAdapter.class
                mCartoonItemsList
        );
//อ้างอิงถึงลิสวิว
        ListView iv = (ListView) findViewById(R.id.list_view);
        iv.setAdapter((ListAdapter) mAdapter);


    }//end onCreate

    private void loadDataFromDb() {
        Cursor cursor = mDb.query(
                //CTRT+P เอาแบบ3
                CharacterDbHelper.TABLE_NAME,
                null,//เอามาทุกคอลัม
                CharacterDbHelper.COL_TYPE+"="+mType,//"category=1"  คิวรีเแพาะที่มีค่าแคททากอรีเป็น1เท่ารั้ร
                null,
                null,
                null,
                null
        );

        mCartoonItemsList.clear();//เคลียข้อมูลเก่าทิ้ง เผือไว้กรณีผู้ใช้แอดข้อมูลเพิ่มมา
//วนลูปเอาข้อมูลออกมา
        while (cursor.moveToNext()) {
            int id = cursor.getInt(cursor.getColumnIndex(CharacterDbHelper.COL_ID));
            String title = cursor.getString(cursor.getColumnIndex(CharacterDbHelper.COL_TITLE));  //getมาแต่ละคอลัมของแถวนั้นๆ หรือcursor.getString(1); ช่อง1ตือtitle
            String calorie = cursor.getString(cursor.getColumnIndex(CharacterDbHelper.COL_DETAIL));  //getมาแต่ละคอลัมของแถวนั้นๆ หรือcursor.getString(1); ช่อง1ตือtitle
            String type = cursor.getString(cursor.getColumnIndex(CharacterDbHelper.COL_TYPE));  //getมาแต่ละคอลัมของแถวนั้นๆ หรือcursor.getString(1); ช่อง1ตือtitle
            String picture = cursor.getString(cursor.getColumnIndex(CharacterDbHelper.COL_PICTURE));  //getมาแต่ละคอลัมของแถวนั้นๆ หรือcursor.getString(1); ช่อง1ตือtitle

            //สร้างโมเดลobj โดยผ่านคอนสตักจอPhoneItem ที่สร้างไว้
            CharacterItem item = new CharacterItem(id, title, calorie, type, picture);
            mCartoonItemsList.add(item);//ข้อมูลขากdbมาอยู่ในนี้หมดแล้ว
        }
    }
}
