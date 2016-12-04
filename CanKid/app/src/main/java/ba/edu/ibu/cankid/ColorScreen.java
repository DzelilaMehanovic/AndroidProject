package ba.edu.ibu.cankid;

/**
 * Created by muki on 05.11.2016..
 */

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.ImageView;


public class ColorScreen extends AppCompatActivity {


    public void homeButton(){
        final ImageView homeIcon = (ImageView) findViewById(R.id.homeIcon);
        homeIcon.setOnClickListener(new OnClickListener(){
            public void onClick(View v) {
                Intent animalIntent = new Intent(v.getContext(), MainActivity.class);
                startActivityForResult(animalIntent,0);//MainActivity.this  getApplicationContext()
            }
        });
    }


    //click on image, start sound
    public void sound(ImageView imageName, final MediaPlayer soundName){
        imageName.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                soundName.start();
            }
        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.blue);
        homeButton();
        final ImageView blueImage = (ImageView) findViewById(R.id.blue_image);
        final MediaPlayer blueSound =  MediaPlayer.create(ColorScreen.this, R.raw.blue);
        sound(blueImage, blueSound);



      //final Button colorHomeButton=(Button) findViewById(R.id.colorsHomeButton);

        //blue layout
        final ImageView blueNext = (ImageView) findViewById(R.id.blue_next);
        blueNext.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.black);
                homeButton();
                final ImageView blackImage = (ImageView) findViewById(R.id.black_image);
                final MediaPlayer blackSound =  MediaPlayer.create(ColorScreen.this, R.raw.black);
                sound(blackImage, blackSound);

                //black layout
                final ImageView blackNext = (ImageView) findViewById(R.id.black_next);
                blackNext.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        setContentView(R.layout.brown);
                        homeButton();
                        final ImageView brownImage = (ImageView) findViewById(R.id.brown_image);
                        final MediaPlayer brownSound =  MediaPlayer.create(ColorScreen.this, R.raw.brown);
                        sound(brownImage, brownSound);

                        final ImageView brownNext = (ImageView) findViewById(R.id.brown_next);

                        brownNext.setOnClickListener(new OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                setContentView(R.layout.green);
                                homeButton();
                                final ImageView greenImage = (ImageView) findViewById(R.id.green_image);
                                final MediaPlayer greenSound =  MediaPlayer.create(ColorScreen.this, R.raw.green);
                                sound(greenImage, greenSound);


                                final ImageView greenNext = (ImageView) findViewById(R.id.green_next);
                                greenNext.setOnClickListener(new OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        setContentView(R.layout.grey);
                                        homeButton();
                                        final ImageView greyImage = (ImageView) findViewById(R.id.grey_image);
                                        final MediaPlayer greySound =  MediaPlayer.create(ColorScreen.this, R.raw.grey);
                                        sound(greyImage, greySound);


                                        final ImageView greyNext = (ImageView) findViewById(R.id.grey_next);
                                        greyNext.setOnClickListener(new OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                setContentView(R.layout.orange);
                                                homeButton();
                                                final ImageView orangeImage = (ImageView) findViewById(R.id.orange_image);
                                                final MediaPlayer orangeSound =  MediaPlayer.create(ColorScreen.this, R.raw.orange);
                                                sound(orangeImage, orangeSound);

                                                final ImageView orangeNext = (ImageView) findViewById(R.id.orange_next);
                                                orangeNext.setOnClickListener(new OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        setContentView(R.layout.purple);
                                                        homeButton();
                                                        final ImageView purpleImage = (ImageView) findViewById(R.id.purple_image);
                                                        final MediaPlayer purpleSound =  MediaPlayer.create(ColorScreen.this, R.raw.purple);
                                                        sound(purpleImage, purpleSound);

                                                        final ImageView purpleNext = (ImageView) findViewById(R.id.purple_next);


                                                        purpleNext.setOnClickListener(new OnClickListener() {
                                                            @Override
                                                            public void onClick(View v) {
                                                                setContentView(R.layout.red);
                                                                homeButton();
                                                                final ImageView redImage = (ImageView) findViewById(R.id.red_image);
                                                                final MediaPlayer redSound =  MediaPlayer.create(ColorScreen.this, R.raw.red);
                                                                sound(redImage, redSound);

                                                                final ImageView redNext = (ImageView) findViewById(R.id.red_next);
                                                                redNext.setOnClickListener(new OnClickListener() {
                                                                    @Override
                                                                    public void onClick(View v) {

                                                                        setContentView(R.layout.white);
                                                                        homeButton();
                                                                        final ImageView whiteImage = (ImageView) findViewById(R.id.white_image);
                                                                        final MediaPlayer whiteSound =  MediaPlayer.create(ColorScreen.this, R.raw.white);
                                                                        sound(whiteImage, whiteSound);

                                                                        final ImageView whiteNext = (ImageView) findViewById(R.id.white_next);

                                                                        whiteNext.setOnClickListener(new OnClickListener() {
                                                                            @Override
                                                                            public void onClick(View v) {
                                                                                setContentView(R.layout.yellow);
                                                                                homeButton();
                                                                                final ImageView yellowImage = (ImageView) findViewById(R.id.yellow_image);
                                                                                final MediaPlayer yellowSound =  MediaPlayer.create(ColorScreen.this, R.raw.yellow);
                                                                                sound(yellowImage, yellowSound);


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
