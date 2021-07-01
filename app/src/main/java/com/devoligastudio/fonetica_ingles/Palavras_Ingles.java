package com.devoligastudio.fonetica_ingles;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Switch;
import android.widget.TextView;

import com.devoligastudio.fonetica_ingles.recyclerviewproject.Registrotudo;

import java.util.ArrayList;

public class Palavras_Ingles extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private Bemmelhoradapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;


    private ListView lista;
    private ArrayList palavras;
    private ArrayList idimagem;
    private myadapter madapter;
    ArrayList<Integer> vozes;

    ImageView red;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palavras__ingles);
        final ArrayList<Registrotudo> listaos = new ArrayList<>();



        listaos.add(new Registrotudo("Estão/São","Are","ar"));
        listaos.add(new Registrotudo("É/Está","Is","is"));
        listaos.add(new Registrotudo("Nós","We","uí"));
        listaos.add(new Registrotudo("Eles//Elas","They","Dêi"));
        listaos.add(new Registrotudo("Eles/Elas","Them","Véma"));
        listaos.add(new Registrotudo("Irmão","Brother","Bródêr"));
        listaos.add(new Registrotudo("Irmã","Sister","Sístêr"));
        listaos.add(new Registrotudo("Mãe","Mother","Móder"));
        listaos.add(new Registrotudo("Pai","Father","Fádêr"));
        listaos.add(new Registrotudo("Solteiro(a)","Single","síngâl"));
        listaos.add(new Registrotudo("Cabelereiro","Hairdresser","rédréssâr"));
        listaos.add(new Registrotudo("Ambos","Both","bôuf"));
        listaos.add(new Registrotudo("Dela","Her","râr"));
        listaos.add(new Registrotudo("Casado(a)","Married","mérid"));
