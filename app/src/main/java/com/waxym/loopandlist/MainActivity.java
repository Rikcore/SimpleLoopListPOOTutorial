package com.waxym.loopandlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //J'instancie une liste vide
        ArrayList<City> places = new ArrayList<City>();

        //J'instancie des objets avec mon modèle "City"
        City paris = new City("Paris", 2, "France");
        City toulouse = new City("Toulouse", 10, "France");
        City lyon = new City("Lyon", 5, "France");

        //J'édite la note de Paris grâce au "Setter"
        paris.setNotation(0);

        //J'ajoute les éléments à ma liste
        places.add(paris);
        places.add(toulouse);
        places.add(lyon);




        for(int i = 0; i < places.size(); i++){ //La boucle "for" permet de parcourir la liste, avec "i" comme index
            System.out.println(places.get(i).getName() + " " + places.get(i).getNotation() + "/10");
            //System.out.println permet d'afficher des informations dans la console "Logcat"
        }
    }
}
