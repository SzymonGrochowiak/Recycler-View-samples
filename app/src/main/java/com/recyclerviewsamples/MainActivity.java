package com.recyclerviewsamples;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import com.recyclerviewsamples.adpaters.MultipleViewTypeRecyclerViewAdapter;
import com.recyclerviewsamples.model.FirstTypeElement;
import com.recyclerviewsamples.model.RecyclerElement;
import com.recyclerviewsamples.model.SecondTypeElement;
import com.recyclerviewsamples.model.ThirdTypeElement;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private List<RecyclerElement> mElementList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        addElementsToSampleList();
        addElementsToSampleList();
        addElementsToSampleList();
        addElementsToSampleList();

        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new MultipleViewTypeRecyclerViewAdapter(mElementList, this);
        mRecyclerView.setAdapter(mAdapter);
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

    private void addElementsToSampleList() {
        mElementList.add(new FirstTypeElement("Sample text for first type view",
                "http://i3.kym-cdn.com/photos/images/original/000/406/325/b31.jpg"));
        mElementList.add(new SecondTypeElement("Sample text for second type view"));
        mElementList.add(new SecondTypeElement("Another sample text for second type view"));
        mElementList.add(new SecondTypeElement("And one more"));
        mElementList.add(new FirstTypeElement("Some text!!!", "http://i3.kym-cdn.com/photos/images/original/000/406/325/b31.jpg"));
        mElementList.add(new ThirdTypeElement(25, 100));
        mElementList.add(new FirstTypeElement("Some text!!!", "http://i2.kym-cdn.com/photos/images/newsfeed/000/406/325/b31.jpg"));
        mElementList.add(new ThirdTypeElement(45, 100));
        mElementList.add(new ThirdTypeElement(75, 100));
        mElementList.add(new FirstTypeElement("Some text!!!", "http://i2.kym-cdn.com/photos/images/newsfeed/000/406/325/b31.jpg"));
    }
}
