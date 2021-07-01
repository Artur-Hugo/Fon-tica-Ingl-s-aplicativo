package com.devoligastudio.fonetica_ingles;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.SearchView;

import com.devoligastudio.fonetica_ingles.recyclerviewproject.Registros;
import com.devoligastudio.fonetica_ingles.recyclerviewproject.Registrotudo;

import java.util.ArrayList;

public class Aviao extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private Bemmelhoradapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;







    ArrayList<String> frase01;
    ArrayList<String> frase2;
    ArrayList<String> frase3;
    ArrayList<Integer>song;
    ArrayList<Integer>songbasico;
    ArrayList<Integer>songdrink;
    ArrayList<Integer>songalim;
    ArrayList<Integer>songcores;
    ArrayList<Integer>songcalem;
    ArrayList<String> frasedrink1;
    ArrayList<String> frasedrink2;
    ArrayList<String> frasedrink3;

ArrayList<String>frasealim1;
ArrayList<String>frasealim2;
ArrayList<String>frasealim3;

ArrayList<String>frasebasico1;
    ArrayList<String>frasebasico2;
    ArrayList<String>frasebasico3;

ArrayList<String>frasecalem1;
    ArrayList<String>frasecalem2;
    ArrayList<String>frasecalem3;

    ArrayList<String>frasecores1;
    ArrayList<String>frasecores2;
    ArrayList<String>frasecores3;

    ArrayList<String>fraseDesIelo;
    ArrayList<String>fraseDesIelo2;
    ArrayList<String>fraseDesIelo3;

    ListView lista;
    MyadapterGeral myadapterGeral;
    Registros registros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aviao);
     //   ArrayList<Registrotudo> list = new ArrayList<>();
//list.add(new Registrotudo(1,"tete","titi","toto"));







   //     mRecyclerView = findViewById(R.id.listid);
/*mRecyclerView.setHasFixedSize(true);
layoutManager = new LinearLayoutManager(this);
        mAdapter = new Bemmelhoradapter(list);

mRecyclerView.setLayoutManager(layoutManager);
//mRecyclerView.setAdapter(mAdapter);
*/






        Bundle extra = getIntent().getExtras();
        int valor = 0;
if(extra != null){
     valor = extra.getInt("valor");
}

        teste(valor);
lista = (ListView) findViewById(R.id.listid);


