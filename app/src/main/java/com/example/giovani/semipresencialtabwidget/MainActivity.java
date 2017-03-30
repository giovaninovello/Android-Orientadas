package com.example.giovani.semipresencialtabwidget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabhost = (TabHost) findViewById(R.id.tabhost);
        tabhost.setup();

        TabHost.TabSpec aba1 =tabhost.newTabSpec("primeira");
        aba1.setContent(R.id.tab1);
        aba1.setIndicator("Primeira");


        TabHost.TabSpec aba2 =tabhost.newTabSpec("segunda");
        aba1.setContent(R.id.tab2);
        aba1.setIndicator("Sefgunda");


        TabHost.TabSpec aba3 =tabhost.newTabSpec("terceira");
        aba1.setContent(R.id.tab3);
        aba1.setIndicator("Terceira");

        tabhost.addTab(aba1);
        tabhost.addTab(aba2);
        tabhost.addTab(aba3);


    }
}