package com.example.firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = findViewById(R.id.button);
        Button btn2 = findViewById(R.id.button2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it1 = new Intent(getBaseContext(),MainActivity2.class);
                startActivity(it1);
            }
        });

       btn2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent it2 = new Intent(getBaseContext(),MainActivity3.class);
               startActivity(it2);
           }
       });



    }

}