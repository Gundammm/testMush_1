package com.example.gundam.testmush_1;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import static com.example.gundam.testmush_1.DatabaseHelper.COL_ID;
import static com.example.gundam.testmush_1.DatabaseHelper.COL_IMAGE;
import static com.example.gundam.testmush_1.DatabaseHelper.COL_SCIENCE;
import static com.example.gundam.testmush_1.DatabaseHelper.COL_THAI;
import static com.example.gundam.testmush_1.DatabaseHelper.COL_TYPE;
import static com.example.gundam.testmush_1.DatabaseHelper.MUSHROOM_TABLE;

public class Main2Activity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getName();

    private DatabaseHelper mHelper;
    private SQLiteDatabase mDb;
    private List<MushroomItem> mMushroomItemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mHelper = new DatabaseHelper(Main2Activity.this);
        mDb = mHelper.getWritableDatabase();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
        loadPhoneData();
        setupListView();
    }

    private void loadPhoneData(){

        Cursor c = mDb.query(MUSHROOM_TABLE, null, null, null, null, null, null);
        mMushroomItemList = new ArrayList<>();
        while (c.moveToNext()) {
            long id = c.getLong(c.getColumnIndex(COL_ID));
            String thai = c.getString(c.getColumnIndex(COL_THAI));
            String science = c.getString(c.getColumnIndex(COL_SCIENCE));
            String image = c.getString(c.getColumnIndex(COL_IMAGE));
            String type = c.getString(c.getColumnIndex(COL_TYPE));

            MushroomItem item = new MushroomItem(id, thai, science, image, type);
            mMushroomItemList.add(item);
        }
        c.close();
    }

    private void setupListView(){
        MushroomListAdapter adapter = new MushroomListAdapter(
                Main2Activity.this,
                R.layout.item_mushroom,
                mMushroomItemList
        );
        ListView lv = findViewById(R.id.result_list_view);
        lv.setAdapter(adapter);
    }


}
