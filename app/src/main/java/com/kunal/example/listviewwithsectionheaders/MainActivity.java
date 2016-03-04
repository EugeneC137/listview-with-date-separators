package com.kunal.example.listviewwithsectionheaders;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private ListAdapter mAdapter;
    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = (ListView) findViewById(R.id.mylist);

        mAdapter = new ListAdapter(this);
        //create a single item

        //TODAY
        Item item1 = new Item("Kunal", "9080706050", "Today");
        mAdapter.addSectionHeaderItem(item1);
        mAdapter.addItem(item1);

        //TOMORROW
        Item item2 = new Item("Hitesh", "9182736455", "Tomorrow");
        mAdapter.addSectionHeaderItem(item2);
        mAdapter.addItem(item2);
        Item item3 = new Item("Pradeep", "9876543210", "Tomorrow");
        mAdapter.addItem(item3);
        Item item4 = new Item("Pradeep", "9876543210", "Tomorrow");
        mAdapter.addItem(item4);

        //6 MARCH 2016
        Item item5 = new Item("Hitesh", "9182736455", "6 March 2016");
        mAdapter.addSectionHeaderItem(item5);
        mAdapter.addItem(item5);
        Item item6 = new Item("Pradeep", "9876543210", "6 March 2016");
        mAdapter.addItem(item6);
        Item item7 = new Item("Pradeep", "9876543210", "6 March 2016");
        mAdapter.addItem(item7);






        mListView.setAdapter(mAdapter);
    }
}