lista.setAdapter(myadapterGeral);
    }

    private void teste(int i) {
        switch(i){

            case 0:
                //frasedrink1 = getfrasedrink1();
                song = getsong();

                frase01 = getfrase1();
                 frase2 = getfrase2(); frase3 = getfrase3();
                myadapterGeral = new MyadapterGeral(Aviao.this,song,frase01,frase2,frase3);
                //frasedrink2 = getfrasedrink2(); frasedrink3 = getfrasedrink3();
               // myadapterGeral = new MyadapterGeral(Aviao.this,frase01,frase2,frase3);
                break;

            case 1:
                songalim = getsongalim();
               frasealim1 = getfrasealim1(); frasealim2 = getFrasealim2(); frasealim3 = getFrasealim3();
                myadapterGeral = new MyadapterGeral(Aviao.this,songalim,frasealim1,frasealim2,frasealim3);

break;
            case 2:
                songbasico = getsongbasico();
                frasebasico1 = getFrasebasico1(); frasebasico2 = getFrasebasico2(); frasebasico3 = getFrasebasico3();
                myadapterGeral = new MyadapterGeral(Aviao.this,songbasico,frasebasico1,frasebasico2, frasebasico3);
                break;


            case 3:
                songdrink = getsongdrink();
                frasedrink1 = getfrasedrink1(); frasedrink2 = getfrasedrink2(); frasedrink3 = getfrasedrink3();
                myadapterGeral = new MyadapterGeral(Aviao.this,songdrink, frasedrink1, frasedrink2, frasedrink3);
 break;
            case 4:
                frasecalem1 = getFrasecalem1(); frasecalem2 = getFrasecalem2(); frasecalem3 = getFrasecalem3();
                songcalem = getsongcalem();
                myadapterGeral = new MyadapterGeral(Aviao.this,songcalem, frasecalem1, frasecalem2, frasecalem3);
break;
            case 5:
                songcores = getsongcores();
                frasecores1 = getFrasecores1(); frasecores2 = getFrasecores2(); frasecores3 = getFrasecores3();
                myadapterGeral = new MyadapterGeral(Aviao.this, songcores, frasecores1, frasecores2, frasecores3);
                break;
            default:
                //caso não for nenhum desses casos




        }
    }


    public ArrayList<String>getfrase1(){
        frase01 = new ArrayList<>();
        frase01.add("A que horas começa o embarque?");frase01.add("Qual é o portão?");
        frase01.add("Tem alguma refeição a bordo?");
        frase01.add("A que horas o vôo chega?");
        frase01.add("A que horas o vôo parte?");
        frase01.add("Eu poderia trocar de lugar?");
        frase01.add("Onde é o Assento?");
        frase01.add("Pode me arrumar um travesseiro?");
        frase01.add("Posso inclinar a minha poltrona?");
        frase01.add("Posso pegar outra bebida?");
        frase01.add("Quanto tempo vai ficar atrasado?");
        frase01.add("Quanto tempo vamos ficar parados?");
        frase01.add("Queria chá, por favor.");
        frase01.add("Queria comer alguma coisa.");
        frase01.add("Sinto-me mal.");

        return frase01;

    }
    public ArrayList<String>getfrase2(){
        frase2 = new ArrayList<>();
        frase2.add("What time does it start boarding?");
        frase2.add("What gate number is it?");
        frase2.add("Are there any meals on this flight?");
        frase2.add("When will the flight arrive?");
        frase2.add("When will the flight leave?");
        frase2.add("Could i change seats?");
        frase2.add("Where is the seat?");
        frase2.add("Would you please get me a pillow?");
        frase2.add("May i recline my seat?");
        frase2.add("Can i have another drink?");
        frase2.add("How long will it be delayed?");
        frase2.add("How long will we stop here?");
        frase2.add("I'd like some coffee, please?");
        frase2.add("I want to order something to eat.");
        frase2.add("I fell sick.");
        return frase2;
    }
    public ArrayList<String>getfrase3(){
        frase3 = new ArrayList<>();
        frase3.add("Uót taimm dâs it start bõurdinn?");
        frase3.add("Uót guêit nâmbâr is it?");
        frase3.add("Ar dhér eni mils onn dhis fláit?");
        frase3.add("Uén uil dhâ fláit âráiv?");
        frase3.add("Uén uil dhâ fláit liv?");
        frase3.add("Culd Ái tshêindj sits?");
        frase3.add("Uér is dhâ sit?");
        frase3.add("Uúld iú pliz guet mi a pilôu?");
        frase3.add("Mêi Ái ricláinn mái sit?");
        frase3.add("Kén Ái hév anâdhâr drink?");
        frase3.add("Háu lonn uíl it bi dilêid?");
        frase3.add("Háu lonn uíl uí stop hir?");
        frase3.add("Áid láik sâmm cófi,pliz.");
        frase3.add("Ái uónt tshu órder sâmthinn tshu it.");
        frase3.add("Ái fil sik.");
        return frase3;
    }
    public ArrayList<Integer>getsong(){
        song = new ArrayList<>();
        song.add(R.raw.frase12); song.add(R.raw.frase122); song.add(R.raw.frase123); song.add(R.raw.frase124);
        song.add(R.raw.frase125); song.add(R.raw.frase126);
        ; song.add(R.raw.frase127);
        song.add(R.raw.frase128); song.add(R.raw.frase129); song.add(R.raw.frase1210); song.add(R.raw.frase1211); song.add(R.raw.frase1212);
        song.add(R.raw.frase1213);song.add(R.raw.frase1214);song.add(R.raw.frase1215);
        return  song;
    }


    public ArrayList<Integer>getsongdrink(){
        songdrink = new ArrayList<>();
      songdrink.add(R.raw.aperitifi);songdrink.add(R.raw.whitecofee);songdrink.add(R.raw.frappucino);songdrink.add(R.raw.beer);songdrink.add(R.raw.tea);
        songdrink.add(R.raw.skimmilk);songdrink.add(R.raw.wholemilk);songdrink.add(R.raw.soda);songdrink.add(R.raw.juice);songdrink.add(R.raw.whitewine);
        songdrink.add(R.raw.redwine);songdrink.add(R.raw.water);songdrink.add(R.raw.sparklinnwater);songdrink.add(R.raw.mineralwater);
        return songdrink;
    }
   public ArrayList<String>getfrasedrink1(){
        frasedrink1 = new ArrayList<>();
        frasedrink1.add("Aperitivo");       frasedrink1.add("Café com leite"); frasedrink1.add("Café gelado");
       frasedrink1.add("Cerveja");
        frasedrink1.add("Chá"); frasedrink1.add("Leite desnatado"); frasedrink1.add("Leite Integral");
       frasedrink1.add("Refrigerante");frasedrink1.add("Suco");frasedrink1.add("Vinho branco");frasedrink1.add("Vinho tinto");
       frasedrink1.add("Água");frasedrink1.add("Água mineral com gás");frasedrink1.add(" Água mineral");
       return frasedrink1;
   }
   public ArrayList<String>getfrasedrink2(){
        frasedrink2 = new ArrayList<>();
        frasedrink2.add("Aperitif");frasedrink2.add("White coffee"); frasedrink2.add("Frappuccino");frasedrink2.add("Beer");
       frasedrink2.add("Tea"); frasedrink2.add("Skim milk"); frasedrink2.add("Whole milk");
       frasedrink2.add(" Soda"); frasedrink2.add("Juice"); frasedrink2.add("White wine"); frasedrink2.add("Red wine");
       frasedrink2.add("Water"); frasedrink2.add("Sparking mineral water"); frasedrink2.add("mineral water");


       return frasedrink2;
   }
    public ArrayList<String>getfrasedrink3(){
        frasedrink3 = new ArrayList<>();
      frasedrink3.add("Epâritif"); frasedrink3.add("Uáit cófi"); frasedrink3.add("Frépiut-sinôu"); frasedrink3.add("Biêr");
        frasedrink3.add("Ti"); frasedrink3.add("Skimm milk"); frasedrink3.add("Hôul milk");
        frasedrink3.add("Sôuda"); frasedrink3.add("Djuss"); frasedrink3.add("Uáit uáinn"); frasedrink3.add("Réd uáin");
        frasedrink3.add("Uótâr"); frasedrink3.add("Spárklinn minâról uótâr"); frasedrink3.add("minâról uótâr");

        return frasedrink3;
    }

