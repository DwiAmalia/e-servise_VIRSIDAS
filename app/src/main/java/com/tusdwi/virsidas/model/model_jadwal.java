package com.tusdwi.virsidas.model;

public class model_jadwal {
    public String pelajaran;
    public String pengajar;
    public String jam;
    public String link;

    public model_jadwal() {
    }

    public model_jadwal(String pelajaran, String pengajar, String jam, String link) {
        this.pelajaran = pelajaran;
        this.pengajar = pengajar;
        this.jam = jam;
        this.link = link;
    }

    public String getPelajaran() {
        return pelajaran;
    }

    public void setPelajaran(String pelajaran) {
        this.pelajaran = pelajaran;
    }

    public String getPengajar() {
        return pengajar;
    }

    public void setPengajar(String pengajar) {
        this.pengajar = pengajar;
    }

    public String getJam() {
        return jam;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}