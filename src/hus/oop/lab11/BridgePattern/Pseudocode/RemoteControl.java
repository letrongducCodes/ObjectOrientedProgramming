package hus.oop.lab11.BridgePattern.Pseudocode;

public class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void togglePower() {
        if (device.isEnabled()) {
            device.disable();
        } else {
            device.enable();
        }
    }

    public void volumeDown() {
        if(device.getVolume() - 10 < 0) {
            System.out.println("Illegal volume");
        } else {
            device.setVolume(device.getVolume() - 10);
        }
    }

    public void volumeUp() {

        device.setVolume(device.getVolume() + 10);
    }

    public void channelDown() {
        if(device.getChannel() - 1 < 0) {
            System.out.println("Illegal channel");
        } else {
            device.setChannel(device.getChannel() - 1);
        }
    }

    public void channelUp() {
        device.setChannel(device.getChannel() + 1);
    }
}
