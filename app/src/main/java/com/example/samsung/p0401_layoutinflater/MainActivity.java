package com.example.samsung.p0401_layoutinflater;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    final String LOG_TAG = "myLogs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        LayoutInflater layoutInflater = getLayoutInflater();

        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.linLayout);
        View view1 = layoutInflater.inflate(R.layout.text, linearLayout, true);
        ViewGroup.LayoutParams layoutParams1 = view1.getLayoutParams();

        Log.d(LOG_TAG, "Class of view: " + view1.getClass().toString());
        Log.d(LOG_TAG, "Class of LayoutParams of view: " + layoutParams1.getClass().toString());

        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relLayout);
        View view2 = layoutInflater.inflate(R.layout.text, relativeLayout, true);
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();

        Log.d(LOG_TAG, "Class of view: " + view2.getClass().toString());
        Log.d(LOG_TAG, "Class of LayoutParams of view: " + layoutParams2.getClass().toString());
    }
}
