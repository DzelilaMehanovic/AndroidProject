package ba.edu.ibu.cankid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import static android.R.attr.data;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button colorButton = (Button) findViewById(R.id.button_colors);
        final Button animalButton = (Button) findViewById(R.id.button_animals);
        final Button numberButton = (Button) findViewById(R.id.button_numbers);
        //final Button playButton = (Button) findViewById(R.id.button_play);
        //blue button click
        colorButton.setOnClickListener(new OnClickListener(){
            public void onClick(View v) {
                Intent colorIntent = new Intent(v.getContext(), ColorScreen.class);
                colorIntent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivityForResult(colorIntent,0);//MainActivity.this  getApplicationContext()
            }

        });
        //bird button click
        animalButton.setOnClickListener(new OnClickListener(){
            public void onClick(View v) {
                Intent animalIntent = new Intent(v.getContext(), AnimalScreen.class);
                animalIntent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivityForResult(animalIntent,0);//MainActivity.this  getApplicationContext()
            }

        });
        //numbers button click
        numberButton.setOnClickListener(new OnClickListener(){
            public void onClick(View v) {
                Intent numberIntent = new Intent(v.getContext(), NumberScreen.class);
                numberIntent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivityForResult(numberIntent,0);//MainActivity.this  getApplicationContext()
            }

        });


    }
}
