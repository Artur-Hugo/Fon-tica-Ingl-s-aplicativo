package com.devoligastudio.fonetica_ingles;

import android.content.Context;
import android.media.Image;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyadapterGeral extends BaseAdapter  implements Filterable{
    private Context context;
    private ArrayList<Integer> Listid;
    private ArrayList<String> frase1;
    private ArrayList<String> frase2;
    private ArrayList<String> frase3;
    private int layout;
    MediaPlayer mediaPlayer ;


    public MyadapterGeral(Context context, ArrayList<Integer> listid, ArrayList<String> frase1, ArrayList<String> frase2, ArrayList<String> frase3) {
        this.context = context;
        this.Listid = listid;
        this.frase1 = frase1;
        this.frase2 = frase2;
        this.frase3 = frase3;

    }



    @Override
    public int getCount() {
        return frase1.size();
    }

    @Override
    public Object getItem(int position) {
        return frase2.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public Filter getFilter() {
        Filter filtro = new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence constraint) {
                FilterResults filtroresultado = new FilterResults();
                FilterResults filtroresultado2 = new FilterResults();
                FilterResults filtroresultado3 = new FilterResults();
                if(constraint == null|| constraint.length() == 0){

                    filtroresultado.values = frase1;
                    filtroresultado.count = frase1.size();


                    return filtroresultado;
                }else {
                    ArrayList<String> Filtered_names = new ArrayList<>();
                    String filterString = constraint.toString().toLowerCase();
                    String filterablestring;

                    for(int i = 0; i < frase1.size() && i<frase2.size(); i++){
                        filterablestring = frase1.get(i);

                        if(filterablestring.toLowerCase().contains(filterString)){
                            Filtered_names.add(filterablestring);
                        }
                    }
                    filtroresultado.values = Filtered_names;
                    filtroresultado.count = Filtered_names.size();
                }
                return filtroresultado;
            }



            @Override
            protected void publishResults(CharSequence constraint, FilterResults results) {
                frase1 = (ArrayList<String>) results.values;
                notifyDataSetChanged();


                /*if (results.count == 0)
                    notifyDataSetChanged();
                else {  namelist = (ArrayList<String>) results.values;

                    notifyDataSetChanged();
                }*/
            }


        }; return filtro;
    }

    public class Holderview{
        TextView frase1, frase2;
        ImageView som;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        Holderview holderview;
        if (convertView == null) {


            convertView = View.inflate(context, R.layout.fonetica_list,null);
          TextView text1 = (TextView) convertView.findViewById(R.id.frase1id);
            TextView text2 = (TextView) convertView.findViewById(R.id.frase2id);
            TextView text3 = (TextView) convertView.findViewById(R.id.frase3id);
            ImageView images = (ImageView) convertView.findViewById(R.id.som);

            // text2.setText(fonetica2.get(position));

            text1.setText(frase1.get(position));
            text2.setText(frase2.get(position));
            text3.setText(frase3.get(position));
            images.setImageResource(R.drawable.som);




            images.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer = MediaPlayer.create(context, Listid.get(position));
                    mediaPlayer.start();
                }
            });
        }
        else {
            convertView = View.inflate(context, R.layout.fonetica_list,null);
            TextView text1 = (TextView) convertView.findViewById(R.id.frase1id);
            TextView text2 = (TextView) convertView.findViewById(R.id.frase2id);
            TextView text3 = (TextView) convertView.findViewById(R.id.frase3id);
            ImageView images = (ImageView) convertView.findViewById(R.id.som);
            text1.setText(frase1.get(position));
            text2.setText(frase2.get(position));
            text3.setText(frase3.get(position));
            images.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer = MediaPlayer.create(context, Listid.get(position));
                    mediaPlayer.start();
                }
            });


        }


        return convertView;
    }

}
