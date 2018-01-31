package com.example.android.explicitintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ChildActivity extends AppCompatActivity {

    TextView mTextView;

//    TextView mDisplayText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

        mTextView = (TextView) findViewById(R.id.tv_display);
//
        Intent intent = getIntent();
        if(intent.hasExtra(Intent.EXTRA_TEXT)){
            String intentData = intent.getStringExtra(Intent.EXTRA_TEXT);
            mTextView.setText(intentData);
        }

    }
}
