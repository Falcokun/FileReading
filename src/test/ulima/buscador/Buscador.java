package test.ulima.buscador;

import java.io.IOException;
import java.nio.file.*;

/**
 * Created by Ricardo on 19/06/2015.
 * Repasando
 */
public class Buscador {

    static String regex = ".*\\.java";
    static boolean encontrado;

    public static void main(String[] args) throws IOException, InterruptedException {
        //Obtener el acceso al sistema de almacenamiento
        FileSystem fileSystem = FileSystems.getDefault();

        //Path default;
        Path path = fileSystem.getPath("C:\\");
        //navegarStream(path, 0);
        navegarStreamTexto(path);
    }

    private static void navegarStream(Path path, int nivel) throws IOException, InterruptedException {
        Thread.sleep(100);
        try {
            if (Files.isDirectory(path)) {
                DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);
                for (Path pathito : directoryStream) {
                    navegarStream(pathito, nivel + 1);
                }
            } else {
                for (int i = 0; i < nivel; i++) {
                    System.out.print("\t");
                }
                System.out.print(path.getFileName());
            }
        } catch (Exception e) {
            for (int i = 0; i < nivel; i++) {
                System.out.print("\t");
            }
            System.out.print("Archivo Protegido");
        }
        System.out.println("\n");
    }

    private static void navegarStreamTexto(Path path) throws IOException, InterruptedException {
        if (!encontrado) {
            try {
                if (Files.isDirectory(path)) {
                    DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);
                    for (Path pathito : directoryStream) {
                        navegarStreamTexto(pathito);
                    }
                } else {
                    if (path.toString().matches(regex))
                        encontrado(path);
                }
            } catch (Exception e) {
                //System.out.println("Archivo Protegido");
            }
        }
    }

    private static void encontrado(Path path) {
        System.out.println(path);
        encontrado = true;
    }

}

