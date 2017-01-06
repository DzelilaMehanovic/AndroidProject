package ba.edu.ibu.cankid;


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
                Intent cIntent = new Intent(v.getContext(), MainActivity.class);
               // cIntent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(cIntent);
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
        blueSound.start();
        sound(blueImage, blueSound);
        final ImageView blueNext = (ImageView) findViewById(R.id.blue_next);

        blueNext.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.black);
                homeButton();
                final ImageView blackImage = (ImageView) findViewById(R.id.black_image);
                final MediaPlayer blackSound =  MediaPlayer.create(ColorScreen.this, R.raw.black);
                blackSound.start();
                sound(blackImage, blackSound);
                final ImageView blackNext = (ImageView) findViewById(R.id.black_next);

                blackNext.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        setContentView(R.layout.brown);
                        homeButton();
                        final ImageView brownImage = (ImageView) findViewById(R.id.brown_image);
                        final MediaPlayer brownSound =  MediaPlayer.create(ColorScreen.this, R.raw.brown);
                        brownSound.start();
                        sound(brownImage, brownSound);
                        final ImageView brownNext = (ImageView) findViewById(R.id.brown_next);

                        brownNext.setOnClickListener(new OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                setContentView(R.layout.green);
                                homeButton();
                                final ImageView greenImage = (ImageView) findViewById(R.id.green_image);
                                final MediaPlayer greenSound =  MediaPlayer.create(ColorScreen.this, R.raw.green);
                                greenSound.start();
                                sound(greenImage, greenSound);
                                final ImageView greenNext = (ImageView) findViewById(R.id.green_next);

                                greenNext.setOnClickListener(new OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        setContentView(R.layout.grey);
                                        homeButton();
                                        final ImageView greyImage = (ImageView) findViewById(R.id.grey_image);
                                        final MediaPlayer greySound =  MediaPlayer.create(ColorScreen.this, R.raw.grey);
                                        greySound.start();
                                        sound(greyImage, greySound);
                                        final ImageView greyNext = (ImageView) findViewById(R.id.grey_next);

                                        greyNext.setOnClickListener(new OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                setContentView(R.layout.orange);
                                                homeButton();
                                                final ImageView orangeImage = (ImageView) findViewById(R.id.orange_image);
                                                final MediaPlayer orangeSound =  MediaPlayer.create(ColorScreen.this, R.raw.orange);
                                                orangeSound.start();
                                                sound(orangeImage, orangeSound);
                                                final ImageView orangeNext = (ImageView) findViewById(R.id.orange_next);

                                                orangeNext.setOnClickListener(new OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        setContentView(R.layout.purple);
                                                        homeButton();
                                                        final ImageView purpleImage = (ImageView) findViewById(R.id.purple_image);
                                                        final MediaPlayer purpleSound =  MediaPlayer.create(ColorScreen.this, R.raw.purple);
                                                        purpleSound.start();
                                                        sound(purpleImage, purpleSound);
                                                        final ImageView purpleNext = (ImageView) findViewById(R.id.purple_next);

                                                        purpleNext.setOnClickListener(new OnClickListener() {
                                                            @Override
                                                            public void onClick(View v) {
                                                                setContentView(R.layout.red);
                                                                homeButton();
                                                                final ImageView redImage = (ImageView) findViewById(R.id.red_image);
                                                                final MediaPlayer redSound =  MediaPlayer.create(ColorScreen.this, R.raw.red);
                                                                redSound.start();
                                                                sound(redImage, redSound);
                                                                final ImageView redNext = (ImageView) findViewById(R.id.red_next);

                                                                redNext.setOnClickListener(new OnClickListener() {
                                                                    @Override
                                                                    public void onClick(View v) {
                                                                        setContentView(R.layout.white);
                                                                        homeButton();
                                                                        final ImageView whiteImage = (ImageView) findViewById(R.id.white_image);
                                                                        final MediaPlayer whiteSound =  MediaPlayer.create(ColorScreen.this, R.raw.white);
                                                                        whiteSound.start();
                                                                        sound(whiteImage, whiteSound);
                                                                        final ImageView whiteNext = (ImageView) findViewById(R.id.white_next);

                                                                        whiteNext.setOnClickListener(new OnClickListener() {
                                                                            @Override
                                                                            public void onClick(View v) {
                                                                                setContentView(R.layout.yellow);
                                                                                homeButton();
                                                                                final ImageView yellowImage = (ImageView) findViewById(R.id.yellow_image);
                                                                                final MediaPlayer yellowSound =  MediaPlayer.create(ColorScreen.this, R.raw.yellow);
                                                                                yellowSound.start();
                                                                                sound(yellowImage, yellowSound);
                                                                                final ImageView yellowNext = (ImageView) findViewById(R.id.yellow_next);

                                                                                yellowNext.setOnClickListener(new OnClickListener() {
                                                                                    @Override
                                                                                    public void onClick(View v) {
                                                                                        Intent colorIntent = new Intent(v.getContext(), ColorScreen.class);
                                                                                        colorIntent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                                                                                        startActivity(colorIntent);
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

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onStop() {
        super.onStop();
        //   showToastMessage();
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    public void onRestart() {
        super.onRestart();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}

