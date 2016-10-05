package ${YYAndroidPackageName};

import ${YYAndroidPackageName}.R;
import com.yoyogames.runner.RunnerJNILib;

import android.content.Intent;
import android.content.IntentFilter;
import android.app.Activity;

public class androidshareclass{
public void android_share(String arg0) {
Intent shareTextIntent = new Intent();
shareTextIntent.setAction(Intent.ACTION_SEND);
shareTextIntent.putExtra(Intent.EXTRA_TEXT, arg0);
shareTextIntent.setType("text/plain");
Intent.createChooser(shareTextIntent, "Share With");
(RunnerActivity.CurrentActivity).startActivity(shareTextIntent);
}
}