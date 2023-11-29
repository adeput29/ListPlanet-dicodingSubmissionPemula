package com.example.listplanet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvPlanet;
    private ArrayList<Planet> list = new ArrayList<>();
    private String title = "Nama Nama Pelanet - Mode CardView";
    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialView();
        list.addAll(dataplanet.getListData());
        showRecyclerCardView();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_utama, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);

    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {

            case R.id.action_list:
                title = "Nama Nama Pelanet - Mode ListView";
                setActionBarTitle(title);
                showRecyclerList();
                break;
            case R.id.action_cardview:
                title = "Nama Nama Pelanet - Mode CardView";
                setActionBarTitle(title);
                showRecyclerCardView();
                break;
            case R.id.about_page:
                Intent intent = new Intent(MainActivity.this, about.class);
                startActivity(intent);
                break;
        }
    }

    private void initialView() {
        rvPlanet = findViewById(R.id.rv_planet);
        rvPlanet.setHasFixedSize(true);
        setActionBarTitle(title);
    }

    private void showRecyclerList() {
        rvPlanet.setLayoutManager(new LinearLayoutManager(this));
        ListPlanetAdapter listPlanetAdapter = new ListPlanetAdapter(list);
        rvPlanet.setAdapter(listPlanetAdapter);
        listPlanetAdapter.setOnItemClickCallback(new ListPlanetAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Planet planet) {
                showSelectedAnggota(planet);
            }
        });
    }

    private void showSelectedAnggota(Planet planet) {
        Intent intent = new Intent(MainActivity.this, detail_planet.class);
        Bundle extras = new Bundle();
        extras.putString("NamaPlanet", planet.getNamaPlanet());
        extras.putString("DetailPlanet", planet.getDetailPlanet());
        extras.putInt("imgPlanet", planet.getPhotoPlanet());
        extras.putString("DiameterPlanet", planet.getDiameterPlanet());
        intent.putExtras(extras);
        startActivity(intent);
    }

    private void showRecyclerCardView(){
        rvPlanet.setLayoutManager(new LinearLayoutManager(this));
        CardViewPlanetAdapter cardViewAnggotaAdapter = new CardViewPlanetAdapter(list);
        rvPlanet.setAdapter(cardViewAnggotaAdapter);
        cardViewAnggotaAdapter.setOnItemClickCallback(new CardViewPlanetAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Planet planet) {
                showSelectedAnggota(planet);
            }
        });
    }
}