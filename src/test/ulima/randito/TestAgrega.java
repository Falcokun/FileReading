package test.ulima.randito;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by Ricardo on 19/06/2015.
 * Repasando
 */
public class TestAgrega {
    static String archivo = "datos.txt";
    final static int INT_SIZE = 4;

    public static void main(String[] args) throws IOException {
        RandomAccessFile outputFile = new RandomAccessFile(archivo, "rw");
        outputFile.seek(outputFile.length());
        for (int i = 0; i < 30; i++) {
            outputFile.writeInt(i * i);
        }
        outputFile.close();
    }
}
