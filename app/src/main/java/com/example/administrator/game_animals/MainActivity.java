package com.example.administrator.game_animals;

import android.app.Activity;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        super.onCreate(savedInstanceState);
        AssetManager mgr=getAssets();
        Typeface tf=Typeface.createFromAsset(mgr,"Fonts/font_one.TTF");
        TextView textView1=findViewById(R.id.btn_play),textView2=findViewById(R.id.btn_exit);
        textView1.setTypeface(tf);
        textView2.setTypeface(tf);

    }


    public void click_play(View view) {
        Intent intent = new Intent(MainActivity.this, GameActivity.class);
        startActivity(intent);

    }

    public void click_exit(View view) {
        Intent mHomeIntent = new Intent(Intent.ACTION_MAIN);

        mHomeIntent.addCategory(Intent.CATEGORY_HOME);

        startActivity(mHomeIntent);

    }
}
