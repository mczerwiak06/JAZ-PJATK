package pl.pjatk.miccze;

import org.springframework.stereotype.Component;


public class Car {
    private int id;
    private String marka;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Car(int id, String marka) {
        this.id = id;
        this.marka = marka;
    }

    public Car(String marka) {
        this.marka = marka;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public Car() {
    }
}
