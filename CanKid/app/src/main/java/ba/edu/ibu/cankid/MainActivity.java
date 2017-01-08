package ba.edu.ibu.cankid;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.media.MediaPlayer;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.ImageView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import static android.R.attr.button;
import static android.R.attr.data;
import static java.security.AccessController.getContext;


public class MainActivity extends AppCompatActivity {
    private static final int ALERTTAG = 0, PROGRESSTAG = 1;
    private static final int ID = 1;

    private static final String TAG = "Dialog";
    private ImageView closeButton = null;
    private DialogFragment dialogClose;

    public void showNotification() {
        Bitmap largeIcon = BitmapFactory.decodeResource(getResources(), R.drawable.goodbye_icons);
        NotificationCompat.Builder notification;
        notification = new NotificationCompat.Builder(this);
        notification.setAutoCancel(true);
        notification.setSmallIcon(R.drawable.goodbye_icons);
        int color = ContextCompat.getColor(this, R.color.colorBlue);
        notification.setColor(color);
        notification.setLargeIcon(largeIcon);
        notification.setContentTitle("CanKid");
        notification.setContentText("Play CanKid");
        Uri sound = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.notification2);
        notification.setSound(sound);

        Intent notificationIntent = new Intent(this, MainActivity.class);
        PendingIntent notificationPendingIntent = PendingIntent.getActivity(this, 0, notificationIntent,0);
        notification.setContentIntent(notificationPendingIntent);

        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        notificationManager.notify(ID, notification.build());

    }
    //start activity
    public void startActivityF(final Button buttonName, final MediaPlayer soundName, final Intent intentName) {
        buttonName.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                soundName.start();
                soundName.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer arg0) {
                        startActivity(intentName);
                    }
                });

            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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

        Intent colorIntent = new Intent(MainActivity.this, ColorScreen.class);
        Intent animalIntent = new Intent(MainActivity.this, AnimalScreen.class);
        Intent numberIntent = new Intent(MainActivity.this, NumberScreen.class);
        Intent playIntent = new Intent(MainActivity.this, PlayScreen.class);

        startActivityF(colorButton, colorSound, colorIntent);
        startActivityF(animalButton, animalSound, animalIntent);
        startActivityF(numberButton, numberSound, numberIntent);
        startActivityF(playButton, playSound, playIntent);


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
    public void onRestart() {
        super.onRestart();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        showNotification();
    }
    void showDialogFragment(int dialogID) {
        switch (dialogID) {
            case ALERTTAG:
                dialogClose = AlertDialogFragment.newInstance();
                dialogClose.show(getFragmentManager(), "");
                break;
            case PROGRESSTAG:
                dialogClose = ProgressDialogFragment.newInstance();
                dialogClose.show(getFragmentManager(), "");
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
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    Log.i(TAG, e.toString());
                } finally {
                    finish();
                  //  showNotification();
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
                    .setTitle("CanKid")
                    .setIcon(R.drawable.question_icons)
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
            dialog.setTitle("CanKid");
            dialog.setIndeterminate(true);
            dialog.setIcon(R.drawable.goodbye_icons);
            return dialog;
        }
    }
}