package com.devoligastudio.fonetica_ingles;

public class Music {

    private String frase1;
    private String frase2;
    private int song;

    public Music(String frase1, String frase2, int song) {
        this.frase1 = frase1;
        this.frase2 = frase2;
        this.song = song;
    }

    public String getFrase1() {
        return frase1;
    }

    public void setFrase1(String frase1) {
        this.frase1 = frase1;
    }

    public String getFrase2() {
        return frase2;
    }

    public void setFrase2(String frase2) {
        this.frase2 = frase2;
    }

    public Integer getSong() {
        return song;
    }

    public void setSong(int song) {
        this.song = song;
    }
}
