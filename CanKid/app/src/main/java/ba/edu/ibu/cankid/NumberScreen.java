package ba.edu.ibu.cankid;

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
                Intent nIntent = new Intent(v.getContext(), MainActivity.class);
                startActivity(nIntent);
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
        oneSound.start();
        sound(oneImage, oneSound);
        final ImageView oneNext = (ImageView) findViewById(R.id.one_next);

        oneNext.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.two);
                homeButton();
                final ImageView twoImage = (ImageView) findViewById(R.id.two_image);
                final MediaPlayer twoSound =  MediaPlayer.create(NumberScreen.this, R.raw.two);
                twoSound.start();
                sound(twoImage, twoSound);
                final ImageView twoNext = (ImageView) findViewById(R.id.two_next);

                twoNext.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        setContentView(R.layout.three);
                        homeButton();
                        final ImageView threeImage = (ImageView) findViewById(R.id.three_image);
                        final MediaPlayer threeSound =  MediaPlayer.create(NumberScreen.this, R.raw.three);
                        threeSound.start();
                        sound(threeImage, threeSound);
                        final ImageView threeNext = (ImageView) findViewById(R.id.three_next);

                        threeNext.setOnClickListener(new OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                setContentView(R.layout.four);
                                homeButton();
                                final ImageView fourImage = (ImageView) findViewById(R.id.four_image);
                                final MediaPlayer fourSound =  MediaPlayer.create(NumberScreen.this, R.raw.four);
                                fourSound.start();
                                sound(fourImage, fourSound);
                                final ImageView fourNext = (ImageView) findViewById(R.id.four_next);

                                fourNext.setOnClickListener(new OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        setContentView(R.layout.five);
                                        homeButton();
                                        final ImageView fiveImage = (ImageView) findViewById(R.id.five_image);
                                        final MediaPlayer fiveSound =  MediaPlayer.create(NumberScreen.this, R.raw.five);
                                        fiveSound.start();
                                        sound(fiveImage, fiveSound);
                                        final ImageView fiveNext = (ImageView) findViewById(R.id.five_next);

                                        fiveNext.setOnClickListener(new OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                setContentView(R.layout.six);
                                                homeButton();
                                                final ImageView sixImage = (ImageView) findViewById(R.id.six_image);
                                                final MediaPlayer sixSound =  MediaPlayer.create(NumberScreen.this, R.raw.six);
                                                sixSound.start();
                                                sound(sixImage, sixSound);
                                                final ImageView sixNext = (ImageView) findViewById(R.id.six_next);

                                                sixNext.setOnClickListener(new OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        setContentView(R.layout.seven);
                                                        homeButton();
                                                        final ImageView sevenImage = (ImageView) findViewById(R.id.seven_image);
                                                        final MediaPlayer sevenSound =  MediaPlayer.create(NumberScreen.this, R.raw.seven);
                                                        sevenSound.start();
                                                        sound(sevenImage, sevenSound);
                                                        final ImageView sevenNext = (ImageView) findViewById(R.id.seven_next);

                                                        sevenNext.setOnClickListener(new OnClickListener() {
                                                            @Override
                                                            public void onClick(View v) {
                                                                setContentView(R.layout.eight);
                                                                homeButton();
                                                                final ImageView eightImage = (ImageView) findViewById(R.id.eight_image);
                                                                final MediaPlayer eightSound =  MediaPlayer.create(NumberScreen.this, R.raw.eight);
                                                                eightSound.start();
                                                                sound(eightImage, eightSound);
                                                                final ImageView eightNext = (ImageView) findViewById(R.id.eight_next);

                                                                eightNext.setOnClickListener(new OnClickListener() {
                                                                    @Override
                                                                    public void onClick(View v) {
                                                                        setContentView(R.layout.nine);
                                                                        homeButton();
                                                                        final ImageView nineImage = (ImageView) findViewById(R.id.nine_image);
                                                                        final MediaPlayer nineSound =  MediaPlayer.create(NumberScreen.this, R.raw.nine);
                                                                        nineSound.start();
                                                                        sound(nineImage, nineSound);
                                                                        final ImageView nineNext = (ImageView) findViewById(R.id.nine_next);

                                                                        nineNext.setOnClickListener(new OnClickListener() {
                                                                            @Override
                                                                            public void onClick(View v) {
                                                                                setContentView(R.layout.ten);
                                                                                homeButton();
                                                                                final ImageView tenImage = (ImageView) findViewById(R.id.ten_image);
                                                                                final MediaPlayer tenSound =  MediaPlayer.create(NumberScreen.this, R.raw.ten);
                                                                                tenSound.start();
                                                                                sound(tenImage, tenSound);
                                                                                final ImageView tenNext = (ImageView) findViewById(R.id.ten_next);

                                                                                tenNext.setOnClickListener(new OnClickListener() {
                                                                                    @Override
                                                                                    public void onClick(View v) {
                                                                                        Intent numberIntent = new Intent(v.getContext(), NumberScreen.class);
                                                                                        numberIntent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                                                                                        startActivity(numberIntent);
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

