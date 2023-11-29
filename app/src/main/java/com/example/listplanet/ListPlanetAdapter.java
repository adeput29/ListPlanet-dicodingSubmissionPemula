package com.example.listplanet;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListPlanetAdapter extends RecyclerView.Adapter<ListPlanetAdapter.ListViewHolder> {
    private final ArrayList<Planet> listplanet;
    private OnItemClickCallback onItemClickCallback;
    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public interface OnItemClickCallback  {
        void onItemClicked(Planet planet);
    }
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_planet, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        Planet planet = listplanet.get(position);
        Glide.with(holder.itemView.getContext())
                .load(planet.getPhotoPlanet())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPlanet);
        holder.tvPlanet.setText(planet.getNamaPlanet());
        holder.tvDiameter.setText(planet.getDiameterPlanet());
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

    public ListPlanetAdapter(ArrayList<Planet> list) {
        this.listplanet = list;
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPlanet;
        TextView tvPlanet, tvDiameter;
        ListViewHolder(View itemView) {
            super(itemView);
            imgPlanet = itemView.findViewById(R.id.img_planet_photo);
            tvPlanet = itemView.findViewById(R.id.tv_planet);
            tvDiameter = itemView.findViewById(R.id.tv_diameter);
        }
    }
}
