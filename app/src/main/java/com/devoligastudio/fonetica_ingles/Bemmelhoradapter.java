package com.devoligastudio.fonetica_ingles;

import android.graphics.drawable.Drawable;
import android.inputmethodservice.Keyboard;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.devoligastudio.fonetica_ingles.recyclerviewproject.Registros;
import com.devoligastudio.fonetica_ingles.recyclerviewproject.Registrotudo;
import com.google.android.material.resources.MaterialResources;


import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class Bemmelhoradapter extends RecyclerView.Adapter<Bemmelhoradapter.ExemploViewHolder> implements Filterable {
    ArrayList<Registrotudo> mtodos;
    ArrayList<Registrotudo> mui;
    private List<Registrotudo> registrosListfull;
    private OnItemClickListener mlistener;



    @Override
    public Filter getFilter() {
        return examplefilter;
    }
private Filter examplefilter = new Filter() {
    @Override
    protected FilterResults performFiltering(CharSequence constraint) {
        List<Registrotudo> filteredlist = new ArrayList<>();

        if (constraint == null || constraint.length() == 0){
            filteredlist.addAll(registrosListfull);
        } else {
            String filterPattern = constraint.toString().toLowerCase().trim();

            for (Registrotudo item : registrosListfull){
                if (item.getTexto1().toLowerCase().contains(filterPattern)){
                    filteredlist.add(item);
                }
            }
        }
        FilterResults results = new FilterResults();
        results.values = filteredlist;

        return results;
    }

    @Override
    protected void publishResults(CharSequence constraint, FilterResults results) {
        mtodos.clear();
        mtodos.addAll((List) results.values);
        notifyDataSetChanged();
    }
};{

    }

    public interface OnItemClickListener{
        void onItemClick(TextView exa);
    }




public Bemmelhoradapter(ArrayList<Registrotudo> todos){

    mtodos = todos;
    registrosListfull = new ArrayList(todos);

    }
    public void setOnClicksetOnItemClickListener(OnItemClickListener listener){ mlistener = listener;}
    @NonNull
    @Override
    public ExemploViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.fonetica_list, parent,false);
        ExemploViewHolder evh = new ExemploViewHolder(v, mlistener);
        return evh;
    }

    @Override
    public void onBindViewHolder(@NonNull final ExemploViewHolder  holder, final int position) {
        final Registrotudo current = mtodos.get(position);
        holder.mtext1.setText(current.getTexto1());
        holder.mtext2.setText(current.getTexto2());
        holder.mtext3.setText(current.getTexto3());

/*final Registrotudo music = mui.get(position);

        holder.mtext1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mediaPlayer = MediaPlayer.create(music.getContext(), music.getSons());
                mediaPlayer.start();
            }
        });
*/

    }

    @Override
    public int getItemCount() {
        return mtodos.size();
    }



    public static class ExemploViewHolder extends RecyclerView.ViewHolder{
           public TextView mtext1;
        public TextView mtext2;
        public TextView mtext3;
        public Music msong;
        public ImageView volu;


        public ExemploViewHolder (View itemView, final OnItemClickListener listener) {
            super(itemView);
            mtext1 = itemView.findViewById(R.id.frase1id);
            mtext2 = itemView.findViewById(R.id.frase2id);
            mtext3 = itemView.findViewById(R.id.frase3id);
           volu = itemView.findViewById(R.id.som);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (listener != null) {
                        final int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION) {
                            listener.onItemClick(mtext1);
                        }
                    }
                }
            }
        );

    }


    }


}