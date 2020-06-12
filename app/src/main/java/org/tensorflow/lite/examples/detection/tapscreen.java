package org.tensorflow.lite.examples.detection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class tapscreen extends AppCompatActivity {
MediaPlayer player;
LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tapscreen);
        if(player==null){
            player=MediaPlayer.create(this,R.raw.tt);
        }
        player.start();
        linearLayout=findViewById(R.id.lin);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kk = new Intent(tapscreen.this,DetectorActivity.class);
                startActivity(kk);
                if(player!=null){
                    player.pause();
                    player.release();
                    player=null;
                }
            }
        });

    }
}
