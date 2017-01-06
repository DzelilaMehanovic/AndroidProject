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
import android.widget.ImageButton;
import android.widget.ImageView;

public class AnimalScreen extends AppCompatActivity {


    public void homeButton(){
    final ImageView homeIcon = (ImageView) findViewById(R.id.homeIcon);
    homeIcon.setOnClickListener(new OnClickListener(){
        public void onClick(View v) {
            Intent aIntent = new Intent(v.getContext(), MainActivity.class);
           // aIntent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
            startActivity(aIntent);

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
        setContentView(R.layout.bird);
        homeButton();
        final MediaPlayer birdSound = MediaPlayer.create(this, R.raw.bird);
        final ImageView birdImage = (ImageView) findViewById(R.id.bird_image);
        birdSound.start();
        sound(birdImage, birdSound);
        final ImageView birdNext = (ImageView) findViewById(R.id.bird_next);

        birdNext.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.cat);
                homeButton();
                final ImageView catImage = (ImageView) findViewById(R.id.cat_image);
                final MediaPlayer catSound =  MediaPlayer.create(AnimalScreen.this, R.raw.cat);
                catSound.start();
                sound(catImage, catSound);
                final ImageView catNext = (ImageView) findViewById(R.id.cat_next);

                catNext.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        setContentView(R.layout.chicken);
                        homeButton();
                        final MediaPlayer chickenSound = MediaPlayer.create(AnimalScreen.this, R.raw.chicken);
                        final ImageView chickenImage = (ImageView) findViewById(R.id.chicken_image);
                        chickenSound.start();
                       sound(chickenImage, chickenSound);
                        final ImageView chickenNext = (ImageView) findViewById(R.id.chicken_next);

                        chickenNext.setOnClickListener(new OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                setContentView(R.layout.cow);
                                homeButton();
                                final ImageView cowImage = (ImageView) findViewById(R.id.cow_image);
                                final MediaPlayer cowSound = MediaPlayer.create(AnimalScreen.this, R.raw.cow);
                                cowSound.start();
                                sound(cowImage, cowSound);
                                final ImageView cowNext = (ImageView) findViewById(R.id.cow_next);

                                cowNext.setOnClickListener(new OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        setContentView(R.layout.dog);
                                        homeButton();
                                        final ImageView dogImage = (ImageView) findViewById(R.id.dog_image);
                                        final MediaPlayer dogSound = MediaPlayer.create(AnimalScreen.this, R.raw.dog);
                                      dogSound.start();
                                        sound(dogImage, dogSound);
                                        final ImageView dogNext = (ImageView) findViewById(R.id.dog_next);

                                        dogNext.setOnClickListener(new OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                setContentView(R.layout.fish);
                                                homeButton();
                                                final ImageView fishImage = (ImageView) findViewById(R.id.fish_image);
                                                final MediaPlayer fishSound = MediaPlayer.create(AnimalScreen.this, R.raw.fish);
                                                fishSound.start();
                                                sound(fishImage, fishSound);
                                                final ImageView fishNext = (ImageView) findViewById(R.id.fish_next);

                                                fishNext.setOnClickListener(new OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        setContentView(R.layout.goat);
                                                        homeButton();
                                                        final ImageView goatImage = (ImageView) findViewById(R.id.goat_image);
                                                        final MediaPlayer goatSound = MediaPlayer.create(AnimalScreen.this, R.raw.goat);
                                                        goatSound.start();
                                                        sound(goatImage, goatSound);
                                                        final ImageView goatNext = (ImageView) findViewById(R.id.goat_next);

                                                        goatNext.setOnClickListener(new OnClickListener() {
                                                            @Override
                                                            public void onClick(View v) {
                                                                setContentView(R.layout.horse);
                                                                homeButton();
                                                                final ImageView horseImage = (ImageView) findViewById(R.id.horse_image);
                                                                final MediaPlayer horseSound = MediaPlayer.create(AnimalScreen.this, R.raw.horse);
                                                                horseSound.start();
                                                                sound(horseImage, horseSound);
                                                                final ImageView horseNext = (ImageView) findViewById(R.id.horse_next);

                                                                horseNext.setOnClickListener(new OnClickListener() {
                                                                    @Override
                                                                    public void onClick(View v) {
                                                                        setContentView(R.layout.rabbit);
                                                                        homeButton();
                                                                        final ImageView rabbitImage = (ImageView) findViewById(R.id.rabbit_image);
                                                                        final MediaPlayer rabbitSound = MediaPlayer.create(AnimalScreen.this, R.raw.rabbit);
                                                                        rabbitSound.start();
                                                                        sound(rabbitImage, rabbitSound);
                                                                        final ImageView rabbitNext = (ImageView) findViewById(R.id.rabbit_next);

                                                                        rabbitNext.setOnClickListener(new OnClickListener() {
                                                                            @Override
                                                                            public void onClick(View v) {
                                                                                setContentView(R.layout.sheep);
                                                                                homeButton();
                                                                                final ImageView sheepImage = (ImageView) findViewById(R.id.sheep_image);
                                                                                final MediaPlayer sheepSound = MediaPlayer.create(AnimalScreen.this, R.raw.sheep);
                                                                                sheepSound.start();
                                                                                sound(sheepImage, sheepSound);
                                                                                final ImageView sheepNext = (ImageView) findViewById(R.id.sheep_next);

                                                                                sheepNext.setOnClickListener(new OnClickListener() {
                                                                                    @Override
                                                                                    public void onClick(View v) {
                                                                                        Intent animalIntent = new Intent(v.getContext(), AnimalScreen.class);
                                                                                        animalIntent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                                                                                        startActivity(animalIntent);
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
