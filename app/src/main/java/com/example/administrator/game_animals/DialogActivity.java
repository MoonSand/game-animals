package com.example.administrator.game_animals;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DialogActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
    }


    public void click_next(View view) {
        Intent intent = new Intent(DialogActivity.this, GameActivity1.class);
        startActivity(intent);


    }
}
