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
        //blue layout
        final ImageView blueNext = (ImageView) findViewById(R.id.blue_next);
        blueNext.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.black);
                //black layout
                final ImageView blackNext = (ImageView) findViewById(R.id.black_next);
                blackNext.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        setContentView(R.layout.brown);
                        final ImageView brownNext = (ImageView) findViewById(R.id.brown_next);

                        brownNext.setOnClickListener(new OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                setContentView(R.layout.green);

                                final ImageView greenNext = (ImageView) findViewById(R.id.green_next);
                                greenNext.setOnClickListener(new OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        setContentView(R.layout.grey);

                                        final ImageView greyNext = (ImageView) findViewById(R.id.grey_next);
                                        greyNext.setOnClickListener(new OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                setContentView(R.layout.orange);
                                                final ImageView orangeNext = (ImageView) findViewById(R.id.orange_next);
                                                orangeNext.setOnClickListener(new OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        setContentView(R.layout.purple);
                                                        final ImageView purpleNext = (ImageView) findViewById(R.id.purple_next);


                                                        purpleNext.setOnClickListener(new OnClickListener() {
                                                            @Override
                                                            public void onClick(View v) {
                                                                setContentView(R.layout.red);
                                                                final ImageView redNext = (ImageView) findViewById(R.id.red_next);
                                                                redNext.setOnClickListener(new OnClickListener() {
                                                                    @Override
                                                                    public void onClick(View v) {

                                                                        setContentView(R.layout.white);
                                                                        final ImageView whiteNext = (ImageView) findViewById(R.id.white_next);

                                                                        whiteNext.setOnClickListener(new OnClickListener() {
                                                                            @Override
                                                                            public void onClick(View v) {
                                                                                setContentView(R.layout.yellow);

                                                                                final ImageView yellowNext = (ImageView) findViewById(R.id.yellow_next);


                                                                                yellowNext.setOnClickListener(new OnClickListener() {
                                                                                    @Override
                                                                                    public void onClick(View v) {
                                                                                        setContentView(R.layout.blue);
                                                                                    }
                                                                                });

                                                                            }
                                                                        });

                                                                    }
                                                                });
                                                            }
                                                        });
                                                    }
                                                });
                                            }
                                        });

                                    }
                                });
                            }
                        });
                    }
                });


            }
        });

    }
}
