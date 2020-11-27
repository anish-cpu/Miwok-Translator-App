package android.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //on clicking the numbers view
        TextView numbers = (TextView)findViewById(R.id.numbers);
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numIntent = new Intent(MainActivity.this,NumbersActivity.class);
                startActivity(numIntent);
            }
        });

        //on clicking the colors view
        TextView colors = (TextView)findViewById(R.id.colors);
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numIntent = new Intent(MainActivity.this,ColorsActivity.class);
                startActivity(numIntent);
            }
        });

        //on clicking the family view
        TextView family = (TextView)findViewById(R.id.family);
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numIntent = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(numIntent);
            }
        });

        //on clicking the phrases view
        TextView phrases = (TextView)findViewById(R.id.phrases);
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(numIntent);
            }
        });
    }
}