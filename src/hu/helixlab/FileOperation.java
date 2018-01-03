package hu.helixlab;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOperation {
    //1 feladat
    public static void fileMaker(String filePlace, String fileName) {
        // fout változó inicializálása
        try {
            // fájl mentési helyének megadása, valamint a file nevének megadása
            FileOutputStream fout = new FileOutputStream(filePlace + fileName);
            System.out.println("success...");
            // kivétel általános hiba esetén
        }  catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }



}
