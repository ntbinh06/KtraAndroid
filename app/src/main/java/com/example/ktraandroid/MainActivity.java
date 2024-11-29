package com.example.ktraandroid;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ImageButton ic_back = findViewById(R.id.ic_back);
        ic_back.setOnClickListener(view -> {
            Intent backIntent = new Intent(MainActivity.this, DangNhap.class);
            startActivity(backIntent);
        });
    }
}