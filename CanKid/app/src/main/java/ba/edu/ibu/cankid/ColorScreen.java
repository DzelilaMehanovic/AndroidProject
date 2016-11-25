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
import android.widget.ImageView;


public class ColorScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.blue);



      //final Button colorHomeButton=(Button) findViewById(R.id.colorsHomeButton);
        final ImageView homeIcon = (ImageView) findViewById(R.id.homeIcon);

        homeIcon.setOnClickListener(new OnClickListener(){
            public void onClick(View v) {
                Intent colorIntent = new Intent(v.getContext(), MainActivity.class);
                startActivityForResult(colorIntent,0);//MainActivity.this  getApplicationContext()
            }

        });



        final ImageView blueNext = (ImageView) findViewById(R.id.blueNext);
        final ImageView blackNext = (ImageView) findViewById(R.id.blackNext);
        final ImageView brownNext = (ImageView) findViewById(R.id.brownNext);
        final ImageView greenNext = (ImageView) findViewById(R.id.greenNext);
        final ImageView greyNext = (ImageView) findViewById(R.id.greyNext);
        final ImageView orangeNext = (ImageView) findViewById(R.id.orangeNext);
        final ImageView purpleNext = (ImageView) findViewById(R.id.purpleNext);
        final ImageView redNext = (ImageView) findViewById(R.id.redNext);
        final ImageView whiteNext = (ImageView) findViewById(R.id.whiteNext);
        final ImageView yellowNext = (ImageView) findViewById(R.id.yellowNext);

        blueNext.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // your code here
                setContentView(R.layout.black);
            }
        });

        blackNext.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // your code here
                setContentView(R.layout.brown);
            }
        });

       brownNext.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // your code here
                setContentView(R.layout.green);
            }
        });

       greenNext.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // your code here
                setContentView(R.layout.grey);
            }
        });

       greyNext.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // your code here
                setContentView(R.layout.orange);
            }
        });

        orangeNext.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // your code here
                setContentView(R.layout.purple);
            }
        });

       purpleNext.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // your code here
                setContentView(R.layout.red);
            }
        });

        redNext.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // your code here
                setContentView(R.layout.white);
            }
        });

       whiteNext.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // your code here
                setContentView(R.layout.yellow);
            }
        });

        yellowNext.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // your code here
                setContentView(R.layout.blue);
            }
        });


        yellowNext.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // your code here
                setContentView(R.layout.activity_main);
            }
        });


    }
}
