package test.ulima.outin;

import java.io.*;

/**
 * Created by Ricardo on 19/06/2015.
 * Repasando
 */
public class TestIn {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("primitivos.txt");
        BufferedInputStream buferedInputStream = new BufferedInputStream(fileInputStream);
        DataInputStream inputStream = new DataInputStream(buferedInputStream);

        boolean a = inputStream.readBoolean();
        char b = inputStream.readChar();
        byte c = inputStream.readByte();
        short d = inputStream.readShort();

        inputStream.close();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
