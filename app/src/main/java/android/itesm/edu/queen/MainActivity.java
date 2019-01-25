package android.itesm.edu.queen;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {


    private Button randomB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        randomB = (Button) findViewById(R.id.randomB);
    }
    private void goSong(String file){
        Intent intent = new Intent(this, SongActivity.class);
        intent.putExtra("file", file);
        startActivity(intent);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 500 && resultCode == RESULT_OK){
            randomB.setText(data.getStringExtra("random"));
        }

    }

    public void sing(View view){
        String file = "";
        switch(view.getId()){
            case R.id.bohemian:
                file = "bohemian";
                goSong(file);
                break;
            case R.id.dont:
                file = "dont";
                goSong(file);
                break;
            case R.id.anotherone:
                file = "dont";
                goSong(file);
                break;
            case R.id.breakfree:
                file = "dont";
                goSong(file);
                break;
            case R.id.flash:
                file = "dont";
                goSong(file);
                break;
            case R.id.randomB:
                String names[] = {"Another One Bites The Dust","Bohemian Rhapsody","I Want To Break Free",
                        "Don´t Stop Me Now", "flash"};

                int alfa = new Random().nextInt(4);
                String value = names[alfa];
                Intent intent = new Intent(this, RandomActivity.class);
                intent.putExtra("song", value);
                startActivity(intent);

                break;
            case R.id.site:
                Uri page = Uri.parse("http://www.android.com");
                Intent web = new Intent(Intent.ACTION_VIEW, page);
                startActivity(web);
                break;


        }

    }
}
