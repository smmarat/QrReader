package net.multipi.QrReader;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created with IntelliJ IDEA.
 * User: marat
 * Date: 1/14/13
 * Time: 3:07 PM
 */
public class ResultActivity extends Activity {

    public static final String RESULT = "result";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String s = intent.getStringExtra(RESULT);
        TextView tw = new TextView(this);
        tw.setGravity(Gravity.CENTER);
        tw.setTextSize(26);
        if (s!=null) {
            tw.setText(s);
        }
        setContentView(tw, new ViewGroup.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.FILL_PARENT));
    }
}
