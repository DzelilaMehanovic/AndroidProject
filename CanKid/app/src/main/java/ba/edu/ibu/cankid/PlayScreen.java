package ba.edu.ibu.cankid;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.Toast;

public class PlayScreen extends AppCompatActivity {

    public void wrongAnswer() {
        final MediaPlayer wrongAnswer1 = MediaPlayer.create(PlayScreen.this, R.raw.wrong_answer);
        wrongAnswer1.start();
    }

    public void showToastMessage() {
       final Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(getLayoutInflater().inflate(R.layout.toast_message_wrong, null));
        toast.show();

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                toast.cancel();

            }
        }, 1500);
    }

    public void checkAnswers(ImageView imageCorrect, ImageView imageWrong1, ImageView imageWrong2) {
        imageCorrect.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                final MediaPlayer correctAnswer = MediaPlayer.create(PlayScreen.this, R.raw.correct_answerc);
                correctAnswer.start();
                final  Toast toast = new Toast(getApplicationContext());
                toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setView(getLayoutInflater().inflate(R.layout.toast_message_correct, null));
                toast.show();

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        toast.cancel();
                    }
                }, 1500);
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
      /*public void Re(int layoutR, int img1, int img2, int img3, MediaPlayer soundName, int imgSound){
            setContentView(layoutR);
            soundName.start();
            final ImageView bird = (ImageView) findViewById(img1);
            final ImageView black = (ImageView) findViewById(img2);
            final ImageView one = (ImageView) findViewById(img3);
            checkAnswers(bird, black, one);
            ImageView question1SoundImage = (ImageView) findViewById(imgSound);
            sound(question1SoundImage, soundName);
        }
*/
    //click on image, start sound
    public void sound(ImageView imageName, final MediaPlayer soundName) {
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

       /* final MediaPlayer birdSound = MediaPlayer.create(PlayScreen.this, R.raw.bird);
        final ImageView question1Next = (ImageView) findViewById(R.id.question1_next);
        Re(R.layout.question1, R.id.bird_image, R.id.black_image, R.id.one_image, birdSound, R.id.question1Sound);
*/

       setContentView(R.layout.question1);
        final MediaPlayer birdSound = MediaPlayer.create(PlayScreen.this, R.raw.bird);
        birdSound.start();
        final ImageView bird = (ImageView) findViewById(R.id.bird_image);
        final ImageView black = (ImageView) findViewById(R.id.black_image);
        final ImageView one = (ImageView) findViewById(R.id.one_image);
        final ImageView question1Next = (ImageView) findViewById(R.id.question1_next);
        checkAnswers(bird, black, one);
        final ImageView question1SoundImage = (ImageView) findViewById(R.id.question1Sound);
        sound(question1SoundImage, birdSound);

        question1Next.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

               setContentView(R.layout.question2);
                final MediaPlayer blueSound = MediaPlayer.create(PlayScreen.this, R.raw.blue);
                blueSound.start();
                final ImageView cat = (ImageView) findViewById(R.id.cat_image);
                final ImageView blue = (ImageView) findViewById(R.id.blue_image);
                final ImageView two = (ImageView) findViewById(R.id.two_image);
                final ImageView question2Next = (ImageView) findViewById(R.id.question2_next);
                checkAnswers(blue, cat, two);
                final ImageView question2SoundImage = (ImageView) findViewById(R.id.question2Sound);
                sound(question2SoundImage, blueSound);


                question2Next.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        setContentView(R.layout.question3);
                        final MediaPlayer threeSound = MediaPlayer.create(PlayScreen.this, R.raw.three);
                        threeSound.start();
                        final ImageView chicken = (ImageView) findViewById(R.id.chicken_image);
                        final ImageView brown = (ImageView) findViewById(R.id.brown_image);
                        final ImageView three = (ImageView) findViewById(R.id.three_image);
                        final ImageView question3Next = (ImageView) findViewById(R.id.question3_next);
                        checkAnswers(three, chicken, brown);
                        final ImageView question3SoundImage = (ImageView) findViewById(R.id.question3Sound);
                        sound(question3SoundImage, threeSound);


                        question3Next.setOnClickListener(new OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                setContentView(R.layout.question4);
                                final MediaPlayer fourSound = MediaPlayer.create(PlayScreen.this, R.raw.four);
                                fourSound.start();
                                final ImageView cow = (ImageView) findViewById(R.id.cow_image);
                                final ImageView green = (ImageView) findViewById(R.id.green_image);
                                final ImageView four = (ImageView) findViewById(R.id.four_image);
                                final ImageView question4Next = (ImageView) findViewById(R.id.question4_next);
                                checkAnswers(four, green, cow);
                                final ImageView question4SoundImage = (ImageView) findViewById(R.id.question4Sound);
                                sound(question4SoundImage, fourSound);


                                question4Next.setOnClickListener(new OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        setContentView(R.layout.question5);
                                        final MediaPlayer greySound = MediaPlayer.create(PlayScreen.this, R.raw.grey);
                                        greySound.start();
                                        final ImageView dog = (ImageView) findViewById(R.id.dog_image);
                                        final ImageView grey = (ImageView) findViewById(R.id.grey_image);
                                        final ImageView five = (ImageView) findViewById(R.id.five_image);
                                        final ImageView question5Next = (ImageView) findViewById(R.id.question5_next);
                                        checkAnswers(grey, five, dog);
                                        final ImageView question5SoundImage = (ImageView) findViewById(R.id.question5Sound);
                                        sound(question5SoundImage, greySound);


                                        question5Next.setOnClickListener(new OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                setContentView(R.layout.question6);
                                                final MediaPlayer fishSound = MediaPlayer.create(PlayScreen.this, R.raw.fish);
                                                fishSound.start();
                                                final ImageView fish = (ImageView) findViewById(R.id.fish_image);
                                                final ImageView orange = (ImageView) findViewById(R.id.orange_image);
                                                final ImageView six = (ImageView) findViewById(R.id.six_image);
                                                final ImageView question6Next = (ImageView) findViewById(R.id.question6_next);
                                                checkAnswers(fish, orange, six);
                                                final ImageView question6SoundImage = (ImageView) findViewById(R.id.question6Sound);
                                                sound(question6SoundImage, fishSound);


                                                question6Next.setOnClickListener(new OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        setContentView(R.layout.question7);
                                                        final MediaPlayer purpleSound = MediaPlayer.create(PlayScreen.this, R.raw.purple);
                                                        purpleSound.start();
                                                        final ImageView goat = (ImageView) findViewById(R.id.goat_image);
                                                        final ImageView purple = (ImageView) findViewById(R.id.purple_image);
                                                        final ImageView seven = (ImageView) findViewById(R.id.seven_image);
                                                        final ImageView question7Next = (ImageView) findViewById(R.id.question7_next);
                                                        checkAnswers(purple, goat, seven);
                                                        final ImageView question7SoundImage = (ImageView) findViewById(R.id.question7Sound);
                                                        sound(question7SoundImage, purpleSound);


                                                        question7Next.setOnClickListener(new OnClickListener() {
                                                            @Override
                                                            public void onClick(View v) {
                                                                setContentView(R.layout.question8);
                                                                final MediaPlayer horseSound = MediaPlayer.create(PlayScreen.this, R.raw.horse);
                                                                horseSound.start();
                                                                final ImageView horse = (ImageView) findViewById(R.id.horse_image);
                                                                final ImageView red = (ImageView) findViewById(R.id.red_image);
                                                                final ImageView eight = (ImageView) findViewById(R.id.eight_image);
                                                                final ImageView question8Next = (ImageView) findViewById(R.id.question8_next);
                                                                checkAnswers(horse, red, eight);
                                                                final ImageView question8SoundImage = (ImageView) findViewById(R.id.question8Sound);
                                                                sound(question8SoundImage, horseSound);


                                                                question8Next.setOnClickListener(new OnClickListener() {
                                                                    @Override
                                                                    public void onClick(View v) {
                                                                        setContentView(R.layout.question9);
                                                                        final MediaPlayer nineSound = MediaPlayer.create(PlayScreen.this, R.raw.nine);
                                                                        nineSound.start();
                                                                        final ImageView rabbit = (ImageView) findViewById(R.id.rabbit_image);
                                                                        final ImageView yellow = (ImageView) findViewById(R.id.yellow_image);
                                                                        final ImageView nine = (ImageView) findViewById(R.id.nine_image);
                                                                        final ImageView question9Next = (ImageView) findViewById(R.id.question9_next);
                                                                        checkAnswers(nine, rabbit, yellow);
                                                                        final ImageView question9SoundImage = (ImageView) findViewById(R.id.question9Sound);
                                                                        sound(question9SoundImage, nineSound);


                                                                        question9Next.setOnClickListener(new OnClickListener() {
                                                                            @Override
                                                                            public void onClick(View v) {
                                                                                setContentView(R.layout.question10);
                                                                                final MediaPlayer sheepSound = MediaPlayer.create(PlayScreen.this, R.raw.sheep);
                                                                                sheepSound.start();
                                                                                final ImageView sheep = (ImageView) findViewById(R.id.sheep_image);
                                                                                final ImageView white = (ImageView) findViewById(R.id.white_image);
                                                                                final ImageView ten = (ImageView) findViewById(R.id.ten_image);
                                                                                final ImageView question10Next = (ImageView) findViewById(R.id.question10_next);
                                                                                checkAnswers(sheep, white, ten);
                                                                                final ImageView question10SoundImage = (ImageView) findViewById(R.id.question10Sound);
                                                                                sound(question10SoundImage, sheepSound);


                                                                                question10Next.setOnClickListener(new OnClickListener() {
                                                                                    @Override
                                                                                    public void onClick(View v) {
                                                                                        Intent playIntent = new Intent(v.getContext(), PlayScreen.class);
                                                                                        // playIntent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
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
    }

    @Override
    public void onRestart() { super.onRestart();}
    @Override
    public void onDestroy() { super.onDestroy();
    }

}

