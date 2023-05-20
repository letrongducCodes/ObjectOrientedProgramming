package hus.oop.lab11.BridgePattern.Exercise3;

public abstract class Message {
    MessageLogger messageLogger;
    public Message() {
    }
    public Message(MessageLogger messageLogger) {
        this.messageLogger = messageLogger;
    }
    public abstract void log(String msg);
}
