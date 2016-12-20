package com.example.martinosorio.mixedhomework;

import android.content.Intent;
import android.preference.PreferenceFragment;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Toast;

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
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setMessage("Do you like iOS?");
        alertDialogBuilder.setNegativeButton("Nah", null);
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }

    public void onPrefsClick(View view) {
        Intent intent = new Intent(this, PrefsActivity.class);
        startActivity(intent);
    }


    public void onFragmentClick(View view) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        GhostFragment ghostFragment = new GhostFragment();
        fragmentTransaction.add(ghostFragment, "myTAG");
        fragmentTransaction.commit();
    }

    public static class GhostFragment extends Fragment {
        public GhostFragment() {
            // Required empty public constructor
        }

        @Override
        public void onStart() {
            super.onStart();
            Toast.makeText(getActivity(), "OooOoOooo I am a GHOST FRAMEEEEENT!!!", Toast.LENGTH_SHORT).show();
        }
    }
}
