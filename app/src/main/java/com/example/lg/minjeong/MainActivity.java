package com.example.lg.minjeong;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.button).setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        Intent intent_act = new Intent(getApplicationContext(), Main2Activity.class);
                        startActivity(intent_act);
                    }
                }
        );
        findViewById(R.id.button2).setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        Intent intent_act = new Intent(getApplicationContext(), Main3Activity.class);
                        startActivity(intent_act);
                    }
                }
        );
    }
    public void onButtonClick(View v) {
        Toast.makeText(this, "반갑습니다!!", Toast.LENGTH_LONG).show();
    }
}
