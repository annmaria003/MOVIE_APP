package com.example.movieapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ADD_MOVIE extends AppCompatActivity {

    EditText movieName, language, directorName, actorName, actressName, releaseYear;
    Button submitButton, backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_movie);

        movieName = (EditText) findViewById(R.id.movie_name);
        language = (EditText) findViewById(R.id.language);
        directorName = (EditText) findViewById(R.id.director_name);
        actorName = (EditText) findViewById(R.id.actor_name);
        actressName = (EditText) findViewById(R.id.actress_name);
        releaseYear = (EditText) findViewById(R.id.release_year);
        submitButton = (Button) findViewById(R.id.submit_button);
        backButton = (Button) findViewById(R.id.back_button);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String movie = movieName.getText().toString();
                String lang = language.getText().toString();
                String director = directorName.getText().toString();
                String actor = actorName.getText().toString();
                String actress = actressName.getText().toString();
                String year = releaseYear.getText().toString();

                Toast.makeText(ADD_MOVIE.this, "Movie Added Successfully", Toast.LENGTH_SHORT).show();
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), DASHBOARD.class);
                startActivity(intent);
            }
        });
    }
}