listaos.add(new Registrotudo("dona de casa","Housewife","ráusifáif"));
listaos.add(new Registrotudo("Vinte","Twenty","tchúênti"));
        listaos.add(new Registrotudo("Tem","have","rév"));
        listaos.add(new Registrotudo("Aluno","Student","student"));
        listaos.add(new Registrotudo("Muito","Very","véri"));
        listaos.add(new Registrotudo("Agitados","agitaded","édgiteitid"));
        listaos.add(new Registrotudo("Companhia aérea","Airline","érlaini"));
        listaos.add(new Registrotudo("Aeroporto","Airport","érpórt"));
        listaos.add(new Registrotudo("Passagem aérea","airplane ticket","Érpleni ticket"));
        listaos.add(new Registrotudo("Vôos de chegada","Arrival"," óuraivóu(əˈrīvəl)"));
        listaos.add(new Registrotudo("Bagagem","Baggage","Baguédji"));
        listaos.add(new Registrotudo("Embarcando","Boarding","bôurdinn(bɔːr.dɪŋ)"));
        listaos.add(new Registrotudo("cartão de embarque","Boarding pass","bôurdinn péas(bɔːr.dɪŋ ˌpæs)"));
        listaos.add(new Registrotudo("Maleta de mão","Briefcase","brifkeis"));
        listaos.add(new Registrotudo("Despachar a bagagem e receber o cartão de embarque","Check in","tiek"));
        listaos.add(new Registrotudo("Vôo atrasado","Delayed","dêlêid"));
        listaos.add(new Registrotudo("Alfãndega","Customs","cóstomis"));
        listaos.add(new Registrotudo("Sala de embarque","Departure Lounge","Departiô lân-údji"));
        listaos.add(new Registrotudo("Vôos de partida","Departures","Departiô "));
        listaos.add(new Registrotudo("Desembarque","Disembarkation","dês-im-bâr-kei-chón(dɪs.ɪm.bɑːrˈkeɪ.ʃən)"));
        listaos.add(new Registrotudo("Excesso de bagagem","Excess baggage","ékses baguédji"));
        listaos.add(new Registrotudo("Vôo","Flight","fláit"));
        //listaos.add(new Registrotudo());




        ////////////////////////////////////
       listaos.add(new Registrotudo("Portão","gate","guêit"));listaos.add(new Registrotudo("Refeição","meals","mils"));listaos.add(new Registrotudo("Travesseiro","pillow","pilou"));
        listaos.add(new Registrotudo("Inclinar","recline","ricláinn"));listaos.add(new Registrotudo("Acompanhamentos","side dishes","Sáid dishs"));listaos.add(new Registrotudo("Algodão-doce","Candyfloss","Kéndi-flóss"));listaos.add(new Registrotudo("Alho","Garlic","Gárléc"));listaos.add(new Registrotudo("Baixo teor de gordura","low fat","Lôu fet"));
        listaos.add(new Registrotudo("Amêndoa","Almond","ámând"));listaos.add(new Registrotudo("Arroz","Rice","Ráiss"));listaos.add(new Registrotudo("Atum","Tuna","Tíuna"));listaos.add(new Registrotudo("Açúcar","Sugar","Shugar"));listaos.add(new Registrotudo("Bacalhau","Codfish","Cód fish"));
        listaos.add(new Registrotudo("Bala de gelatina em forma de urso","Gummy bears","Gâmi bérs"));listaos.add(new Registrotudo("Bala em forma de feijão","Jelly beans", "Djéli bins"));listaos.add(new Registrotudo("Batata assada","Baked potato","Bêikd potêitôu"));listaos.add(new Registrotudo("Batata palito","French fries","Fréntsh fráis"));listaos.add(new Registrotudo("Batata fritas","Chips","Tships"));
        listaos.add(new Registrotudo("Carangueijo","Crab","Créb"));listaos.add(new Registrotudo("Churrasco","Barbecue","Bárb-Kíu"));listaos.add(new Registrotudo("Feijão","Bean","binn"));listaos.add(new Registrotudo("Frango","Chicken","Tshikin"));listaos.add(new Registrotudo("Grão de Bico","Chickpea","Tshik-pi"));listaos.add(new Registrotudo("Legume","Vegetable","Védj-tabâl"));
        listaos.add(new Registrotudo("Línguiça","Sausage","Sóu-sêdj"));listaos.add(new Registrotudo("Macarrão","Noodle","Níu-dól"));listaos.add(new Registrotudo("Manteiga","Butter","Bâtâr"));listaos.add(new Registrotudo("Molho","Sauce","Sós"));listaos.add(new Registrotudo("Ovos cozidos","Boiled eggs","Bôi-âid égs"));listaos.add(new Registrotudo("Peito de frango","Chicken breast","Tshikin brést"));
        listaos.add(new Registrotudo("Peixe frito", "Fried fish", "Fráid fish"));listaos.add(new Registrotudo("Pipoca pop","Pop corn", "Póp córn"));listaos.add(new Registrotudo("Pudim","Fran","Flénn"));listaos.add(new Registrotudo("Purê de batata","Mashed potatoes","Mésh-d potêitôus"));listaos.add(new Registrotudo("Pão","bread","Bréd"));listaos.add(new Registrotudo("Queijo","Cheese","Tshiz"));
        listaos.add(new Registrotudo("Salada de frutas","Fruit salad","Frut sé-lâd"));listaos.add(new Registrotudo("Salmão","Salmon","Sémenn"));listaos.add(new Registrotudo("Sobremesas","Desserts","Dizarts"));listaos.add(new Registrotudo("Sopa","Soup","Síup"));listaos.add(new Registrotudo("Sorvete","Ice cream","Áis crimm"));listaos.add(new Registrotudo("Torta","Tart","Tárt"));listaos.add(new Registrotudo("Vinagre","Vinegar","vinâgâr"));listaos.add(new Registrotudo("Xícara","Cup","Câp"));