public ArrayList<String> getfrasealim1(){
        frasealim1 = new ArrayList<>();
        frasealim1.add("Acompanhamentos");frasealim1.add("Algodão-doce");frasealim1.add("Alho");frasealim1.add("Alimento com baixo teor de gordura");
        frasealim1.add(" Amêndoa");frasealim1.add("Arroz");frasealim1.add(" Atum");frasealim1.add("Açúcar");
        frasealim1.add("Bacalhau");frasealim1.add("Bala de gelatina em forma de urso");frasealim1.add(" Bala em forma de feijão");
    frasealim1.add("Batata assada");frasealim1.add("Batata palito");frasealim1.add("Batatas fritas");frasealim1.add("Carangueijo");
    frasealim1.add("Churrasco");frasealim1.add("Feijão");frasealim1.add("Frango"); frasealim1.add("Grão de Bico");frasealim1.add("Legume");
    frasealim1.add("Línguiça");frasealim1.add("Macarrão");frasealim1.add("Manteiga");frasealim1.add("Molho");
    frasealim1.add("Ovos cozidos");frasealim1.add("Peito de frango");frasealim1.add("Peixe frito");frasealim1.add("Pipoca Pop");
    frasealim1.add("Pudim");frasealim1.add("Purê de batata ");frasealim1.add("Pão");frasealim1.add("Queijo");
    frasealim1.add("Salada de frutas");frasealim1.add("Salmão");frasealim1.add("Sobremesas");frasealim1.add("Sopa");
    frasealim1.add("Sorvete ");frasealim1.add("Torta"); frasealim1.add("Vinagre");frasealim1.add("Xícara");
return frasealim1;
}
public ArrayList<String>getFrasealim2(){
        frasealim2 = new ArrayList<>();
        frasealim2.add("Side dishes");frasealim2.add(" Candyfloss");frasealim2.add("Garlic");frasealim2.add("Low fat");
        frasealim2.add("Almond");frasealim2.add("Rice");frasealim2.add("Tuna");frasealim2.add("Sugar");
        frasealim2.add("Codfish"); frasealim2.add("Gummy bears");frasealim2.add("Jelly beans");
        frasealim2.add("Baked potato");frasealim2.add("French fries");frasealim2.add("Chips ");
        frasealim2.add("Crab");frasealim2.add("Barbecue");frasealim2.add("Bean");
        frasealim2.add("Chicken");frasealim2.add("Chickpea");frasealim2.add("Vegetable");frasealim2.add("Sausage");
        frasealim2.add("Noodle");frasealim2.add("Butter"); frasealim2.add("Sauce");frasealim2.add("Boiled eggs");
        frasealim2.add("Chicken breast"); frasealim2.add("Fried fish");frasealim2.add("Pop corn");frasealim2.add("Flan");
        frasealim2.add("Mashed potatoes");frasealim2.add("bread");frasealim2.add("Cheese");frasealim2.add("Fruit salad");
        frasealim2.add("Salmon");frasealim2.add("Desserts");frasealim2.add("Soup");frasealim2.add("Ice cream");
        frasealim2.add("Tart");frasealim2.add("Vinegar");frasealim2.add("Cup");
        return frasealim2;
    }
