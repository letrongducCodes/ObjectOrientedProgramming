package hus.oop.lab11.BridgePattern.Exercise3;

import java.io.File;
import java.io.FileWriter;

public class FileLogger implements MessageLogger {
    @Override
    public void log(String msg) {
        // viet ham ghi ra file log.txt
        try {
            FileWriter fw = new FileWriter(new File("log.txt"), true);
            fw.append((char) 10);
            fw.write(msg);
            fw.close();
        } catch (Exception ex) {
            System.out.println("loi log trong FileLogger: " + ex);
        }
    }
}
