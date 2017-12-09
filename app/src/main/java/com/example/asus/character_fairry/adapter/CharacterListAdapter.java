package com.example.asus.character_fairry.adapter;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import com.example.asus.character_fairry.R;
import com.example.asus.character_fairry.model.CharacterItem;

public class CharacterListAdapter extends ArrayAdapter<CharacterItem> {

    private Context mContext;

    private int mLayoutResId;

    private ArrayList<CharacterItem> mCartoonItemList;



    public CharacterListAdapter(@NonNull Context context, int layoutResId, @NonNull ArrayList<CharacterItem> FoodItemList) {

        super(context, layoutResId, FoodItemList);



        this.mContext = context;

        this.mLayoutResId = layoutResId;

        this.mCartoonItemList = FoodItemList;


    }



    @NonNull
    @Override

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(mContext);

        View itemLayout = inflater.inflate(mLayoutResId, null);



        CharacterItem item = mCartoonItemList.get(position);



        ImageView CartoonImageView = (ImageView) itemLayout.findViewById(R.id.Food_image_view);

        TextView CartoonTitleTextView = (TextView) itemLayout.findViewById(R.id.Food_title_text_view);

        TextView CartoonNumberTextView = (TextView) itemLayout.findViewById(R.id.Food_text_view);



        CartoonTitleTextView.setText(item.title);

        CartoonNumberTextView.setText(item.detail);

        String pictureFileName = item.picture;



        AssetManager am = mContext.getAssets();

        try {

            InputStream stream = am.open(pictureFileName);

            Drawable drawable = Drawable.createFromStream(stream, null);

            CartoonImageView.setImageDrawable(drawable);



        } catch (IOException e) {

            e.printStackTrace();



            File pictureFile = new File(mContext.getFilesDir(), pictureFileName);

            Drawable drawable = Drawable.createFromPath(pictureFile.getAbsolutePath());

            CartoonImageView.setImageDrawable(drawable);

        }



        return itemLayout;

    }
}
