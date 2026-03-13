package W5;

public class Lab5_5 {
    public static void main(String[] args) {
        TVCR myTVCR = new TVCR();
        myTVCR.power();
        myTVCR.channelUp();
        myTVCR.play();
        myTVCR.stop();
    }
}

class Tv{
    boolean power;
    int channel;

    void power(){
        power = !power;
    }
    void channelUp(){
        ++channel;
    }
    void channelDown(){
        --channel;
    }

}

class VCR{
    boolean power;
    int counter = 0;
    void power(){
        power = !power;
    }
    void play(){
        System.out.println("play VCP");
    }
    void stop(){
        System.out.println("Rewind VCR");
    }
    void rew(){
        System.out.println("Rewind VCR");
    }
    void ff(){
        System.out.println("Fast Forward VCR");
    }

}

class TVCR extends Tv{
    VCR vcr = new VCR();
    int counter = vcr.counter;
    void play(){
        vcr.play();
    }
    void stop(){
        vcr.stop();
    }
    void rew(){
        vcr.rew();
    }
    void ff(){
        vcr.ff();
    }
    void power(){
        super.power(); //메서드 오버라이딩
        System.out.println("TVCR power " + (power?"On":"OFF"));
    }
    void channelUp(){
        ++channel;
        System.out.println("Channel No: " + channel);
    }
    void channelDown(){
        super.channelDown();
        System.out.println("Channel No: " + channel);
    }
}
