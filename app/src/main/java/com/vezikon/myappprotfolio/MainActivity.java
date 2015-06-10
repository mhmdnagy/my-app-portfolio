package com.vezikon.myappprotfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.InjectView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //UI
    @InjectView(R.id.btn_spotify_streamer)
    Button btnSpotifyStreamer;
    @InjectView(R.id.btn_scores_app)
    Button btnScoresApp;
    @InjectView(R.id.btn_library_app)
    Button btnLibraryApp;
    @InjectView(R.id.btn_build_it_bigger)
    Button btnBuildItBigger;
    @InjectView(R.id.btn_xyz_reader)
    Button btnXyzReader;
    @InjectView(R.id.btn_capstone)
    Button btnCapstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);

        //setting onClickListeners
        btnSpotifyStreamer.setOnClickListener(this);
        btnScoresApp.setOnClickListener(this);
        btnLibraryApp.setOnClickListener(this);
        btnBuildItBigger.setOnClickListener(this);
        btnXyzReader.setOnClickListener(this);
        btnCapstone.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.btn_spotify_streamer:
                showMessage("This button will launch my Spotfiy Streamer App");
                break;
            case R.id.btn_build_it_bigger:
                showMessage("This button will launch my Build it Bigger App");
                break;
            case R.id.btn_capstone:
                showMessage("This button will launch my Capstone App");
                break;
            case R.id.btn_library_app:
                showMessage("This button will launch my Library App");
                break;
            case R.id.btn_scores_app:
                showMessage("This button will launch my Scores App");
                break;
            case R.id.btn_xyz_reader:
                showMessage("This button will launch my XYZ Reader App");
                break;
        }
    }

    private void showMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
