package com.example.admin.game_v10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import android.media.MediaPlayer;


public class MainActivity extends AppCompatActivity {

    ImageView iw,iw1,iw2,iw3,iw4,iw5,iw6,iw7,iw8,iw9,iw10,iw11;

    int count[]={0,0,0,0,0,0,0,0,0,0,0,0};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iw = (ImageView) findViewById(R.id.scene);
        iw1 = (ImageView) findViewById(R.id.scene2);
        iw2 = (ImageView) findViewById(R.id.scene3);
        iw3 = (ImageView) findViewById(R.id.scene4);
        iw4 = (ImageView) findViewById(R.id.scene5);
        iw5 = (ImageView) findViewById(R.id.scene6);
        iw6 = (ImageView) findViewById(R.id.scene7);
        iw7 = (ImageView) findViewById(R.id.scene8);
        iw8 = (ImageView) findViewById(R.id.scene9);
        iw9 = (ImageView) findViewById(R.id.scene10);
        iw10 = (ImageView) findViewById(R.id.scene11);
        iw11 = (ImageView) findViewById(R.id.scene12);


       /* Button one = (Button)this.findViewById(R.id.button1);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.soho);
        one.setOnClickListener(new OnClickListener(){

            public void onClick(View v) {
                mp.start();
            }
        });*/


        /*

        final MediaPlayer mp2 = MediaPlayer.create(this, R.raw.elephant);
        final MediaPlayer mp3 = MediaPlayer.create(this, R.raw.cow);
        final MediaPlayer mp4 = MediaPlayer.create(this, R.raw.tiger);
        final MediaPlayer mp5 = MediaPlayer.create(this, R.raw.rhino);
        final MediaPlayer mp6 = MediaPlayer.create(this, R.raw.monkey);
        final MediaPlayer mp7 = MediaPlayer.create(this, R.raw.bear);
*/

