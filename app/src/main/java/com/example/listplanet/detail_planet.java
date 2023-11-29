package com.example.listplanet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.io.InputStream;

public class detail_planet extends AppCompatActivity {
    String namaPlanet,diameterPlanet, detailPlanet;
    int photoPlanet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_planet);
        setActionBarTitle(title);
        Bundle extras = getIntent().getExtras();
        namaPlanet = extras.getString("NamaPlanet");
        diameterPlanet = extras.getString("DiameterPlanet");
        detailPlanet = extras.getString("DetailPlanet");
        photoPlanet = extras.getInt("imgPlanet");
        TextView tvnamaPlanet = findViewById(R.id.tv_namaPlanet_formDetail);
        TextView tvdiamaterPlanet = findViewById(R.id.tv_diameterPlanet_formDetail);
        TextView tvdetailPlanet = findViewById(R.id.tv_detailPlanet_formDetail);
        ImageView imgPlanet = findViewById(R.id.img_planet_detail);
        tvnamaPlanet.setText(namaPlanet);
        tvdiamaterPlanet.setText(diameterPlanet);
        tvdetailPlanet.setText(detailPlanet);
        Glide.with(this.getApplicationContext())
                .load(photoPlanet)
                .apply(new RequestOptions())
                .into(imgPlanet);
    }
    private String title = "Detail Planet Page";
    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_share, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {

            case R.id.action_share:
                String text = namaPlanet+" "+detailPlanet;
                Uri pictureUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.bumi);
                Intent shareIntent = new Intent();
                shareIntent.setAction(Intent.ACTION_SEND);
                shareIntent.putExtra(Intent.EXTRA_TEXT, text);
                //shareIntent.putExtra(Intent.EXTRA_STREAM, pictureUri);
                //shareIntent.setType("image/*");
                shareIntent.setType("text/plain");
                shareIntent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
                startActivity(Intent.createChooser(shareIntent, "Share..."));
                break;
        }
    }
}