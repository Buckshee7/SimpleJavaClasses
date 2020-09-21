public class WaterBottle {

    private int volume;

    public WaterBottle() {
        this.volume = 100;
    }

    public int getVolume() {
        return volume;
    }

    public void drinkWater() {
        if (this.volume < 10) {
            this.volume = 0;
        } else {
            this.volume = this.volume - 10;
        }
    }

    public void emptyBottle(){
        this.volume=0;
    }

    public void fullBottle(){
        this.volume=100;
    }
}
