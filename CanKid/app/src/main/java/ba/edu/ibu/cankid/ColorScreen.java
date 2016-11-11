package ba.edu.ibu.cankid;

/**
 * Created by muki on 05.11.2016..
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.ImageButton;


public class ColorScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.colors);



        final Button colorHomeButton=(Button) findViewById(R.id.colorsHomeButton);

        colorHomeButton.setOnClickListener(new OnClickListener(){
            public void onClick(View v) {
                Intent colorIntent = new Intent(v.getContext(), MainActivity.class);
                startActivityForResult(colorIntent,0);//MainActivity.this  getApplicationContext()
            }

        });



    }
}
