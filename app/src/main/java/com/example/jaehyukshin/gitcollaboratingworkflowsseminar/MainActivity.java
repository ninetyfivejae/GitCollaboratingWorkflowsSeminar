package com.example.jaehyukshin.gitcollaboratingworkflowsseminar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button teamButton;
    Button stadiumButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        teamButton = (Button)findViewById(R.id.teamButton);
        teamButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "FC Barcelona", Toast.LENGTH_SHORT).show();
            }
        });

        stadiumButton = (Button)findViewById(R.id.stadiumButton);
        stadiumButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(getApplicationContext(), "Camp Nou", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
