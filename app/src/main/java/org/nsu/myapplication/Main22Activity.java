package org.nsu.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class Main22Activity extends AppCompatActivity {

    EditText name, nName, dept, age, height, webpage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);
        name = (EditText)findViewById(R.id.name);
        name = (EditText)findViewById(R.id.name);
        name = (EditText)findViewById(R.id.name);
        name = (EditText)findViewById(R.id.name);
        name = (EditText)findViewById(R.id.name);
    }


    public void submit(View view)
    {

    }
}
