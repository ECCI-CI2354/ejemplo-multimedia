package ac.cr.ucr.ecci.android.ejemplomultimedia;

import java.io.IOException;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {
	MediaPlayer mPlayer;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

	@Override
	protected void onResume() {
		super.onResume();
		mPlayer = MediaPlayer.create(this, R.raw.barracuda);
	}
    
	public void play(View view){
		mPlayer.seekTo(0);
		mPlayer.start();
	}
	
	public void stop(View view){
		mPlayer.pause();
	}

	@Override
	protected void onPause() {
		super.onPause();
		mPlayer.release();
	}
 
	
}
