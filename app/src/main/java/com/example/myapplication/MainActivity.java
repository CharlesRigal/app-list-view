package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ArrayList<Equipe>listEquipe;
    Equipe e1 = new Equipe(1,"Avengers","Super héros Marvel", "avangers/Avangers.jpg");
    Equipe e2 = new Equipe(2,"JLA","Super héros DC", "jla/Jla.png");
    Equipe e3 = new Equipe(3,"X-Men","Super héros Mutants", "xmen/xmen.png");

    ListView lvListe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listEquipe = new ArrayList<Equipe>();
        listEquipe.add(e1);
        listEquipe.add(e2);
        listEquipe.add(e3);

        lvListe = (ListView)findViewById(R.id.ListView1);

    }

    @Override
    protected  void onResume() {
        super.onResume();
        ListeAdapter listeAdapter = new ListeAdapter(this, listEquipe);
        lvListe.setAdapter(listeAdapter);
    }

}