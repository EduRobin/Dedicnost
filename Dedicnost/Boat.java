package Dedicnost;

public class Boat extends Car{

    final int length;



    public Boat(String znacka, int vykon, int length) {
        super(znacka, vykon);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public void superCoolSound() {
        System.out.println("Sheeeesh boom boom vzum");
    }

}