public ArrayList<String>getFrasealim3(){
        frasealim3 = new ArrayList<>();
        frasealim3.add("Sáid dishs");frasealim3.add("Kéndi-flóss");frasealim3.add("Gárléc");frasealim3.add("Lôu fet");
        frasealim3.add("ámând");frasealim3.add("Ráiss");frasealim3.add("Tíuna");frasealim3.add("Shúgar");
        frasealim3.add("Cód fish");frasealim3.add("Gâmi bérs");frasealim3.add("Djéli bins");
        frasealim3.add("Bêikd potêitôu");frasealim3.add("Fréntsh fráis");frasealim3.add("Tships");
        frasealim3.add("Créb");frasealim3.add("Bárb-kíu");frasealim3.add("binn");
        frasealim3.add("Tshíkin");frasealim3.add("Tshík-pi");frasealim3.add("Védj-tabâl");frasealim3.add("Sóu-sêdj");
        frasealim3.add("Níu-dól");frasealim3.add("bâtâr");frasealim3.add("Sós");frasealim3.add("Bôi-âid égs");
        frasealim3.add("Tshíkin brést");frasealim3.add("Fráid fish");frasealim3.add("Póp córnn");frasealim3.add("Flénn");
        frasealim3.add("Mésh-d potêitôus");frasealim3.add("Bréd");frasealim3.add("Tshiz");frasealim3.add("Frut sé-lâd");
        frasealim3.add("Sémenn");frasealim3.add("Dizârts");frasealim3.add("Síup");frasealim3.add("Áis crimm");
        frasealim3.add("Tárt");frasealim3.add("vinâgâr");frasealim3.add("Câp");
        return frasealim3;
    }
    public ArrayList<Integer>getsongalim(){
        songalim = new ArrayList<>();
       songalim.add(R.raw.sidediches);songalim.add(R.raw.candyfloss);songalim.add(R.raw.garlic);songalim.add(R.raw.lowfat);songalim.add(R.raw.almond);songalim.add(R.raw.rice);
        songalim.add(R.raw.tuna);songalim.add(R.raw.sugar);songalim.add(R.raw.codfish);songalim.add(R.raw.gummybears);songalim.add(R.raw.jellybean);songalim.add(R.raw.bakedpotato);
        songalim.add(R.raw.frienchfries);songalim.add(R.raw.chips);songalim.add(R.raw.crab);songalim.add(R.raw.barbecue);songalim.add(R.raw.bean);songalim.add(R.raw.chicken);
        songalim.add(R.raw.chickpea);songalim.add(R.raw.vegetable);songalim.add(R.raw.sausage);songalim.add(R.raw.noodle);songalim.add(R.raw.butter);
        songalim.add(R.raw.sauce);songalim.add(R.raw.boiledeggs);songalim.add(R.raw.chickenbreast);songalim.add(R.raw.friedfish);songalim.add(R.raw.popcorn);songalim.add(R.raw.flan);
        songalim.add(R.raw.mashedpotatos);songalim.add(R.raw.bread);songalim.add(R.raw.cheese);songalim.add(R.raw.fruitsalad);songalim.add(R.raw.salmon);songalim.add(R.raw.dessert);
        songalim.add(R.raw.soup);songalim.add(R.raw.icescream);songalim.add(R.raw.tart);songalim.add(R.raw.vinegar);songalim.add(R.raw.cup);
        return  songalim;
    }
    public ArrayList<Integer>getsongbasico(){
        songbasico = new ArrayList<>();
        songbasico.add(R.raw.welcome);songbasico.add(R.raw.whereareyoufrom);songbasico.add(R.raw.sorryispeakli);songbasico.add(R.raw.sorrymyenglish);
        songbasico.add(R.raw.howlongh);songbasico.add(R.raw.haveyoubeento);songbasico.add(R.raw.howdoyoulike);songbasico.add(R.raw.whereareyoulivin);
        songbasico.add(R.raw.howoldareyou);songbasico.add(R.raw.whereareyoustay);songbasico.add(R.raw.portugueseyet);songbasico.add(R.raw.haveyoubeenanywhere);

        return  songbasico;
    }
