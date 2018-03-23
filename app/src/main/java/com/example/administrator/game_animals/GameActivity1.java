package com.example.administrator.game_animals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class GameActivity1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_game1);
        super.onCreate(savedInstanceState);

    }
    public void click_image(View view) {

        if(view.getTag()==((Button)findViewById(R.id.btn_display)).getText())
        {
            Intent it=new Intent(GameActivity1.this,DialogActivity.class);
            startActivity(it);
        }else{

        }

    }


}
