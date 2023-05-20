package hus.oop.lab11.BridgePattern.Exercise3;

public class Client {
    public static void main(String[] args) {
        // chọn log kiểu show ra console
        MessageLogger messageLogger = new ConsoleLogger();
        // chọn cách thức hiển thị kiểu mã hóa
        Message message1 = new EncryptedMessage(messageLogger);
        // chọn cách thức hiển thị kiểu text rõ
        Message message2 = new TextMessage(messageLogger);
        // thực thi phương thức log
        message1.log("Hello world");
        message2.log("Hello world");
    }
}
