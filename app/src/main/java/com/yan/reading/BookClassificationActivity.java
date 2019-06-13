package com.yan.reading;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BookClassificationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_classification);
    }

    public void onClick2(View view) {
        Intent intent = new Intent();
        intent.setClass(BookClassificationActivity.this,ScienceActivity.class);
        startActivity(intent);
    }

    public void onClick3(View view) {
        Intent intent = new Intent();
        intent.setClass(BookClassificationActivity.this,NewsActivity.class);
        startActivity(intent);
    }
}
