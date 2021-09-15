public class Bycicle {
    int startCadence;
    int startSpeed;
    int startGear;

    public Bycicle(int startCadence, int startSpeed, int startGear){

    }
}
class MountainBike extends Bycicle {
    int startHeight;
    int seatHeight;
    public MountainBike(int startHeight, int startCadence, int startSpeed, int startGear) {
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
        //this.clone().getClass();
    }  
}