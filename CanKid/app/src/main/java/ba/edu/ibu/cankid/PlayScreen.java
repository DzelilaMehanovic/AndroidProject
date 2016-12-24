package ba.edu.ibu.cankid;

/**
 * Created by muki on 23.12.2016..
 */

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.Toast;

public class PlayScreen extends AppCompatActivity {
    public void homeButton() {
        final ImageView homeIcon = (ImageView) findViewById(R.id.homeIcon);
        homeIcon.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent animalIntent = new Intent(v.getContext(), MainActivity.class);
                startActivityForResult(animalIntent, 0);//MainActivity.this  getApplicationContext()
            }
        });
    }
    public void wrongAnswer(){
        final MediaPlayer wrongAnswer1 = MediaPlayer.create(PlayScreen.this, R.raw.wrong_answer);
        wrongAnswer1.start();
    }
public void showToastMessage(){
    Toast toast = new Toast(getApplicationContext());
    toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
    toast.setDuration(Toast.LENGTH_SHORT);
    toast.setView(getLayoutInflater().inflate(R.layout.toast_message_wrong, null));
    toast.show();
}
    public void checkAnswers(ImageView imageCorrect, ImageView imageWrong1, ImageView imageWrong2 ){
        imageCorrect.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                final MediaPlayer correctAnswer = MediaPlayer.create(PlayScreen.this, R.raw.correct_answer);
                correctAnswer.start();
                Toast toast = new Toast(getApplicationContext());
                toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
                toast.setDuration(Toast.LENGTH_LONG);
                toast.setView(getLayoutInflater().inflate(R.layout.toast_message_correct, null));
                toast.show();
            }
        });

        imageWrong1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                wrongAnswer();
                showToastMessage();

            }
        });
        imageWrong2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                wrongAnswer();
               showToastMessage();
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question1);
        final MediaPlayer birdSound = MediaPlayer.create(PlayScreen.this, R.raw.bird);
        //blackSound.setLooping(false);
        birdSound.start();
        homeButton();
        final ImageView bird = (ImageView) findViewById(R.id.bird_image);
        final ImageView black = (ImageView) findViewById(R.id.black_image);
        final ImageView one = (ImageView) findViewById(R.id.one_image);
        final ImageView question1Next = (ImageView) findViewById(R.id.question1_next);
        checkAnswers(bird, black, one);

        question1Next.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.question2);
                final MediaPlayer blueSound = MediaPlayer.create(PlayScreen.this, R.raw.blue);
                //blackSound.setLooping(false);
                blueSound.start();
                homeButton();
                final ImageView cat = (ImageView) findViewById(R.id.cat_image);
                final ImageView blue = (ImageView) findViewById(R.id.blue_image);
                final ImageView two = (ImageView) findViewById(R.id.two_image);
                final ImageView question2Next = (ImageView) findViewById(R.id.question2_next);
                checkAnswers(blue, cat, two);

                question2Next.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        setContentView(R.layout.question3);
                        final MediaPlayer threeSound = MediaPlayer.create(PlayScreen.this, R.raw.three);
                        //blackSound.setLooping(false);
                        threeSound.start();
                        homeButton();
                        final ImageView chicken = (ImageView) findViewById(R.id.chicken_image);
                        final ImageView brown = (ImageView) findViewById(R.id.brown_image);
                        final ImageView three = (ImageView) findViewById(R.id.three_image);
                        final ImageView question3Next = (ImageView) findViewById(R.id.question3_next);
                        checkAnswers(three, chicken, brown);

                        question3Next.setOnClickListener(new OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                setContentView(R.layout.question4);
                                final MediaPlayer fourSound = MediaPlayer.create(PlayScreen.this, R.raw.four);
                                //blackSound.setLooping(false);
                                fourSound.start();
                                homeButton();
                                final ImageView cow = (ImageView) findViewById(R.id.cow_image);
                                final ImageView green = (ImageView) findViewById(R.id.green_image);
                                final ImageView four = (ImageView) findViewById(R.id.four_image);
                                final ImageView question4Next = (ImageView) findViewById(R.id.question4_next);
                                checkAnswers(four, green, cow);

                                question4Next.setOnClickListener(new OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        setContentView(R.layout.question5);
                                        final MediaPlayer greySound = MediaPlayer.create(PlayScreen.this, R.raw.grey);
                                        //blackSound.setLooping(false);
                                       greySound.start();
                                        homeButton();
                                        final ImageView dog = (ImageView) findViewById(R.id.dog_image);
                                        final ImageView grey = (ImageView) findViewById(R.id.grey_image);
                                        final ImageView five = (ImageView) findViewById(R.id.five_image);
                                        final ImageView question5Next = (ImageView) findViewById(R.id.question5_next);
                                        checkAnswers(grey, five, dog);

                                        question5Next.setOnClickListener(new OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                setContentView(R.layout.question6);
                                                final MediaPlayer fishSound = MediaPlayer.create(PlayScreen.this, R.raw.fish);
                                                //blackSound.setLooping(false);
                                                fishSound.start();
                                                homeButton();
                                                final ImageView fish = (ImageView) findViewById(R.id.fish_image);
                                                final ImageView orange = (ImageView) findViewById(R.id.orange_image);
                                                final ImageView six = (ImageView) findViewById(R.id.six_image);
                                                final ImageView question6Next = (ImageView) findViewById(R.id.question6_next);
                                                checkAnswers(fish, orange, six);

                                                question6Next.setOnClickListener(new OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        setContentView(R.layout.question7);
                                                        final MediaPlayer purpleSound = MediaPlayer.create(PlayScreen.this, R.raw.purple);
                                                        //blackSound.setLooping(false);
                                                        purpleSound.start();
                                                        homeButton();
                                                        final ImageView goat = (ImageView) findViewById(R.id.goat_image);
                                                        final ImageView purple = (ImageView) findViewById(R.id.purple_image);
                                                        final ImageView seven = (ImageView) findViewById(R.id.seven_image);
                                                        final ImageView question7Next = (ImageView) findViewById(R.id.question7_next);
                                                        checkAnswers(purple, goat, seven);

                                                        question7Next.setOnClickListener(new OnClickListener() {
                                                            @Override
                                                            public void onClick(View v) {
                                                                setContentView(R.layout.question8);
                                                                final MediaPlayer horseSound = MediaPlayer.create(PlayScreen.this, R.raw.horse);
                                                                //blackSound.setLooping(false);
                                                                horseSound.start();
                                                                homeButton();
                                                                final ImageView horse = (ImageView) findViewById(R.id.horse_image);
                                                                final ImageView red = (ImageView) findViewById(R.id.red_image);
                                                                final ImageView eight = (ImageView) findViewById(R.id.eight_image);
                                                                final ImageView question8Next = (ImageView) findViewById(R.id.question8_next);
                                                                checkAnswers(horse, red, eight);

                                                                question8Next.setOnClickListener(new OnClickListener() {
                                                                    @Override
                                                                    public void onClick(View v) {
                                                                        setContentView(R.layout.question9);
                                                                        final MediaPlayer nineSound = MediaPlayer.create(PlayScreen.this, R.raw.nine);
                                                                        //blackSound.setLooping(false);
                                                                       nineSound.start();
                                                                        homeButton();
                                                                        final ImageView rabbit = (ImageView) findViewById(R.id.rabbit_image);
                                                                        final ImageView yellow = (ImageView) findViewById(R.id.yellow_image);
                                                                        final ImageView nine = (ImageView) findViewById(R.id.nine_image);
                                                                        final ImageView question9Next = (ImageView) findViewById(R.id.question9_next);
                                                                        checkAnswers(nine, rabbit, yellow);

                                                                        question9Next.setOnClickListener(new OnClickListener() {
                                                                            @Override
                                                                            public void onClick(View v) {
                                                                                setContentView(R.layout.question10);
                                                                                final MediaPlayer sheepSound = MediaPlayer.create(PlayScreen.this, R.raw.sheep);
                                                                                //blackSound.setLooping(false);
                                                                                sheepSound.start();
                                                                                homeButton();
                                                                                final ImageView sheep = (ImageView) findViewById(R.id.sheep_image);
                                                                                final ImageView white = (ImageView) findViewById(R.id.white_image);
                                                                                final ImageView ten = (ImageView) findViewById(R.id.ten_image);
                                                                                final ImageView question10Next = (ImageView) findViewById(R.id.question10_next);
                                                                                checkAnswers(sheep, white, ten);


                                                                                question10Next.setOnClickListener(new OnClickListener() {
                                                                                    @Override
                                                                                    public void onClick(View v) {
                                                                                        Intent playIntent = new Intent(v.getContext(), PlayScreen.class);
                                                                                        playIntent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                                                                                        startActivity(playIntent);
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

