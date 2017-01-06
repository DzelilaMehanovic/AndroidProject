package ba.edu.ibu.cankid;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.ImageView;

import static android.R.attr.button;
import static android.R.attr.data;
import static java.security.AccessController.getContext;


public class MainActivity extends AppCompatActivity {
    // Identifier for each type of Dialog
    private static final int ALERTTAG = 0, PROGRESSTAG = 1;

    private static final String TAG = "AlertDialogActivity";
    private ImageView closeButton = null;
    private DialogFragment dialogClose;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // Intent mainIntent = new Intent(MainActivity.this, MainActivity.class);
        //mainIntent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);

        //close button
        closeButton = (ImageView) findViewById(R.id.button_close);
        closeButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialogFragment(ALERTTAG);
            }
        });


        final Button colorButton = (Button) findViewById(R.id.button_colors);
        final Button animalButton = (Button) findViewById(R.id.button_animals);
        final Button numberButton = (Button) findViewById(R.id.button_numbers);
        final Button playButton = (Button) findViewById(R.id.button_play);
        final MediaPlayer colorSound = MediaPlayer.create(MainActivity.this, R.raw.colour);
        final MediaPlayer animalSound = MediaPlayer.create(MainActivity.this, R.raw.animal);
        final MediaPlayer numberSound = MediaPlayer.create(MainActivity.this, R.raw.number);
        final MediaPlayer playSound = MediaPlayer.create(MainActivity.this, R.raw.play);



        //color button click
        colorButton.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                colorSound.start();
                colorSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer arg0) {
                        Intent colorIntent = new Intent(MainActivity.this,ColorScreen.class);
                        colorIntent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                        startActivity(colorIntent);
                    }
                });

            }
        });


        //animal button click
        animalButton.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                animalSound.start();
                animalSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer arg0) {
                        Intent animalIntent = new Intent(MainActivity.this, AnimalScreen.class);
                        animalIntent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                        startActivity(animalIntent);
                    }
                });

            }
        });
        //numbers button click
        numberButton.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                numberSound.start();
                numberSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer arg0) {
                        Intent numberIntent = new Intent(MainActivity.this, NumberScreen.class);
                        numberIntent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                        startActivity(numberIntent);
                    }
                });

            }
        });

        //play button click
        playButton.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                playSound.start();
                playSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer arg0) {
                        Intent playIntent = new Intent(MainActivity.this, PlayScreen.class);
                       // playIntent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                        startActivity(playIntent);
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
    void showDialogFragment(int dialogID) {
        switch (dialogID) {
            case ALERTTAG:
                dialogClose = AlertDialogFragment.newInstance();
                dialogClose.show(getFragmentManager(), "Alert");
                break;
            case PROGRESSTAG:
                dialogClose = ProgressDialogFragment.newInstance();
                dialogClose.show(getFragmentManager(), "Shutdown");
                break;
        }
    }
    private void continueShutdown(boolean shouldContinue) {
        if (shouldContinue) {
            closeButton.setEnabled(false);
            showDialogFragment(PROGRESSTAG);
            finishShutdown();
        } else {
            dialogClose.dismiss();
        }
    }
private void finishShutdown() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Log.i(TAG, e.toString());
                } finally {
                   finish();
                }
            }
        }).start();
    }
    public static class AlertDialogFragment extends DialogFragment {
        public static AlertDialogFragment newInstance() {
            return new AlertDialogFragment();
        }
        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            return new AlertDialog.Builder(getActivity())
                    .setMessage("Do you want to finish")
                    .setCancelable(false)
                    .setNegativeButton("No",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,
                                                    int id) {
                                    ((MainActivity) getActivity())
                                            .continueShutdown(false);
                                }
                            })
                    .setPositiveButton("Yes",
                            new DialogInterface.OnClickListener() {
                                public void onClick(
                                        final DialogInterface dialog, int id) {
                                    ((MainActivity) getActivity()).continueShutdown(true);
                                }
                            }).create();
        }
    }
    public static class ProgressDialogFragment extends DialogFragment {
        public static ProgressDialogFragment newInstance() {
            return new ProgressDialogFragment();
        }
        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            final ProgressDialog dialog = new ProgressDialog(getActivity());
            dialog.setMessage("Goodbye, see you later");
            dialog.setIndeterminate(true);

            return dialog;
        }
    }
}