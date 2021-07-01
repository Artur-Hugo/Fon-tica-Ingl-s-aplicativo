package com.devoligastudio.fonetica_ingles;

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

import java.util.ArrayList;
import java.util.List;


public class Melhoradapter extends RecyclerView.Adapter<Melhoradapter.ExampleViewHolder> implements Filterable {
private ArrayList<Registros> mlistaos;
private OnItemClickListener mListener;

private List<Registros> registrosList;
private List<Registros> registrosListfull;

    @Override
    public Filter getFilter() {
        return examplefilter;
    }

    private Filter examplefilter = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            List<Registros> filteredlist = new ArrayList<>();

            if (constraint == null || constraint.length() == 0){
                filteredlist.addAll(registrosListfull);
            } else {
                String filterPattern = constraint.toString().toLowerCase().trim();

                for (Registros item : registrosListfull){
                    if (item.getmText1().toLowerCase().contains(filterPattern)){
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
mlistaos.clear();
mlistaos.addAll((List) results.values);
notifyDataSetChanged();
        }
    };



    public interface OnItemClickListener{
    void onItemClick(TextView exampleViewHolder);
}

public void setOnItemClickListener(OnItemClickListener listener) {
    mListener = listener;
}

    public Melhoradapter(ArrayList<Registros> listaos){
        mlistaos = listaos;
        registrosListfull = new ArrayList<>(listaos);
    }
    @NonNull
    @Override
    public ExampleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,parent,false);
       ExampleViewHolder evh = new ExampleViewHolder(v, mListener);

        return evh;
    }

    @Override
    public void onBindViewHolder(@NonNull ExampleViewHolder holder, int position) {
            Registros currentItem = mlistaos.get(position);
            holder.mimageView.setImageResource(currentItem.getmImageResource());
            holder.mtext1.setText(currentItem.getmText1());
    }

    @Override
    public int getItemCount() {
        return mlistaos.size();
    }

    public static class ExampleViewHolder extends RecyclerView.ViewHolder{
       public ImageView mimageView;
       public TextView mtext1;
        public ExampleViewHolder (View itemView, final OnItemClickListener listener){
            super(itemView);
            mimageView = itemView.findViewById(R.id.imageView);
            mtext1 = itemView.findViewById(R.id.textView);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                       if(listener != null){
                           final int position = getAdapterPosition();
                           if(position != RecyclerView.NO_POSITION){
                              listener.onItemClick(mtext1);
                           }
                       }
                }
            });

        }
    }


}
