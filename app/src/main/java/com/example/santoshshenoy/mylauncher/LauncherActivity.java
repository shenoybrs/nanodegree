package com.example.santoshshenoy.mylauncher;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class LauncherActivity extends ActionBarActivity implements View.OnClickListener {

    private Button spotifyBt, scoresBt, libraryBt, builtItBt, xyzBt, capstoneBt;
    Toast t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        t = new Toast(getApplicationContext());
        setContentView(R.layout.activity_launcher);
        spotifyBt = (Button) findViewById(R.id.spotify);
        scoresBt = (Button) findViewById(R.id.scores);
        libraryBt = (Button) findViewById(R.id.library);
        builtItBt = (Button) findViewById(R.id.buildit);
        xyzBt = (Button) findViewById(R.id.xyz);
        capstoneBt = (Button) findViewById(R.id.capstone);
        spotifyBt.setOnClickListener(this);
        scoresBt.setOnClickListener(this);
        libraryBt.setOnClickListener(this);
        builtItBt.setOnClickListener(this);
        xyzBt.setOnClickListener(this);
        capstoneBt.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_launcher, menu);
        return true;
    }


    @Override
    public void onClick(View v) {

        String message = "default";

        if (t != null)
            t.cancel();
        switch (v.getId()) {
            case R.id.spotify:
                message = "This button will launch spotify app";
                break;
            case R.id.scores:
                message = "This button will launch scores app";
                break;
            case R.id.library:
                message = "This button will launch library app";
                break;
            case R.id.buildit:
                message = "This button will launch buildit app";
                break;
            case R.id.xyz:
                message = "This button will launch xyz app";
                break;
            case R.id.capstone:
                message = "This button will launch capstone app";
                break;
            default:
                message = "This will never happen";
                break;

        }
        t = Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT);
        t.show();
    }
}
