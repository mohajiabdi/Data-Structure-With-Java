package TV;

public class Main {
    public static void main(String[] args) {
        Tv tv = new Tv();

        tv.turnOn();
        tv.setChannel(2);
        tv.channelDown();
        tv.volumeUp();
        tv.volumeUp();
        tv.volumeUp();
        tv.volumeUp();
        tv.volumeDown();

        //tv.setChannel(140);

        tv.channelDown();
        tv.displayStatus();
        tv.mute();
        tv.displayStatus();
        tv.unmute();
        tv.displayStatus();


    }
}
