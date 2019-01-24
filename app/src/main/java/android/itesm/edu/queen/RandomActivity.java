package android.itesm.edu.queen;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RandomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random);
    }
    public void done(View view){
        Intent intent = new Intent();
        String names[] = {"Another One Bites The Dust","Bohemian Rhapsody","I Want To Break Free",
                "Don´t Stop Me Now", "flash"};
        int alfa = ((int)(Math.random()* 100));
        String value = names[alfa];
        ((TextView)findViewById(R.id.textView)).setText(value);
        intent.putExtra("random", value);
        setResult(Activity.RESULT_OK, intent);
        finish();
    }
}