//////////////////////////////////////////////////////////
        listaos.add(new Registrotudo("Bem vindo","Welcome","uél-câmm"));listaos.add(new Registrotudo("Onde","where","Uér"));listaos.add(new Registrotudo("Desculpe","Sorry","Sóri"));listaos.add(new Registrotudo("Morando","Living","livinn"));listaos.add(new Registrotudo("Aperitivo","Aperitif","Epâritif"));listaos.add(new Registrotudo("Café com leite","White coffee","Uáit cófi"));
        listaos.add(new Registrotudo("Café gelado","Frappuccino","Frépiut-sinôu"));listaos.add(new Registrotudo("Cerveja","Beer","Biêr"));listaos.add(new Registrotudo("Chá","Tea","Ti"));listaos.add(new Registrotudo("Leite desnatado","Skim milk","Skimm milk"));listaos.add(new Registrotudo("Leite Integral","Whole milk","Hôul milk"));listaos.add(new Registrotudo("Refrigerante","Soda","Sôuda"));listaos.add(new Registrotudo("Suco","Juice","Djuss"));
        listaos.add(new Registrotudo("Vinho Branco","White wine","Uáit uáinn"));listaos.add(new Registrotudo("Vinho tinto","Red wine","Réd uáin"));listaos.add(new Registrotudo("Água","Water","uótâr"));





        listaos.add(new Registrotudo("Domingo","Sunday","Sândei"));listaos.add(new Registrotudo("Segunda","Monday","Mândei"));listaos.add(new Registrotudo("Terça-feira","Tuesday","Tiusdêi"));listaos.add(new Registrotudo("Quarta-feira","Wednesday","Uênzdêi"));listaos.add(new Registrotudo("Quinta-feira","Thursday","Thârsdêi"));
        listaos.add(new Registrotudo("Sexta-feira","Friday","Fráidêi"));listaos.add(new Registrotudo("Sábado","Saturday","Sétârdei"));listaos.add(new Registrotudo("Inverno","Winter","Uíntâr"));listaos.add(new Registrotudo("Outuno","Autumn","Ó-tâm"));listaos.add(new Registrotudo("Primavera","Spring","Sprinn"));
        listaos.add(new Registrotudo("Verâo","Summer","Sâmâr"));listaos.add(new Registrotudo("Janeiro","January","Djéniuéri"));listaos.add(new Registrotudo("Fevereiro","February","Februâri"));listaos.add(new Registrotudo("Março","March","Mártsh"));listaos.add(new Registrotudo("Abril","April","Êipril"));
        listaos.add(new Registrotudo("Maio","May","Mêi"));listaos.add(new Registrotudo("Junho","June","Djunn"));listaos.add(new Registrotudo("Julho","July","Djulái"));listaos.add(new Registrotudo("Agosto","August","Ó-gâst"));listaos.add(new Registrotudo("Setembro","September","Septémbâr"));
        listaos.add(new Registrotudo("Outubro","October","Octôubâr"));listaos.add(new Registrotudo("Novembro","November","Novémbâr"));listaos.add(new Registrotudo("Dezembro","December","Dissémbâr"));
        ////////////////////////////////////////////////////////////////
        listaos.add(new Registrotudo("Amarelo","Yellow","Ié-lou"));listaos.add(new Registrotudo("Azul","Blue","Blú"));listaos.add(new Registrotudo("Branco","White","Uáit"));listaos.add(new Registrotudo("Cinza","Gray","Grêi"));listaos.add(new Registrotudo("Laranja","Orange","Órandj"));
        listaos.add(new Registrotudo("Preto","Black","blék"));listaos.add(new Registrotudo("Verde","Green","Grinn"));listaos.add(new Registrotudo("Vermelho","Red","réd"));listaos.add(new Registrotudo("Violeta","Violet","Váiolet"));listaos.add(new Registrotudo("Azul marinho","Navy","Nêivi"));
        listaos.add(new Registrotudo("Bronzeado","Tan","Ténn"));listaos.add(new Registrotudo("Dourado","Golden","Gôudan"));listaos.add(new Registrotudo("Esmerald","Emerald","É-mârâld"));listaos.add(new Registrotudo("Lilás","Lilac","Lái-lâk"));listaos.add(new Registrotudo("Marrom","Brown","Bráunn"));
        listaos.add(new Registrotudo("Prata","Silver","Sílvâr"));listaos.add(new Registrotudo("Roxo","Purple","Pârpâl"));
        ///listaos.add(new Registrotudo());listaos.add(new Registrotudo());listaos.add(new Registrotudo());







        palavras = new ArrayList();
        idimagem = new ArrayList();


        mRecyclerView = findViewById(R.id.listaid);
        mRecyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        mAdapter = new Bemmelhoradapter(listaos);

        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setAdapter(mAdapter);

        mAdapter.setOnClicksetOnItemClickListener(new Bemmelhoradapter.OnItemClickListener() {
            @Override
            public void onItemClick(TextView exa) {




                exa.toString();
                if(exa.getText().toString().equals("Irmão")) {
                                 musicon(R.raw.brother);
            }
                else if(exa.getText().toString().equals("Irmã")){
                    musicon(R.raw.sister1);
                }
                else if(exa.getText().toString().equals("Pai")){
                    musicon(R.raw.father);
                }
                else if(exa.getText().toString().equals("Mãe")){
                    musicon(R.raw.monther);
                }
                else if(exa.getText().toString().equals("Solteiro(a)")){
                    musicon(R.raw.single1);
                }
                else if(exa.getText().toString().equals("Cabelereiro")){
                    musicon(R.raw.hairdresser1);
                }
                else if(exa.getText().toString().equals("Dela")){
                    musicon(R.raw.her);
                }
                else if(exa.getText().toString().equals("Ambos")){
                    musicon(R.raw.bouf);
                }
                else if(exa.getText().toString().equals("Casado(a)")){
                    musicon(R.raw.married);
                }
                else if(exa.getText().toString().equals("Vinte")){
                    musicon(R.raw.twenty);
                }
                else if(exa.getText().toString().equals("Tem")){
                    musicon(R.raw.have);
                }
                else if(exa.getText().toString().equals("dona de casa")){
                    musicon(R.raw.housewife);
                }
                else if(exa.getText().toString().equals("Aluno")){
                    musicon(R.raw.student);
                }
                else if(exa.getText().toString().equals("Muito")){
                    musicon(R.raw.very);
                }
                else if(exa.getText().toString().equals("Agitados")){musicon(R.raw.agitated);}else if(exa.getText().toString().equals("Companhia aérea")){musicon(R.raw.airline);}else if(exa.getText().toString().equals("Aeroporto")){musicon(R.raw.airport);}
                else if(exa.getText().toString().equals("Passagem aérea")){musicon(R.raw.airplaneticket);}else if(exa.getText().toString().equals("Vôos de chegada")){musicon(R.raw.arrival);}else if(exa.getText().toString().equals("Bagagem")){musicon(R.raw.baggage);}
                else if(exa.getText().toString().equals("Embarcando")){musicon(R.raw.boarding);}else if(exa.getText().toString().equals("cartão de embarque")){musicon(R.raw.check);}else if(exa.getText().toString().equals("Maleta de mão")){musicon(R.raw.briefcase);}
                else if(exa.getText().toString().equals("Vôo atrasado")){musicon(R.raw.delayed);}else if(exa.getText().toString().equals("Alfãndega")){musicon(R.raw.customs);}else if(exa.getText().toString().equals("Sala de embarque")){musicon(R.raw.departurelounge);}
                else if(exa.getText().toString().equals("Vôos de partida")){musicon(R.raw.departure);}else if(exa.getText().toString().equals("Desembarque")){musicon(R.raw.disembarktion);}else if(exa.getText().toString().equals("Excesso de bagagem")){musicon(R.raw.excessbaggage);}
                else if(exa.getText().toString().equals("Vôo")){musicon(R.raw.flight);}else if(exa.getText().toString().equals("Eles/Elas")){musicon(R.raw.them);}else if(exa.getText().toString().equals("Eles//Elas")){musicon(R.raw.they);}else if(exa.getText().toString().equals("Nós")){musicon(R.raw.we);}
                else if(exa.getText().toString().equals("É/Está")){musicon(R.raw.is);}else if(exa.getText().toString().equals("Estão/São")){musicon(R.raw.are);}//else if(exa.getText().toString().equals()){musicon(R.raw.);}else if(exa.getText().toString().equals()){musicon(R.raw.);}else if(exa.getText().toString().equals()){musicon(R.raw.);}

                else if(exa.getText().toString().equals("Portão")){musicon(R.raw.gate);}else if(exa.getText().toString().equals("Refeição")){musicon(R.raw.meal);}else if(exa.getText().toString().equals("Travesseiro")){musicon(R.raw.pillow);}else if(exa.getText().toString().equals("Inclinar")){musicon(R.raw.recline);}else if(exa.getText().toString().equals("Acompanhamentos")){musicon(R.raw.sidediches);}else if(exa.getText().toString().equals("Algodão-doce")){musicon(R.raw.candyfloss);}
                else if(exa.getText().toString().equals("Alho")){musicon(R.raw.garlic);}else if(exa.getText().toString().equals("Baixo teor de gordura")){musicon(R.raw.lowfat);}else if(exa.getText().toString().equals("Amêndoa")){musicon(R.raw.almond);}else if(exa.getText().toString().equals("Arroz")){musicon(R.raw.rice);}else if(exa.getText().toString().equals("Atum")){musicon(R.raw.tuna);}else if(exa.getText().toString().equals("Açúcar")){musicon(R.raw.sugar);}
                else if(exa.getText().toString().equals("Bacalhau")){musicon(R.raw.codfish);}else if(exa.getText().toString().equals("Bala de gelatina em forma de urso")){musicon(R.raw.gummybears);}else if(exa.getText().toString().equals("Bala em forma de feijão")){musicon(R.raw.jellybean);}else if(exa.getText().toString().equals("Batata assada")){musicon(R.raw.bakedpotato);}else if(exa.getText().toString().equals("Batata palito")){musicon(R.raw.frienchfries);}else if(exa.getText().toString().equals("Batata fritas")){musicon(R.raw.chips);}
                else if(exa.getText().toString().equals("Carangueijo")){musicon(R.raw.crab);}else if(exa.getText().toString().equals("Churrasco")){musicon(R.raw.barbecue);}else if(exa.getText().toString().equals("Feijão")){musicon(R.raw.bean);}else if(exa.getText().toString().equals("Frango")){musicon(R.raw.chicken);}else if(exa.getText().toString().equals("Grão de Bico")){musicon(R.raw.chickpea);}else if(exa.getText().toString().equals("Legume")){musicon(R.raw.vegetable);}
                else if(exa.getText().toString().equals("Línguiça")){musicon(R.raw.sauce);}else if(exa.getText().toString().equals("Macarrão")){musicon(R.raw.noodle);}else if(exa.getText().toString().equals("Manteiga")){musicon(R.raw.butter);}else if(exa.getText().toString().equals("Molho")){musicon(R.raw.sauce);}else if(exa.getText().toString().equals("Ovos cozidos")){musicon(R.raw.boiledeggs);}else if(exa.getText().toString().equals("Peito de frango")){musicon(R.raw.chickenbreast);}else if(exa.getText().toString().equals("Peixe frito")){musicon(R.raw.friedfish);}
                else if(exa.getText().toString().equals("Pipoca pop")){musicon(R.raw.popcorn);}else if(exa.getText().toString().equals("Pudim")){musicon(R.raw.flan);}               else if(exa.getText().toString().equals("Pipoca pop")){musicon(R.raw.popcorn);}else if(exa.getText().toString().equals("Pudim")){musicon(R.raw.flan);}else if(exa.getText().toString().equals("Purê de batata")){musicon(R.raw.mashedpotatos);}else if(exa.getText().toString().equals("Pão")){musicon(R.raw.bread);}else if(exa.getText().toString().equals("Queijo")){musicon(R.raw.cheese);}
                else if(exa.getText().toString().equals("Salada de frutas")){musicon(R.raw.fruitsalad);}else if(exa.getText().toString().equals("Salmão")){musicon(R.raw.salmon);}
                else if(exa.getText().toString().equals("Sobremesas")){musicon(R.raw.dessert);}else if(exa.getText().toString().equals("Sopa")){musicon(R.raw.soup);}else if(exa.getText().toString().equals("Sorvete")){musicon(R.raw.icescream);}else if(exa.getText().toString().equals("Torta")){musicon(R.raw.tart);}else if(exa.getText().toString().equals("Vinagre")){musicon(R.raw.vinegar);}else if(exa.getText().toString().equals("Xícara")){musicon(R.raw.cup);}//else if(exa.getText().toString().equals()){musicon(R.raw.);}


                else if(exa.getText().toString().equals("Bem vindo")){musicon(R.raw.welcome);}else if(exa.getText().toString().equals("Onde")){musicon(R.raw.where);}else if(exa.getText().toString().equals("Desculpe")){musicon(R.raw.living);}else if(exa.getText().toString().equals("Morando")){musicon(R.raw.living);}else if(exa.getText().toString().equals("Aperitivo")){musicon(R.raw.aperitifi);}else if(exa.getText().toString().equals("Café com leite")){musicon(R.raw.whitecofee);}else if(exa.getText().toString().equals("Café gelado")){musicon(R.raw.frappucino);}else if(exa.getText().toString().equals("Cerveja")){musicon(R.raw.beer);}
                else if(exa.getText().toString().equals("Chá")){musicon(R.raw.tea);}else if(exa.getText().toString().equals("Leite desnatado")){musicon(R.raw.skimmilk);}else if(exa.getText().toString().equals("Leite Integral")){musicon(R.raw.wholemilk);}else if(exa.getText().toString().equals("Refrigerante")){musicon(R.raw.soda);}else if(exa.getText().toString().equals("Suco")){musicon(R.raw.juice);}else if(exa.getText().toString().equals("Vinho Branco")){musicon(R.raw.whitewine);}else if(exa.getText().toString().equals("Vinho tinto")){musicon(R.raw.redwine);}else if(exa.getText().toString().equals("Água")){musicon(R.raw.water);}
                else if(exa.getText().toString().equals("Água mineral")){musicon(R.raw.mineralwater);}else if(exa.getText().toString().equals("Água mineral com gás")){musicon(R.raw.sparklinnwater);}


                else if(exa.getText().toString().equals("Domingo")){musicon(R.raw.sunday);}else if(exa.getText().toString().equals("Segunda")){musicon(R.raw.monday);}else if(exa.getText().toString().equals("Terça-feira")){musicon(R.raw.tuesday);}else if(exa.getText().toString().equals("Quarta-feira")){musicon(R.raw.wednesday);}else if(exa.getText().toString().equals("Quinta-feira")){musicon(R.raw.thursday);}
                else if(exa.getText().toString().equals("Sexta-feira")){musicon(R.raw.friday);}else if(exa.getText().toString().equals("Sábado")){musicon(R.raw.saturday);}else if(exa.getText().toString().equals("Inverno")){musicon(R.raw.winter);}else if(exa.getText().toString().equals("Outuno")){musicon(R.raw.autumn);}else if(exa.getText().toString().equals("Primavera")){musicon(R.raw.spring);}
                else if(exa.getText().toString().equals("Verâo")){musicon(R.raw.summer);}else if(exa.getText().toString().equals("Janeiro")){musicon(R.raw.january);}else if(exa.getText().toString().equals("Fevereiro")){musicon(R.raw.february);}else if(exa.getText().toString().equals("Março")){musicon(R.raw.march);}else if(exa.getText().toString().equals("Abril")){musicon(R.raw.april);}
                else if(exa.getText().toString().equals("Maio")){musicon(R.raw.may);}else if(exa.getText().toString().equals("Junho")){musicon(R.raw.june);}else if(exa.getText().toString().equals("Julho")){musicon(R.raw.july);}else if(exa.getText().toString().equals("Agosto")){musicon(R.raw.august);}else if(exa.getText().toString().equals("Setembro")){musicon(R.raw.september);}
                else if(exa.getText().toString().equals("Outubro")){musicon(R.raw.october);}else if(exa.getText().toString().equals("Novembro")){musicon(R.raw.november);}else if(exa.getText().toString().equals("Dezembro")){musicon(R.raw.december);}


                else if(exa.getText().toString().equals("Amarelo")){musicon(R.raw.yellow);} else if(exa.getText().toString().equals("Azul")){musicon(R.raw.blue);} else if(exa.getText().toString().equals("Branco")){musicon(R.raw.white);} else if(exa.getText().toString().equals("Cinza")){musicon(R.raw.gray);}
                else if(exa.getText().toString().equals("Laranja")){musicon(R.raw.orange);} else if(exa.getText().toString().equals("Preto")){musicon(R.raw.black);} else if(exa.getText().toString().equals("Verde")){musicon(R.raw.green);} else if(exa.getText().toString().equals("Vermelho")){musicon(R.raw.red);}
                else if(exa.getText().toString().equals("Violeta")){musicon(R.raw.purple);} else if(exa.getText().toString().equals("Azul marinho")){musicon(R.raw.navy);} else if(exa.getText().toString().equals("Bronzeado")){musicon(R.raw.tan);} else if(exa.getText().toString().equals("Dourado")){musicon(R.raw.golden);}
                else if(exa.getText().toString().equals("Esmerald")){musicon(R.raw.emerald);} else if(exa.getText().toString().equals("Lilás")){musicon(R.raw.lilac);} else if(exa.getText().toString().equals("Marrom")){musicon(R.raw.brown);} else if(exa.getText().toString().equals("Prata")){musicon(R.raw.silver);}
                else if(exa.getText().toString().equals("Roxo")){musicon(R.raw.purple);}/// else if(exa.getText().toString().equals()){musicon(R.raw.);} else if(exa.getText().toString().equals()){musicon(R.raw.);} else if(exa.getText().toString().equals()){musicon(R.raw.);}



            }
        });






    }

public int musicon(int song){
    MediaPlayer mediaPlayer;
    mediaPlayer = MediaPlayer.create(Palavras_Ingles.this,song);
    mediaPlayer.start();




   /* if(mediaPlayer.isPlaying() ) {
        red = findViewById(R.id.som);
        red.setImageResource(R.drawable.somin);

    } */



        return song;
}

    public boolean onCreateOptionsMenu(Menu menu) {
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
    }
}
