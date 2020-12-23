package com.tusdwi.virsidas.model;

import com.google.gson.annotations.SerializedName;

public class jadwalModel {

    @SerializedName("id")
    private String id;
    @SerializedName("mulai")
    private String mulai;
    @SerializedName("seleai")
    private String selesai;
    @SerializedName("tgl")
    private String tgl;
    @SerializedName("rincian")
    private String rincian;
    @SerializedName("nama_hari")
    private String nama_hari;
    @SerializedName("nama_mapel")
    private String nama_mapel;
    @SerializedName("nama_kelas")
    private String nama_kelas;
    @SerializedName("nama_guru")
    private String nama_guru;
    @SerializedName("nip")
    private String nip;

    public jadwalModel() {
    }

    public jadwalModel(String id, String mulai, String selesai, String tgl, String rincian, String nama_hari, String nama_mapel, String nama_kelas, String nama_guru, String nip) {
        this.id = id;
        this.mulai = mulai;
        this.selesai = selesai;
        this.tgl = tgl;
        this.rincian = rincian;
        this.nama_hari = nama_hari;
        this.nama_mapel = nama_mapel;
        this.nama_kelas = nama_kelas;
        this.nama_guru = nama_guru;
        this.nip = nip;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMulai() {
        return mulai;
    }

    public void setMulai(String mulai) {
        this.mulai = mulai;
    }

    public String getSelesai() {
        return selesai;
    }

    public void setSelesai(String selesai) {
        this.selesai = selesai;
    }

    public String getTgl() {
        return tgl;
    }

    public void setTgl(String tgl) {
        this.tgl = tgl;
    }

    public String getRincian() {
        return rincian;
    }

    public void setRincian(String rincian) {
        this.rincian = rincian;
    }

    public String getNama_hari() {
        return nama_hari;
    }

    public void setNama_hari(String nama_hari) {
        this.nama_hari = nama_hari;
    }

    public String getNama_mapel() {
        return nama_mapel;
    }

    public void setNama_mapel(String nama_mapel) {
        this.nama_mapel = nama_mapel;
    }

    public String getNama_kelas() {
        return nama_kelas;
    }

    public void setNama_kelas(String nama_kelas) {
        this.nama_kelas = nama_kelas;
    }

    public String getNama_guru() {
        return nama_guru;
    }

    public void setNama_guru(String nama_guru) {
        this.nama_guru = nama_guru;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }
}

