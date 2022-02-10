package Dedicnost;

public class Truck extends Car {

    final int loadMaxWeight;
    final int loadMinWeight;



    public Truck(String znacka, int vykon, int loadMaxWeight, int loadMinWeight) {
        super(znacka, vykon);
        this.loadMaxWeight = loadMaxWeight;
        this.loadMinWeight = loadMinWeight;
    }

    public int getLoadMaxWeight() {
        return loadMaxWeight;
    }

    public int getLoadMinWeight() {
        return loadMinWeight;
    }

    @Override
    public void superCoolSound() {
        System.out.println("HUSTOPEČESKRRRRRRRRRRRRRRRRRRRRRRR");
    }

}
