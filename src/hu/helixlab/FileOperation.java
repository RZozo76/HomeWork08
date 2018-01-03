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
    //2 feladat
    public static void fileMaker(String filePlace, int num, String fileName2) {
        //fout változó inicializálása
        try {
            //file mentési helyének megadása, a file nevének megadása, valamint darabszámának létrehozása for ciklussal
            for (int i = 1; i <= num; i++) {
            // for ciklusssal bevezetett i változóval lehet megoldani a különböző fájlnevek létrehozását
                FileOutputStream fout = new FileOutputStream(filePlace + i + fileName2);
        }//kivétel általános hiba esetén, kivétel file hiánya esetén
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public static void fileMakerWithContent(String filePlace, String content, String fileName3) {

        //fout változó inicializálása
        try {
            // file mentési helyének megadása, valamint a file nevének megadása
            FileOutputStream fout = new FileOutputStream(filePlace + fileName3);
            //string konvertálás és beleírása a file-ba
            byte b[] = content.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("success...");
            // kivétel általános hiba esetén
        } catch (Exception e) {
                System.err.println(e.getMessage());
            }


    }
    public static void fileMakerWithContent(String filePlace, int num2, String content, String fileName4) {

        //fout változó inicializálása
        FileOutputStream fout = null;
        try {
            // file mentési helyének megadása, valamint a file nevének megadása
            for (int i = 1; i <= num2; i++) {
                // for ciklusssal bevezetett i változóval lehet megoldani a különböző fájlnevek létrehozását
                fout = new FileOutputStream(filePlace + i + fileName4);
                byte b[] = content.getBytes();
                fout.write(b);
                fout.close();
            }
            //string konvertálás és beleírása a file-ba

            System.out.println("success...");
            // kivétel általános hiba esetén
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }


    }
}