        iw.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                count[0]=(count[0]+1)%2;
                MediaPlayer mp;
                mp=change(0);
                mp.start();
                while (mp.isPlaying()) {
                    // do nothing
                }
                mp.release();



            }
        });
        iw1.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                count[1]=(count[1]+1)%2;
                MediaPlayer mp;
                mp=change(1);
                mp.start();
                while (mp.isPlaying()) {
                    // do nothing
                }
                mp.release();

            }
        });
        iw2.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                count[2]=(count[2]+1)%2;
                MediaPlayer mp;
                mp=change(2);
                mp.start();
                while (mp.isPlaying()) {
                    // do nothing
                }
                mp.release();

            }
        });
        iw3.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                count[3]=(count[3]+1)%2;
                MediaPlayer mp;
                mp=change(3);
                mp.start();
                while (mp.isPlaying()) {
                    // do nothing
                }
                mp.release();

            }
        });
        iw4.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                count[4]=(count[4]+1)%2;
                MediaPlayer mp;
                mp=change(4);
                mp.start();
                while (mp.isPlaying()) {
                    // do nothing
                }
                mp.release();

            }
        });
        iw5.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                count[5]=(count[5]+1)%2;
                MediaPlayer mp;
                mp=change(5);
                mp.start();
                while (mp.isPlaying()) {
                    // do nothing
                }
                mp.release();

            }
        });
        iw6.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                count[6]=(count[6]+1)%2;
                MediaPlayer mp;
                mp=change(6);
                mp.start();
                while (mp.isPlaying()) {
                    // do nothing
                }
                mp.release();
            }
        });
        iw7.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                count[7]=(count[7]+1)%2;
                MediaPlayer mp;
                mp=change(7);
                mp.start();
                while (mp.isPlaying()) {
                    // do nothing
                }
                mp.release();
            }
        });
        iw8.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                count[8]=(count[8]+1)%2;
                MediaPlayer mp;
                mp=change(8);
                mp.start();
                while (mp.isPlaying()) {
                    // do nothing
                }
                mp.release();

            }
        });
        iw9.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                count[9]=(count[9]+1)%2;
                MediaPlayer mp;
                mp=change(9);
                mp.start();
                while (mp.isPlaying()) {
                    // do nothing
                }
                mp.release();

            }
        });
        iw10.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                count[10]=(count[10]+1)%2;
                MediaPlayer mp;
                mp=change(10);
                mp.start();
                while (mp.isPlaying()) {
                    // do nothing
                }
                mp.release();

            }
        });
        iw11.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                count[11]=(count[11]+1)%10;
                MediaPlayer mp;
                mp=change(11);
                mp.start();
                while (mp.isPlaying()) {
                    // do nothing
                }
                mp.release();

            }
        });
    }




    MediaPlayer change(int i)
    {


        if(count[i]%2==0)
        {
            switch (i)
            {
                case 0:iw.setImageResource(R.drawable.dog);
                    final MediaPlayer mp = MediaPlayer.create(this, R.raw.dog);
                    return mp;

                case 1:iw1.setImageResource(R.drawable.cat);
                    final MediaPlayer mp1 = MediaPlayer.create(this, R.raw.cat);
                    return mp1;

                case 2:iw2.setImageResource(R.drawable.elephant);
                    final MediaPlayer mp2 = MediaPlayer.create(this, R.raw.elephant);
                    return mp2;
                case 3:iw3.setImageResource(R.drawable.cow);
                    final MediaPlayer mp3 = MediaPlayer.create(this, R.raw.cow);
                    return mp3;
                case 4:iw4.setImageResource(R.drawable.whitetiger);
                    final MediaPlayer mp4 = MediaPlayer.create(this, R.raw.tiger);
                    return mp4;
                case 5:iw5.setImageResource(R.drawable.rhino);
                    final MediaPlayer mp5 = MediaPlayer.create(this, R.raw.rhino);
                    return mp5;
                case 6:iw6.setImageResource(R.drawable.monkey);
                    final MediaPlayer mp6 = MediaPlayer.create(this, R.raw.monkey);
                    return mp6;
                case 7:iw7.setImageResource(R.drawable.bear);
                    final MediaPlayer mp7 = MediaPlayer.create(this, R.raw.bear);
                    return mp7;
                case 8:iw8.setImageResource(R.drawable.hippo);
                    final MediaPlayer mp8 = MediaPlayer.create(this, R.raw.hippo);
                    return mp8;
                case 9:iw9.setImageResource(R.drawable.gorilla);
                    final MediaPlayer mp9 = MediaPlayer.create(this, R.raw.gorilla);
                    return mp9;
                case 10:iw10.setImageResource(R.drawable.panther);
                    final MediaPlayer mp10 = MediaPlayer.create(this, R.raw.panther);
                    return mp10;
                case 11:iw11.setImageResource(R.drawable.penguin);
                    final MediaPlayer mp11 = MediaPlayer.create(this, R.raw.penguin);
                    return mp11;

            }


        }
        else if(count[i]%2!=0)
        {
            switch (i)
            {
                case 0:iw.setImageResource(R.drawable.dog1);
                    final MediaPlayer mp = MediaPlayer.create(this, R.raw.dog);
                    return mp;
                case 1:iw1.setImageResource(R.drawable.cat1);
                    final MediaPlayer mp1 = MediaPlayer.create(this, R.raw.cat);
                    return mp1;
                case 2:iw2.setImageResource(R.drawable.elephant1);
                    final MediaPlayer mp2 = MediaPlayer.create(this, R.raw.elephant);
                    return mp2;
                case 3:iw3.setImageResource(R.drawable.cow1);
                    final MediaPlayer mp3 = MediaPlayer.create(this, R.raw.cow);
                    return mp3;
                case 4:iw4.setImageResource(R.drawable.whitetiger1);
                    final MediaPlayer mp4 = MediaPlayer.create(this, R.raw.tiger);
                    return mp4;
                case 5:iw5.setImageResource(R.drawable.rhino1);
                    final MediaPlayer mp5 = MediaPlayer.create(this, R.raw.rhino);
                    return mp5;
                case 6:iw6.setImageResource(R.drawable.monkey1);
                    final MediaPlayer mp6 = MediaPlayer.create(this, R.raw.monkey);
                    return mp6;
                case 7:iw7.setImageResource(R.drawable.bear1);
                    final MediaPlayer mp7 = MediaPlayer.create(this, R.raw.bear);
                    return mp7;
                case 8:iw8.setImageResource(R.drawable.hippo1);
                    final MediaPlayer mp8 = MediaPlayer.create(this, R.raw.hippo);
                    return mp8;
                case 9:iw9.setImageResource(R.drawable.gorilla1);
                    final MediaPlayer mp9 = MediaPlayer.create(this, R.raw.gorilla);
                    return mp9;
                case 10:iw10.setImageResource(R.drawable.panther1);
                    final MediaPlayer mp10 = MediaPlayer.create(this, R.raw.panther);
                    return mp10;
                case 11:iw11.setImageResource(R.drawable.penguin1);
                    final MediaPlayer mp11 = MediaPlayer.create(this, R.raw.penguin);
                    return mp11;

            }

        }

        final MediaPlayer mp12 = MediaPlayer.create(this, R.raw.cat);
        return mp12;

    }



}
