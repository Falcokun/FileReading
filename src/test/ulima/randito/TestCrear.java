package test.ulima.randito;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by Ricardo on 19/06/2015.
 * Repasando
 */
public class TestCrear {
    static String archivo = "datos.txt";

    public static void main(String[] args) throws IOException {
        File dataFile = new File(archivo);
        //rw: mean read and  write
        RandomAccessFile outputFile = new RandomAccessFile(dataFile, "rw");
        for (int i = 0; i < 10; i++) {
            outputFile.writeInt(i * i);
        }
        outputFile.close();

    }
}
