package test.ulima.randito;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by Ricardo on 19/06/2015.
 * Repasando
 */
public class TestLeer {
    static String archivo = "datos.txt";
    final static int INT_SIZE = 4;

    public static void main(String[] args) throws IOException {
        File dataFile = new File(archivo);
        RandomAccessFile inputFile = new RandomAccessFile(dataFile, "r");
        System.out.println("Leyendo los cuadrados de los impares");
        long length = inputFile.length();
        for (int i = INT_SIZE; i < length; i += 2 * INT_SIZE) {
            inputFile.seek(i);
            System.out.println(inputFile.readInt());
        }
        inputFile.close();
    }
}
