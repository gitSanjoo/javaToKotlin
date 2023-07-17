package com.sanjoo.javatokotlin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.sanjoo.testmodule.TestClass;

public class JavaRecView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_rec_view);

        RecyclerView recyclerView=findViewById(R.id.rec_java);

        TestClass.myName="swami";
    }
}