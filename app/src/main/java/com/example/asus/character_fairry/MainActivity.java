package com.example.asus.character_fairry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    private final String[] mCartoon = {
            "Aurora", "Rapunzel", "Ariel",
            "Cinderella", "Tiana", "Merida",
            "Pocahontas", "Belle", "Jasmine",
            "Mulan", "Snow white", "Elsa",
    };

    private final int[] mImageId = {
            R.drawable.a11, //ชนิดข้อมูลแบบ integer
            R.drawable.a21,
            R.drawable.a31,
            R.drawable.a41,
            R.drawable.a51,
            R.drawable.a61,
            R.drawable.a71,
            R.drawable.a81,
            R.drawable.a91,
            R.drawable.a101,
            R.drawable.a111,
            R.drawable.a121
    };


    //-------------------------------------------------------------------------


    Button mStart_button;

    private final Random mRandom = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mStart_button = (Button) findViewById(R.id.start_button);


        mStart_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SelectCategory.class);//(context.คลาสปลายทางที่จะรัน)
                startActivity(intent);
            }
        });
//-----------------------------------------------------------------------------------------------------------



            Button randomButton = (Button) findViewById(R.id.random_button);
            randomButton.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    int randomIndex = mRandom.nextInt(mCartoon.length);
                    String randomCartoon = mCartoon[randomIndex];
                    int cartoonImageId = mImageId[randomIndex];
                    Log.i(TAG, randomCartoon);

                    Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                    intent.putExtra("cartoon_name", randomCartoon);
                    intent.putExtra("cartoon_image", cartoonImageId);
                    startActivity(intent);


                }
            });



    }
}

