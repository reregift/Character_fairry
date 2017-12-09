package com.example.asus.character_fairry.db;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.asus.character_fairry.R;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class CharacterDbHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "cartoon.db";
    private static final int DATABASE_VERSION = 1;

    //ชื่อฟิล
    public static final String TABLE_NAME = "cartoon";
    public static final String COL_ID = "_id";
    public static final String COL_TITLE = "title";
    public static final String COL_DETAIL = "detail";
    public static final String COL_TYPE = "type";
    public static final String COL_PICTURE = "picture";

    private static final String CREATE_TABLE = "CREATE TABLE "+TABLE_NAME+"("
            + COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + COL_TITLE + " TEXT,"
            + COL_DETAIL + " TEXT,"
            + COL_TYPE + " TEXT,"
            + COL_PICTURE + " TEXT)";

    public CharacterDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) { //ถ้าฐานข้อมูลยังไม่มีก็จะมาทำตรงนี้
        db.execSQL(CREATE_TABLE); //ไปสร้างตาราง
        insertInitialData(db);//ใส่ข้อมูลลงตาราง
    }

    private void insertInitialData(SQLiteDatabase db) {//idไม่ต้องใส่เพราะเดียวandroidทำให้เอง

        ContentValues cv = new ContentValues();
//--------------- 1---------------------------------------------
        //putค่าต่างๆใส่ลงcv
        cv.put(COL_TITLE,"Aurora");//ใส่ฟิลไหน,ค่าที่ใส่
        cv.put(COL_DETAIL,"เด็กสาวผู้อ่อนโยนและน่ารัก เธอเติบโตมาด้วยการดูและของนางฟ้า");
        cv.put(COL_TYPE,"1");
        cv.put(COL_PICTURE,"a11.png");
        //app->New->Foder->Asset จะได้Fodel asset ไปหารูปมาใส่
        //เอาcv ใส่ลงฐานข้อมูล
        db.insert(TABLE_NAME,null,cv);//ชื่อตาราง,null,cv
        //ข้อมูล2
        cv = new ContentValues();
        cv.put(COL_TITLE,"Maleficent");
        cv.put(COL_DETAIL,"ปีศาจร้ายที่ประกาศตนว่าตนเองนั้นเป็นประมุขห่างความชั่วร้าย");
        cv.put(COL_TYPE,"1");
        cv.put(COL_PICTURE,"a12.jpeg");
        db.insert(TABLE_NAME,null,cv);
        //ข้อมูล3
        cv = new ContentValues();
        cv.put(COL_TITLE,"Prince philip");
        cv.put(COL_DETAIL,"เจ้าชายดินแดนข้างเคียงเสด็จมาเขาร่วมงานประสูติของเจ้าหญิง");
        cv.put(COL_TYPE,"1");
        cv.put(COL_PICTURE,"a13.jpeg");
        db.insert(TABLE_NAME,null,cv);
        //ข้อมูล4
        cv = new ContentValues();
        cv.put(COL_TITLE,"Diablo");
        cv.put(COL_DETAIL,"นกของมาเลฟิเซนต์");
        cv.put(COL_TYPE,"1");
        cv.put(COL_PICTURE,"a14.jpeg");
        db.insert(TABLE_NAME,null,cv);
        //ข้อมูล5
        cv = new ContentValues();
        cv.put(COL_TITLE,"Samson");
        cv.put(COL_DETAIL,"ม้าที่ซื้อสัตว์ของเจ้าชายฟิลิปส์");
        cv.put(COL_TYPE,"1");
        cv.put(COL_PICTURE,"a15.jpeg");
        db.insert(TABLE_NAME,null,cv);

        cv = new ContentValues();
        cv.put(COL_TITLE,"Flora,Fauna และ Merryweather");
        cv.put(COL_DETAIL,"เหล่านางฟ้าที่ปกป้องดูแล ออโรล่า จากปีศาจร้าย");
        cv.put(COL_TYPE,"1");
        cv.put(COL_PICTURE,"a16.jpeg");
        db.insert(TABLE_NAME,null,cv);

//--------------- 2---------------------------------------------
        //ข้อมูล (หมวด2) 1
        cv = new ContentValues();
        cv.put(COL_TITLE,"Rapunzel");
        cv.put(COL_DETAIL,"เจ้าหญิงที่ถูกลักพาตัวเพราะผมของพิเศษกว่าคนอื่นๆ ซึ่งถูกขังอยู่ในหอคอย");
        cv.put(COL_TYPE,"2");
        cv.put(COL_PICTURE,"a21.jpeg");
        db.insert(TABLE_NAME,null,cv);
        //ข้อมูล2
        cv = new ContentValues();
        cv.put(COL_TITLE,"Flynn rider");
        cv.put(COL_DETAIL,"โจรหนุ่ม ขี้เก็ก มั่นใจในตัวเอง เหย่อหยิ่ง");
        cv.put(COL_TYPE,"2");
        cv.put(COL_PICTURE,"a22.jpeg");
        db.insert(TABLE_NAME,null,cv);
        //ข้อมูล3
        cv = new ContentValues();
        cv.put(COL_TITLE,"Gothel");
        cv.put(COL_DETAIL,"หญิงแก่ที่ลักพาตัวราฟันเซลแต่เธอยังดูสาวเพราะผมของราพันเซล");
        cv.put(COL_TYPE,"2");
        cv.put(COL_PICTURE,"a23.jpg");
        db.insert(TABLE_NAME,null,cv);
        //ข้อมูล4
        cv = new ContentValues();
        cv.put(COL_TITLE,"Pascal");
        cv.put(COL_DETAIL,"เพื่อนแท้ผู้ซื่อสัตว์ของราพันเซล");
        cv.put(COL_TYPE,"2");
        cv.put(COL_PICTURE,"a24.jpeg");
        db.insert(TABLE_NAME,null,cv);
        //ข้อมูล5
        cv = new ContentValues();
        cv.put(COL_TITLE,"Maximus");
        cv.put(COL_DETAIL,"ม้าองครักษ์ผู้อุทิศตรอาจหาญ ไร้ซึ่งความกลัว");
        cv.put(COL_TYPE,"2");
        cv.put(COL_PICTURE,"a25.jpeg");
        db.insert(TABLE_NAME,null,cv);
//----------------3---------------------------------------------
        //ข้อมูล อาหาร(หมวด3) 1
        cv = new ContentValues();
        cv.put(COL_TITLE,"Arial");
        cv.put(COL_DETAIL,"เงือกน้อยผู้แน่วแน่และรักอิสระ");
        cv.put(COL_TYPE,"3");
        cv.put(COL_PICTURE,"a31.jpeg");
        db.insert(TABLE_NAME,null,cv);
        //ข้อมูล2
        cv = new ContentValues();
        cv.put(COL_TITLE,"Sebastain");
        cv.put(COL_DETAIL,"เพื่อนตัวป่วนของแอเรียลที่ชอบสร้างปัญหา");
        cv.put(COL_TYPE,"3");
        cv.put(COL_PICTURE,"a32.jpeg");
        db.insert(TABLE_NAME,null,cv);
        //ข้อมูล3
        cv = new ContentValues();
        cv.put(COL_TITLE,"Flounder");
        cv.put(COL_DETAIL,"เพื่อนที่เคียงข้างแอเรียนเสมอมา");
        cv.put(COL_TYPE,"3");
        cv.put(COL_PICTURE,"a33.jpeg");
        db.insert(TABLE_NAME,null,cv);
        //ข้อมูล4
        cv = new ContentValues();
        cv.put(COL_TITLE,"King Triton");
        cv.put(COL_DETAIL,"บิดาของแอเรียลคือเจ้าของท้องทะเล ราชันผู้ทรงอำนาจ ");
        cv.put(COL_TYPE,"3");
        cv.put(COL_PICTURE,"a34.jpeg");
        db.insert(TABLE_NAME,null,cv);
        //ข้อมูล5
        cv = new ContentValues();
        cv.put(COL_TITLE,"Prince Eric");
        cv.put(COL_DETAIL,"เจ้าชายที่มีรอยยิ้มที่มีเสน่ห์ตกหลุมรักกับแอเรียล");
        cv.put(COL_TYPE,"3");
        cv.put(COL_PICTURE,"a35.jpeg");
        db.insert(TABLE_NAME,null,cv);

        cv = new ContentValues();
        cv.put(COL_TITLE,"Ursula");
        cv.put(COL_DETAIL,"หญิงร้ายกายอ้วนในร่างหมึก เธอต้องการโค่นอำนาจเจ้าสมุทรไตรตันและตั้งตัวเป็นผู้ปกครองโลกมหาสมุทรแทน");
        cv.put(COL_TYPE,"3");
        cv.put(COL_PICTURE,"a36.jpeg");
        db.insert(TABLE_NAME,null,cv);
//----------------4---------------------------------------------
        //ข้อมูล (หมวด4) 1
        cv = new ContentValues();
        cv.put(COL_TITLE,"Cinderrella");
        cv.put(COL_DETAIL,"หญิงสาวที่มีเตตากับทุกชีวิต");
        cv.put(COL_TYPE,"4");
        cv.put(COL_PICTURE,"a41.jpeg");
        db.insert(TABLE_NAME,null,cv);
        //ข้อมูล2
        cv = new ContentValues();
        cv.put(COL_TITLE,"Prince Charming");
        cv.put(COL_DETAIL,"เจ้าชายที่ตกหลุมรักซินเดอเรลา ตาามหาหญิงรองเท้าแก้ว");
        cv.put(COL_TYPE,"4");
        cv.put(COL_PICTURE,"a42.jpeg");
        db.insert(TABLE_NAME,null,cv);
        //ข้อมูล3
        cv = new ContentValues();
        cv.put(COL_TITLE,"นางฟ้าทูนหัว");
        cv.put(COL_DETAIL,"รักฟ้าผู้ใจดีที่ชวยให้ซินเดอเรลาได้ไปงานเต้นรำ");
        cv.put(COL_TYPE,"4");
        cv.put(COL_PICTURE,"a43.jpeg");
        db.insert(TABLE_NAME,null,cv);
        //ข้อมูล4
        cv = new ContentValues();
        cv.put(COL_TITLE,"Jaq");
        cv.put(COL_DETAIL,"เพื่อนรักของซิลเดอเรลาที่ดูแลและเคียงข้างเธออยู่เสมอ");
        cv.put(COL_TYPE,"4");
        cv.put(COL_PICTURE,"a44.jpeg");
        db.insert(TABLE_NAME,null,cv);
        //ข้อมูล5
        cv = new ContentValues();
        cv.put(COL_TITLE,"Gus");
        cv.put(COL_DETAIL,"เพื่อนรักของซิลเดอเรลาที่ดูแลและเคียงข้างเธออยู่เสมอ");
        cv.put(COL_TYPE,"4");
        cv.put(COL_PICTURE,"a45.jpeg");
        db.insert(TABLE_NAME,null,cv);

        cv = new ContentValues();
        cv.put(COL_TITLE,"Lady Tremaine");
        cv.put(COL_DETAIL,"แม่เลี้ยงแสนใจร้าย");
        cv.put(COL_TYPE,"4");
        cv.put(COL_PICTURE,"a46.jpeg");
        db.insert(TABLE_NAME,null,cv);

        cv = new ContentValues();
        cv.put(COL_TITLE,"Anastasia");
        cv.put(COL_DETAIL,"ลูกของแม่เลี้ยงใจร้าย");
        cv.put(COL_TYPE,"4");
        cv.put(COL_PICTURE,"a47.jpeg");
        db.insert(TABLE_NAME,null,cv);

        cv = new ContentValues();
        cv.put(COL_TITLE,"Drizella");
        cv.put(COL_DETAIL,"ลูกของแม่เลี้ยงใจร้าย");
        cv.put(COL_TYPE,"4");
        cv.put(COL_PICTURE,"a48.jpeg");
        db.insert(TABLE_NAME,null,cv);

        //----------------5---------------------------------------------
        //ข้อมูล (หมวด4) 1
        cv = new ContentValues();
        cv.put(COL_TITLE,"Tiana");
        cv.put(COL_DETAIL,"หญิงสาวที่มีความฝันอยากมีร้านอาหารเป็นของตนเอง เธอขยันขันแข็งเพื่อให้ฝันที่เธอเป็นจริง");
        cv.put(COL_TYPE,"5");
        cv.put(COL_PICTURE,"a51.jpeg");
        db.insert(TABLE_NAME,null,cv);
        //ข้อมูล2
        cv = new ContentValues();
        cv.put(COL_TITLE,"Prince Naveen");
        cv.put(COL_DETAIL,"เจ้าชายจากดินแดนห่างไกล เขาคลั่งไคล้ในดรตรีแจสเป็นอย่างมาก");
        cv.put(COL_TYPE,"5");
        cv.put(COL_PICTURE,"a52.jpeg");
        db.insert(TABLE_NAME,null,cv);
        //ข้อมูล3
        cv = new ContentValues();
        cv.put(COL_TITLE,"Louis");
        cv.put(COL_DETAIL,"จระเข้ตัวใหญ่ที่มีหัวใจรักในเสียงดนตรี");
        cv.put(COL_TYPE,"5");
        cv.put(COL_PICTURE,"a53.jpeg");
        db.insert(TABLE_NAME,null,cv);
        //ข้อมูล4
        cv = new ContentValues();
        cv.put(COL_TITLE,"Ray");
        cv.put(COL_DETAIL,"หิ่งห้องผู้นำทางที่มีอารมณ์ขัน ดูแลทุกคนที่รักใคร่");
        cv.put(COL_TYPE,"5");
        cv.put(COL_PICTURE,"a54.jpeg");
        db.insert(TABLE_NAME,null,cv);
        //ข้อมูล5
        cv = new ContentValues();
        cv.put(COL_TITLE,"Mama Odie");
        cv.put(COL_DETAIL,"ผู้ที่อยู่ในความมืดมนมาสองร้อยปี");
        cv.put(COL_TYPE,"5");
        cv.put(COL_PICTURE,"a55.jpeg");
        db.insert(TABLE_NAME,null,cv);

        cv = new ContentValues();
        cv.put(COL_TITLE,"Eudora");
        cv.put(COL_DETAIL,"แม่ของTianaผู้ที่มีความกังวลกับความฝันของลูกสาว");
        cv.put(COL_TYPE,"5");
        cv.put(COL_PICTURE,"a56.jpeg");
        db.insert(TABLE_NAME,null,cv);

        cv = new ContentValues();
        cv.put(COL_TITLE,"James");
        cv.put(COL_DETAIL,"พ่อของ Tiana ที่คอยปลูกฝังความเชื่อกับลูกสาวว่าอาหารจะทำให้คนรักกัน");
        cv.put(COL_TYPE,"5");
        cv.put(COL_PICTURE,"a57.jpeg");
        db.insert(TABLE_NAME,null,cv);

        cv = new ContentValues();
        cv.put(COL_TITLE,"Charllotte La Bouff");
        cv.put(COL_DETAIL,"เพื่อนในวัยเยาว์ของ Tiana ความฝันของเธอคือการได้แต่งงาน");
        cv.put(COL_TYPE,"5");
        cv.put(COL_PICTURE,"a58.jpeg");
        db.insert(TABLE_NAME,null,cv);

        cv = new ContentValues();
        cv.put(COL_TITLE,"Big Daddy La Bouff");
        cv.put(COL_DETAIL,"พ่อของCharllotteที่จะเปลี่ยนแปลงลูกสาวอันแสนจะดื้อรั้น");
        cv.put(COL_TYPE,"5");
        cv.put(COL_PICTURE,"a59.jpeg");
        db.insert(TABLE_NAME,null,cv);

        //----------------6---------------------------------------------
        //ข้อมูล อาหาร(หมวด4) 1
        cv = new ContentValues();
        cv.put(COL_TITLE,"Merida");
        cv.put(COL_DETAIL,"เธอเป็นเจ้าหญิงโดยกำเนิดและมีจิตวิญญาณเป็นนักพจญภัย");
        cv.put(COL_TYPE,"6");
        cv.put(COL_PICTURE,"a61.jpeg");
        db.insert(TABLE_NAME,null,cv);

        cv = new ContentValues();
        cv.put(COL_TITLE,"Angus");
        cv.put(COL_DETAIL,"ม้าสีดำคู่ใจของ Merida");
        cv.put(COL_TYPE,"6");
        cv.put(COL_PICTURE,"a62.jpeg");
        db.insert(TABLE_NAME,null,cv);

        cv = new ContentValues();
        cv.put(COL_TITLE,"Queen Elinor");
        cv.put(COL_DETAIL,"ราชินีผู้มีความสง่างามร่ำรวยด้วยปัญญาและมีความเข้มแข็งเธอทุ่มเท่ทุกอย่างเพื่อครอบครัวและอาณาจักร");
        cv.put(COL_TYPE,"6");
        cv.put(COL_PICTURE,"a63.jpeg");
        db.insert(TABLE_NAME,null,cv);

        cv = new ContentValues();
        cv.put(COL_TITLE,"KingFergus");
        cv.put(COL_DETAIL,"บอดาของMerida ผู้พิทักษ์ปกป้องทั้งอาณาจักรและครอบครัว เขาเป็นนักรบผู้แกร่งกล้า");
        cv.put(COL_TYPE,"6");
        cv.put(COL_PICTURE,"a64.jpeg");
        db.insert(TABLE_NAME,null,cv);

        cv = new ContentValues();
        cv.put(COL_TITLE,"Lord Dingwall");
        cv.put(COL_DETAIL,"ผูนำในอาณาจักรปห่งหนึ่ง เขามีนิสัยอารมณ์ร้าน ใจร้าน ชอบต่อสู้");
        cv.put(COL_TYPE,"6");
        cv.put(COL_PICTURE,"a65.jpeg");
        db.insert(TABLE_NAME,null,cv);

        cv = new ContentValues();
        cv.put(COL_TITLE,"Lord MacGuffin");
        cv.put(COL_DETAIL,"ผูนำในอาณาจักรปห่งหนึ่งเป็นบุรุษพูดน้อยมีเสียงอันน่าเคารพยำเกรง");
        cv.put(COL_TYPE,"6");
        cv.put(COL_PICTURE,"a66.jpeg");
        db.insert(TABLE_NAME,null,cv);

        cv = new ContentValues();
        cv.put(COL_TITLE,"Lord Macintosh");
        cv.put(COL_DETAIL,"ผู้นำเผ่าหลุดโลก หุ่นผอมแต่แรงดีและยังขี้หงุดหงิด");
        cv.put(COL_TYPE,"6");
        cv.put(COL_PICTURE,"a67.jpeg");
        db.insert(TABLE_NAME,null,cv);

        //----------------7---------------------------------------------
        //ข้อมูล (หมวด4) 1
        cv = new ContentValues();
        cv.put(COL_TITLE,"Pocahontas");
        cv.put(COL_DETAIL,"เธอเป็นเจ้าหญิงโดยกำเนิดและมีจิตวิญญาณเป็นนักพจญภัย");
        cv.put(COL_TYPE,"7");
        cv.put(COL_PICTURE,"a71.jpeg");
        db.insert(TABLE_NAME,null,cv);

        cv = new ContentValues();
        cv.put(COL_TITLE,"Meeko");
        cv.put(COL_DETAIL,"เธอเป็นเจ้าหญิงโดยกำเนิดและมีจิตวิญญาณเป็นนักพจญภัย");
        cv.put(COL_TYPE,"7");
        cv.put(COL_PICTURE,"a72.jpg");
        db.insert(TABLE_NAME,null,cv);

        cv = new ContentValues();
        cv.put(COL_TITLE,"John Smith");
        cv.put(COL_DETAIL,"เธอเป็นเจ้าหญิงโดยกำเนิดและมีจิตวิญญาณเป็นนักพจญภัย");
        cv.put(COL_TYPE,"7");
        cv.put(COL_PICTURE,"a73.jpg");
        db.insert(TABLE_NAME,null,cv);

        cv = new ContentValues();
        cv.put(COL_TITLE,"Governor Rat Cliffe");
        cv.put(COL_DETAIL,"เธอเป็นเจ้าหญิงโดยกำเนิดและมีจิตวิญญาณเป็นนักพจญภัย");
        cv.put(COL_TYPE,"7");
        cv.put(COL_PICTURE,"a74.jpg");
        db.insert(TABLE_NAME,null,cv);

        //----------------8---------------------------------------------
        //ข้อมูล (หมวด4) 1
        cv = new ContentValues();
        cv.put(COL_TITLE,"Belle");
        cv.put(COL_DETAIL,"หญิงสาวที่รักพ่อและการอ่านหนังสือของเธอเป็นอย่างมากและเป็นหญิงสาวที่โดเด่นในเมือง");
        cv.put(COL_TYPE,"8");
        cv.put(COL_PICTURE,"a81.jpeg");
        db.insert(TABLE_NAME,null,cv);

        cv = new ContentValues();
        cv.put(COL_TITLE,"ฺBeast");
        cv.put(COL_DETAIL,"เจ้าชายองค์หนึ่งที่ถูกสาปให้เป็นอสูรโดยแม่มดเพราะว่าเขาไม่มีความรักในหัวใจ");
        cv.put(COL_TYPE,"8");
        cv.put(COL_PICTURE,"a82.jpeg");
        db.insert(TABLE_NAME,null,cv);

        cv = new ContentValues();
        cv.put(COL_TITLE,"Lumiere");
        cv.put(COL_DETAIL,"ผู้ชายที่ถูกสาปเป็นเชิงเทียนที่มีนิสัยจ้าชู่และมีเสน่ห์ เขาดูแลเบลเป็นอย่างดี");
        cv.put(COL_TYPE,"8");
        cv.put(COL_PICTURE,"a83.jpeg");
        db.insert(TABLE_NAME,null,cv);

        cv = new ContentValues();
        cv.put(COL_TITLE,"Mrs.Potts");
        cv.put(COL_DETAIL,"แม่ครัวถูกสาปเป็นกาน้ำชาที่รักใคร่เลเหมือนลูกสาว");
        cv.put(COL_TYPE,"8");
        cv.put(COL_PICTURE,"a84.jpeg");
        db.insert(TABLE_NAME,null,cv);

        cv = new ContentValues();
        cv.put(COL_TITLE,"Chip");
        cv.put(COL_DETAIL,"ลุกของMrs.Potts ที่ถูกสาปเป็นแก้วน้ำชา ");
        cv.put(COL_TYPE,"8");
        cv.put(COL_PICTURE,"a85.jpeg");
        db.insert(TABLE_NAME,null,cv);

        cv = new ContentValues();
        cv.put(COL_TITLE,"Gaston");
        cv.put(COL_DETAIL,"หนุ่มขี้เก็กในเมืองที่โดนใจสาวทุกคนยกเว้นเบล");
        cv.put(COL_TYPE,"8");
        cv.put(COL_PICTURE,"a86.jpeg");
        db.insert(TABLE_NAME,null,cv);

        cv = new ContentValues();
        cv.put(COL_TITLE,"Maurice");
        cv.put(COL_DETAIL,"พ่อของเบลเป็นนักประดิษฐ์จอมพิสดารทำทุกอย่างเพื่อเบล");
        cv.put(COL_TYPE,"8");
        cv.put(COL_PICTURE,"a87.jpeg");
        db.insert(TABLE_NAME,null,cv);


        //----------------9---------------------------------------------
        //ข้อมูล อาหาร(หมวด4) 1
        cv = new ContentValues();
        cv.put(COL_TITLE,"Jasmine");
        cv.put(COL_DETAIL,"เจ้าหญิงช่างฝัน รักอิสระ มั่นใจในตัวเองและมีความเมตตาต่อผู้อื่น");
        cv.put(COL_TYPE,"9");
        cv.put(COL_PICTURE,"a91.jpeg");
        db.insert(TABLE_NAME,null,cv);

        //ข้อมูล อาหาร(หมวด4) 1
        cv = new ContentValues();
        cv.put(COL_TITLE,"Aladdin");
        cv.put(COL_DETAIL,"โจรหนุ่มข้างถนนที่มีความกล้าหาญหลักแหลมมีไหวพริบ");
        cv.put(COL_TYPE,"9");
        cv.put(COL_PICTURE,"a92w.jpeg");
        db.insert(TABLE_NAME,null,cv);



        cv = new ContentValues();
        cv.put(COL_TITLE,"Abu");
        cv.put(COL_DETAIL,"ลิงจอมป่านเพื่อรักของ Aladin");
        cv.put(COL_TYPE,"9");
        cv.put(COL_PICTURE,"a93.jpeg");
        db.insert(TABLE_NAME,null,cv);

        cv = new ContentValues();
        cv.put(COL_TITLE,"Gennie");
        cv.put(COL_DETAIL,"ผู้มีพลังวิเศษอาศัยอยู่ในตะเกียง");
        cv.put(COL_TYPE,"9");
        cv.put(COL_PICTURE,"a94.jpeg");
        db.insert(TABLE_NAME,null,cv);

        cv = new ContentValues();
        cv.put(COL_TITLE,"Jarfar");
        cv.put(COL_DETAIL,"ขุนนางชั่วช้าเป็นเจ้ากรรมนายเวรของ Aladdin และเขากระหายอำนาจเป็นอย่างมาก");
        cv.put(COL_TYPE,"9");
        cv.put(COL_PICTURE,"a95.jpeg");
        db.insert(TABLE_NAME,null,cv);


        //----------------10---------------------------------------------
        //ข้อมูล อาหาร(หมวด4) 1

        cv = new ContentValues();
        cv.put(COL_TITLE,"Fa Mulan");
        cv.put(COL_DETAIL,"หญิงสาวผู้มีจิตใจแข็งแกร่ง ชอบอิาระอีกทั้งยังกล้าหาญ");
        cv.put(COL_TYPE,"10");
        cv.put(COL_PICTURE,"a101.jpeg");
        db.insert(TABLE_NAME,null,cv);


        cv = new ContentValues();
        cv.put(COL_TITLE,"Li Shang");
        cv.put(COL_DETAIL,"แม่ทัพผู้แข็งแกร่งที่ฝึกความแข็งแกร่งให้กับพลทหารและมู่หลาน");
        cv.put(COL_TYPE,"10");
        cv.put(COL_PICTURE,"a102.png");
        db.insert(TABLE_NAME,null,cv);

        cv = new ContentValues();
        cv.put(COL_TITLE,"Mu shu");
        cv.put(COL_DETAIL,"เทพมังกรสุดป่วนที่ค่อยป่วยและช่วยเหลือมู่หลาน");
        cv.put(COL_TYPE,"10");
        cv.put(COL_PICTURE,"a103.jpg");
        db.insert(TABLE_NAME,null,cv);

        cv = new ContentValues();
        cv.put(COL_TITLE,"Cri-Kee");
        cv.put(COL_DETAIL,"เพื่อนจิ้งหรีดของมู่หลาน");
        cv.put(COL_TYPE,"10");
        cv.put(COL_PICTURE,"a104.jpg");
        db.insert(TABLE_NAME,null,cv);

        cv = new ContentValues();
        cv.put(COL_TITLE,"Shan Yu");
        cv.put(COL_DETAIL,"ตัวรายที่คอยจะยึดครองแผ่นดินจีน");
        cv.put(COL_TYPE,"10");
        cv.put(COL_PICTURE,"a105.jpg");
        db.insert(TABLE_NAME,null,cv);

        //----------------11---------------------------------------------
        //ข้อมูล อาหาร(หมวด4) 1

        cv = new ContentValues();
        cv.put(COL_TITLE,"Snow white");
        cv.put(COL_DETAIL,"หญิงสาวที่อ่อนโยนและใจดี เธอมีริมฝีปากเป็นสีดงดุจกุหลาบผิวขาวราวกับหิมะ");
        cv.put(COL_TYPE,"11");
        cv.put(COL_PICTURE,"a111.jpeg");
        db.insert(TABLE_NAME,null,cv);

        cv = new ContentValues();
        cv.put(COL_TITLE,"Bashful");
        cv.put(COL_DETAIL,"คนแคระขี้อายเมื่อเค้าได้เจอกับสโนว์ไวท์ทำให้เค้าเขินมากกว่าเดิม");
        cv.put(COL_TYPE,"11");
        cv.put(COL_PICTURE,"a112.jpeg");
        db.insert(TABLE_NAME,null,cv);


        cv = new ContentValues();
        cv.put(COL_TITLE,"Doc");
        cv.put(COL_DETAIL,"ผู้ที่ประกาศตนเองว่าเป็นผู้นำของกลุ่ม");
        cv.put(COL_TYPE,"11");
        cv.put(COL_PICTURE,"a113.jpeg");
        db.insert(TABLE_NAME,null,cv);

        cv = new ContentValues();
        cv.put(COL_TITLE,"Dopey");
        cv.put(COL_DETAIL,"คนแคระชอบซุ่มซ่ามเขามักเป็นตัวตลกของกลุ่ม");
        cv.put(COL_TYPE,"11");
        cv.put(COL_PICTURE,"a114.jpeg");
        db.insert(TABLE_NAME,null,cv);

        cv = new ContentValues();
        cv.put(COL_TITLE,"็Happy");
        cv.put(COL_DETAIL,"คนแคระมีบุคคลิกที่มีความสุขตลอดเวลา");
        cv.put(COL_TYPE,"11");
        cv.put(COL_PICTURE,"a115.jpeg");
        db.insert(TABLE_NAME,null,cv);

        cv = new ContentValues();
        cv.put(COL_TITLE,"Sleepy");
        cv.put(COL_DETAIL,"คนแคระขี้เซา หาวได้ทั้งวัน");
        cv.put(COL_TYPE,"11");
        cv.put(COL_PICTURE,"a116.jpeg");
        db.insert(TABLE_NAME,null,cv);


        cv = new ContentValues();
        cv.put(COL_TITLE,"Sneezy");
        cv.put(COL_DETAIL,"คนแคระจอมจามแต่มันก็ไม่ได้ทำให้เค้าไม่สนุก");
        cv.put(COL_TYPE,"11");
        cv.put(COL_PICTURE,"a117.jpeg");
        db.insert(TABLE_NAME,null,cv);

        cv = new ContentValues();
        cv.put(COL_TITLE,"Grumpy");
        cv.put(COL_DETAIL,"คนแคระจอมหงุดหงิดในทุกๆเรื่อง");
        cv.put(COL_TYPE,"11");
        cv.put(COL_PICTURE,"a118.jpeg");
        db.insert(TABLE_NAME,null,cv);

        cv = new ContentValues();
        cv.put(COL_TITLE,"Prince");
        cv.put(COL_DETAIL,"เจ้าชายผู้ที่จุมพิตให้สโนว์ไวท์ตื่นจากนิทรา");
        cv.put(COL_TYPE,"11");
        cv.put(COL_PICTURE,"a119.jpeg");
        db.insert(TABLE_NAME,null,cv);


        cv = new ContentValues();
        cv.put(COL_TITLE,"The Queen");
        cv.put(COL_DETAIL,"ราชินีใจร้ายที่ห่ววงและหวงความงามในโลกนี้ ห้ามมีใครงามกว่าเธอโดยเด็ดขาด");
        cv.put(COL_TYPE,"11");
        cv.put(COL_PICTURE,"a1110.jpeg");
        db.insert(TABLE_NAME,null,cv);

//----------------12------------------------
        cv = new ContentValues();
        cv.put(COL_TITLE,"Elsa");
        cv.put(COL_DETAIL,"เจ้าหญิงผู้มีพลังวิเศษอันแสนหนาวเหน็บ เธอสามารถเสกทุกอย่างให้เป็นน้ำแข็ง");
        cv.put(COL_TYPE,"12");
        cv.put(COL_PICTURE,"a121.jpeg");
        db.insert(TABLE_NAME,null,cv);

        cv = new ContentValues();
        cv.put(COL_TITLE,"Anna");
        cv.put(COL_DETAIL,"น้องสาวแสนร่าเริงของเอลซ่าที่พยายามหาวิธีให้พี่สาวออกมาเล่นกับเธอ");
        cv.put(COL_TYPE,"12");
        cv.put(COL_PICTURE,"a122.jpeg");
        db.insert(TABLE_NAME,null,cv);

        cv = new ContentValues();
        cv.put(COL_TITLE,"Olaf");
        cv.put(COL_DETAIL,"มนุษย์หิมะแสนใจดีที่เอลซ่าเสกขึ้นมา");
        cv.put(COL_TYPE,"12");
        cv.put(COL_PICTURE,"a123.jpeg");
        db.insert(TABLE_NAME,null,cv);

        cv = new ContentValues();
        cv.put(COL_TITLE,"Kristoff");
        cv.put(COL_DETAIL,"ชายหนุ่มที่มีบ้านอาศัยอยู่กลางหิมะโดยมีกวางมูสเป็นเพื่อคู่ใจ");
        cv.put(COL_TYPE,"12");
        cv.put(COL_PICTURE,"a124.jpeg");
        db.insert(TABLE_NAME,null,cv);

        cv = new ContentValues();
        cv.put(COL_TITLE,"Sven");
        cv.put(COL_DETAIL,"กวางมูสแสนฉลาดเป็นเพื่อนคู่ใจของคริสตอฟ");
        cv.put(COL_TYPE,"12");
        cv.put(COL_PICTURE,"a125.jpeg");
        db.insert(TABLE_NAME,null,cv);

        cv = new ContentValues();
        cv.put(COL_TITLE,"Hans");
        cv.put(COL_DETAIL,"เจ้าชายแสนเสน่ห์ที่มีเหล่เหลี่ยมกับอันนา");
        cv.put(COL_TYPE,"12");
        cv.put(COL_PICTURE,"a126.jpeg");
        db.insert(TABLE_NAME,null,cv);

        cv = new ContentValues();
        cv.put(COL_TITLE,"Mashmallow");
        cv.put(COL_DETAIL,"ปีศาจน้ำแข็งอันน่ากลัวที่คอยเฝ้ายามอยู่หน้าปราสาท");
        cv.put(COL_TYPE,"12");
        cv.put(COL_PICTURE,"a127.jpeg");
        db.insert(TABLE_NAME,null,cv);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);//ลบตารางออก
        onCreate(db);
        //แล้วไปปรับ เวอชัน
        //หรือลบแอพทิ้งแล้วรันใหม่ก็ได้
    }
}
