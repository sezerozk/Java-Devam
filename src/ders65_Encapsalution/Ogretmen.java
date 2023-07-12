package ders65_Encapsalution;

public class Ogretmen {

    private String isim = "Hamza";
    private int yas = 20;
    private long kimlikNo = 5465435648l;

    public String getIsim() {

        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void setYas(int yas) {

        this.yas = yas;
    }

    public int getYas() {

        return yas;
    }

    public long getKimlikNo() {

        return kimlikNo;
    }
}