public ArrayList<String>getFrasebasico1(){
        frasebasico1 = new ArrayList<>();
        frasebasico1.add("Bem vindo");frasebasico1.add("De onde você é?");frasebasico1.add("Desculpe, falo pouco Inglês");frasebasico1.add("Desculpe, meu Inglês nâo é muito bom.");
    frasebasico1.add("Há quanto tempo você está aqui?");frasebasico1.add("Já foi ao...?");frasebasico1.add("O que você achou?");frasebasico1.add("Onde você está morando?");
    frasebasico1.add("Quanto anos você tem?");frasebasico1.add("Você está onde?");frasebasico1.add("Você já fala alguma coisa em português?");frasebasico1.add("Você já foi a outros lugares?");

        return frasebasico1;
}
public ArrayList<String> getFrasebasico2(){
        frasebasico2 = new ArrayList<>();
        frasebasico2.add("Welcome");frasebasico2.add(" Where are you from?");frasebasico2.add("Sorry,I speak little English.");frasebasico2.add("Sorry, my english is not very good.");
    frasebasico2.add(" How long have you been here?");frasebasico2.add("Have you been to...?");frasebasico2.add("How do you like?");frasebasico2.add("Where are you living?");
    frasebasico2.add("How old are you?");frasebasico2.add("Where are you staying?");frasebasico2.add("Do you know any portuguese yet?");frasebasico2.add(" Have you been anywhere else?");
        return frasebasico2;
}
public ArrayList <String> getFrasebasico3(){
        frasebasico3 = new ArrayList<>();
        frasebasico3.add("Uél-câmm");frasebasico3.add("Uér ar iú fromm");frasebasico3.add("Sóri, Ái spik litâl Ìnglish.");frasebasico3.add("Sóri, mái Ínglish is nót véri gud.");
    frasebasico3.add("Háu lonn hév iú binn hir?");frasebasico3.add("Hév iú binn tshu...?");frasebasico3.add("Háu du iú láik?");frasebasico3.add("Uér ar iú lívinn?");
    frasebasico3.add("Háu óld ar iú?");frasebasico3.add("Uér ar iú stêinn?");frasebasico3.add("Du iú nôu éni portiuguiz iét?");frasebasico3.add("Hév iú binn éni-uér éus?");
        return frasebasico3;
}

