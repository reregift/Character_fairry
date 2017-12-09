package com.example.asus.character_fairry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SelectCategory extends AppCompatActivity {

    ImageButton mCetagory1_button ;
    ImageButton mCetagory2_button ;
    ImageButton mCetagory3_button ;
    ImageButton mCetagory4_button ;
    ImageButton mCetagory5_button ;
    ImageButton mCetagory6_button ;
    ImageButton mCetagory7_button ;
    ImageButton mCetagory8_button ;
    ImageButton mCetagory9_button ;
    ImageButton mCetagory10_button ;
    ImageButton mCetagory11_button ;
    ImageButton mCetagory12_button ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_category);

        mCetagory1_button = (ImageButton) findViewById(R.id.mCetagory1_button);
        mCetagory2_button = (ImageButton) findViewById(R.id.mCetagory2_button);
        mCetagory3_button = (ImageButton) findViewById(R.id.mCetagory3_button);
        mCetagory4_button = (ImageButton) findViewById(R.id.mCetagory4_button);
        mCetagory5_button = (ImageButton) findViewById(R.id.mCetagory5_button);
        mCetagory6_button = (ImageButton) findViewById(R.id.mCetagory6_button);
        mCetagory7_button = (ImageButton) findViewById(R.id.mCetagory7_button);
        mCetagory8_button = (ImageButton) findViewById(R.id.mCetagory8_button);
        mCetagory9_button = (ImageButton) findViewById(R.id.mCetagory9_button);
        mCetagory10_button = (ImageButton) findViewById(R.id.mCetagory10_button);
        mCetagory11_button = (ImageButton) findViewById(R.id.mCetagory11_button);
        mCetagory12_button = (ImageButton) findViewById(R.id.mCetagory12_button);




        mCetagory1_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SelectCategory.this,Category.class);//(context.คลาสปลายทางที่จะรัน)
                intent.putExtra("type","1"); //ส่งค่าไปแอคทิวิตีปลายทาง
                startActivity(intent);
            }
        });

        mCetagory2_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SelectCategory.this,Category.class);//(context.คลาสปลายทางที่จะรัน)
                intent.putExtra("type","2"); //ส่งค่าไปแอคทิวิตีปลายทาง
                startActivity(intent);
            }
        });

        mCetagory3_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SelectCategory.this,Category.class);//(context.คลาสปลายทางที่จะรัน)
                intent.putExtra("type","3"); //ส่งค่าไปแอคทิวิตีปลายทาง
                startActivity(intent);
            }
        });

        mCetagory4_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SelectCategory.this,Category.class);//(context.คลาสปลายทางที่จะรัน)
                intent.putExtra("type","4"); //ส่งค่าไปแอคทิวิตีปลายทาง
                startActivity(intent);
            }
        });

        mCetagory5_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SelectCategory.this,Category.class);//(context.คลาสปลายทางที่จะรัน)
                intent.putExtra("type","5"); //ส่งค่าไปแอคทิวิตีปลายทาง
                startActivity(intent);
            }
        });

        mCetagory6_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SelectCategory.this,Category.class);//(context.คลาสปลายทางที่จะรัน)
                intent.putExtra("type","6"); //ส่งค่าไปแอคทิวิตีปลายทาง
                startActivity(intent);
            }
        });

        mCetagory7_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SelectCategory.this,Category.class);//(context.คลาสปลายทางที่จะรัน)
                intent.putExtra("type","7"); //ส่งค่าไปแอคทิวิตีปลายทาง
                startActivity(intent);
            }
        });

        mCetagory8_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SelectCategory.this,Category.class);//(context.คลาสปลายทางที่จะรัน)
                intent.putExtra("type","8"); //ส่งค่าไปแอคทิวิตีปลายทาง
                startActivity(intent);
            }
        });

        mCetagory9_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SelectCategory.this,Category.class);//(context.คลาสปลายทางที่จะรัน)
                intent.putExtra("type","9"); //ส่งค่าไปแอคทิวิตีปลายทาง
                startActivity(intent);
            }
        });

        mCetagory10_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SelectCategory.this,Category.class);//(context.คลาสปลายทางที่จะรัน)
                intent.putExtra("type","10"); //ส่งค่าไปแอคทิวิตีปลายทาง
                startActivity(intent);
            }
        });


        mCetagory11_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SelectCategory.this,Category.class);//(context.คลาสปลายทางที่จะรัน)
                intent.putExtra("type","11"); //ส่งค่าไปแอคทิวิตีปลายทาง
                startActivity(intent);
            }
        });

        mCetagory12_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SelectCategory.this,Category.class);//(context.คลาสปลายทางที่จะรัน)
                intent.putExtra("type","12"); //ส่งค่าไปแอคทิวิตีปลายทาง
                startActivity(intent);
            }
        });


    }
}