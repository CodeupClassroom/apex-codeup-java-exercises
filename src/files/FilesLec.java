package files;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesLec {

    public static void main(String[] args) {
        String directory = "data";
        String filename = "info.txt";

        // where the folder is gonna live
        Path dataDirectory = Paths.get(directory);
        // where the file is gonna live
        Path dataFile = Paths.get(directory, filename);

        if(Files.notExists(dataDirectory)){
            try{
                Files.createDirectory(dataDirectory);
            } catch (IOException exp){
                System.out.println("Problems creating the directory");
                exp.printStackTrace();
            }
        }

        if(!Files.exists(dataFile)){
            try {
                Files.createFile(dataFile);
            } catch (IOException e){
                System.out.println("Problems creating the file");
                e.printStackTrace();
            }
        }


    }

}
