package com.devoligastudio.fonetica_ingles;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Filter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import com.devoligastudio.fonetica_ingles.recyclerviewproject.Registros;

import org.w3c.dom.Text;

import java.util.ArrayList;


public class Frase_Ingles extends AppCompatActivity  {
private RecyclerView mRecyclerView;
private Melhoradapter mAdapter;
private RecyclerView.LayoutManager layoutManager;


    private ListView lista;
private ArrayList palavras;
private ArrayList idimagem;
private myadapter madapter;




private Button atualizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frase__ingles);
      // final ArrayList<Registros> listaos = new ArrayList<>();

   /*     listaos.add(new Registros(R.drawable.aviaop,"Aeroporto"));
        listaos.add(new Registros(R.drawable.alimentacao,"Alimentacao"));
        listaos.add(new Registros(R.drawable.icone,"Basico"));
        listaos.add(new Registros(R.drawable.bebida,"Bebida"));
        listaos.add(new Registros(R.drawable.calendario,"Calendario"));
        listaos.add(new Registros(R.drawable.cores,"Cores"));
        listaos.add(new Registros(R.drawable.geral,"Geral"));
        listaos.add(new Registros(R.drawable.hotel,"Hotel"));
        listaos.add(new Registros(R.drawable.policia,"Policia"));
        listaos.add(new Registros(R.drawable.pprofissional,"Profissional"));
        listaos.add(new Registros(R.drawable.salao,"Salão"));
        listaos.add(new Registros(R.drawable.transporte,"Transporte"));
        listaos.add(new Registros(R.drawable.turismo,"Turismo"));
        listaos.add(new Registros(R.drawable.viajando, "Viajem"));
*/
       palavras = new ArrayList();
        idimagem = new ArrayList();
atualizar = (Button) findViewById(R.id.botaorefreshid);
atualizar.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(Frase_Ingles.this, Frase_Ingles.class);
        startActivity(intent);
    }
});

        lista = (ListView) findViewById(R.id.listaid);
 /*       mRecyclerView = findViewById(R.id.listaid);
        mRecyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        mAdapter = new Melhoradapter(listaos);

        mRecyclerView.setLayoutManager(layoutManager);
mRecyclerView.setAdapter(mAdapter);




mAdapter.setOnItemClickListener(new Melhoradapter.OnItemClickListener() {
    @Override
    public void onItemClick(TextView view) {
        view.toString();
        if(view.getText().toString().equals("Bebida"))

            Toast.makeText(Frase_Ingles.this,"Certo",Toast.LENGTH_LONG).show();

            Intent intent = new Intent(Frase_Ingles.this,Aviao.class);
        startActivity(intent);
        }

*/


 /*   @Override
    public void onItemClick(int position) {
        listaos.get(position);
        if (position == 1){
            getString(idimagem);
            Toast.makeText(Frase_Ingles.this,"Certo",Toast.LENGTH_LONG).show();
        }

    }
}); */



        palavras = getnomes();
idimagem = getumages();
madapter = new myadapter(Frase_Ingles.this,idimagem,palavras);
lista.setAdapter(madapter);




        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int valor;
                valor = position;
                Intent intent = new Intent(Frase_Ingles.this, Aviao.class);
                intent.putExtra("valor",valor);
                switch (position){
                    case 0:


                    Toast.makeText(Frase_Ingles.this,"Certo",Toast.LENGTH_LONG).show();


                break;
                    case 1:
                        break;

            }startActivity(intent);}
        });



    }


    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.example_menu,menu);

        MenuItem searchitem = menu.findItem(R.id.app_bar_search);
        SearchView searchView = (SearchView) searchitem.getActionView();

       searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
           @Override
           public boolean onQueryTextSubmit(String query) {
               return false;
           }

           @Override
           public boolean onQueryTextChange(String newText) {
              Frase_Ingles.this.madapter.getFilter().filter(newText);

               return false;
           }
       });
        return true;
    }
*/
    public ArrayList<Integer> getumages(){
        idimagem = new ArrayList();
        idimagem.add(R.drawable.aviaop);
        idimagem.add(R.drawable.alimentacao);
        idimagem.add(R.drawable.icone);
        idimagem.add(R.drawable.bebida);
        idimagem.add(R.drawable.calendario);
        idimagem.add(R.drawable.cores);
        idimagem.add(R.drawable.geral);
        idimagem.add(R.drawable.hotel);
        idimagem.add(R.drawable.policia);
        idimagem.add(R.drawable.pprofissional);
        idimagem.add(R.drawable.salao);
        idimagem.add(R.drawable.transporte);
        idimagem.add(R.drawable.turismo);
        idimagem.add(R.drawable.viajando);
        return idimagem;
    }
    public ArrayList<String> getnomes(){
        palavras = new ArrayList<>();
        palavras.add("Aeroporto");
        palavras.add("Alimentação");
        palavras.add("Basico");
        palavras.add("Bebida");
        palavras.add("Calendario");
        palavras.add("Cores");
        palavras.add("Geral");
        palavras.add("Hotel");
        palavras.add("Policia");
        palavras.add("Profissional");
        palavras.add("Salão");
        palavras.add("Transporte");
        palavras.add("Turismo");
        palavras.add("Viajando");

        return palavras;
    }


   /* public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.example_menu, menu);

        MenuItem searchItem = menu.findItem(R.id.app_bar_search);
        SearchView searchView = (SearchView) searchItem.getActionView();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                mAdapter.getFilter().filter(newText);
                return false;
            }
        });
        return true;
    } */
}
