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
        Path numbersFilePath = Paths.get(directory, filename);
        Path groceryFilePath = Paths.get(directory, secondName);

        createDir(dataDirectory);

        createAndCheckFile(numbersFilePath);
        createAndCheckFile(groceryFilePath);

        writeFile(numbersFilePath, numberList);
        writeFile(groceryFilePath, groceryList);

        readFile(numbersFilePath, true);
        readFile(groceryFilePath, true);

        List<String> modifiedGrocery = replaceItem(groceryFilePath, "milk" , "cream");

        writeFile(groceryFilePath, modifiedGrocery);

        // check if an item exists in the file, simulate contains return true/false
        System.out.println("fileContains(\"cheese\", groceryFilePath) = " + fileContains("cheese", groceryFilePath));
        System.out.println("fileContains(\"grapes\", groceryFilePath) = " + fileContains("grapes", groceryFilePath));
    }

    private static boolean fileContains(String needle, Path aFile) {
        List<String> lines = readFile(aFile, false);
        for (String line : lines) {
            if(line.equals(needle)){
                return true;
            }
        }
        return false;
    }

    private static List<String> replaceItem(Path aFile, String find, String replacement){

        List<String> tempList = new ArrayList<>();

        try {
            List<String> lines = Files.readAllLines(aFile);
            for (String line : lines) {
                if(line.equals(find)){
                    tempList.add(replacement);
                    continue;
                }
                tempList.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return tempList;
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

    public static List<String> readFile(Path aFile, boolean print){
        List<String> lines;
        try{
            lines = Files.readAllLines(aFile);
            if(print == true){
                for (String line: lines) {
                    System.out.println("lines = " + line);
                }
                return null;
            }
            return lines;
        } catch (IOException e){
            System.out.println("Problems reading the file");
            e.printStackTrace();
            return null;
        }
    }

}
