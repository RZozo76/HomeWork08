package hu.helixlab;

public class Main {

    public static void main(String[] args) {
	//1 feladat
        FileOperation.fileMaker("E:\\","virag.txt");
    //2 feladat
        FileOperation.fileMaker("E:\\", 4, "ajandek.txt");
        //3 feladat
        String content = "Valami szöveg";
        FileOperation.fileMakerWithContent("E:\\", content, "valami.txt");
    }
}
