package test.ulima.outin;

import java.io.*;

/**
 * Created by Ricardo on 19/06/2015.
 * Repasando
 */
public class TestOut {

    /**
     * Metodo para escribir un archivo en bytes
     */
    public static void main(String[] args) throws IOException {
        //Nombre del archivo en el cual se escribirá
        FileOutputStream outputFile = new FileOutputStream("primitivos.txt");

        //Opcinal que da perfromance, haciendolo trabajoar como buffered
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputFile);

        //Es la creacion del data stream donde escribiremos
        DataOutputStream outputStream = new DataOutputStream(bufferedOutputStream);

        outputStream.writeBoolean(true);
        outputStream.writeChar('A');
        outputStream.writeByte(Byte.MAX_VALUE);
        outputStream.writeShort(Short.MAX_VALUE);

        outputStream.close();
    }
}
