package FileReader_88;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderClass {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to file Reader");
        System.out.print("Now, enter file name which you want to read: ");
        String filename = input.next();
        try(FileReader reader = new FileReader(filename)){
            int read;
            do{
                read = reader.read();
                System.out.print((char) read);
            }
            while(read != -1);
        }catch(FileNotFoundException e){
            System.out.println("file not found, please try again");
        }catch (IOException e){
            System.out.println("Some input otput exception occured");
        }
    }
}
