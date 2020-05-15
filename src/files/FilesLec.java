package files;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesLec {

    public static void main(String[] args) {
        String directory = "data";
        String filename = "info.txt";
        String secondName = "names.csv";

        // where the folder is gonna live
        Path dataDirectory = Paths.get(directory);
        // where the file is gonna live
        Path dataFile = Paths.get(directory, filename);
        Path mySecondFile = Paths.get(directory, secondName);

        if (!Files.exists(dataFile)) {
            try {
                Files.createFile(dataFile);
            } catch (IOException e) {
                System.out.println("Problems creating the directory");
                e.printStackTrace();
            }
        }

        createFile(dataFile);
        createFile(mySecondFile);

    }

    public static void createFile(Path aFile) {
        if (!Files.exists(aFile)) {
            try {
                Files.createFile(aFile);
            } catch (IOException e) {
                System.out.println("Problems creating the file");
                e.printStackTrace();
            }
        }
    }

}
