package hus.oop.lab11.BridgePattern.Exercise3;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class EncryptedMessage extends Message {
    public EncryptedMessage() {
    }
    public EncryptedMessage(MessageLogger messageLogger) {
        super(messageLogger);
    }
    public MessageLogger getMessageLogger() {
        return messageLogger;
    }
    public void setMessageLogger(MessageLogger messageLogger) {
        this.messageLogger = messageLogger;
    }
    public String preProcess(String str) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(str.getBytes());
            BigInteger number = new BigInteger(1, messageDigest);
            String hashtext = number.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public void log(String msg) {
        this.messageLogger.log(preProcess(msg));
    }
}
