package W7;

public class RepairTest {

    public static void main(String[] args) {
        Tank tank = new Tank();
        Marine marine = new Marine();
        SCV scv = new SCV();
        SCV scv2 = new SCV();
        scv.repair(tank);
        //scv.repair(marine);
        scv.repair(scv2);

    }
}

class Unit{
    int hitPoint;
    final int MAX_HP;

    Unit(int hp) {
        MAX_HP = hp;
    }
}

class GroundUnit extends Unit{
    GroundUnit(int hp) {
        super(hp);
    }
}

class AirUnit extends Unit{
    AirUnit(int hp) {
        super(hp);
    }
}

class Tank extends GroundUnit implements Repairable{
    Tank(){
        super(150);
        hitPoint = MAX_HP;
    }
    public String toString(){
        return "Tank";
    }
}

class Marine extends GroundUnit{
    Marine(){
        super(40);
        hitPoint = MAX_HP;
    }
}

class SCV extends GroundUnit implements Repairable{
    SCV(){
        super(60);
        hitPoint = MAX_HP;
    }
    void repair(Repairable r){
        if(r instanceof Unit){
            Unit u = (Unit) r;
            while (u.hitPoint != u.MAX_HP){
                u.hitPoint++;
            }
        }
        System.out.println(r + " is repaired.");
    }
}
