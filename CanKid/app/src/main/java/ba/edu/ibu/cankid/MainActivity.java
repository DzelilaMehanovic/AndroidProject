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


        final Button colorButton=(Button) findViewById(R.id.button_colors);
        final Button animalButton=(Button) findViewById(R.id.button_animals);
        final Button numberButton=(Button) findViewById(R.id.button_numbers);
        //blue button click
        colorButton.setOnClickListener(new OnClickListener(){
            public void onClick(View v) {
                Intent colorIntent = new Intent(v.getContext(), ColorScreen.class);
                startActivityForResult(colorIntent,0);//MainActivity.this  getApplicationContext()
            }

        });
        //animals button click
        animalButton.setOnClickListener(new OnClickListener(){
            public void onClick(View v) {
                Intent animalIntent = new Intent(v.getContext(), AnimalScreen.class);
                startActivityForResult(animalIntent,0);//MainActivity.this  getApplicationContext()
            }

        });
        //numbers button click
        numberButton.setOnClickListener(new OnClickListener(){
            public void onClick(View v) {
                Intent numberIntent = new Intent(v.getContext(), NumberScreen.class);
                startActivityForResult(numberIntent,0);//MainActivity.this  getApplicationContext()
            }

        });


    }
}
