package ba.edu.ibu.cankid;

/**
 * Created by muki on 11.11.2016..
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class NumberScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.one);



        //final Button colorHomeButton=(Button) findViewById(R.id.colorsHomeButton);
       final ImageView homeIcon = (ImageView) findViewById(R.id.homeIcon);

        homeIcon.setOnClickListener(new OnClickListener(){
            public void onClick(View v) {
                Intent numberIntent = new Intent(v.getContext(), MainActivity.class);
                startActivityForResult(numberIntent,0);//MainActivity.this  getApplicationContext()
            }

        });
        final ImageView oneNext = (ImageView) findViewById(R.id.one_next);
        oneNext.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.two);
                final ImageView twoNext = (ImageView) findViewById(R.id.two_next);
                twoNext.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        setContentView(R.layout.three);
                        final ImageView threeNext = (ImageView) findViewById(R.id.three_next);

                        threeNext.setOnClickListener(new OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                setContentView(R.layout.four);

                                final ImageView fourNext = (ImageView) findViewById(R.id.four_next);
                                fourNext.setOnClickListener(new OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        setContentView(R.layout.five);

                                        final ImageView fiveNext = (ImageView) findViewById(R.id.five_next);
                                        fiveNext.setOnClickListener(new OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                setContentView(R.layout.six);
                                                final ImageView sixNext = (ImageView) findViewById(R.id.six_next);
                                                sixNext.setOnClickListener(new OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        setContentView(R.layout.seven);
                                                        final ImageView sevenNext = (ImageView) findViewById(R.id.seven_next);


                                                        sevenNext.setOnClickListener(new OnClickListener() {
                                                            @Override
                                                            public void onClick(View v) {
                                                                setContentView(R.layout.eight);
                                                                final ImageView eightNext = (ImageView) findViewById(R.id.eight_next);
                                                                eightNext.setOnClickListener(new OnClickListener() {
                                                                    @Override
                                                                    public void onClick(View v) {

                                                                        setContentView(R.layout.nine);
                                                                        final ImageView nineNext = (ImageView) findViewById(R.id.nine_next);

                                                                        nineNext.setOnClickListener(new OnClickListener() {
                                                                            @Override
                                                                            public void onClick(View v) {
                                                                                setContentView(R.layout.ten);

                                                                                final ImageView tenNext = (ImageView) findViewById(R.id.ten_next);


                                                                                tenNext.setOnClickListener(new OnClickListener() {
                                                                                    @Override
                                                                                    public void onClick(View v) {
                                                                                        setContentView(R.layout.one);
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
