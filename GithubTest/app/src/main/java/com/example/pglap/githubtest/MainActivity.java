package com.example.pglap.githubtest;

import android.database.DataSetObserver;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private String[] listOfNames = {"Arun", "Akash", "Zohar", "Naveen", "Kailash"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void setUpListView() {
        ListView listView = new ListView(this);
        listView.setAdapter(new ListAdapter() {
            @Override
            public boolean areAllItemsEnabled() {
                return false;
            }

            @Override
            public boolean isEnabled(int position) {
                return false;
            }

            @Override
            public void registerDataSetObserver(DataSetObserver observer) {

            }

            @Override
            public void unregisterDataSetObserver(DataSetObserver observer) {

            }

            @Override
            public int getCount() {
                return listOfNames.length;
            }

            @Override
            public Object getItem(int position) {
                return listOfNames[position];
            }

            @Override
            public long getItemId(int position) {
                return (long) position;
            }

            @Override
            public boolean hasStableIds() {
                return true;
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                return null;
            }

            @Override
            public int getItemViewType(int position) {
                return 0;
            }

            @Override
            public int getViewTypeCount() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }
        });
    }
}
