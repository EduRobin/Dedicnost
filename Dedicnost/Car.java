package Dedicnost;

public class Car {

    final String znacka;
    final int vykon;


    public Car(String znacka, int vykon) {
        this.znacka = znacka;
        this.vykon = vykon;
    }

    public String getZnacka() {
        return znacka;
    }

    public int getVykon() {
        return vykon;
    }


    public void superCoolSound() {
        System.out.println("BRABUSJAKOBJEMUSTVOJOSMAMOS");
    }

}
