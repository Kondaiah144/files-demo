import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

    //private static final Path filePath = Paths.get(System.getProperty("user.dir") + "\\resource\\sampleDateText.txt "));
    private static final Path filePathForMac = Paths.get("/Applications/FannieMaeProjects/files-demo/working-with-files/simpleDataText/");

    public static void main(String[] args) throws IOException {
        String welcome = "Welcome to Files!";
        System.out.println(welcome);
        //Crete
        System.out.println("\n Calling the create a file method.");
        createAFile();

        //Update
        System.out.println("\n Calling the update a file method.");
        writeToAFile();

        //Read
        System.out.println("\n Calling the read a file method.");
        readAFile();

        //Delete
        System.out.println("\n Calling the delete a file method.");
        deleteAFile();

    }

//Create
        public static void createAFile () {
            try {
                Files.createFile(filePathForMac);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

//Read
        public static void readAFile () {
            String temp;
            try {
                temp = Files.readString(filePathForMac);
                System.out.println(temp);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

//Update
        public static void writeToAFile () {
            try {
                Files.writeString(filePathForMac, "This is the end my Friend..");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

//Delete
        public static void deleteAFile () throws IOException {
            System.out.println("Do you want to delete the file?");
            System.out.println("Please say Yes or No..");

            Scanner scanner = new Scanner(System.in);
            String delete = scanner.next();
            if(delete.equals("Yes")){
                Files.delete(filePathForMac);
            }else{
                System.out.println("Okay you choose not to delete");
            }

            Files.delete(filePathForMac);
        }
    }

