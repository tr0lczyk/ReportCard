package com.example.android.reportcard;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Mateusz on 14.01.2018.
 */

public class ReportActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.school_list);

        ArrayList<Padawan> padawans = new ArrayList<>();
        padawans.add(new Padawan("Obi-wan","Human",89, 65, 54));
        padawans.add(new Padawan("qui-Gon","Twi'leak",67, 98, 23));
        padawans.add(new Padawan("yoda","Bunta",34, 65, 56));
        padawans.add(new Padawan("Luke","droid",80, 53, 89));
        padawans.add(new Padawan("Charlie","elf",56, 23, 90));
        padawans.add(new Padawan("Obito","hobbit",74, 78, 34));
        padawans.add(new Padawan("Sasuke","dwarf",67, 90, 76));


        ListView listView = (ListView) findViewById(R.id.list);
        PadawanAdapter itemArray = new PadawanAdapter(this, padawans);
        listView.setAdapter(itemArray);



    }
}
