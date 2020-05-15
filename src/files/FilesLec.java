package files;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilesLec {

    public static void main(String[] args) {
        String directory = "data";
        String filename = "info.txt";
        String secondName = "grocery-list.csv";
        List<String> groceryList = new ArrayList<>();
        List<String> numberList = Arrays.asList("1","2","5","8","90");

        groceryList.add("coffee");
        groceryList.add("milk");
        groceryList.add("sugar");
        groceryList.add("cheese");
        groceryList.add("eggs");
        groceryList.add("tomatoes");

        // where the folder is gonna live
        Path dataDirectory = Paths.get(directory);
        // where the file is gonna live
        Path dataFile = Paths.get(directory, filename);
        Path mySecondFile = Paths.get(directory, secondName);

        createDir(dataDirectory);

        createAndCheckFile(dataFile);
        createAndCheckFile(mySecondFile);

        writeFile(dataFile, numberList);
        writeFile(mySecondFile, groceryList);

        readFile(dataFile);
        readFile(mySecondFile);

    }

    private static void createDir(Path aDir) {
        if (Files.notExists(aDir)) {
            try {
                Files.createDirectory(aDir);
            } catch (IOException e) {
                System.out.println("Problems creating the directory");
                e.printStackTrace();
            }
        }
    }

    private static void createAndCheckFile(Path aFile) {
        if (Files.notExists(aFile)) {
            try {
                Files.createFile(aFile);
            } catch (IOException e) {
                System.out.println("Problems creating the file");
                e.printStackTrace();
            }
        }
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

    public static void writeFile(Path aFile, List<String> aList){
        try {
            Files.write(aFile, aList);
//            Files.write(aFile, aList, StandardOpenOption.APPEND);
        } catch (IOException e){
            System.out.println("Problems writing in the file");
            e.printStackTrace();
        }
    }

    public static void readFile(Path aFile){
        try{
            List<String> lines = Files.readAllLines(aFile);
            for (String line: lines) {
                System.out.println("lines = " + line);
            }
        } catch (IOException e){
            System.out.println("Problems reading the file");
            e.printStackTrace();
        }
    }

}
