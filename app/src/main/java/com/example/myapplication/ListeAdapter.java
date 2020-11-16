package com.example.myapplication;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import android.widget.ImageView;
import android.widget.TextView;

public class ListeAdapter extends  ArrayAdapter<Equipe> {
    Context context;

    public ListeAdapter(Context context, List<Equipe> listEquipe) {
        super(context, -1, listEquipe);
        this.context = context;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        View view;
        Equipe uneEquipe;
        view=null;

        if (convertView==null){
            LayoutInflater layoutInflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.ligne, parent, false);

        }else{
            view = convertView;
        }
        uneEquipe = getItem(position);
        TextView tvTitre1 = (TextView)view.findViewById(R.id.Titre1);
        TextView tvTitre2 = (TextView)view.findViewById(R.id.Titre2);
        ImageView imageView = (ImageView)view.findViewById(R.id.img);

        tvTitre1.setText(uneEquipe.getName());
        tvTitre2.setText(uneEquipe.getWording());

        AssetManager manager = context.getAssets();
        InputStream open = null;

        try {
            open = manager.open(uneEquipe.getImage());
            Bitmap bitmap = BitmapFactory.decodeStream(open);
            imageView.setImageBitmap(bitmap);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return view;
    }
}
