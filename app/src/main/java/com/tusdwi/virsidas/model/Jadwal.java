package com.tusdwi.virsidas.model;

import com.google.firebase.database.Exclude;

import java.util.HashMap;
import java.util.Map;

public class Jadwal {
    public String pelajaran;
    public String pengajar;
    public String jam;
    public String link;

    public Jadwal() {

    }

    public Jadwal(String pelajaran, String pengajar, String jam, String link) {
        this.pelajaran = pelajaran;
        this.pengajar = pengajar;
        this.jam = jam;
        this.link = link;
    }


    @Exclude
    public Map<String, Object> toMap(){
        HashMap<String, Object> result = new HashMap<>();
        result.put("pelajaran", pelajaran);
        result.put("pengajar", pengajar);
        result.put("jam", jam);
        result.put("link", link);
        return result;

    }
}