package com.example.martinosorio.mixedhomework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_activity_menu, menu);
        //super.onCreateOptionsMenu(menu);
        //menu.add("Home").setIcon(R.drawable.one);
        return true;
    }

    public void onDialogClick(View view) {
    }

    public void onFragmentClick(View view) {
    }

    public void onPrefsClick(View view) {
    }
}
