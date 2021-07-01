package com.devoligastudio.fonetica_ingles;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class myadapter extends BaseAdapter implements Filterable {
    ArrayList<Listao> listaos = new ArrayList<>();
    private Context context;
    private ArrayList<Integer> Listid;
    private ArrayList<String> namelist;
    MediaPlayer mediaPlayer;

    public myadapter(Context context, ArrayList<Integer> listid, ArrayList<String> namelist) {
        this.context = context;
        Listid = listid;
        this.namelist = namelist;
    }

public class Listao{

}
    @Override
    public int getCount() {
        return namelist.size();
    }

    @Override
    public Object getItem(int position) {
        return namelist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        if(convertView == null){
            convertView = View.inflate(context, R.layout.item_list,null);
        }
        ImageView images = convertView.findViewById(R.id.imageView);
        TextView text = convertView.findViewById(R.id.textView);





       /*  images.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(context, Listid.get(position));
                mediaPlayer.start();
            }
        });*/
        text.setText(namelist.get(position));
images.setImageResource(Listid.get(position));

        return convertView;
    }



    @Override
    public Filter getFilter() {
        Filter filtro = new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence constraint) {
                FilterResults filtroresultado = new FilterResults();

                if(constraint == null|| constraint.length() == 0){

                    filtroresultado.values = context;
                    filtroresultado.count = namelist.size();
                    return filtroresultado;
                }else {
                   List<myadapter> auxconteudo = new ArrayList<myadapter>();




                     ArrayList<String> Filtered_names = new ArrayList<>();
                    String filterString = constraint.toString().toLowerCase();
                    String filterablestring;

                   for(int i = 0; i < namelist.size(); i++){
                        filterablestring = namelist.get(i);
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
               // namelist = (ArrayList<String>) results.values;
              //  notifyDataSetChanged();


                if (results.count == 0)
                    notifyDataSetInvalidated();
                else {  namelist = (ArrayList) results.values;


                    notifyDataSetChanged();
                }
            }


        }; return filtro;
    }
}
