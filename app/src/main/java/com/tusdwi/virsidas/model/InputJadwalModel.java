package com.tusdwi.virsidas.model;

public class InputJadwalModel {

    private String Jam1;
    private String Jam2;
    private String Jam3;
    private String Jam4;
    private String Jam5;
    private String Jam6;
    private String Jam7;
    private String key;

    public InputJadwalModel() {
    }

    public InputJadwalModel(String jam1, String jam2, String jam3, String jam4, String jam5, String jam6, String jam7) {
        Jam1 = jam1;
        Jam2 = jam2;
        Jam3 = jam3;
        Jam4 = jam4;
        Jam5 = jam5;
        Jam6 = jam6;
        Jam7 = jam7;
    }

    public String getJam1() {
        return Jam1;
    }

    public void setJam1(String jam1) {
        Jam1 = jam1;
    }

    public String getJam2() {
        return Jam2;
    }

    public void setJam2(String jam2) {
        Jam2 = jam2;
    }

    public String getJam3() {
        return Jam3;
    }

    public void setJam3(String jam3) {
        Jam3 = jam3;
    }

    public String getJam4() {
        return Jam4;
    }

    public void setJam4(String jam4) {
        Jam4 = jam4;
    }

    public String getJam5() {
        return Jam5;
    }

    public void setJam5(String jam5) {
        Jam5 = jam5;
    }

    public String getJam6() {
        return Jam6;
    }

    public void setJam6(String jam6) {
        Jam6 = jam6;
    }

    public String getJam7() {
        return Jam7;
    }

    public void setJam7(String jam7) {
        Jam7 = jam7;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
