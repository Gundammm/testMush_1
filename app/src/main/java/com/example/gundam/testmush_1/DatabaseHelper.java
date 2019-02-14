package com.example.gundam.testmush_1;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "mushroom.db";
    private static final int DATABASE_VERSION = 1;

    public static final String MUSHROOM_TABLE = "mushroom_table";

    public static final String COL_ID = "_id";
    public static final String COL_THAI = "thai";
    public static final String COL_SCIENCE = "science";
    public static final String COL_IMAGE = "image";
    public static final String COL_TYPE = "type";

    private static final String SQL_CREATE_TABLE_MUSHROOM
            = "CREATE TABLE " + MUSHROOM_TABLE + "("
            + COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + COL_THAI + " TEXT,"
            + COL_SCIENCE + " TEXT,"
            + COL_IMAGE + " TEXT,"
            + COL_TYPE + " TEXT"
            + ")";

    public DatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(SQL_CREATE_TABLE_MUSHROOM);
        ContentValues mr = new ContentValues();
        mr.put(COL_THAI, "เห็ดกรวยเกล็ดทอง");
        mr.put(COL_SCIENCE, "Gomphus floccosus");
        mr.put(COL_IMAGE, "GomphusFloccosus.jpg");
        mr.put(COL_TYPE, "eat");
        db.insert(MUSHROOM_TABLE, null, mr);

        mr = new ContentValues();
        mr.put(COL_THAI, "เห็ดกระดุม");
        mr.put(COL_SCIENCE, "Agaricus bisporus");
        mr.put(COL_IMAGE, "AgaricusBisporus.jpg");
        mr.put(COL_TYPE, "eat");
        db.insert(MUSHROOM_TABLE, null, mr);

        mr = new ContentValues();
        mr.put(COL_THAI, "เห็ดเกล็ดดาว");
        mr.put(COL_SCIENCE, "Amanita pantherina");
        mr.put(COL_IMAGE, "AmanitaPantherina.jpg");
        mr.put(COL_TYPE, "poisonous");
        db.insert(MUSHROOM_TABLE, null, mr);

        mr = new ContentValues();
        mr.put(COL_THAI, "เห็ดขอนสีทองเกล็ดแดง");
        mr.put(COL_SCIENCE, "Gymnopilus Aeruginosus");
        mr.put(COL_IMAGE, "GymnopilusAeruginosus.jpg");
        mr.put(COL_TYPE, "poisonous");
        db.insert(MUSHROOM_TABLE, null, mr);

        mr = new ContentValues();
        mr.put(COL_THAI, "เห็ดข้าวตอก");
        mr.put(COL_SCIENCE, "Termitomyces microcarpus");
        mr.put(COL_IMAGE, "TermitomycesMicrocarpus.jpg");
        mr.put(COL_TYPE, "eat");
        db.insert(MUSHROOM_TABLE, null, mr);

        mr = new ContentValues();
        mr.put(COL_THAI, "เห็ดขี้ควาย");
        mr.put(COL_SCIENCE, "Psilocybe cubensis");
        mr.put(COL_IMAGE, "PsilocybeCubensis.jpg");
        mr.put(COL_TYPE, "poisonous");
        db.insert(MUSHROOM_TABLE, null, mr);

        mr = new ContentValues();
        mr.put(COL_THAI, "เห็ดเข็มทอง");
        mr.put(COL_SCIENCE, "Flammulina velutipes");
        mr.put(COL_IMAGE, "FlammulinaVelutipes.jpg");
        mr.put(COL_TYPE, "eat");
        db.insert(MUSHROOM_TABLE, null, mr);

        mr = new ContentValues();
        mr.put(COL_THAI, "เห็ดไข่หงส์");
        mr.put(COL_SCIENCE, "Scleroderma citrinum");
        mr.put(COL_IMAGE, "SclerodermaCitrinum.jpg");
        mr.put(COL_TYPE, "poisonous");
        db.insert(MUSHROOM_TABLE, null, mr);

        mr = new ContentValues();
        mr.put(COL_THAI, "เห็ดโคนญี่ปุ่น");
        mr.put(COL_SCIENCE, "Agrocybe aegerita");
        mr.put(COL_IMAGE, "AgrocybeAegerita.jpg");
        mr.put(COL_TYPE, "eat");
        db.insert(MUSHROOM_TABLE, null, mr);

        mr = new ContentValues();
        mr.put(COL_THAI, "เห็ดจมูกหมู");
        mr.put(COL_SCIENCE, "Galiella rufa");
        mr.put(COL_IMAGE, "GaliellaRufa.jpg");
        mr.put(COL_TYPE, "eat");
        db.insert(MUSHROOM_TABLE, null, mr);

        mr = new ContentValues();
        mr.put(COL_THAI, "เห็ดจาวมะพร้าว");
        mr.put(COL_SCIENCE, "Calvatia craniformis");
        mr.put(COL_IMAGE, "CalvatiaCraniformis.jpg");
        mr.put(COL_TYPE, "eat");
        db.insert(MUSHROOM_TABLE, null, mr);

        mr = new ContentValues();
        mr.put(COL_THAI, "เห็ดชงโค");
        mr.put(COL_SCIENCE, "Clitocybe nuda");
        mr.put(COL_IMAGE, "ClitocybeNuda.jpg");
        mr.put(COL_TYPE, "eat");
        db.insert(MUSHROOM_TABLE, null, mr);

        mr = new ContentValues();
        mr.put(COL_THAI, "เห็ดชิเมะจิ");
        mr.put(COL_SCIENCE, "Hypsizygus marmoreus");
        mr.put(COL_IMAGE, "HypsizygusMarmoreus.jpg");
        mr.put(COL_TYPE, "eat");
        db.insert(MUSHROOM_TABLE, null, mr);

        mr = new ContentValues();
        mr.put(COL_THAI, "เห็ดซังขนุน");
        mr.put(COL_SCIENCE, "Clavulinopsis fusiformis");
        mr.put(COL_IMAGE, "ClavulinopsisFusiformis.jpg");
        mr.put(COL_TYPE, "eat");
        db.insert(MUSHROOM_TABLE, null, mr);

        mr = new ContentValues();
        mr.put(COL_THAI, "เห็ดแดงน้ำหมาก ");
        mr.put(COL_SCIENCE, "Russula emetica");
        mr.put(COL_IMAGE, "RussulaEmetica.jpg");
        mr.put(COL_TYPE, "poisonous");
        db.insert(MUSHROOM_TABLE, null, mr);

        mr = new ContentValues();
        mr.put(COL_THAI, "เห็ดตีนตุ๊กแก");
        mr.put(COL_SCIENCE, "Schizophyllum commune");
        mr.put(COL_IMAGE, "SchizophyllumCommune.jpg");
        mr.put(COL_TYPE, "eat");
        db.insert(MUSHROOM_TABLE, null, mr);

        mr = new ContentValues();
        mr.put(COL_THAI, "เห็ดถั่งเช่า");
        mr.put(COL_SCIENCE, "Ophiocordyceps sinensis");
        mr.put(COL_IMAGE, "OphiocordycepsSinensis.jpg");
        mr.put(COL_TYPE, "eat");
        db.insert(MUSHROOM_TABLE, null, mr);

        mr = new ContentValues();
        mr.put(COL_THAI, "เห็ดถ่านเล็ก");
        mr.put(COL_SCIENCE, "Russula densifolia");
        mr.put(COL_IMAGE, "RussulaDensifolia.jpg");
        mr.put(COL_TYPE, "eat");
        db.insert(MUSHROOM_TABLE, null, mr);

        mr = new ContentValues();
        mr.put(COL_THAI, "เห็ดถ่านใหญ่");
        mr.put(COL_SCIENCE, "Russula nigricans");
        mr.put(COL_IMAGE, "RussulaNigricans.jpg");
        mr.put(COL_TYPE, "eat");
        db.insert(MUSHROOM_TABLE, null, mr);

        mr = new ContentValues();
        mr.put(COL_THAI, "เห็ดนางฟ้า");
        mr.put(COL_SCIENCE, "Pleurotus pulmonarius");
        mr.put(COL_IMAGE, "PleurotusPulmonarius.jpg");
        mr.put(COL_TYPE, "eat");
        db.insert(MUSHROOM_TABLE, null, mr);

        mr = new ContentValues();
        mr.put(COL_THAI, "เห็ดนางรมทอง");
        mr.put(COL_SCIENCE, "Pleurotus citrinopileatus");
        mr.put(COL_IMAGE, "PleurotusCitrinopileatus.jpg");
        mr.put(COL_TYPE, "eat");
        db.insert(MUSHROOM_TABLE, null, mr);

        mr = new ContentValues();
        mr.put(COL_THAI, "เห็ดน้ำหมึก");
        mr.put(COL_SCIENCE, "Coprinus cinerea");
        mr.put(COL_IMAGE, "CoprinopsisCinerea.JPG");
        mr.put(COL_TYPE, "eat");
        db.insert(MUSHROOM_TABLE, null, mr);

        mr = new ContentValues();
        mr.put(COL_THAI, "เห็ดเนยแม่มด");
        mr.put(COL_SCIENCE, "Tremella mesenterica");
        mr.put(COL_IMAGE, "TremellaMesenterica.jpg");
        mr.put(COL_TYPE, "eat");
        db.insert(MUSHROOM_TABLE, null, mr);

        mr = new ContentValues();
        mr.put(COL_THAI, "เห็ดปอดดำ");
        mr.put(COL_SCIENCE, "Strobilomyces floccopus");
        mr.put(COL_IMAGE, "StrobilomycesFloccopus.jpg");
        mr.put(COL_TYPE, "eat");
        db.insert(MUSHROOM_TABLE, null, mr);

        mr = new ContentValues();
        mr.put(COL_THAI, "เห็ดปะการังพวงแสด");
        mr.put(COL_SCIENCE, "Clavulinopsis miyabeana");
        mr.put(COL_IMAGE, "ClavulinopsisMiyabeana.jpg");
        mr.put(COL_TYPE, "eat");
        db.insert(MUSHROOM_TABLE, null, mr);

        mr = new ContentValues();
        mr.put(COL_THAI, "เห็ดปะการังส้มอมชมพู");
        mr.put(COL_SCIENCE, "Ramaria formosa");
        mr.put(COL_IMAGE, "RamariaFormosa.jpg");
        mr.put(COL_TYPE, "poisonous");
        db.insert(MUSHROOM_TABLE, null, mr);

        mr = new ContentValues();
        mr.put(COL_THAI, "เห็ดปุยฝ้าย");
        mr.put(COL_SCIENCE, "Hericium erinaceus");
        mr.put(COL_IMAGE, "HericiumErinaceus.jpg");
        mr.put(COL_TYPE, "eat");
        db.insert(MUSHROOM_TABLE, null, mr);

        mr = new ContentValues();
        mr.put(COL_THAI, "เห็ดเป๋าฮื้อ");
        mr.put(COL_SCIENCE, "Pleurotus ostreatus");
        mr.put(COL_IMAGE, "PleurotusOstreatus.JPG");
        mr.put(COL_TYPE, "eat");
        db.insert(MUSHROOM_TABLE, null, mr);

        mr = new ContentValues();
        mr.put(COL_THAI, "เห็ดเผาะ");
        mr.put(COL_SCIENCE, "Astraeus hygrometricus");
        mr.put(COL_IMAGE, "AstraeusHygrometricus.jpg");
        mr.put(COL_TYPE, "eat");
        db.insert(MUSHROOM_TABLE, null, mr);

        mr = new ContentValues();
        mr.put(COL_THAI, "เห็ดพายทอง");
        mr.put(COL_SCIENCE, "Dacryopinax spathularia");
        mr.put(COL_IMAGE, "DacryopinaxSpathularia.jpg");
        mr.put(COL_TYPE, "eat");
        db.insert(MUSHROOM_TABLE, null, mr);

        mr = new ContentValues();
        mr.put(COL_THAI, "เห็ดพุงหมู");
        mr.put(COL_SCIENCE, "Russula foetens");
        mr.put(COL_IMAGE, "RussulaFoetens.JPG");
        mr.put(COL_TYPE, "poisonous");
        db.insert(MUSHROOM_TABLE, null, mr);

        mr = new ContentValues();
        mr.put(COL_THAI, "เห็ดฟานน้ำตาลแดง");
        mr.put(COL_SCIENCE, "Lactarius volemus");
        mr.put(COL_IMAGE, "LactariusVolemus.jpg");
        mr.put(COL_TYPE, "eat");
        db.insert(MUSHROOM_TABLE, null, mr);

        mr = new ContentValues();
        mr.put(COL_THAI, "เห็ดเฟืองล้อสีส้ม");
        mr.put(COL_SCIENCE, "Marasmius siccus");
        mr.put(COL_IMAGE, "MarasmiusSiccus.jpg");
        mr.put(COL_TYPE, "eat");
        db.insert(MUSHROOM_TABLE, null, mr);

        mr = new ContentValues();
        mr.put(COL_THAI, "เห็ดมิลค์กี้");
        mr.put(COL_SCIENCE, "Calocybe Indica");
        mr.put(COL_IMAGE, "CalocybeIndica.jpg");
        mr.put(COL_TYPE, "eat");
        db.insert(MUSHROOM_TABLE, null, mr);

        mr = new ContentValues();
        mr.put(COL_THAI, "เห็ดไมตาเกะ");
        mr.put(COL_SCIENCE, "Grifola frondosa");
        mr.put(COL_IMAGE, "GrifolaFrondosa.jpg");
        mr.put(COL_TYPE, "eat");
        db.insert(MUSHROOM_TABLE, null, mr);

        mr = new ContentValues();
        mr.put(COL_THAI, "เห็ดเยื่อไผ่ (เห็ดร่างแห)");
        mr.put(COL_SCIENCE, "Phallus indusiatus");
        mr.put(COL_IMAGE, "PhallusIndusiatus.jpg");
        mr.put(COL_TYPE, "eat");
        db.insert(MUSHROOM_TABLE, null, mr);

        mr = new ContentValues();
        mr.put(COL_THAI, "เห็ดระโงกแดงอมส้ม");
        mr.put(COL_SCIENCE, "Amanita caesarea");
        mr.put(COL_IMAGE, "AmanitaCaesarea.jpg");
        mr.put(COL_TYPE, "eat");
        db.insert(MUSHROOM_TABLE, null, mr);

        mr = new ContentValues();
        mr.put(COL_THAI, "เห็ดระโงกหิน");
        mr.put(COL_SCIENCE, "Amanita phalloides");
        mr.put(COL_IMAGE, "AmanitaPhalloides.jpg");
        mr.put(COL_TYPE, "poisonous");
        db.insert(MUSHROOM_TABLE, null, mr);

        mr = new ContentValues();
        mr.put(COL_THAI, "เห็ดระโงกหิน เห็ดไข่ตายซาก");
        mr.put(COL_SCIENCE, "Amanita virosa");
        mr.put(COL_IMAGE, "AmanitaVirosa.jpg");
        mr.put(COL_TYPE, "poisonous");
        db.insert(MUSHROOM_TABLE, null, mr);

        mr = new ContentValues();
        mr.put(COL_THAI, "เห็ดร่างแหกระโปรงยาวสีเหลือง");
        mr.put(COL_SCIENCE, "Dictyophora indusiata");
        mr.put(COL_IMAGE, "DictyophoraIndusiata.jpg");
        mr.put(COL_TYPE, "eat");
        db.insert(MUSHROOM_TABLE, null, mr);

        mr = new ContentValues();
        mr.put(COL_THAI, "เห็ดร่างแหสั้นขาว");
        mr.put(COL_SCIENCE, "Dictyophora duplicata");
        mr.put(COL_IMAGE, "DictyophoraDuplicata.jpg");
        mr.put(COL_TYPE, "eat");
        db.insert(MUSHROOM_TABLE, null, mr);

        mr = new ContentValues();
        mr.put(COL_THAI, "เห็ดรูประฆัง");
        mr.put(COL_SCIENCE, "Coprinus atramentarius");
        mr.put(COL_IMAGE, "CoprinusAtramentarius.jpg");
        mr.put(COL_TYPE, "poisonous");
        db.insert(MUSHROOM_TABLE, null, mr);

        mr = new ContentValues();
        mr.put(COL_THAI, "เห็ดลม");
        mr.put(COL_SCIENCE, "Lentinus polychrous");
        mr.put(COL_IMAGE, "LentinusPolychrous.jpg");
        mr.put(COL_TYPE, "eat");
        db.insert(MUSHROOM_TABLE, null, mr);

        mr = new ContentValues();
        mr.put(COL_THAI, "เห็ดสมองวัว");
        mr.put(COL_SCIENCE, "Gyromitra esculenta");
        mr.put(COL_IMAGE, "GyromitraEsculenta.jpg");
        mr.put(COL_TYPE, "poisonous");
        db.insert(MUSHROOM_TABLE, null, mr);

        mr = new ContentValues();
        mr.put(COL_THAI, "เห็ดหนอนขาว");
        mr.put(COL_SCIENCE, "Clavaria fragilis");
        mr.put(COL_IMAGE, "ClavariaFragilis.jpg");
        mr.put(COL_TYPE, "eat");
        db.insert(MUSHROOM_TABLE, null, mr);

        mr = new ContentValues();
        mr.put(COL_THAI, "เห็ดหล่มกระเขียว");
        mr.put(COL_SCIENCE, "Russula virescens");
        mr.put(COL_IMAGE, "RussulaVirescens.jpg");
        mr.put(COL_TYPE, "eat");
        db.insert(MUSHROOM_TABLE, null, mr);

        mr = new ContentValues();
        mr.put(COL_THAI, "เห็ดหล่มขาว");
        mr.put(COL_SCIENCE, "Russula delica");
        mr.put(COL_IMAGE, "RussulaDelica.jpg");
        mr.put(COL_TYPE, "eat");
        db.insert(MUSHROOM_TABLE, null, mr);

        mr = new ContentValues();
        mr.put(COL_THAI, "เห็ดหล่มเหลือง");
        mr.put(COL_SCIENCE, "Russula flavida");
        mr.put(COL_IMAGE, "RussulaFlavida.jpg");
        mr.put(COL_TYPE, "eat");
        db.insert(MUSHROOM_TABLE, null, mr);

        mr = new ContentValues();
        mr.put(COL_THAI, "เห็ดหลินจือ");
        mr.put(COL_SCIENCE, "Ganoderma lucidum");
        mr.put(COL_IMAGE, "GanodermaIucidum.jpg");
        mr.put(COL_TYPE, "eat");
        db.insert(MUSHROOM_TABLE, null, mr);

        mr = new ContentValues();
        mr.put(COL_THAI, "เห็ดหอม");
        mr.put(COL_SCIENCE, "Lentinula edodes");
        mr.put(COL_IMAGE, "LentinulaEdodes.jpg");
        mr.put(COL_TYPE, "eat");
        db.insert(MUSHROOM_TABLE, null, mr);

        mr = new ContentValues();
        mr.put(COL_THAI, "เห็ดหัวกรวดครีบเขียว");
        mr.put(COL_SCIENCE, "Chlorophyllum molybdites");
        mr.put(COL_IMAGE, "ChlorophyllumMolybdites.jpg");
        mr.put(COL_TYPE, "poisonous");
        db.insert(MUSHROOM_TABLE, null, mr);

        mr = new ContentValues();
        mr.put(COL_THAI, "เห็ดตับเต่า");
        mr.put(COL_SCIENCE, "Phlebopus marginatus");
        mr.put(COL_IMAGE, "PhlebopusMarginatus.jpg");
        mr.put(COL_TYPE, "eat");
        db.insert(MUSHROOM_TABLE, null, mr);

        mr = new ContentValues();
        mr.put(COL_THAI, "เห็ดหูช้าง");
        mr.put(COL_SCIENCE, "Ganoderma applanatum");
        mr.put(COL_IMAGE, "GanodermaApplanatum.jpg");
        mr.put(COL_TYPE, "eat");
        db.insert(MUSHROOM_TABLE, null, mr);

        mr = new ContentValues();
        mr.put(COL_THAI, "เห็ดหูหนูขาว");
        mr.put(COL_SCIENCE, "Tremella fuciformis");
        mr.put(COL_IMAGE, "TremellaFuciformis.jpg");
        mr.put(COL_TYPE, "eat");
        db.insert(MUSHROOM_TABLE, null, mr);

        mr = new ContentValues();
        mr.put(COL_THAI, "เห็ดหูหนูดำ");
        mr.put(COL_SCIENCE, "Auricularia auricula");
        mr.put(COL_IMAGE, "AuriculariaAuricula.JPG");
        mr.put(COL_TYPE, "eat");
        db.insert(MUSHROOM_TABLE, null, mr);

        mr = new ContentValues();
        mr.put(COL_THAI, "เห็ดหูหนูรวงผึ้ง");
        mr.put(COL_SCIENCE, "Auricularia delicata");
        mr.put(COL_IMAGE, "AuriculariaDelicata.jpg");
        mr.put(COL_TYPE, "eat");
        db.insert(MUSHROOM_TABLE, null, mr);

        mr = new ContentValues();
        mr.put(COL_THAI, "เห็ดหูหนูลายเสือ");
        mr.put(COL_SCIENCE, "Auricularia mesenterica");
        mr.put(COL_IMAGE, "AuriculariaMesenterica.jpg");
        mr.put(COL_TYPE, "eat");
        db.insert(MUSHROOM_TABLE, null, mr);

        mr = new ContentValues();
        mr.put(COL_THAI, "เห็ดออรินจิ");
        mr.put(COL_SCIENCE, "Pleurotus eryngii");
        mr.put(COL_IMAGE, "PleurotusEryngii.jpg");
        mr.put(COL_TYPE, "eat");
        db.insert(MUSHROOM_TABLE, null, mr);


    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

}
