package pl.pjatk.miccze;

import org.springframework.stereotype.Component;


public class Car {
    private String marka;

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
