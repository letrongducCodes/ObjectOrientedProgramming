package hus.oop.lab11.BridgePattern.Pseudocode;

public class Client {
    public static void main(String[] args) {
        TV tv = new TV();
        RemoteControl remote = new RemoteControl(tv);

        System.out.println(tv.isEnabled());
        remote.togglePower();
        System.out.println(tv.isEnabled());
        System.out.println();

        System.out.println(tv.getVolume());
        remote.volumeUp();
        System.out.println(tv.getVolume());
        remote.volumeDown();
        System.out.println(tv.getVolume());
        tv.setVolume(0);
        remote.volumeDown();
        System.out.println(tv.getVolume());
        System.out.println();

        System.out.println(tv.getChannel());
        remote.channelUp();
        System.out.println(tv.getChannel());
        remote.channelDown();
        System.out.println(tv.getChannel());
        tv.setChannel(0);
        remote.channelDown();
        System.out.println(tv.getChannel());
        System.out.println();

        Radio radio = new Radio();
        remote = new AdvancedRemoteControl(radio);

        remote.togglePower();
        ((AdvancedRemoteControl) remote).mute();
        System.out.println(radio.getVolume());
    }
}