public ArrayList<String>getFrasecalem1(){
        frasecalem1 = new ArrayList<>();
        frasecalem1.add("Domingo");frasecalem1.add("Segunda-Feira");frasecalem1.add("Terça-feira");frasecalem1.add("Quarta-Feira");
    frasecalem1.add("Quinta-feira");frasecalem1.add("Sexta-feira");frasecalem1.add("Sábado");
    frasecalem1.add("Inverno");frasecalem1.add("Outuno");frasecalem1.add("Primavera");
    frasecalem1.add("Verâo");frasecalem1.add("Janeiro");frasecalem1.add("Fevereiro");frasecalem1.add("Março");
    frasecalem1.add("Abril");frasecalem1.add("Maio");frasecalem1.add("Junho");frasecalem1.add("Julho");
    frasecalem1.add("Agosto");frasecalem1.add("Setembro");frasecalem1.add("Outubro");frasecalem1.add("Novembro");
    frasecalem1.add("Dezembro");


        return frasecalem1;
}
public ArrayList<Integer>getsongcalem(){
        songcalem = new ArrayList<>();
        songcalem.add(R.raw.sunday);songcalem.add(R.raw.monday);songcalem.add(R.raw.tuesday);songcalem.add(R.raw.wednesday);songcalem.add(R.raw.thursday);
    songcalem.add(R.raw.friday);songcalem.add(R.raw.saturday);songcalem.add(R.raw.winter);songcalem.add(R.raw.autumn);songcalem.add(R.raw.spring);
    songcalem.add(R.raw.summer);songcalem.add(R.raw.january);songcalem.add(R.raw.february);songcalem.add(R.raw.march);songcalem.add(R.raw.april);
    songcalem.add(R.raw.may);songcalem.add(R.raw.june);songcalem.add(R.raw.july);songcalem.add(R.raw.august);songcalem.add(R.raw.september);
    songcalem.add(R.raw.october);songcalem.add(R.raw.november);songcalem.add(R.raw.december);
        return  songcalem;
}
public ArrayList<String>getFrasecalem2(){
        frasecalem2 = new ArrayList<>();
        frasecalem2.add("Sunday");frasecalem2.add("Monday");frasecalem2.add("Tuesday");frasecalem2.add("Wednesday");
    frasecalem2.add("Thursday");frasecalem2.add("Friday");frasecalem2.add("Saturday ");frasecalem2.add("Winter");
    frasecalem2.add("Autumn");frasecalem2.add("Spring ");frasecalem2.add("Summer");frasecalem2.add("January");
    frasecalem2.add("February");frasecalem2.add("March");frasecalem2.add("April");frasecalem2.add("May");
    frasecalem2.add("June");frasecalem2.add("July");frasecalem2.add("August");frasecalem2.add("September");
    frasecalem2.add("October");frasecalem2.add("November");frasecalem2.add("December");
        return frasecalem2;
}
public ArrayList<String>getFrasecalem3(){
        frasecalem3 = new ArrayList<>();
        frasecalem3.add("Sândei");frasecalem3.add("Mândei ");frasecalem3.add("Tíusdêi");frasecalem3.add("Uênzdêi");
    frasecalem3.add("Thârsdêi");frasecalem3.add("Fráidêi");frasecalem3.add("Sétârdei");frasecalem3.add("Uíntâr");
    frasecalem3.add("Ó-tâm");frasecalem3.add("Sprinn");frasecalem3.add("Sâmâr");frasecalem3.add(" Djéniuéri");
    frasecalem3.add("Fébruâri");frasecalem3.add("Mártsh");frasecalem3.add("Êipril");frasecalem3.add("Mêi");
    frasecalem3.add("Djunn");frasecalem3.add("Djulái");frasecalem3.add("Ó-gâst");frasecalem3.add("Septémbâr");
    frasecalem3.add("Octôubâr");frasecalem3.add("Novémbâr");frasecalem3.add("Dissémbâr  ");
        return frasecalem3;
}

public ArrayList<String>getFrasedesIelo1(){
        fraseDesIelo = new ArrayList<>();
        fraseDesIelo.add("Aguarde um momento, por favor");fraseDesIelo.add("Da próxima vez será melhor");fraseDesIelo.add("Desculpa");fraseDesIelo.add("Desculpe ter chegado atrasado");fraseDesIelo.add("Foi minha culpa");fraseDesIelo.add("Foi sem intenção");fraseDesIelo.add("Não é culpa sua");
    fraseDesIelo.add("Adorei o seu novo penteado");fraseDesIelo.add("Está bonito!");fraseDesIelo.add("Nossa! Você emagreceu?");fraseDesIelo.add("Que bela vista!");fraseDesIelo.add("Que ótimo lugar!");fraseDesIelo.add("Você sabe se vestir bem.");fraseDesIelo.add("É interessante.");fraseDesIelo.add("É ótimo!");
        return fraseDesIelo;
}
    public ArrayList<String>getFrasedesIelo2(){
        fraseDesIelo2 = new ArrayList<>();
        fraseDesIelo2.add("Just a moment please");fraseDesIelo2.add("Next time I'II get i right");fraseDesIelo2.add("Sorry");fraseDesIelo2.add("Forgive me for being late");fraseDesIelo2.add("That's my fault");fraseDesIelo2.add("I didn´t mean that");fraseDesIelo2.add("it's not your fault");
        fraseDesIelo2.add("Your new haircut is great");fraseDesIelo2.add("You look nice!");fraseDesIelo2.add("Wow! Have you lost weight?");fraseDesIelo2.add("What a nice view!");fraseDesIelo2.add("What a nice place!");fraseDesIelo2.add("You have wonderful taste in clothes");fraseDesIelo2.add("That's interesting");fraseDesIelo2.add("That's perfect!");
        return fraseDesIelo2;
    }
    public ArrayList<String>getFrasedesIelo3(){
        fraseDesIelo3 = new ArrayList<>();
        fraseDesIelo3.add("Djâst a môument pliz");fraseDesIelo3.add("Nékst táimm Áu guét it ráit");fraseDesIelo3.add("Sóri");fraseDesIelo3.add("Forguív mi for bi-inn lêit");fraseDesIelo3.add("Dhéts mái fólt");fraseDesIelo3.add("Ái didint minn dhét");fraseDesIelo3.add("Its not iôr fólt");
        fraseDesIelo3.add("Iôr niu hércat is grêit");fraseDesIelo3.add("Iú luk náiss!");fraseDesIelo3.add("Uáu? Hév iú lóst uêit?");fraseDesIelo3.add("Uót a náiss viu!");fraseDesIelo3.add("Uót a náiss plêiss!");fraseDesIelo3.add("Iú hév uândânful têist in clóths.");fraseDesIelo3.add("Dhéts intrâstinn");fraseDesIelo3.add("Dhéts pârféct" );
        return fraseDesIelo3;
    }



