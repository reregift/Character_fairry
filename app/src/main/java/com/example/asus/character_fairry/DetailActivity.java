package com.example.asus.character_fairry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        String cartoonName = intent.getStringExtra("cartoon_name");

        int cartoonImageId = intent.getIntExtra("cartoon_image", -1);

        TextView cartoonNameTextView = (TextView) findViewById(R.id.cartoon_name_text_view);
        cartoonNameTextView.setText(cartoonName);

        ImageView cartoonPictureImageView = (ImageView) findViewById(R.id.cartoon_picture_image_view);
        cartoonPictureImageView.setImageResource(cartoonImageId);

        Button backButton = (Button) findViewById(R.id.back_button);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}
