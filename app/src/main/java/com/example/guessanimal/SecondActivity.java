package com.example.guessanimal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.guessanimal.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {
    ActivitySecondBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_second);
    }
    private void getValue() {
        String extraValue;
       Intent intent = getIntent();
        extraValue = intent.getStringExtra("key");
        binding.tvAnswer.setText(extraValue);
    }
}
