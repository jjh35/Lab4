package com.example.jjh35.lab4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

/**
 * Jesse Hulse, jjh35, lab4 Sept. 30.
 * This lab implements a simple menu
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * This function creates the menu
     *
     * @param menu
     *  the menu for the app
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    /**
     * This function is the action listener for the menu options. If
     * one is pressed, then it will switch activities.
     *
     * @param item
     *  The menu option selected
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch ( item.getItemId() ) {
            case R.id.about :
                startActivity( new Intent( getApplicationContext(), AboutActivity.class ) );
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
