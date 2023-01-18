package com.example.homworc_3_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private ArrayList<String> name = new ArrayList<>();
private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        NameAdapter adapter = new NameAdapter(name);
        recyclerView.setAdapter(adapter);

        LoadData();
    }

    private void LoadData() {
name.add("jscsj");
name.add("jscsj");
name.add("jscsj");
name.add("jscsj");
name.add("jscsj");
name.add("jscsj");
name.add("jscsj");
name.add("jscsj");
name.add("jscsj");
name.add("jscsj");
name.add("jscsj");
name.add("`jscsj");
    }
}