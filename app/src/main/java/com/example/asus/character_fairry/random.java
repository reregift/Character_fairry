package com.example.asus.character_fairry;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class random extends AppCompatActivity {


    private static final String TAG = MainActivity.class.getSimpleName();

    private String[] mCartoon = {
            "Aurora","Rapunzel","Ariel",
            "Cinderella","Tiana","Merida",
            "Pocahontas","Belle","Jasmine",
            "Mulan","Snow white","Elsa",
    };

    private int[] mImageId = {
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

    private Random mRandom = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        Button randomButton = (Button) findViewById(R.id.random_show_button);
        randomButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                int randomIndex = mRandom.nextInt(mCartoon.length);
                String randomCartoon = mCartoon[randomIndex];
                int cartoonImageId = mImageId[randomIndex];
                Log.i(TAG,randomCartoon);

                Intent intent = new Intent(random.this,DetailActivity.class);
                intent.putExtra("cartoon_name",randomCartoon);
                intent.putExtra("cartoon_image",cartoonImageId);
                startActivity(intent);


            }
        });

    }
}
