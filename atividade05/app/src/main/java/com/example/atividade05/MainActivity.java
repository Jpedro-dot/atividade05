package com.example.atividade05;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.atividade05.LineAdapter;
import com.example.atividade05.view;

import java.util.ArrayList;

public class LinearLayoutActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;

    private LineAdapter mAdapter;

    private void setupRecycler() {

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);

        mAdapter = new LineAdapter(new ArrayList<Object>(0));
        mRecyclerView.setAdapter(mAdapter);

        mRecyclerView.addItemDecoration(
                new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
    }
}
    view rawLinearLayoutVerticalActivity.java hosted with ❤ by GitHub
