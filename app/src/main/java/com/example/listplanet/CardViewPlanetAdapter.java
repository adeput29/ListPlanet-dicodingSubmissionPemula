package com.example.listplanet;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardViewPlanetAdapter extends RecyclerView.Adapter<CardViewPlanetAdapter.CardViewPlanetAdapter_ViewHolder> {
    private ArrayList<Planet> listplanet;
    private OnItemClickCallback onItemClickCallback;
    public CardViewPlanetAdapter(ArrayList<Planet> list) {
        this.listplanet = list;
    }

    @NonNull
    @Override
    public CardViewPlanetAdapter_ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview_planet, parent, false);
        return new CardViewPlanetAdapter_ViewHolder(view);
    }

    public void setOnItemClickCallback(CardViewPlanetAdapter.OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public interface OnItemClickCallback  {
        void onItemClicked(Planet planet);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewPlanetAdapter_ViewHolder holder, int position) {
        Planet planet = listplanet.get(position);
        Glide.with(holder.itemView.getContext())
                .load(planet.getPhotoPlanet())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imgPlanet);
        holder.tvPlanet.setText(planet.getNamaPlanet());
        holder.tvDetailPlanet.setText(planet.getDiameterPlanet());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listplanet.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listplanet.size();
    }

    public class CardViewPlanetAdapter_ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPlanet;
        TextView tvPlanet, tvDetailPlanet;


        public CardViewPlanetAdapter_ViewHolder(View itemView) {
            super(itemView);
            imgPlanet = itemView.findViewById(R.id.img_item_planet);
            tvPlanet = itemView.findViewById(R.id.tv_namaPlanet);
            tvDetailPlanet = itemView.findViewById(R.id.tv_detailPlanet);
        }
    }
}
