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

public class AnimalScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bird);





        //final Button colorHomeButton=(Button) findViewById(R.id.colorsHomeButton);
       final ImageView homeIcon = (ImageView) findViewById(R.id.homeIcon);

        homeIcon.setOnClickListener(new OnClickListener(){
            public void onClick(View v) {
                Intent animalIntent = new Intent(v.getContext(), MainActivity.class);
                startActivityForResult(animalIntent,0);//MainActivity.this  getApplicationContext()
            }

        });

        final ImageView birdNext = (ImageView) findViewById(R.id.bird_next);
        birdNext.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.cat);
                final ImageView catNext = (ImageView) findViewById(R.id.cat_next);
                catNext.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        setContentView(R.layout.chicken);
                        final ImageView chickenNext = (ImageView) findViewById(R.id.chicken_next);

                        chickenNext.setOnClickListener(new OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                setContentView(R.layout.cow);

                                final ImageView cowNext = (ImageView) findViewById(R.id.cow_next);
                               cowNext.setOnClickListener(new OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        setContentView(R.layout.dog);

                                        final ImageView dogNext = (ImageView) findViewById(R.id.dog_next);
                                        dogNext.setOnClickListener(new OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                setContentView(R.layout.fish);
                                                final ImageView fishNext = (ImageView) findViewById(R.id.fish_next);
                                                fishNext.setOnClickListener(new OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        setContentView(R.layout.goat);
                                                        final ImageView goatNext = (ImageView) findViewById(R.id.goat_next);


                                                        goatNext.setOnClickListener(new OnClickListener() {
                                                            @Override
                                                            public void onClick(View v) {
                                                                setContentView(R.layout.horse);
                                                                final ImageView horseNext = (ImageView) findViewById(R.id.horse_next);
                                                                horseNext.setOnClickListener(new OnClickListener() {
                                                                    @Override
                                                                    public void onClick(View v) {

                                                                        setContentView(R.layout.rabbit);
                                                                        final ImageView rabbitNext = (ImageView) findViewById(R.id.rabbit_next);

                                                                        rabbitNext.setOnClickListener(new OnClickListener() {
                                                                            @Override
                                                                            public void onClick(View v) {
                                                                                setContentView(R.layout.sheep);

                                                                                final ImageView sheepNext = (ImageView) findViewById(R.id.sheep_next);


                                                                                sheepNext.setOnClickListener(new OnClickListener() {
                                                                                    @Override
                                                                                    public void onClick(View v) {
                                                                                        setContentView(R.layout.bird);
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
