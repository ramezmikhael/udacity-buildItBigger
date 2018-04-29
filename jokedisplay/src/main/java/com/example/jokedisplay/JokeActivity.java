package com.example.jokedisplay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    public static final String ARG_JOKE = "arg_joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        // I am not using a library like ButterKnife just for simplicity!
        TextView tvJoke = findViewById(R.id.joke_textview);

        if(getIntent().hasExtra(ARG_JOKE))
            tvJoke.setText(getIntent().getStringExtra(ARG_JOKE));
    }
}
