package com.example.cameraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;

public class ImageActivity extends AppCompatActivity {
    private ImageView show_image;
    private String imgPath;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        startView();
        processview();
    }



    private void startView() {
        show_image = findViewById(R.id.show_image);
    }

    private void processview() {
      imgPath = getIntent().getExtras().get("img").toString();
        show_image.setImageURI(Uri.parse(imgPath));
    }
}