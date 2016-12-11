package ba.edu.ibu.cankid;

/**
 * Created by muki on 11.11.2016..
 */

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class NumberScreen extends AppCompatActivity {
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
        setContentView(R.layout.one);
        homeButton();
        final ImageView oneImage = (ImageView) findViewById(R.id.one_image);
        final MediaPlayer oneSound =  MediaPlayer.create(NumberScreen.this, R.raw.one);
        sound(oneImage, oneSound);

 final ImageView oneNext = (ImageView) findViewById(R.id.one_next);
        oneNext.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.two);
                homeButton();
                final ImageView twoImage = (ImageView) findViewById(R.id.two_image);
                final MediaPlayer twoSound =  MediaPlayer.create(NumberScreen.this, R.raw.two);
                sound(twoImage, twoSound);

                final ImageView twoNext = (ImageView) findViewById(R.id.two_next);
                twoNext.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        setContentView(R.layout.three);
                        homeButton();
                        final ImageView threeImage = (ImageView) findViewById(R.id.three_image);
                        final MediaPlayer threeSound =  MediaPlayer.create(NumberScreen.this, R.raw.three);
                        sound(threeImage, threeSound);
                        final ImageView threeNext = (ImageView) findViewById(R.id.three_next);

                        threeNext.setOnClickListener(new OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                setContentView(R.layout.four);
                                homeButton();
                                final ImageView fourImage = (ImageView) findViewById(R.id.four_image);
                                final MediaPlayer fourSound =  MediaPlayer.create(NumberScreen.this, R.raw.four);
                                sound(fourImage, fourSound);

                                final ImageView fourNext = (ImageView) findViewById(R.id.four_next);
                                fourNext.setOnClickListener(new OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        setContentView(R.layout.five);
                                        homeButton();
                                        final ImageView fiveImage = (ImageView) findViewById(R.id.five_image);
                                        final MediaPlayer fiveSound =  MediaPlayer.create(NumberScreen.this, R.raw.five);
                                        sound(fiveImage, fiveSound);

                                        final ImageView fiveNext = (ImageView) findViewById(R.id.five_next);
                                        fiveNext.setOnClickListener(new OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                setContentView(R.layout.six);
                                                homeButton();
                                                final ImageView sixImage = (ImageView) findViewById(R.id.six_image);
                                                final MediaPlayer sixSound =  MediaPlayer.create(NumberScreen.this, R.raw.six);
                                                sound(sixImage, sixSound);
                                                final ImageView sixNext = (ImageView) findViewById(R.id.six_next);
                                                sixNext.setOnClickListener(new OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        setContentView(R.layout.seven);
                                                        homeButton();
                                                        final ImageView sevenImage = (ImageView) findViewById(R.id.seven_image);
                                                        final MediaPlayer sevenSound =  MediaPlayer.create(NumberScreen.this, R.raw.seven);
                                                        sound(sevenImage, sevenSound);

                                                        final ImageView sevenNext = (ImageView) findViewById(R.id.seven_next);


                                                        sevenNext.setOnClickListener(new OnClickListener() {
                                                            @Override
                                                            public void onClick(View v) {
                                                                setContentView(R.layout.eight);
                                                                homeButton();
                                                                final ImageView eightImage = (ImageView) findViewById(R.id.eight_image);
                                                                final MediaPlayer eightSound =  MediaPlayer.create(NumberScreen.this, R.raw.eight);
                                                                sound(eightImage, eightSound);
                                                                final ImageView eightNext = (ImageView) findViewById(R.id.eight_next);
                                                                eightNext.setOnClickListener(new OnClickListener() {
                                                                    @Override
                                                                    public void onClick(View v) {

                                                                        setContentView(R.layout.nine);
                                                                        homeButton();
                                                                        final ImageView nineImage = (ImageView) findViewById(R.id.nine_image);
                                                                        final MediaPlayer nineSound =  MediaPlayer.create(NumberScreen.this, R.raw.nine);
                                                                        sound(nineImage, nineSound);
                                                                        final ImageView nineNext = (ImageView) findViewById(R.id.nine_next);

                                                                        nineNext.setOnClickListener(new OnClickListener() {
                                                                            @Override
                                                                            public void onClick(View v) {
                                                                                setContentView(R.layout.ten);
                                                                                homeButton();
                                                                                final ImageView tenImage = (ImageView) findViewById(R.id.ten_image);
                                                                                final MediaPlayer tenSound =  MediaPlayer.create(NumberScreen.this, R.raw.ten);
                                                                                sound(tenImage, tenSound);
                                                                                homeButton();

                                                                                /*final ImageView tenNext = (ImageView) findViewById(R.id.ten_next);
                                                                                tenNext.setOnClickListener(new OnClickListener() {
                                                                                    @Override
                                                                                    public void onClick(View v) {
                                                                                        setContentView(R.layout.one);
                                                                                    }
                                                                                });*/

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
