package com.example.sockdack_app;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.AdapterView;
import android.widget.TextView;

import java.util.ArrayList;


/*
 * A simple {@link Fragment} subclass.
 * Use the {@link MyLibrary#newInstance} factory method to
 * create an instance of this fragment.
 */

public class MyLibrary extends Fragment {

    ListView listView;
    ListViewAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_my_library, container, false);

    }
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        listView = view.findViewById(R.id.booklist);

        adapter = new ListViewAdapter();
        adapter.addItem(new ListItem("여행 이야기", "강서현", getResources().getDrawable(R.drawable.book_icon)));
        adapter.addItem(new ListItem("말센스", "김성환", getResources().getDrawable(R.drawable.book_icon)));

        listView.setAdapter(adapter);
    }

}