package ba.edu.ibu.cankid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button colorButton=(Button) findViewById(R.id.button_colors);

        colorButton.setOnClickListener(new OnClickListener(){
            public void onClick(View v) {
                Intent colorIntent = new Intent(MainActivity.this, ColorScreen.class);
                startActivity(colorIntent);//MainActivity.this  getApplicationContext()
            }

        });
    }
}
