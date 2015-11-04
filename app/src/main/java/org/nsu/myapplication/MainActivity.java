package org.nsu.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //String[] names = new String[]{"Atiar", "Saadman","Jabir","Arabi","Naheena","Nafis","Salat","Saiful"};
        ListView listView = (ListView)findViewById(R.id.list);

        PersonItem atiar = new PersonItem("Atiar","Swajan",R.drawable.panda, "CSE");
        PersonItem jabir = new PersonItem("Kamal","Jabir",R.drawable.monkey, "CSE");
        PersonItem nafis = new PersonItem("Nafis","UI",R.drawable.cat, "CSE");
        PersonItem sadman = new PersonItem("Sadman", "Shahid", R.drawable.pup, "CSE");
        PersonItem arabi = new PersonItem("Ahmed","Arabi",R.drawable.panda, "EEE");
        PersonItem naheena = new PersonItem("Chowdhury","Naheena",R.drawable.monkey, "ETE");
        PersonItem salat = new PersonItem("Kayem","Salat",R.drawable.pup, "BBA");
        PersonItem saiful = new PersonItem("Islam","Saiful",R.drawable.cat, "ENV");

        ArrayList<PersonItem> personItems = new ArrayList<>();
        personItems.add(atiar);
        personItems.add(jabir);
        personItems.add(nafis);
        personItems.add(sadman);
        personItems.add(arabi);
        personItems.add(naheena);
        personItems.add(salat);
        personItems.add(saiful);

        PersonAdapter nameAdapter =
                new PersonAdapter(this, personItems);

        listView.setAdapter(nameAdapter);
    }
}
