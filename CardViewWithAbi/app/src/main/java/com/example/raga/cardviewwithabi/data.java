package com.example.raga.cardviewwithabi;

/**
 * Created by RAGA on 24/10/2017.
 */

public class data {

    private  String sosmed;
    private Integer gambar;

    public data (String sosmed, Integer gambar){
        this.sosmed = sosmed;
        this.gambar = gambar;
    }

    public String getSosmed() {
        return sosmed;

    }
    public void setSosmed(){
        this.sosmed = sosmed;
    }

    public Integer getGambar(){
        return gambar;

    }
    public void setGambar(){
        this.gambar =gambar;
    }
}
