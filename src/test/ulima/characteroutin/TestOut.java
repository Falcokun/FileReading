package test.ulima.characteroutin;

import java.io.*;

/**
 * Created by Ricardo on 19/06/2015.
 * Repasando
 */
public class TestOut {

    public static void main(String[] args) {
        FileOutputStream outputFile = null;
        try {
            outputFile = new FileOutputStream("caracteres.txt");
            OutputStreamWriter outputStream = new OutputStreamWriter(outputFile, "UTF-8");
            BufferedWriter bufferedOutput = new BufferedWriter(outputStream);
            PrintWriter pw = new PrintWriter(bufferedOutput);

            //Escribir;

            pw.print("Hola MUNDO");
            pw.println("J");
            pw.println("A");
            pw.println("V");
            pw.println("A");
            pw.print(2015);
            pw.flush();

        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

}
