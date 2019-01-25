package android.itesm.edu.queen;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RandomActivity extends AppCompatActivity {

    private String randomSong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random);
        randomSong = getIntent().getStringExtra("song");
        ((TextView)findViewById(R.id.textView)).setText(randomSong);

    }

    public void done(View view){
        Intent intent = new Intent(this, SongActivity.class);
        intent.putExtra("file", randomSong);
        startActivity(intent);
    }

}
