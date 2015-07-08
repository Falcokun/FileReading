package test.ulima.characteroutin;

import java.io.*;

/**
 * Created by Ricardo on 19/06/2015.
 * Repasando
 */
public class TestIn {
    public static void main(String[] args) {
        FileInputStream inputFile = null;
        try {
            inputFile = new FileInputStream("caracteres.txt");
            InputStreamReader reader = new InputStreamReader(inputFile, "UTF-8");
            BufferedReader buf = new BufferedReader(reader);

            String linea;
            while ((linea = buf.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