public ArrayList<Integer>getsongcores(){
        songcores = new ArrayList<>();
    songcores.add(R.raw.yellow);songcores.add(R.raw.blue);songcores.add(R.raw.white);songcores.add(R.raw.gray);songcores.add(R.raw.orange);
    songcores.add(R.raw.black);songcores.add(R.raw.green);songcores.add(R.raw.red);songcores.add(R.raw.purple);songcores.add(R.raw.navy);
    songcores.add(R.raw.tan);songcores.add(R.raw.golden);songcores.add(R.raw.emerald);songcores.add(R.raw.lilac);songcores.add(R.raw.brown);
    songcores.add(R.raw.silver);songcores.add(R.raw.purple);
        return  songcores;
}
public ArrayList<String>getFrasecores1(){
        frasecores1 = new ArrayList<>();
        frasecores1.add("Amarelo");frasecores1.add("Azul");frasecores1.add("Branco");frasecores1.add("Cinza");
    frasecores1.add("Laranja");frasecores1.add("Preto");frasecores1.add("Verde");frasecores1.add("Vermelho");
    frasecores1.add("Violeta");frasecores1.add("Azul marinho");frasecores1.add("Bronzeado");frasecores1.add("Dourado");
    frasecores1.add("Esmeralda");frasecores1.add("Lilás");frasecores1.add("Marrom");frasecores1.add("Prata");frasecores1.add("Roxo ");
        return frasecores1;
}
public ArrayList<String>getFrasecores2(){
        frasecores2 = new ArrayList<>();
    frasecores2.add("Yellow");frasecores2.add("Blue");frasecores2.add("White");frasecores2.add("Gray");frasecores2.add("Orange");
    frasecores2.add("Black");frasecores2.add("Green");frasecores2.add("Red");frasecores2.add("Violet");frasecores2.add("Navy");
    frasecores2.add("Tan");frasecores2.add("Golden");frasecores2.add("Emerald");frasecores2.add("Lilac");frasecores2.add("Brown");frasecores2.add("Silver");frasecores2.add("Purple");
        return frasecores2;
}
    public ArrayList<String>getFrasecores3(){
        frasecores3 = new ArrayList<>();
        frasecores3.add("ié-lou");frasecores3.add("Blú");frasecores3.add("Uáit");frasecores3.add("Grêi");frasecores3.add("Órandj");
        frasecores3.add("blék");frasecores3.add("Grinn");frasecores3.add("Réd");frasecores3.add("Váiolet");
        frasecores3.add("Nêivi ");frasecores3.add("Ténn");frasecores3.add("Gôudan");frasecores3.add("É-mârâld");
        frasecores3.add("Lái-lâk");frasecores3.add("Bráunn");frasecores3.add("Sílvâr");frasecores3.add("Pârpâl");
        return frasecores3;
    }

    @Override
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
                Aviao.this.myadapterGeral.getFilter().filter(newText);

                return false;
            }
        });
        return true;
    }
}
