package org.nsu.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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

        PersonItem atiar = new PersonItem("Atiar","Swajan",R.drawable.panda, "CSE", 21, 5.8, "http://fb.com/gxabir");
        PersonItem jabir = new PersonItem("Kamal","Jabir",R.drawable.monkey, "CSE", 21, 5.6, "http://fb.com/gxabir");
        PersonItem nafis = new PersonItem("Nafis","UI",R.drawable.cat, "CSE", 25, 5.11, "http://fb.com/gxabir");
        PersonItem sadman = new PersonItem("Sadman", "Shahid", R.drawable.pup, "CSE", 21, 5.11, "http://fb.com/gxabir");
        PersonItem arabi = new PersonItem("Ahmed","Arabi",R.drawable.panda, "EEE", 24, 5.9, "http://fb.com/gxabir");
        PersonItem naheena = new PersonItem("Chowdhury","Naheena",R.drawable.monkey, "ETE", 23, 5.5, "http://fb.com/gxabir");
        PersonItem salat = new PersonItem("Kayem","Salat",R.drawable.pup, "BBA", 22, 5.5, "http://fb.com/gxabir");
        PersonItem saiful = new PersonItem("Islam","Saiful",R.drawable.cat, "ENV", 23, 5.7, "http://fb.com/gxabir");

        final ArrayList<PersonItem> personItems = new ArrayList<>();
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

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                PersonItem personItem = personItems.get(i);

                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("nameKEY", personItem.name);
                intent.putExtra("nNameKEY", personItem.nickName);
                intent.putExtra("deptKEY", personItem.dept);
                intent.putExtra("imageKEY", personItem.imageResId);
                intent.putExtra("ageKEY", personItem.age);
                intent.putExtra("heightKEY", personItem.height);
                intent.putExtra("webKEY", personItem.webpage);
                startActivity(intent);

                //Toast.makeText(MainActivity.this, "I Clicked name " + pName, Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void add(View view)
    {
        Intent intent = new Intent(MainActivity.this, Main22Activity.class);
        startActivity(intent);
    }
}
