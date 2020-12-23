package com.tusdwi.virsidas.model;

import java.util.List;

public class ResponJadwal {
        String  kode, pesan;
        List<jadwalModel> result;

        public List<jadwalModel> getResult() {
            return result;
        }

        public void setResult(List<jadwalModel> result) {
            this.result = result;
        }

        public String getKode() {
            return kode;
        }

        public void setKode(String kode) {
            this.kode = kode;
        }

        public String getPesan() {
            return pesan;
        }

        public void setPesan(String pesan) {
            this.pesan = pesan;
        }
    }
