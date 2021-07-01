package com.devoligastudio.fonetica_ingles.recyclerviewproject;

import android.content.Context;

import com.devoligastudio.fonetica_ingles.Music;

public class Registrotudo {

    private String mtexto1;
    private String mtexto2;
    private String mtexto3;
public Registrotudo(){}
    public Registrotudo( String mtexto1, String mtexto2, String mtexto3) {

        this.mtexto1 = mtexto1;
        this.mtexto2 = mtexto2;
        this.mtexto3 = mtexto3;
    }

    public Registrotudo(String mtexto1) {
        this.mtexto1 = mtexto1;
    }

    public String getTexto1() {
        return mtexto1;
    }

    public String getTexto2() {
        return mtexto2;
    }

    public String getTexto3() {
        return mtexto3;
    }



}
