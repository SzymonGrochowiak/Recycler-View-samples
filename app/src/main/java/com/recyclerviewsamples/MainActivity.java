package com.recyclerviewsamples;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.recyclerviewsamples.adpaters.MultipleViewTypeRecyclerViewAdapter;
import com.recyclerviewsamples.model.FirstTypeElement;
import com.recyclerviewsamples.model.RecyclerElement;
import com.recyclerviewsamples.model.SecondTypeElement;
import com.recyclerviewsamples.model.ThirdTypeElement;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity {

    private TextView multipleViewTypeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        multipleViewTypeTextView = (TextView) findViewById(R.id.multipleViewTypeTextView);
        multipleViewTypeTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RecyclerViewActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
